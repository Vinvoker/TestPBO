package view;

import controller.CariDataUser;
import controller.HitungNilaiAkhir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Doktor;
import model.Mahasiswa;
import model.User;

public class MenuPrintNilai {
    public MenuPrintNilai(ArrayList<User> user){
        CariDataUser dataMahasiswa = new CariDataUser();
        String nim = JOptionPane.showInputDialog(null, "Input NIM", "Print Nilai Akhir",JOptionPane.QUESTION_MESSAGE);
        if(nim!=null){
            User mahasiswa = dataMahasiswa.CariDataByNIM(user, nim);
            if(mahasiswa!=null){
                HitungNilaiAkhir nilai = new HitungNilaiAkhir();
                double nilaiAkhir = 0;
                if(mahasiswa instanceof Doktor){
                    nilaiAkhir = nilai.HitungNA((Doktor) mahasiswa);
                }else{
                    String kodeMK = JOptionPane.showInputDialog(null, "Input Kode MK", "Print Nilai Akhir",JOptionPane.QUESTION_MESSAGE);
                    if(kodeMK!=null){
                        int[] arrNilai = dataMahasiswa.CariNilaiMK((Mahasiswa) mahasiswa, kodeMK);
                        nilaiAkhir = nilai.HitungNA(arrNilai);                        
                    }
                }
                
                if(nilaiAkhir!=0){
                    JOptionPane.showMessageDialog(null, "Nilai Akhir : "+nilaiAkhir, "Print Nilai Akhir", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "MK tidak ditemukan pada data User", "Error", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Mahasiswa tidak ditemukan", "Error", 0);
            }
        }
    }
}
