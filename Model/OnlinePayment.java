package Model;

import Model.Enum.ClassType;
import Model.Enum.TicketStatus;
import Model.Enum.TrainType;
import Model.Interface.*;

public class OnlinePayment implements Payment_Interface {
    String transactionID, paymentGateway;
    Ticket tiket;
    TrainType trainType;
    ClassType classType;


    public OnlinePayment(String transactionID, String paymentGateway) {
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public Ticket getTiket() {
        return tiket;
    }

    public void setTiket(Ticket tiket) {
        this.tiket = tiket;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    @Override
    public double makePayment() {
        double total = 0;
        if (this.trainType == TrainType.FASTTRAIN) {
            if (this.classType == ClassType.FIRST_CLASS) {
                tiket.setTicketPrice(600000);
            } else if (this.classType == ClassType.BUSINESS_CLASS) {
                tiket.setTicketPrice(500000);
            } else {
                tiket.setTicketPrice(400000);
            }
        } else {
            if (this.classType == ClassType.FIRST_CLASS) {
                tiket.setTicketPrice(350000);
            } else if (this.classType == ClassType.BUSINESS_CLASS) {
                tiket.setTicketPrice(250000);
            } else {
                tiket.setTicketPrice(175000);
            }
        }

        if (tiket.getStatus() == TicketStatus.PAID || tiket.getStatus() == TicketStatus.AWAITING_PAYMENT
                || tiket.getStatus() != TicketStatus.CANCELED) {
            total += tiket.getTicketPrice();
        }
        return total;
    }
}
