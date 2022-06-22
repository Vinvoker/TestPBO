package model;

public class Honorer extends Dosen{
    private int honorPerSKS;

    public Honorer(int honorPerSKS, String departemen, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "Honorer{" + "honorPerSKS=" + honorPerSKS + '}';
    }
    
    
}
