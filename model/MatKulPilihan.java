package model;

public class MatKulPilihan extends MataKuliah{
    private int minimumMahasiswa;

    public MatKulPilihan(int minimumMahasiswa, String kode, int SKS, String nama) {
        super(kode, SKS, nama);
        this.minimumMahasiswa = minimumMahasiswa;
    }

    public int getMinimumMahasiswa() {
        return minimumMahasiswa;
    }

    public void setMinimumMahasiswa(int minimumMahasiswa) {
        this.minimumMahasiswa = minimumMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + "MatKulPilihan{" + "minimumMahasiswa=" + minimumMahasiswa + '}';
    }
    
    
}
