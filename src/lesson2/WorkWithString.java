package lesson2;


import javafx.scene.control.ListCell;

import java.awt.*;
import java.util.ArrayList;

public class WorkWithString {

    public static String eachNth(String current, int n){
        if(!current.isEmpty()){
            String returnString = "";
            char [] arrCurent = current.toCharArray();
            for(int i=0; i<current.length(); i=i+n){
                returnString += arrCurent[i];
            }
            return returnString;
        }
        else{
            return null;
        }
    }

    public static String eachNthModern(String current, int n){
        if(current.isEmpty()){
            return null;
        }
        else{
            StringBuilder sb = new StringBuilder();
            char [] arrCurent = current.toCharArray();
            for(int i=0; i<current.length(); i=i+n){
                sb.append(arrCurent[i]);
            }
            return sb.toString();
        }
    }
}
