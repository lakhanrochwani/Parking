package Parking.com.parking.Rate;

import org.junit.Before;
import org.junit.Test;
import Parking.com.parking.Rate.RateController;
import java.util.*;


import static org.junit.Assert.assertEquals;

public class RateTest {
    private RateController rc;

    @Before
    public void SetUp() {
        rc = new RateController();
    }

    @Test
    public void getCar_Test(){
        List<CarDetails> expected = new ArrayList<>();

        List<CarDetails> actual = rc.getCar();

        assertEquals(expected,actual);

    }

    @Test
    public void addCar_Test(){
        List<CarDetails> car_list = new ArrayList<>();
        CarDetails cd = new CarDetails(4,8, "ABC");
        rc.addCar(4, 8, "ABC");
        List<CarDetails> expected = rc.getCar();

        CarDetails actual = new CarDetails(4,8, "ABC");

        assertEquals(expected.get(0), actual);
    }

    @Test
    public void parkingFee_Test(){
        List<CarDetails> car_list = new ArrayList<>();
        double expected = rc.parkingFee(4,8);
        double actual = 20.0;

        assertEquals(expected, actual,0.1);
    }
}
