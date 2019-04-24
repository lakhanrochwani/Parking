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
        rc.addCar();
        List<CarDetails> actual = rc.getCar();

        CarDetails expected = new CarDetails(4,8, "ABC");

        assertEquals(actual[0], expected);
    }
}
