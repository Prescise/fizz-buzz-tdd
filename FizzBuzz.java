public class FizzBuzz {

    public static void printFizzBuzz(){
        byte number = 1;
        do {
            System.out.println(getValue(number));
            number += 1;
        } while (number <= 100);

    }

    public static String getValue (byte number) {
        if (isMultipleOf3And5(number))
            return "FizzBuzz";
        else if (isMultipleOf3(number))
            return "Fizz";
        else if (isMultipleOf5(number))
            return "Buzz";
        else
            return String.valueOf(number);
    }

    public static boolean isMultipleOf3 (byte number) {
        return number % 3 == 0;
    }

    public static boolean isMultipleOf5 (byte number) {
        return number % 5 == 0;
    }

    public static boolean isMultipleOf3And5 (byte number) {
        return number % 3 == 0 && number % 5 == 0;
    }

}
