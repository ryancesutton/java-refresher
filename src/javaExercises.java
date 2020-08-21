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







    public static void main(String[] args) {

        System.out.println(sum(5, 5));
        System.out.println(addMultiplesOfThreeAndFive(15));
        System.out.println(factorial(7));
        Integer[] list = new Integer[3];
        list[0] = 3;
        list[1] = 4;
        list[2] = 5;
        System.out.println(search(5, list));

    }

}
