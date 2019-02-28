package lesson3;

import lesson3.contract.Climateble;

public class Truck extends Car implements Climateble {

    public Truck (String manufacture, int year, String color){
        super(manufacture,year,color);
    }


    @Override
    protected String getName(){
        return "Hello world";
    }
}
