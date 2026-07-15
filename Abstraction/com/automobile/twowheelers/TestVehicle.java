package com.automobile.twowheeler;

public class TestVehicle {
	 public static void main(String[] args) {

	        Hero h = new Hero();

	        System.out.println(h.getModelName());
	        System.out.println(h.getRegistrationNumber());
	        System.out.println(h.getOwnerName());
	        System.out.println(h.getSpeed());
	        h.radio();

	        System.out.println("----------------");

	        Honda hd = new Honda();

	        System.out.println(hd.getModelName());
	        System.out.println(hd.getRegistrationNumber());
	        System.out.println(hd.getOwnerName());
	        System.out.println(hd.getSpeed());
	        hd.cdplayer();
	    }

}
