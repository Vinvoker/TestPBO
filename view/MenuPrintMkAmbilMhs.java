package view;

import controller.CariDataUser;
import controller.PrintData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Doktor;
import model.User;

public class MenuPrintMkAmbilMhs {
    public MenuPrintMkAmbilMhs(ArrayList<User> user){
        String nim = JOptionPane.showInputDialog(null, "Input NIM", "Print Mata Kuliah Ambil & Presensi Mahasiswa",JOptionPane.QUESTION_MESSAGE);
        if(nim!=null){
            CariDataUser cariData = new CariDataUser();
            User mhs = cariData.CariDataByNIM(user, nim);
            //krn yg punya MK ambil hanya sarjana dan magister
            if(mhs!=null){
                if(!(mhs instanceof Doktor)){
                    PrintData dataUser = new PrintData();
                    StringBuilder string = dataUser.PrintMKAmbil(mhs);
                    JOptionPane.showMessageDialog(null, string, "Print Mata Kuliah Ambil & Presensi Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Doktor tidak memiliki Mata Kuliah Ambil", "Error", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Mahasiswa tidak ditemukan", "Error", 0);
            }
        }
    }
}
