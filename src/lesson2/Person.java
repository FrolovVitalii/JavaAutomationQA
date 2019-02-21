package lesson2;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    Person(){

    }

    Person(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    void doSomething() {
        String end = "jjjjjjjjjjj";
    }

        static {
            System.out.print("Test class loading");
        }

        {
            System.out.print(count+ " class loading");
        }
    }


