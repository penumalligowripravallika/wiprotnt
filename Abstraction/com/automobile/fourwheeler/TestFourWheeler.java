package com.automobile.fourwheeler;

public class TestFourWheeler {
	public static void main(String[] args) {

        Logan logan = new Logan();

        System.out.println("Model Name : " + logan.getModelName());
        System.out.println("Registration Number : " + logan.getRegistrationNumber());
        System.out.println("Owner Name : " + logan.getOwnerName());
        System.out.println("Speed : " + logan.speed());
        System.out.println("GPS : " + logan.gps());

        System.out.println("-------------------------");

        Ford ford = new Ford();

        System.out.println("Model Name : " + ford.getModelName());
        System.out.println("Registration Number : " + ford.getRegistrationNumber());
        System.out.println("Owner Name : " + ford.getOwnerName());
        System.out.println("Speed : " + ford.speed());
        System.out.println("Temperature : " + ford.tempControl());
    }

}
