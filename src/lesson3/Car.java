package lesson2;

public abstract class Car {

    private String manufacture;
    private int year;
    private String color;


    public Car(String manufacture, int year, String color) {
        this.manufacture = manufacture;
        this.year = year;
        this.color = color;
    }

    protected abstract String getName();

    public void gas(){
       System.out.println("move");
    }
    public void stop(){
        System.out.println("stop");
    }
}
