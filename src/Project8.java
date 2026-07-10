import java.util.*;

public class Project8 {
    public static void clear(int n,Scanner s){
        System.out.print("Enter the index: ");
        int i= s.nextInt();

        int bitMask= 1<<i;
        int converted = ~bitMask & n;
        if(converted!=n){
            System.out.println("The remains the same: "+converted);
        }
        else{
            System.out.println("The updated integer: "+ converted);
        }
    }
    public static void set(int n, Scanner s){
        System.out.print("Enter the index: ");
        int i= s.nextInt();

        int bitMask= 1<<i;
        int converted = bitMask | n;
        if(converted==n){
            System.out.println("The remains the same: "+converted);
        }
        else{
            System.out.println("The updated integer: "+ converted);
        }
    }
    public static void main(String args[]){
        //bit manipulation
        Scanner s= new Scanner(System.in);
        System.out.println("We are performing bit manipulations.");
        System.out.print("Enter an integer: ");
        int n= s.nextInt();
        while(true){
            System.out.println("1. Get");
            System.out.println("2. Set for converting 0 to 1.");
            System.out.println("3. Clear for converting 1 to 0.");
            System.out.println("4. Update");
            System.out.println();
            System.out.print("Enter what you want to do: ");
            int choice= s.nextInt();

            if(choice==1){
                // using and
                System.out.print("Enter the index: ");
                int i= s.nextInt();

                int bitMask= 1<<i;
                if((bitMask & n)==0){
                    System.out.println("The value at "+i+" is 0.");
                }
                else{
                    System.out.println("The value at "+i+" is 1.");
                }
            }
            else if(choice==2){
                set(n,s);
            }
            else if(choice==3){
                clear(n, s);
            }
            else if(choice==4){
                System.out.print("Enter the change to the index (1 or 0): ");
                int change= s.nextInt();
                if(change==1){
                    set(n,s);
                }
                else if(change==0){
                    clear(n,s);
                }
                else{
                    System.out.println("You have entered something fishy.");
                }
            }
            else{
                System.out.println("You have entered something fishy.");
            }
            System.out.print("You want to do some work ? (y,n) : ");
            char answer= s.next().charAt(0);
            if(answer=='y'){
                continue;
            }
            else if(answer=='n'){
                break;
            }
            else{
                System.out.println("You have entered something fishy.");
                System.out.println("So not going....");
                break;
            }
        }
    }
}
