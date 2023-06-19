//Java Program to print the sum of all the items of the array
public class SumOfArray {
    public static void main( String[] args) {
        int[] numbers ={4,5,6,7,8};
        int sum = 0;
        for (int i =0; i< numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Sum of all the items of Array is:" +sum);
        }
    }
}
