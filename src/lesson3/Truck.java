package lesson2;

public abstract class Truck extends Car implements Climateble{

    public Truck (String manufacture, int year, String color){
        super(manufacture,year,color);
    }


    @Override
    protected String getName(){

    }
}
