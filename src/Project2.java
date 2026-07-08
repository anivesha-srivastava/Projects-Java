import java.util.*;

public class Project2 {
    public static void main(String[] args){
        // we are gonna make patterns.
        System.out.println("We going to print basic patterns.");
        System.out.print("Enter a number from 1-9: ");
        Scanner s= new Scanner(System.in);
        int num= s.nextInt();

        if(num==1){
            System.out.println("We are printing a solid rectangle.");
            System.out.print("Enter a breadth: ");
            int a= s.nextInt();
            System.out.print("Enter a length: ");
            int b= s.nextInt();
            System.out.println();
            for(int i=1; i<=a; i++){ //outer loop
                for(int j=1; j<=b; j++){ //inner loop
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        else if(num==2){
            System.out.println("We are printing hollow rectangle.");
            System.out.print("Enter a breadth: ");
            int a= s.nextInt();
            System.out.print("Enter a length: ");
            int b= s.nextInt();
            System.out.println();
            for(int i=1; i<=a; i++){
                for(int j=1; j<=b; j++){
                    if(i==1 ||i==a ||j==1 ||j==b){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
        else if(num==3){
            System.out.println("We are printing half pyramid.");
            System.out.print("Enter a height: ");
            int a= s.nextInt();
            System.out.println();
            for(int i=1; i<=a; i++){
                for(int j=1; j<=i; j++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        else if(num==4){
            System.out.println("We are printing inverted half pyramid.");
            System.out.print("Enter a height: ");
            int a= s.nextInt();
            System.out.println();
            for(int i=a; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        else if(num==5){
            System.out.println("We are printing rotated by 180 degree half pyramid.");
            System.out.print("Enter a height: ");
            int a= s.nextInt();
            System.out.println();
            for(int i=1; i<=a; i++) {
                for (int k = 1; k <= a - i; k++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        else if(num==6){
            System.out.println("We are printing half pyramid with numbers.");
            System.out.print("Enter a number: ");
            int a= s.nextInt();
            System.out.println();
            for(int i=1; i<=a; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                    System.out.print(' ');
                }
                System.out.println();
            }
        }
        else if(num==7){
            System.out.println("We are printing inverted half pyramid with numbers.");
            System.out.print("Enter a number: ");
            int a= s.nextInt();
            System.out.println();
            for(int i=a; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        else if(num==8){
            System.out.println("We are printing Floyd's triangle.");
            System.out.print("Enter a number: ");
            int a= s.nextInt();
            int number= 1;
            System.out.println();
            for(int i=1; i<=a; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(number+" ");
                    number++;
                }
                System.out.println();
            }
        }
        else if(num==9){
            System.out.println("We are printing 0-1 triangle.");
            System.out.print("Enter a height: ");
            int a= s.nextInt();
            System.out.println();
            for(int i=1; i<=a; i++){
                for(int j=1; j<=i; j++){
                    if((i+j)%2==0){
                        System.out.print(1+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("You have entered something out of the range.");
        }
    }
}
