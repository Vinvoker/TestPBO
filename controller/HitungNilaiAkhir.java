package controller;

import java.util.ArrayList;
import model.Doktor;
import model.Magister;
import model.Mahasiswa;
import model.Sarjana;
import model.User;

public class HitungNilaiAkhir {
    public HitungNilaiAkhir() {
    }

    public double HitungNA(Doktor mahasiswa) {
        int totalNilai = mahasiswa.getnSidang1() + mahasiswa.getnSidang2() + mahasiswa.getnSidang3();
        return (double) totalNilai / 3;
    }

    public double HitungNA(int[] nilai) {
        int total = nilai[0] + nilai[1] + nilai[2];
        return (double) total / 3;
    }

    public double HitungRataRataNA(ArrayList<User> user, String mk) {
        double totalNilai = 0;
        int banyakNilai = 0;
        for (User object : user) {
            if (object instanceof Sarjana || object instanceof Magister) {
                CariDataUser dataMahasiswa = new CariDataUser();
                int[] arrNilai = dataMahasiswa.CariNilaiMK((Mahasiswa) object, mk);
                double nilaiAkhir = HitungNA(arrNilai);
                if (nilaiAkhir != 0) {
                    totalNilai += nilaiAkhir;
                    banyakNilai++;
                }
            }
        }
        return totalNilai / banyakNilai;
    }
}
