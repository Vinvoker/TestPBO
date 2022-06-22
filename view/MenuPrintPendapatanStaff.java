package view;

import controller.CariDataUser;
import controller.HitungPendapatan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Staff;
import model.User;

public class MenuPrintPendapatanStaff {
    public MenuPrintPendapatanStaff(ArrayList<User> user){
        String nik = JOptionPane.showInputDialog(null, "Input NIK", "Print Pendapatan Staff",JOptionPane.QUESTION_MESSAGE);
        if(nik!=null){
            CariDataUser data = new CariDataUser();
            Staff staff = data.CariDataByNIK(user, nik);
            HitungPendapatan hitung = new HitungPendapatan();
            double pendapatan = hitung.HitungPendapatanStaff(staff);
            JOptionPane.showMessageDialog(null, "Total Pendapatan : Rp "+pendapatan, "Print Pendapatan Staff", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Staff tidak ditemukan", "Error", 0);
        }
    }
}
