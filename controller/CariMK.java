package controller;

import java.util.ArrayList;
import model.MataKuliah;

public class CariMK {
    public CariMK(){}
    
    public String CariNamaMKbyKode(ArrayList<MataKuliah> mk, String Kode){
        for (MataKuliah mataKuliah: mk) {
            if(mataKuliah.getKode().equals(Kode)){
                return mataKuliah.getNama();
            }
        }
        return "";
    }
}
