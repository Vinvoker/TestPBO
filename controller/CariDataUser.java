package controller;

import java.util.ArrayList;
import model.Magister;
import model.Mahasiswa;
import model.MatkulAmbil;
import model.Sarjana;
import model.Staff;
import model.User;

public class CariDataUser {

    public CariDataUser() {
    }

    public User CariData(ArrayList<User> user, String nama) {
        for (User object : user) {
            if (object.getNama().equals(nama)) {
                return object;
            }
        }
        return null;
    }

    public User CariDataByNIM(ArrayList<User> user, String nim) {
        for (User object : user) {
            if (object instanceof Mahasiswa) {
                if (((Mahasiswa) object).getNIM().equals(nim)) {
                    return object;
                }
            }
        }
        return null;
    }

    public Staff CariDataByNIK(ArrayList<User> user, String nik) {
        for (User object : user) {
            if (object instanceof Staff) {
                if (((Staff) object).getNIK().equals(nik)) {
                    return (Staff) object;
                }
            }
        }
        return null;
    }

    public int[] CariNilaiMK(Mahasiswa mahasiswa, String mk) {
        int[] nilai = { 0, 0, 0 };
        if (mahasiswa instanceof Sarjana) {
            Sarjana sarjana = (Sarjana) mahasiswa;
            MatkulAmbil matkul = sarjana.getMatakuliah(mk);
            if (matkul != null) {
                nilai[0] = matkul.getN1();
                nilai[1] = matkul.getN2();
                nilai[2] = matkul.getN3();
            }
        } else {
            Magister magister = (Magister) mahasiswa;
            MatkulAmbil matkul = magister.getMatakuliah(mk);
            if (matkul != null) {
                nilai[0] = matkul.getN1();
                nilai[1] = matkul.getN2();
                nilai[2] = matkul.getN3();
            }
        }
        return nilai;
    }

}
