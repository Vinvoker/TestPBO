package model;

import java.util.Arrays;

public class MatkulAjar {
    private MataKuliah mataKuliah;
    private PresensiStaff[] presensi = new PresensiStaff[3];

    public MatkulAjar(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public PresensiStaff[] getPresensi() {
        return presensi;
    }

    public void setPresensi(PresensiStaff[] presensi) {
        this.presensi = presensi;
    }

    public void addPresensi(PresensiStaff presensi, int i) {
        this.presensi[i] = presensi;
    }

    @Override
    public String toString() {
        return "MatkulAjar{" + "mataKuliah=" + mataKuliah + ", presensi=" + Arrays.toString(presensi) + '}';
    } 
    
}
