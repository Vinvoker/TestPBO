package view;

import controller.HitungNilaiAkhir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;

public class MenuPrintRataRataNilai {

    public MenuPrintRataRataNilai(ArrayList<User> user) {
        String kodeMK = JOptionPane.showInputDialog(null, "Input Kode MK", "Print Rata-rata Nilai Akhir",JOptionPane.QUESTION_MESSAGE);
        if(kodeMK!=null){
            HitungNilaiAkhir nilai = new HitungNilaiAkhir();
            double nilaiRataRata = nilai.HitungRataRataNA(user, kodeMK);
            if(nilaiRataRata!=0){
                JOptionPane.showMessageDialog(null, "Rata-rata Nilai Akhir : "+nilaiRataRata, "Print Rata-rata Nilai Akhir", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "MK tidak ditemukan pada data user", "Error", 0);
            }
        }
    }
    
}
