package lesson3;

public abstract class Program{

    private static Truck truck;

    public static void main(String[] args) {

        Engin eng = new Engin(3);

        truck = new Truck("BMW",2001,"red");
        truck.gas();
        truck.climateControl();
        truck.getName();
        truck.stop();

    }

}

