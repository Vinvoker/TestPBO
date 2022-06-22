package controller;

import java.util.ArrayList;
import model.Doktor;
import model.DosenTetap;
import model.Honorer;
import model.Karyawan;
import model.Magister;
import model.MatkulAmbil;
import model.Presensi;
import model.Sarjana;
import model.User;

public class PrintData {
    public PrintData() {
    }

    public StringBuilder PrintDataUser(User data) {
        StringBuilder string = new StringBuilder();
        string.append("Nama : ").append(data.getNama()).append("\n");
        string.append("Alamat : ").append(data.getAlamat()).append("\n");
        string.append("TTL : ").append(data.getTTL()).append("\n");
        string.append("Telepon : ").append(data.getTelepon()).append("\n");
        string.append("Status : ");
        if (data instanceof Honorer) {
            string.append("Dosen Honorer");
        } else if (data instanceof DosenTetap) {
            string.append("Dosen Tetap");
        } else if (data instanceof Karyawan) {
            string.append("Karyawan");
        } else if (data instanceof Sarjana) {
            string.append("Mahasiswa (Sarjana)");
        } else if (data instanceof Magister) {
            string.append("Mahasiswa (Magister)");
        } else if (data instanceof Doktor) {
            string.append("Mahasiswa (Doktor)");
        }
        return string;
    }

    public StringBuilder PrintMKAmbil(User data) {
        ArrayList<MatkulAmbil> listMk;
        StringBuilder string = new StringBuilder();

        if (data instanceof Sarjana) {
            Sarjana sarjana = (Sarjana) data;
            listMk = sarjana.getMatakuliah();
        } else {
            Magister magister = (Magister) data;
            listMk = magister.getMatakuliah();
        }
        for (MatkulAmbil mk : listMk) {
            string.append("Mata Kuliah : ").append(mk.getMataKuliah().getNama()).append(" (");
            string.append(mk.getMataKuliah().getKode()).append(")\n");
            string.append("SKS : ").append(mk.getMataKuliah().getSKS()).append("\n");
            string.append("Presensi : \n");
            for (Presensi presensi : mk.getPresensi()) {
                String status = "Hadir";
                if (presensi.getStatus() == 0) {
                    status = "Alpha";
                }
                string.append(presensi.getTanggal()).append(" ").append(status).append("\n");
            }
        }
        return string;
    }
}
