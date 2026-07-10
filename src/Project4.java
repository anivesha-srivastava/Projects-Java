import java.util.*;

public class Project4 {
    public static int factorial(int number){
        int fac=1;
        if(number<0){
            System.out.println("You have entered a negative number. Invalid..");
            return 0;
        }
        for(int i=number; i>=1; i--){
            fac*=i;
        }
        return fac;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number whose factorial you want: ");
        int n= s.nextInt();
        System.out.print("The factorial of the given number: "+factorial(n));
    }
}
