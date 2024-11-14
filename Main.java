import View.MainMenu;
import Model.DataDummy;

public class Main {
    public static void main(String[] args) {
        DataDummy.createDummy();
        MainMenu.menu();
    }
}
