import java.util.Scanner;

public class Factorialprogram {
    public static void main(String[] args){
        int N = 6;
        long factorial = 1;
        for (int i =1; i <= N; i++){
            factorial *= i;

        }
        System.out.println(" The Factorial of " +N+ "is" + factorial);
    }
    
}
