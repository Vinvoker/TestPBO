package model;

public class Mahasiswa extends User {
    private String NIM;
    private String jurusan;

    public Mahasiswa(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "Mahasiswa{" + "NIM=" + NIM + ", jurusan=" + jurusan + '}';
    }
    
    
}
