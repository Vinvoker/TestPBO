package view;

import controller.CariMK;
import controller.HitungMahasiswa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.MataKuliah;
import model.User;

public class MenuPrintTidakLulus {
    public MenuPrintTidakLulus(ArrayList<User> user, ArrayList<MataKuliah> mk){
        String kodeMK = JOptionPane.showInputDialog(null, "Input Kode MK", "Print Banyak Mahasiswa Tidak Lulus",JOptionPane.QUESTION_MESSAGE);
        if(kodeMK!=null){
            CariMK cariMK = new CariMK();
            String namaMK = cariMK.CariNamaMKbyKode(mk, kodeMK);
            if(!namaMK.equals("")){
                HitungMahasiswa hitungMhs = new HitungMahasiswa();
                int[] mhsTdkLulus = hitungMhs.HitungMhsTdkLulus(user, kodeMK);
                
                JOptionPane.showMessageDialog(null, "<"+mhsTdkLulus[0]+"> dari <"+mhsTdkLulus[1]+">"
                        + " tidak lulus mata kuliah <"+namaMK+">", "Print Banyak Mahasiswa Tidak Lulus", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "MK tidak ditemukan", "Error", 0);
            }
        }
    }
}
