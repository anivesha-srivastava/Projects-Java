import java.util.*;

public class Project7 {
    public static void reverse(StringBuilder str){

        for(int i = 0; i< str.length() /2; i++){
            int front= i;
            int back = str.length()-1-i;

            char frontChar= str.charAt(front);
            char backChar= str.charAt(back);

            str.setCharAt(back, frontChar);
            str.setCharAt(front,backChar);
        }
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("We are using String Builder and its functions.");
        System.out.println("1.  .setCharAt(Index,New character)");
        System.out.println("2.  .insert()");
        System.out.println("3.  .delete(start,end)");
        System.out.println("4.  .append()");
        System.out.println("5.  .reverse()");
        System.out.print("Enter your choice: ");
        int choice= s.nextInt();
        s.nextLine();
        System.out.print("Enter the string: ");
        StringBuilder string= new StringBuilder(s.nextLine());
        if(choice==1){
            System.out.print("Which character want to change: ");
            char c= s.next().charAt(0);
            System.out.print("With what character to be changed: ");
            char j= s.next().charAt(0);
            for(int i=0; i<string.length(); i++){
                if(c==string.charAt(i)){
                    string.setCharAt(i,j);
                }
            }
            System.out.println("Your modified string : "+string);
        }
        else if(choice==2){
            System.out.print("Which index: ");
            int index= s.nextInt();
            s.nextLine();
            System.out.print("With what characters to be added: ");
            String j= s.nextLine();
            for(int i=0; i<string.length(); i++){
                if(index==i){
                    string.insert(index,j);
                }
            }
            System.out.println("Your modified string : "+string);
        }
        else if(choice==3){
            System.out.print("Starting character: ");
            char start= s.next().charAt(0);
            s.nextLine();
            System.out.print("Ending character: ");
            char end= s.next().charAt(0);
            for(int i=0; i<string.length(); i++){
                if(start == string.charAt(i)){
                    for(int j=0; j<string.length(); j++){
                        if(end== string.charAt(j)){
                            string.delete(i,j+1);
                            break;
                        }
                    }
                    break;
                }
            }
            System.out.println("Your modified string : "+string);
        }
        else if(choice==4){
            System.out.print("Which characters do you want to append: ");
            String addition= s.nextLine();
            while(true){
                string.append(addition);
                System.out.print("Want to append more (y,n): ");
                char ch= s.next().charAt(0);
                if(ch=='y'){
                    s.nextLine();
                    System.out.print("Which characters do you want to append: ");
                    addition= s.nextLine();
                }
                else{
                    break;
                }
            }
            System.out.println("Your modified string : "+string);
        }
        else if(choice==5){
            reverse(string);
            System.out.println("Your modified string : "+string);
        }
        }
    }

