package Parking.com.parking.Rate;

import Parking.com.parking.Rate.CarDetails;
import java.util.*;

public class RateController {
    List<CarDetails> car = new ArrayList<>(10);


    public List<CarDetails> getCar() {
        return car;
    }
    
    public void addCar() {
        CarDetails cd = new CarDetails(4,8, "ABC");
        car.add(cd);
    }

    public double parkingFee(int inTime, int outTime) {
        double fee;
        fee = 5 * (outTime - inTime);

        return fee;

    }



    
    
    


}
