package Controller;

import java.util.ArrayList;

import Model.*;

public class Calculate {
    public static double ticketPayment(String ID) {
        Ticket payment = DataDummy.getListTicket().get(ID);
        double total = 0;
        if (payment instanceof Ticket) {
            total = ((OnlinePayment) payment).makePayment();
        }
        return total;
    }

    public static double totalRevenue(ArrayList<String> listID) {
        double total = 0;
        for (String ID : listID) {
            total += ticketPayment(ID);
        }
        return total;
    }
}
