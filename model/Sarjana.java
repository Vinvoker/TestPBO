package model;

import java.util.ArrayList;
public class Sarjana extends Mahasiswa{
    private ArrayList<MatkulAmbil> mkAmbil = new ArrayList<>();

    public Sarjana(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
    }

    public ArrayList<MatkulAmbil> getMatakuliah() {
        return mkAmbil;
    }
    
    public MatkulAmbil getMatakuliah(int i) {
        return this.mkAmbil.get(i);
    }
    
    public MatkulAmbil getMatakuliah(String kode) {
        int i = 0;
        for (MatkulAmbil element : mkAmbil){
            if (element.getMataKuliah().getKode().equals(kode)){
                return this.mkAmbil.get(i);
            }else{
                i++;
            }
        }
        return null;
    }

    public void setMatakuliah(ArrayList<MatkulAmbil> mkAmbil) {
        this.mkAmbil = mkAmbil;
    }
    
    public void addMatakuliah(MatkulAmbil mkAmbil) {
        this.mkAmbil.add(mkAmbil);
    }

    @Override
    public String toString() {
        return super.toString() + "Sarjana{" + "mkAmbil=" + mkAmbil + '}';
    }
    
    
    
}
