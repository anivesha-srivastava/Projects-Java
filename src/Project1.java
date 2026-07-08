import java.util.*;

public class Project1 {
     public static void main(String[] args){
         Scanner s= new Scanner(System.in);
         System.out.print("Enter what you want to use a naming calendar(1) or a calculator(2): ");
         int bottom= s.nextInt();
         // using switches and if- else if-else statements
         if(bottom==1){
             System.out.println("Entering a naming calendar......");
             System.out.print("Enter the month number(1-12): ");
             int month=s.nextInt();
             System.out.print("Enter the date:");
             int date = s.nextInt();
             switch(month){
                 case 1:
                        System.out.print(date);
                        System.out.print("/January/2026");
                        break;
                 case 2:
                         System.out.print(date);
                         System.out.print("/February/2026");
                         break;
                 case 3:
                         System.out.print(date);
                         System.out.print("/March/2026");
                         break;
                 case 4:
                         System.out.print(date);
                         System.out.print("/April/2026");
                         break;
                 case 5:
                         System.out.print(date);
                         System.out.print("/May/2026");
                         break;
                 case 6:
                         System.out.print(date);
                         System.out.print("/June/2026");
                         break;
                 case 7:
                         System.out.print(date);
                         System.out.print("/July/2026");
                         break;
                 case 8:
                         System.out.print(date);
                         System.out.print("/August/2026");
                         break;
                 case 9:
                         System.out.print(date);
                         System.out.print("/September/2026");
                         break;
                 case 10:
                         System.out.print(date);
                         System.out.print("/October/2026");
                         break;
                 case 11:
                         System.out.print(date);
                         System.out.print("/November/2026");
                         break;
                 case 12:
                         System.out.print(date);
                         System.out.print("/December/2026");
                         break;
                 default : System.out.print("You have entered an invalid number.");
             }
         }
         else if(bottom ==2){
             System.out.println("Entering a calculator....");
             System.out.print("Enter your operator (+,-,%,*,/): ");
             String operator=s.next();
             System.out.print("Enter the first operand: ");
             int a= s.nextInt();
             System.out.print("Enter the second operand: ");
             int b= s.nextInt();
             if(operator.equals("+")){
                 int sum = a+b;
                 System.out.print("The result is ");
                 System.out.print(sum);
             }
             else if(operator.equals("-")){
                 int sum = a-b;
                 System.out.print("The result is ");
                 System.out.print(sum);
             }
             else if(operator.equals("%")){
                 int sum = a%b;
                 System.out.print("The result is ");
                 System.out.print(sum);
             }
             else if(operator.equals("*")){
                 int sum = a*b;
                 System.out.print("The result : ");
                 System.out.print(sum);
             }
             else if(operator.equals("/")){
                 float sum = a/b;
                 System.out.print("The result is ");
                 System.out.print(sum);
             }
             else{
                 System.out.print("You have entered an invalid or out of range operator.");
             }
         }
         else{
             System.out.print("You have entered an invalid number to decide.");
         }
     }
}

