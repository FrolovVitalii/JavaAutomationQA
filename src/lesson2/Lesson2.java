package lesson2;


import lesson2.contracts.Fast;
import lesson2.contracts.Small;

public class Lesson2 extends Cat implements Small, Fast {
    public void go(){

    }

    public  void goFast(){

        int[] numbers ={0,1,2,3,4,5};
        for (int x:numbers){
            System.out.println(x);
        }
    }

    public void high(){

    }
}
