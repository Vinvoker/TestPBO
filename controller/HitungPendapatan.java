package controller;

import model.Dosen;
import model.DosenTetap;
import model.Honorer;
import model.Karyawan;
import model.MatkulAjar;
import model.Staff;

public class HitungPendapatan {
    public HitungPendapatan(){}
    
    public double HitungPendapatanStaff(Staff staff){
        double pendapatan = 0;
        if(staff instanceof Karyawan){
            Karyawan karyawan = (Karyawan)staff;
            pendapatan = HitungPendapatanKaryawan(karyawan);
        }else if(staff instanceof Dosen){
            Dosen dosen = (Dosen)staff;
            pendapatan = HitungPendapatanDosen(dosen);
        }
        return pendapatan;
    }
    
    public double HitungPendapatanKaryawan(Karyawan karyawan){
        HitungPresensi presensi = new HitungPresensi();
        int kehadiran = presensi.HitungJumlahKehadiran(karyawan.getPresensi());
        double pendapatan = (kehadiran * karyawan.getSalary())/22;
        return pendapatan;
    }
    
    public double HitungPendapatanDosen(Dosen dosen){
        double pendapatan = 0;
        int kehadiran = 0;
        HitungPresensi presensi = new HitungPresensi();
        for (MatkulAjar mkAjar : dosen.getMatakuliah()){
            kehadiran += presensi.HitungJumlahKehadiran(mkAjar.getPresensi());
        }
        if(dosen instanceof DosenTetap){
            DosenTetap dosenTetap = (DosenTetap) dosen;
            pendapatan = dosenTetap.getSalary()+(kehadiran*25000);
        }else{
            Honorer honorer = (Honorer) dosen;
            pendapatan = kehadiran*honorer.getHonorPerSKS();
        }
        return pendapatan;
    }
}
