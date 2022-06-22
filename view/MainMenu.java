package view;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.MataKuliah;
import model.User;

public class MainMenu {
    
    public MainMenu(ArrayList<User> user, ArrayList<MataKuliah> mk){
        boolean exit = false;
        do{
            int menu = parseInt(JOptionPane.showInputDialog(null, "Menu\n"
                + "1. Print Data User\n"
                + "2. Print Nilai Akhir\n"
                + "3. Print Rata-rata Nilai Akhir\n"
                + "4. Print Mahasiswa Tidak Lulus\n"
                + "5. Print Mata Kuliah & Presensi Mahasiswa\n"
                + "6. Print Jam Kerja Dosen\n"
                + "7. Print Total Pendapatan Staff\n"
                + "8. Exit", "Main Menu",JOptionPane.QUESTION_MESSAGE));
            switch(menu){
                case 1:
                    new MenuPrintData(user);
                    break;
                case 2:
                    new MenuPrintNilai(user);
                    break;
                case 3:
                    new MenuPrintRataRataNilai(user);
                    break;
                case 4:
                    new MenuPrintTidakLulus(user,mk);
                    break;
                case 5:
                    new MenuPrintMkAmbilMhs(user);
                    break;
                case 6:
                    new MenuPrintJamKerjaDosen(user);
                    break;
                case 7:
                    new MenuPrintPendapatanStaff(user);
                    break;
                case 8:
                    exit = true;
            }
        }while(exit!=true);
        
    }
}
