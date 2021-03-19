package com;
import java.util.ArrayList;

public class HotelManager {
    public static ArrayList<HotelReservation> hotels = new ArrayList<>();
    public ArrayList<HotelReservation> addHotel(HotelReservation hotel){
        hotels.add(hotel);
        return hotels;

    }
}


