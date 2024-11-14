package View;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.*;

public class PrintTotal {
    static Scanner scan = new Scanner(System.in);

    public static void printTiket() {
        System.out.print("Masukkan ID tiket: ");
        String ID = scan.nextLine();
        double total = Calculate.ticketPayment(ID);
        System.out.println("Harga tiket: " + total);
    }

    public static void printRevenue() {
        ArrayList<String> listID = new ArrayList<String>();
        double total = Calculate.totalRevenue(listID);
        System.out.println("Total Revenue: " + total);
    }
}
