package controller;

import model.Dosen;
import model.MatkulAjar;
import model.PresensiStaff;

public class HitungPresensi {
    public HitungPresensi(){}
    
    public int HitungJamKerjaDosen(Dosen data){
        int jamKerja = 0;
        for(MatkulAjar listMk : data.getMatakuliah()){
            for(PresensiStaff presensi : listMk.getPresensi()){
                if(presensi.getStatus()==1){
                    jamKerja+=presensi.getJam();
                }
            }
        }
        return jamKerja;
    }
    
    public int HitungJumlahKehadiran(PresensiStaff[] presensi){
        int unitPresensi = 0;
        for(PresensiStaff unit : presensi){
            if(unit.getStatus()==1){
                unitPresensi++;
            }
        }
        return unitPresensi;
    }
}
