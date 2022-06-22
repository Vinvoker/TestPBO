package controller;

import java.util.ArrayList;
import model.Magister;
import model.Mahasiswa;
import model.Sarjana;
import model.User;

public class HitungMahasiswa {

    public HitungMahasiswa() {
    }
    
    public int[] HitungMhsTdkLulus(ArrayList<User> user, String mk){
        int banyakMhs = 0;
        int tdkLulus = 0;
        for (User object: user) {
            if(object instanceof Sarjana || object instanceof Magister){
                CariDataUser dataMahasiswa = new CariDataUser();
                HitungNilaiAkhir hitung = new HitungNilaiAkhir();
                int[] arrNilai = dataMahasiswa.CariNilaiMK((Mahasiswa) object, mk);
                double nilaiAkhir = hitung.HitungNA(arrNilai);
                if(nilaiAkhir!=0){
                    banyakMhs++;
                    if(nilaiAkhir<56){
                        tdkLulus++;
                    }
                }
            }
        }
        int[] mhs = {tdkLulus,banyakMhs};
        return mhs;
    }
}
