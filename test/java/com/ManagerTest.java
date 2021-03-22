package com;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    HotelReservation lakewood = new HotelReservation("Lakewood", 100, "seema", 1);
    HotelReservation bridgewood = new HotelReservation("Bridgewood", 200, "Siddhesh", 6);
    HotelReservation ridgewood = new HotelReservation("Ridgewood", 300, "Ram", 3);

    HotelReservation lakewood1 = new HotelReservation("Lakewood", 100, "seema", 5);
    HotelReservation bridgewood2 = new HotelReservation("Bridgewood", 200, "Siddhesh", 4);
    HotelReservation ridgewood3 = new HotelReservation("Ridgewood", 300, "Ram", 4);


    @Test
    public void given_Hotel_Add_Result_True() {

        Assertions.assertTrue(hotels.contains(lakewood));
        Assertions.assertTrue(hotels.contains(bridgewood));
        Assertions.assertTrue(hotels.contains(ridgewood));
        hotels.forEach(System.out::println);
    }

    @Test
    public void given_Hotel_IS_Cheapest_List_True() {
        LocalDate date1 = LocalDate.of(2019, 2, 10);
        LocalDate date2 = LocalDate.of(2018, 4, 11);

        HotelReservation cheapesthotel = hotelReservation.cheapestHotelList(date1, date2);

        Assertions.assertEquals("Lakewood", cheapesthotel.Hotel_Name);
    }
}