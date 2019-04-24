package Parking.com.parking.Rate;

public class CarDetails {
    private int inTime;
    private int outTime;
    private String carPlate;

    public CarDetails(int inTime, int outTime, String carPlate) {
        this.inTime = inTime;
        this.outTime = outTime;
        this.carPlate = carPlate;
    }

    public int getInTime(){
        return inTime;
    }

    public int getOutTime(){
        return outTime;
    }

    public String getCarPlate(){
        return carPlate;
    }

    public int parkingTime(int inTime, int outTime){
        return outTime - inTime;
    }

}
