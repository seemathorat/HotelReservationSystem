package com;
public class HotelReservation {
    String Hotel_Name;
    int rate;
    public String Regular_Customer_Type;
    public  int Weekday_Rate;

    public HotelReservation(String hotelName, Integer rate, String Regular_Customer_Type,Integer Weekday_Rate) {
        this.Hotel_Name = hotelName;
        this.rate = rate;
        this.Regular_Customer_Type = Regular_Customer_Type;
        this.Weekday_Rate=Weekday_Rate;
    }


    public void setHotel_Name(String Hotel_Name) {
        this.Hotel_Name = Hotel_Name;
    }

    public String getHotelName() {
        return Hotel_Name;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }


    public Integer getRate() {
        return rate;

    }

    public void setRegular_Customer_Type(String regular_Customer_Type) {
        Regular_Customer_Type = regular_Customer_Type;
    }

    public String getRegular_Customer_Type() {
        return Regular_Customer_Type;

    }

    public void setWeekday_Rate(Integer Weekday_Rate) {
       this.Weekday_Rate = Weekday_Rate;
    }

    public Integer getWeekday_Rate() {
        return Weekday_Rate;

    }

    @Override
    public String toString() {
        return "HotelReservation{" +
                "HotelName='" +Hotel_Name + '\'' +
                "HotelRate" +rate +
                ", Regular_Customer_Type=" + Regular_Customer_Type+
                ",Weekday_Rate="+ Weekday_Rate +
                '}';
    }
}




