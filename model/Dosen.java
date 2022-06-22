package model;

import java.util.ArrayList;

public class Dosen extends Staff{
    private String departemen;
    private ArrayList<MatkulAjar> mkAjar = new ArrayList<>();

    public Dosen(String departemen, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getMatakuliah() {
        return mkAjar;
    }

    public MatkulAjar getMatakuliah(int a) {
        return this.mkAjar.get(a);
    }
    
    public MatkulAjar getMatakuliah(String kode) {
        int i = 0;
        for (MatkulAjar element : mkAjar){
            if (element.getMataKuliah().getKode().equals(kode)){
                return this.mkAjar.get(i);
            }else{
                i++;
            }
        }
        return null;
    }
    
    public void setMatakuliah(ArrayList<MatkulAjar> mkAjar) {
        this.mkAjar = mkAjar;
    }

    public void addMatakuliah(MatkulAjar mkAjar) {
        this.mkAjar.add(mkAjar);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Dosen{" + "departemen=" + departemen + ", mkAjar=" + mkAjar + '}';
    }
    
    
}
