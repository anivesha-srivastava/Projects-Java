import java.util.*;

public class Project5 {
    public static void main(String args[]){
        //arrays and strings syntaxes
        /**int rows = matrix.length;       // Returns 2
         int columns = matrix[0].length;**/
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number of tables: ");
        int rows= s.nextInt();
        System.out.print("Enter the number till which you want to save the tables: ");
        int cols= s.nextInt();
        int tables[][]= new int[rows][cols];

        for(int i=0; i<tables.length; i++){
            for(int j=0; j<tables[0].length; j++){
                tables[i][j]=(i+1)*(j+1);
            }
        }
        System.out.println("Printing tables from 1 to "+rows+" are saved.");
        System.out.print("Enter whether you want all tables(all) or just one of them(one): ");
        String choice= s.next();
        if("all".equals(choice)){
            System.out.println();
            for(int i=0; i<tables.length; i++){
                for(int j=0; j<tables[0].length; j++){
                    System.out.print((i+1)+"x"+(j+1)+"="+tables[i][j]+"\n");
                }
                System.out.println();
            }
        }
        else if("one".equals(choice)){
            System.out.print("Enter the number whose table you want: ");
            int table= s.nextInt();
            if(table<=tables.length+1){
                System.out.println();
                for(int j=0; j<tables[0].length; j++){
                    System.out.print((table)+"x"+(j+1)+"="+ tables[table-1][j]);
                    System.out.println();
                }
            }
            else{
                System.out.println("You have entered out of bounds table to be printed.");
            }
        }
        else{
            System.out.println("You have entered something fishy.");
        }
    }
}
