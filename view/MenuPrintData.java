package view;

import controller.CariDataUser;
import controller.PrintData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;

public class MenuPrintData {
    public MenuPrintData(ArrayList<User> user){
        String nama = JOptionPane.showInputDialog(null, "Input Nama User", "Print Data User",JOptionPane.QUESTION_MESSAGE);
        if(nama!=null){
            CariDataUser cariData = new CariDataUser();
            User data = cariData.CariData(user,nama);
            if(data==null){
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Error", 0);
            }else{
                PrintData dataUser = new PrintData();
                StringBuilder string = dataUser.PrintDataUser(data);
                JOptionPane.showMessageDialog(null, string, "Print Data User", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
