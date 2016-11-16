package com.greenfox.bx;

public class Reservation implements Reservationy {

    String dowBooking;

    public void setDowBooking(String dowBooking){
        this.dowBooking=dowBooking;
    }
    public String getDowBooking(){
        ;
    }

    public void setCodeBooking(String codeBooking){
        ;
    }

    public String getCodeBooking() {
        return null;
    }

    public boolean PlaceReserved (String dowBooking, String codeBooking){
    return true;
}
    public boolean PlaceCancelled (String dowBooking,String codeBooking){
    return true;
    }

    public String toString (){
        ;
    }




    // this is somewhere in the code...
final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // and someplace else in the code
        this.codeBooking = randomZeroToZ(8);

// and this is how I got the code
static String randomZeroToZ(int len) {
        String out = "";
        for(int i= 0; i<len; i++) {
        out += ls.charAt((int) (Math.random() * 36));
        }
        return out;
        }
}