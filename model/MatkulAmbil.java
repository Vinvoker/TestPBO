package model;

import java.util.Arrays;

public class MatkulAmbil {
    private MataKuliah mataKuliah;
    private Presensi[] presensi = new Presensi[3];
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(MataKuliah mataKuliah, int n1, int n2, int n3) {
        this.mataKuliah = mataKuliah;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Presensi[] getPresensi() {
        return presensi;
    }

    public void setPresensi(Presensi[] presensi) {
        this.presensi = presensi;
    }
    
    public void addPresensi(Presensi presensi, int i) {
        this.presensi[i] = presensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return super.toString() + "MatkulAmbil{" + "mataKuliah=" + mataKuliah + ", presensi=" + Arrays.toString(presensi) + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}';
    }
    
    
}
