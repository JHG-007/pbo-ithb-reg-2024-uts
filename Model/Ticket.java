package Model;

import Model.Enum.ClassType;
import Model.Enum.TicketStatus;

public class Ticket {
    String ticketID, seatNumber;
    double ticketPrice;
    ClassType classType;
    TicketStatus status;

    public Ticket(String ticketID, String seatNumber, double ticketPrice, ClassType classType, TicketStatus status) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.classType = classType;
        this.status = status;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public void getTicketStatus() {
        System.out.println("Ticket: " + ticketID + ", Seat number: " + seatNumber + ", Ticket Price: " + ticketPrice
                + ", Class: " + classType + ", Status: " + status);
    }
}
