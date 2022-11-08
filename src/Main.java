public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
     public static void GreatestOfNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Largest Number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest Number is " + b);
        } else {
            System.out.println("Largest Number is " + c);
        }
    }
}
