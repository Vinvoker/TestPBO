package main;

import controller.DummyController;
import java.util.ArrayList;
import model.MataKuliah;
import model.User;
import view.MainMenu;

public class main {
    public static void main(String[] args) {
        
        DummyController dummy = new DummyController();
        ArrayList<MataKuliah> mk = dummy.CreateDummyMK();
        ArrayList<User> user = dummy.CreateDummyData(mk);
        
        new MainMenu(user,mk);
    }
}
