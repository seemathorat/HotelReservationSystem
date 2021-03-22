package com;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class HotelManager {
    public static ArrayList<HotelReservation> hotels = new ArrayList<>();

    public ArrayList<HotelReservation> addHotel(HotelReservation hotel) {
        hotels.add(hotel);
        return hotels;

    }

    public HotelReservation cheapestHotelList(LocalDate date1, LocalDate date2) {
        long days = ChronoUnit.DAYS.between(date1, date2);
        HotelReservation min = Collections.min(hotels, Comparator.comparing(hotelInfo -> hotelInfo.rate));
        int cheapest;
        cheapest = (int) (days * min.rate);
        System.out.println("Cheapest Hotel Name: " + min.Hotel_Name+ "\nTotal Rate: " + cheapest);
        return min;
    }
}


