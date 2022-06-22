package model;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap(int salary, String departemen, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "DosenTetap{" + "salary=" + salary + '}';
    }
    
    
}
