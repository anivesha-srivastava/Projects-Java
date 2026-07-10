import java.util.*;

public class Project6 {
    public static void main(String args[]){
        //Strings and its functions
        Scanner s= new Scanner(System.in);
        System.out.println("We are going to use string functions.");
        System.out.println("1. .Length()");
        System.out.println("2. .charAt()");
        System.out.println("3. .compareTo()");
        System.out.println("4. .substring(begin index ,end index(excluded)(optional if the end is the ending index))");
        System.out.println("5. .parseInt()");
        System.out.println("6. .toString()");
        System.out.print("Enter your choice: ");
        int choice= s.nextInt();
        s.nextLine();
        if(choice==1){
            System.out.print("Enter your string: ");
            String string= s.nextLine();
            System.out.println("The length of the string is "+string.length()+'.');
        }
        else if(choice==2){
            System.out.print("Enter your string: ");
            String string= s.nextLine();

            for(int i=0; i<string.length(); i++){
                System.out.println(string.charAt(i));
            }
        }
        else if(choice==3){
            System.out.print("Enter your first string: ");
            String stringOne= s.nextLine();
            System.out.print("Enter your second string: ");
            String stringTwo= s.nextLine();

            if(stringOne.compareTo(stringTwo)==0){
                System.out.println("The strings are equal.");
            }
            else{
                if(stringOne.compareTo(stringTwo)>0){
                    System.out.println("The first string is greater than the second string.");
                }
                else{
                    System.out.println("The second string is greater than the first string.");
                }
            }
        }
        else if(choice==4){
            System.out.print("Enter your string: ");
            String string= s.nextLine();

            System.out.print("Enter the beginning index: ");
            int begin= s.nextInt();
            System.out.print("Enter the ending index (Enter 0 if you want till the end.): ");
            int end= s.nextInt();

            if(end==0){
                System.out.println("The substring is "+string.substring(begin)+'.');
            }
            else{
                System.out.println("The substring is "+string.substring(begin,end)+'.');
            }
        }
        else if(choice==5){
            System.out.print("Enter your string: ");
            String string= s.nextLine();

            System.out.println("Here is your integer version: "+Integer.parseInt(string));
        }
        else if(choice==6){
            System.out.print("Enter your number: ");
            int integer= s.nextInt();

            System.out.println("Here is your string version: "+Integer.toString(integer));
        }
        else{
            System.out.println("Invalid !");
        }
    }
}
