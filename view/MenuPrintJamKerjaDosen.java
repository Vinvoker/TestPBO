package view;

import controller.CariDataUser;
import controller.HitungPresensi;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Dosen;
import model.Staff;
import model.User;

public class MenuPrintJamKerjaDosen {
    public MenuPrintJamKerjaDosen(ArrayList<User> user){
        String nik = JOptionPane.showInputDialog(null, "Input NIK", "Print Total Jam Kerja Dosen",JOptionPane.QUESTION_MESSAGE);
        if(nik!=null){
            CariDataUser data = new CariDataUser();
            Staff staff = data.CariDataByNIK(user, nik);
            Dosen dosen = null;
            if(staff instanceof Dosen){
                dosen = (Dosen)staff;
            }
            
            if(dosen!=null){
                HitungPresensi hitung = new HitungPresensi();
                int jamKerja = hitung.HitungJamKerjaDosen(dosen);
                JOptionPane.showMessageDialog(null, "Total Jam Kerja : "+jamKerja, "Print Total Jam Kerja Dosen", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Dosen tidak ditemukan", "Error", 0);
            }
        }
    }
}
