package model;

public class Staff extends User{
    private String NIK;

    public Staff(String NIK, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString() + "Staff{" + "NIK=" + NIK + '}';
    }
    
    
}
