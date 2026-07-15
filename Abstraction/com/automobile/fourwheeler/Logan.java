package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Logan extends Vehicle {
	@Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS09AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Pravallika";
    }

    public int speed() {
        return 120;
    }

    public int gps() {
        return 1;
    }

}
