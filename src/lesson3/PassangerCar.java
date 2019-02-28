package lesson3;

class PassengerCar extends Car {

    public PassengerCar (String manufacture, int year, String color){

        super(manufacture,year,color);
    }


    @Override
    protected String getName(){
        return "Hello world";
    }

}
