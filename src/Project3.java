import java.util.*;

public class Project3 {
    public static void main(String[] args){
        System.out.println("We are going to print intermediate patterns.");
        System.out.print("Enter a number in the range 1-5: ");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        if(n==1){
            System.out.println("Printing butterfly pattern........\n");
            System.out.print("Enter a number: ");
            int m= s.nextInt();
            System.out.println();
            //Upper part
            for(int i=1; i<=m; i++){
                for(int j=1; j<=i; j++){            //Left side
                    System.out.print('*');
                }
                for(int k=2*(m-i); k>=1; k--){
                    System.out.print(" ");         //Mid-part
                }
                for(int j=1; j<=i; j++){
                    System.out.print('*');         //Right side
                }
                System.out.println();
            }
            //Lower part
            for(int i=m; i>=1; i--){
                for(int j=1; j<=i; j++){           //Left part
                    System.out.print('*');
                }
                int spaces= 2*(m-i);
                for(int k=1; k<=spaces; k++){      //Mid-part
                    System.out.print(' ');
                }
                for(int j=1; j<=i; j++){           //Right side
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        else if(n==2){
            System.out.println("Printing solid rhombus.......");
            System.out.print("Enter a number: ");
            int m= s.nextInt();
            System.out.println();
            for(int i=1; i<=m; i++){
                for(int j=1; j<=(m-i); j++){
                    System.out.print(' ');
                }
                for(int k=m; k>=1; k--){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        else if(n==3){
            System.out.println("Printing number pyramid.......");
            System.out.print("Enter a number: ");
            int m= s.nextInt();
            int number=1;
            System.out.println();
            for(int i=1; i<=m; i++){
                for(int j=1; j<=(m-i); j++){
                    System.out.print(' ');
                }
                if(i<10){
                    for(int k=i; k>=1; k--){
                        System.out.print(number+" ");
                    }
                }else if(i>=10 && i<100){
                    for(int k=i; k>=4; k--){
                        System.out.print(number+" ");
                    }
                }else if(i>=100 && i<1000){
                    for(int k=i; k>=28; k--){
                        System.out.print(number+" ");
                    }
                }else{
                    for(int k=i; k>=222; k--){
                        System.out.print(number+" ");
                    }
                }
                number++;
                System.out.println();
            }
        }
        else if(n==4){
            System.out.println("Printing palindromic pattern.......");
            System.out.print("Enter a number: ");
            int m= s.nextInt();
            System.out.println();
            for(int i=1; i<=m; i++){
                for(int j=1; j<=(m-i); j++){
                    System.out.print(' ');
                }
                for(int k=i; k>=1; k--){
                    System.out.print(k);
                }
                for(int k=2; k<=i; k++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
        else if(n==5){
            System.out.println("Printing diamond pattern.......");
            System.out.print("Enter a number: ");
            int m= s.nextInt();
            System.out.println();
            for(int i=1; i<=m; i++){
                for(int j=1; j<=(m-i); j++){
                    System.out.print(' ');
                }
                for(int k=(2*i)-1; k>=1; k--){
                    System.out.print('*');
                }
                System.out.println();
            }
            for(int i=m-1; i>=1; i--){
                for(int j=1; j<=(m-i); j++){
                    System.out.print(' ');
                }
                for(int k=(2*i)-1; k>=1; k--){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        else{
            System.out.println("You have entered something out of the range.");
        }
    }

}