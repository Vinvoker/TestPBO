package model;

import java.util.Arrays;


public class Karyawan extends Staff{
    private int salary;
    private PresensiStaff[] presensi = new PresensiStaff[5];

    public Karyawan(int salary, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
        return super.toString() + "Karyawan{" + "salary=" + salary + ", presensi=" + Arrays.toString(presensi) + '}';
    }
    
    
}
