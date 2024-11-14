package Model;

import java.util.Date;

public class GroupReservation extends Reservation {
    String groupName;
    int numberofPassenger;

    public GroupReservation(String reservationID, Date reservationDate, String groupName, int numberofPassenger) {
        super(reservationID, reservationDate);
        this.groupName = groupName;
        this.numberofPassenger = numberofPassenger;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberofPassenger() {
        return numberofPassenger;
    }

    public void setNumberofPassenger(int numberofPassenger) {
        this.numberofPassenger = numberofPassenger;
    }

}
