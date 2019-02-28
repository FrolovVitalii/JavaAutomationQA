package lesson4;

public class LambdaApp {

    public static void main(String[] args) {


        Expression exp1 = Expressions::isEven;
        Expression exp = Expressions::isNegative;
        Expression exp2 = (int i) -> i >= 0;

        System.out.print(sumOf(),exp1);

        private static int sumOf(int[] arr, Expression expr)
        {
            int result =0;
            for(int i: arr){
                if(expr.isEqual){
                    result+=i;
                }
            }
            return result;
        }
    }
}
