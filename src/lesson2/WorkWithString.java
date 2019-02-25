package lesson2;


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
}
