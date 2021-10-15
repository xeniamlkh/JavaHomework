package KseniaHomeWorkOne;

public class KseniaHomeWorkAppOne {

    // Task N1 - Main method
    public static void main(String[] args) {

        // calling the method printThreeWords() (Task N2)
        printThreeWords();

        // calling the method checkSumSign() (Task N3)
        checkSumSign(-600,24);

        // calling the method CheckSumSignWithOutP() (Task N3)
        CheckSumSignWithOutP();

        // calling the method printColor() (Task N4)
        printColor(-386);

        // calling the method printColorWithOutP() (Task N4)
        printColorWithOutP();

        // calling the method compareNumbers() (Task N5)
        compareNumbers(-84,164);

        // calling the method compareNumbersWithOutP() (Task N5)
        compareNumbersWithOutP();

    }

    // Task N2 - method printThreeWords(), it returns nothing
    public static void printThreeWords(){
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    // Task N3 - method checkSumSign() with parameters, it returns nothing
    public static void checkSumSign(int a, int b){
        if(a + b >= 0){
            System.out.println("Task N3 - version 1. The sum of two numbers: " + a + " and " + b + ", is greater than 0");
        }
        else{
            System.out.println("Task N3 - version 1. The sum of two numbers: " + a + " and " + b + " is less than 0");
        }
    }

    // Task N3 - method checkSumSign() w/o parameters, variables are in the BODY. The method returns nothing
    public static void CheckSumSignWithOutP(){
        int a = 6;
        int b = 98;
        if(a + b >= 0){
            System.out.println("Task N3 - version 2. The sum of two numbers: " + a + " and " + b + ", is greater than 0");
        }
        else{
            System.out.println("Task N3 - version 2. The sum of two numbers: " + a + " and " + b + " is less than 0");
        }
    }

    // Task N4 - method printColor() with a parameter, it returns nothing
    public static void printColor(int value){
        if(value <= 0){
            System.out.println("Task N4 - version 1. Red");
        }
        else if(value > 0 && value <= 100){
            System.out.println("Task N4 - version 1. Yellow");
        }
        else{
            System.out.println("Task N4 - version 1. Green");
        }
    }

    // Task N4 - method printColor() w/o parameters, a variable is in the BODY. The method returns nothing
    public static void printColorWithOutP(){
        int value = 54;
        if(value <= 0){
            System.out.println("Task N4 - version 2. Red");
        }
        else if(value > 0 && value <= 100){
            System.out.println("Task N4 - version 2. Yellow");
        }
        else{
            System.out.println("Task N4 - version 2. Green");
        }
    }

    // Task N5 - method compareNumbers() with parameters. The method returns nothing
    public static void compareNumbers(int a, int b){
        if(a >= b){
            System.out.println("Task N5 - version 1: a >= b");
        }
        else{
            System.out.println("Task N5 - version 1: a < b");
        }
    }

    // Task N5 - method compareNumbers() w/o parameters, variables are in the BODY. The method returns nothing
    public static void compareNumbersWithOutP(){
        int a = 18;
        int b = 18;
        if(a >= b){
            System.out.println("Task N5 - version 2: a >= b");
        }
        else{
            System.out.println("Task N5 - version 2: a < b");
        }
    }
}
