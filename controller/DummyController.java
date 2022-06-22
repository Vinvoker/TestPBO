package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import model.*;
import static model.Status.*;

public class DummyController {

    public DummyController() {}
    
    public ArrayList<MataKuliah> CreateDummyMK(){
        ArrayList<MataKuliah> mk = new ArrayList<>();
        
        MataKuliah Algo = new MataKuliah("IF-101",4,"Algoritma dan Pemrograman");
        mk.add(Algo);
        MataKuliah WebDes = new MataKuliah("IF-102",2,"Web Design");
        mk.add(WebDes);
        MataKuliah Inggris = new MataKuliah("IF-103",2,"Bahasa Inggris");
        mk.add(Inggris);
        MataKuliah StrukDat = new MataKuliah("IF-201",4,"Struktur Data");
        mk.add(StrukDat);
        MataKuliah Kalkulus2 = new MataKuliah("IF-203",3,"Kalkulus II");
        mk.add(Kalkulus2);
        MataKuliah ML = new MatKulPilihan(12,"IF-503",3,"Machine Learning");
        mk.add(ML);
        return mk;
    }
    
    public ArrayList<User> CreateDummyData(ArrayList<MataKuliah> mk){
        ArrayList<User> user = new ArrayList<>();
        MataKuliah Algo = mk.get(0);
        MataKuliah WebDes = mk.get(1);
        MataKuliah Inggris = mk.get(2);
        MataKuliah StrukDat = mk.get(3);
        MataKuliah Kalkulus2 = mk.get(4);
        MataKuliah ML = mk.get(5);
        
        Sarjana sarjana1 = new Sarjana("1120001","IF","Nadia","Jl. Apel No.23","Bandung","088372454824");
        sarjana1.addMatakuliah(new MatkulAmbil(Algo,20,20,70));
        sarjana1.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 8, 1),HADIR),0);
        sarjana1.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 8, 8),HADIR),1);
        sarjana1.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 8, 15),HADIR),2);
        sarjana1.addMatakuliah(new MatkulAmbil(WebDes,80,82,84));
        sarjana1.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 8, 2),HADIR),0);
        sarjana1.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 8, 9),ALPHA),1);
        sarjana1.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 8, 16),HADIR),2);
        sarjana1.addMatakuliah(new MatkulAmbil(Inggris,86,86,92));
        sarjana1.getMatakuliah(2).addPresensi(new Presensi(LocalDate.of(2020, 8, 3),HADIR),0);
        sarjana1.getMatakuliah(2).addPresensi(new Presensi(LocalDate.of(2020, 8, 10),HADIR),1);
        sarjana1.getMatakuliah(2).addPresensi(new Presensi(LocalDate.of(2020, 8, 17),HADIR),2);
        user.add(sarjana1);
        
        Sarjana sarjana2 = new Sarjana("1120015","IF","Amel","Jl. Jeruk No.1","Bandung","088312322324");
        sarjana2.addMatakuliah(new MatkulAmbil(Algo,90,88,60));
        sarjana2.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 8, 1),HADIR),0);
        sarjana2.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 8, 8),HADIR),1);
        sarjana2.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 8, 15),HADIR),2);
        sarjana2.addMatakuliah(new MatkulAmbil(WebDes,85,82,80));
        sarjana2.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 8, 2),HADIR),0);
        sarjana2.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 8, 9),HADIR),1);
        sarjana2.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 8, 16),HADIR),2);
        sarjana2.addMatakuliah(new MatkulAmbil(Inggris,70,78,85));
        sarjana2.getMatakuliah(2).addPresensi(new Presensi(LocalDate.of(2020, 8, 3),ALPHA),0);
        sarjana2.getMatakuliah(2).addPresensi(new Presensi(LocalDate.of(2020, 8, 10),HADIR),1);
        sarjana2.getMatakuliah(2).addPresensi(new Presensi(LocalDate.of(2020, 8, 17),HADIR),2);
        user.add(sarjana2);
        
        Magister magister1 = new Magister("PERENCANAAN SISTEM INFORMASI","1119020","IF","Andre","Jl.Durian No.98","Bandung","082763122768");
        magister1.addMatakuliah(new MatkulAmbil(StrukDat,90,90,90));
        magister1.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 9, 1),HADIR),0);
        magister1.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 9, 8),HADIR),1);
        magister1.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 9, 15),HADIR),2);
        magister1.addMatakuliah(new MatkulAmbil(Kalkulus2,88,81,92));
        magister1.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 9, 1),HADIR),0);
        magister1.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 9, 8),HADIR),1);
        magister1.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 9, 15),HADIR),2);
        user.add(magister1);
        
        Magister magister2 = new Magister("SISTEM PENDETEKSI WAJAH MANUSIA PADA CITRA DIGITAL","1119023","IF","Josep","Jl.Apel No.78","Bandung","082712677768");
        magister2.addMatakuliah(new MatkulAmbil(StrukDat,79,75,89));
        magister2.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 9, 1),HADIR),0);
        magister2.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 9, 8),HADIR),1);
        magister2.getMatakuliah(0).addPresensi(new Presensi(LocalDate.of(2020, 9, 15),HADIR),2);
        magister2.addMatakuliah(new MatkulAmbil(Kalkulus2,88,81,92));
        magister2.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 9, 1),HADIR),0);
        magister2.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 9, 8),HADIR),1);
        magister2.getMatakuliah(1).addPresensi(new Presensi(LocalDate.of(2020, 9, 15),HADIR),2);
        user.add(magister2);
        
        Doktor doktor1 = new Doktor("Representasi Pengetahuan Dengan Graf Spasial Temporal",85,87,89,"1118020","IF","Bimo","Jl. Manggis No.12","Bandung","08367264273");
        user.add(doktor1);
        
        Doktor doktor2 = new Doktor("APLIKASI SISTEM PAKAR MENGGUNAKAN METODE FORWARD CHAINING",80,80,80,"1118021","IF","Agus","Jl. Manggis No.128","Bandung","08354657273");
        user.add(doktor2);

        Karyawan karyawan1 = new Karyawan(2000000,"123336","Bambang","Jl.Mangga No.33","Bandung","08460919838");
        karyawan1.addPresensi(new PresensiStaff(5,LocalDate.of(2020, 8, 1),HADIR),0);
        karyawan1.addPresensi(new PresensiStaff(5,LocalDate.of(2020, 8, 2),HADIR),1);
        karyawan1.addPresensi(new PresensiStaff(5,LocalDate.of(2020, 8, 3),HADIR),2);
        karyawan1.addPresensi(new PresensiStaff(5,LocalDate.of(2020, 8, 4),ALPHA),3);
        karyawan1.addPresensi(new PresensiStaff(5,LocalDate.of(2020, 8, 5),HADIR),4);
        user.add(karyawan1);

        Karyawan karyawan2 = new Karyawan(1200000,"123337","Anton","Jl.Jeruk No.78","Bandung","08411895838");
        karyawan2.addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 1),ALPHA),0);
        karyawan2.addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 2),HADIR),1);
        karyawan2.addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 3),HADIR),2);
        karyawan2.addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 4),HADIR),3);
        karyawan2.addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 5),ALPHA),4);
        user.add(karyawan2);
        
        Honorer dosenHonorer1 = new Honorer(300000,"IF","123666","Yoga","Jl.Rambutan No.11","Bandung","08469273868");
        dosenHonorer1.addMatakuliah(new MatkulAjar(Algo));
        dosenHonorer1.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 1),HADIR),0);
        dosenHonorer1.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 8),HADIR),1);
        dosenHonorer1.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 15),HADIR),2);
        user.add(dosenHonorer1);
        
        Honorer dosenHonorer2 = new Honorer(350000,"IF","123667","Ami","Jl.Singkong No.15","Bandung","08469118960");
        dosenHonorer2.addMatakuliah(new MatkulAjar(WebDes));
        dosenHonorer2.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 2),HADIR),0);
        dosenHonorer2.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 9),HADIR),1);
        dosenHonorer2.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 8, 16),HADIR),2);
        user.add(dosenHonorer2);
        
        DosenTetap dosenTetap1 = new DosenTetap(5000000,"IF","123456","Bagus","Jl.Semangka No.111","Bandung","084647368");
        dosenTetap1.addMatakuliah(new MatkulAjar(StrukDat));
        dosenTetap1.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 9, 1),HADIR),0);
        dosenTetap1.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 9, 8),ALPHA),1);
        dosenTetap1.getMatakuliah(0).addPresensi(new PresensiStaff(3,LocalDate.of(2020, 9, 15),HADIR),2);
        dosenTetap1.addMatakuliah(new MatkulAjar(ML));
        dosenTetap1.getMatakuliah(1).addPresensi(new PresensiStaff(2,LocalDate.of(2020, 9, 1),HADIR),0);
        dosenTetap1.getMatakuliah(1).addPresensi(new PresensiStaff(2,LocalDate.of(2020, 9, 8),HADIR),1);
        dosenTetap1.getMatakuliah(1).addPresensi(new PresensiStaff(2,LocalDate.of(2020, 9, 15),HADIR),2);
        user.add(dosenTetap1);
        
        DosenTetap dosenTetap2 = new DosenTetap(5000000,"IF","123457","Aurel","Jl.Manggis No.113","Bandung","082356368");
        dosenTetap2.addMatakuliah(new MatkulAjar(Inggris));
        dosenTetap2.getMatakuliah(0).addPresensi(new PresensiStaff(2,LocalDate.of(2020, 8, 3),HADIR),0);
        dosenTetap2.getMatakuliah(0).addPresensi(new PresensiStaff(2,LocalDate.of(2020, 9, 8),HADIR),1);
        dosenTetap2.getMatakuliah(0).addPresensi(new PresensiStaff(2,LocalDate.of(2020, 9, 15),HADIR),2);
        user.add(dosenTetap2);
        
        return user;
    }
    
}
