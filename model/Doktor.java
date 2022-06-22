package model;

public class Doktor extends Mahasiswa {
    private String judulDisertasi;
    private int nSidang1;
    private int nSidang2;
    private int nSidang3;

    public Doktor(String judulDisertasi, int nSidang1, int nSidang2, int nSidang3, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulDisertasi = judulDisertasi;
        this.nSidang1 = nSidang1;
        this.nSidang2 = nSidang2;
        this.nSidang3 = nSidang3;
    }

    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public int getnSidang1() {
        return nSidang1;
    }

    public void setnSidang1(int nSidang1) {
        this.nSidang1 = nSidang1;
    }

    public int getnSidang2() {
        return nSidang2;
    }

    public void setnSidang2(int nSidang2) {
        this.nSidang2 = nSidang2;
    }

    public int getnSidang3() {
        return nSidang3;
    }

    public void setnSidang3(int nSidang3) {
        this.nSidang3 = nSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "Doktor{" + "judulDisertasi=" + judulDisertasi + ", nSidang1=" + nSidang1 + ", nSidang2=" + nSidang2 + ", nSidang3=" + nSidang3 + '}';
    }
    
    
}
