package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static com.HotelManager.hotels;

class ManagerTest {
    HotelManager hotelReservation;

    @BeforeEach
    public void add() {
        hotelReservation = new HotelManager();
        hotelReservation.addHotel(lakewood);
        hotelReservation.addHotel(bridgewood);
        hotelReservation.addHotel(ridgewood);

    }

    HotelReservation lakewood = new  HotelReservation("Lakewood", 100,"seema");
    HotelReservation bridgewood = new  HotelReservation("Bridgewood", 200, "Siddhesh");
    HotelReservation ridgewood = new  HotelReservation("Ridgewood", 300, "Ram");


    @Test
    public void given_Hotel_Add_Result_True(){

        Assertions.assertTrue(hotels.contains(lakewood));
        Assertions.assertTrue(hotels.contains(bridgewood));
        Assertions.assertTrue(hotels.contains(ridgewood));
        hotels.forEach(System.out::println);
    }
}


