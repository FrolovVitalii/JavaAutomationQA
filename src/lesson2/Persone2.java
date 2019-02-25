package lesson2;

public class Persone2 {
    public static void main(String[] args) {

        Person person = new Person();
        person.doSomething();

        System.out.println();

        System.out.println(WorkWithString.eachNth("Mirace",2));
        System.out.println(WorkWithString.eachNth("abcdefg",2));
        System.out.println(WorkWithString.eachNth("abcdefg",3));

    }
}
