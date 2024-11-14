package Model;

import java.util.HashMap;

import Model.Enum.*;

public class DataDummy {
    static HashMap<String, Ticket> listTicket = new HashMap<String, Ticket>();

    public static void createDummy() {
        Passenger[] passenger = {
                new Passenger("Pria", 23, "001", "John"),
                new Passenger("Pria", 40, "002", "Ben"),
                new Passenger("Wanita", 32, "003", "Elysia"),
                new Passenger("Pria", 32, "004", "Ren"),
                new Passenger("Wanita", 28, "005", "Evelstine")
        };

        Train[] train = {
                new Train(11, "Cihuy Express", TrainType.FASTTRAIN),
                new Train(55, "Kereta ajah", TrainType.FASTTRAIN),
                new Train(44, "Astral Express", TrainType.STANDARD),
                new Train(22, "Gaskeun Mang", TrainType.FASTTRAIN),
                new Train(33, "Choo Choo", TrainType.STANDARD)
        };

        Ticket[] tiket = {
                new Ticket("01", "21", 350000, ClassType.FIRST_CLASS, TicketStatus.PAID),
                new Ticket("02", "24", 500000, ClassType.BUSINESS_CLASS, TicketStatus.AWAITING_PAYMENT),
                new Ticket("03", "18", 600000, ClassType.FIRST_CLASS, TicketStatus.CANCELED),
                new Ticket("04", "10", 175000, ClassType.ECONOMY_CLASS, TicketStatus.AWAITING_PAYMENT),
                new Ticket("05", "11", 400000, ClassType.ECONOMY_CLASS, TicketStatus.PAID),
        };

        OnlinePayment[] payments = {
            new OnlinePayment("123", "PayPal"),
            new OnlinePayment("456", "DOKU"),
            new OnlinePayment("789", "PayPal"),
            new OnlinePayment("321", "Xendit"),
            new OnlinePayment("987", "DOKU")
        };

        for (int i = 0; i < tiket.length; i++) {
            listTicket.put("", tiket[i]);
        }
    }

    public static HashMap<String, Ticket> getListTicket() {
        return listTicket;
    }

    public static void setListTicket(HashMap<String, Ticket> listTicket) {
        DataDummy.listTicket = listTicket;
    }

}
