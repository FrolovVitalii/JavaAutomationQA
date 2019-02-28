package lesson3;

public abstract class Car {

    private String manufacture;
    private int year;
    private String color;
    private Engin engin = new Engin(5);


    public Car(String manufacture, int year, String color, Engin engin) {
        this.manufacture = manufacture;
        this.year = year;
        this.color = color;
        this.engin = engin;
    }

    public Car(String manufacture, int year, String color) {
        this.manufacture = manufacture;
        this.year = year;
        this.color = color;
    }

    protected abstract String getName();

    public void gas(){
        engin.start();
        System.out.println("move");
    }
    public void stop(){
        engin.start();
        System.out.println("stop");
    }
}
