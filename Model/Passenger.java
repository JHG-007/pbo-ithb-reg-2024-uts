package Model;

public class Passenger {
    int passengerAge;
    String passengerID, passengerName, passengerGender;

    public Passenger(String passengerGender, int passengerAge, String passengerID, String passengerName) {
        this.passengerGender = passengerGender;
        this.passengerAge = passengerAge;
        this.passengerID = passengerID;
        this.passengerName = passengerName;
    }

    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void getPassengerInfo() {
        System.out.println("ID: " + passengerID + "Name: " + passengerName + "Age: " + passengerAge + "Gender: "
                + passengerGender);
    }

}