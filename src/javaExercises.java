import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class javaExercises {


    //Exercise 1
    public static int sum (int a, int b) {

        return a + b;

    }

    //Exercise 2
    public static int addMultiplesOfThreeAndFive(int n){

        int sum = 0;

        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }

        }

        return sum;

    }

    //Exercise 3
    public static int factorial (int n) {

        int product = 1;

        for (int i = 1; i <= n; i++) {

            product *= i;

        }

        return product;

    }


    //Exercise 4
    public static int search(Integer n, Integer[] list) {

        int index = -1;

        for(int i = 0; i < list.length; i++) {

            if (list[i].equals(n)){

                index = i;
                break;


            }
        }
        return index;
    }

    //Exercise 5
    public static String reverseString(String s) {

        String newString = "";

        for (int i = 0; i < s.length(); i++) {

            newString += s.charAt(s.length() - i - 1);

        }
        return newString;
    }

    //Exercise 6
    public static int findMaximum(Integer[] list) {

        int maximum = list[0];
        for (int i : list) {
            if (i > maximum) {
                maximum = i;
            }
        }

        return maximum;

    }

    //Exercise 7
    public static Double average(List<Integer> list) {

        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();

    }

    //Exercise 8
    public static List<String> upperCase(List<String> list) {

        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    //Exercise 9
    public static String fizzBuzz(Integer i) {

        String result = "";
        if (i % 3 == 0) {

            result += "Fizz";

        }
        if (i % 5 == 0) {

            result += "Buzz";
        }

        if (result.equals("")){

            result = i.toString();

        }

        return result;
    }

//    Exercise 10

    public static Boolean isPrime(Integer n) {

        boolean isPrime = true;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }


    public static void main(String[] args) {

        System.out.println(sum(5, 5));
        System.out.println(addMultiplesOfThreeAndFive(15));
        System.out.println(factorial(7));
        Integer[] list = new Integer[3];
        list[0] = 3;
        list[1] = 4;
        list[2] = 5;
        System.out.println(search(5, list));
        System.out.println(reverseString("Very cool sentence"));
        System.out.println(findMaximum(list));
        List<Integer> newList = new ArrayList<>();
        newList.add(4);
        newList.add(5);
        newList.add(7);
        System.out.println(average(newList));
        List<String> stringList = new ArrayList<>();
        stringList.add("codeup");
        stringList.add("java");
        stringList.add("guitar");
        System.out.println(upperCase(stringList));
        int i = 3;
        System.out.println(fizzBuzz(i));
        i = 5;
        System.out.println(fizzBuzz(i));
        System.out.println("Is prime? " + isPrime(5));

    }

}
