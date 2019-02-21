package JavaIntro;

public class MainClass {
    public static void main(String[] args) {
        HelloWorld.printHW();

        HelloWorld temp = new HelloWorld();
        temp.printHW("Vitalii");

        new HelloWorld().printHW("Vitalii");
    }
}
