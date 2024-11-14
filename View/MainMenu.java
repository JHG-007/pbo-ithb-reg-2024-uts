package View;

import java.util.Scanner;

public class MainMenu {
    static Scanner scan = new Scanner(System.in);

    public static void menu(){

        System.out.print("1. Harga Tiket\n2. Total Revenue\nPilih: ");
        int pilih = scan.nextInt();
        switch (pilih) {
            case 1:
                PrintTotal.printTiket();
                break;
            case 2:
                PrintTotal.printRevenue();
                break;
            default:
                System.out.println("Menu not found!");
                break;
        }
    }
}
