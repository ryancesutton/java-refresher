public class javaExercises {


    //Exercise 1
    public static Integer sum (int a, int b) {

        return a + b;

    }

    //Exercise 2
    public static Integer addMultiplesOfThreeAndFive(int n){

        int sum = 0;

        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }

        }

        return sum;

    }

    public static Integer factorial (int n) {

        int product = 1;

        for (int i = 1; i <= n; i++) {

            product *= i;

        }

        return product;

    }







    public static void main(String[] args) {

        System.out.println(sum(5, 5));
        System.out.println(addMultiplesOfThreeAndFive(15));
        System.out.println(factorial(7));

    }

}
