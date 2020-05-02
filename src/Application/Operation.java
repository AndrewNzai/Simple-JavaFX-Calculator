package Application;

public class Operation {

    /*
    Pretty Self-explanatory, don't you think?
     */

    public static float calculate(float num1, float num2, String operator){

        switch (operator){
            case "+":
                return num1 + num2;

            case "-":
                return num1 - num2;

            case "*":
                return num1 * num2;

            case "/":
                return num1/num2;
        }

        return 0;
    }
}
