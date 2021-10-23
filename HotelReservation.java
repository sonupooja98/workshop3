package com.bridgelabzworkshop3;
import java.util.*;

class Hotel{
    public String hotelName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(int hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public  int hotelPrice;

    public Hotel(String hotelName, int hotelPrice) {
        this.hotelName = hotelName;
        this.hotelPrice = hotelPrice;
    }

    public String toString(){
        return "Hotel Name: "+hotelName +"Hotel Price: "+hotelPrice;
    }
}

public class HotelReservation {

    public ArrayList<Hotel> hotelDetails;

    public HotelReservation() {
        hotelDetails = new ArrayList<>();
    }

    public void addHotel(String hotelName, Integer hotelPrice) {
        Hotel adder = new Hotel(hotelName, hotelPrice);
        hotelDetails.add(adder);
    }

    public void getMinPriceHotel(){
        Hotel min =  hotelDetails.stream().min(Comparator.comparing(Hotel::getHotelPrice)).orElseThrow();
        System.out.println(min);
    }

    public void getHotelDetails() {
        String hotelName1 = "LakeWood";
        String hotelName2 = "BridgeWood";
        String hotelName3 = "RidgeWood";
        int lackWoodPrice1 = 100;
        int bridgeWoodPrice1 = 160;
        int ridgeWoodPrice1 = 220;

        addHotel(hotelName1, lackWoodPrice1);
        addHotel(hotelName2, bridgeWoodPrice1);
        addHotel(hotelName3, ridgeWoodPrice1);
    }

    public void viewHotels() {
        getHotelDetails();
        System.out.println(hotelDetails);
    }
}