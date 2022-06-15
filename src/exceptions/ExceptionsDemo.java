package exceptions;

import java.io.IOException;

public class ExceptionsDemo {

    public static void main(String ...args){

        Object obj = Integer.valueOf(3);
        String str = (String) obj;
        obj = null;
        System.out.println(obj.equals(null));

    }

    private static void simpleTryCatch() {

        try {

            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {

            System.out.println("ArithmeticException => " + e.getMessage());

        }


    }


    private static void catchingMultipleExceptionsV1() {

        try {

            int divideByZero = 5 / 0;
        }

        catch (IndexOutOfBoundsException e1) {

            System.out.println("Nice try but no");
        }

        catch (ArithmeticException e2) {

            System.out.println("Ding ding ding");
        }

    }


    private static void catchingMultipleExceptionsV2() {

        try {

            int divideByZero = 5 / 0;
        }

        catch (IndexOutOfBoundsException | ArithmeticException e) {

            System.out.println("Something worked here: " + e.getClass());
        }

    }


    private static void tryWithResources() {

        try(CustomResource resource = new CustomResource()) {

            resource.doStuff();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


    private static void fourthExerciseFromQuiz() {

        Object obj = Integer.valueOf(3);
        String str = (String) obj;
        obj = null;
        System.out.println(obj.equals(null));
    }







}
