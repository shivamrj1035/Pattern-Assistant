import java.util.*;
public class Pattern_Assistant {
    public static void main(String[] args){
        //Welcome message
        Scanner sc=new Scanner(System.in);
        System.out.println("==================================================================================");
        System.out.println("Welcome to the Shivam's Pattern Assistant\nIt is always ready to solve your problems related to Java Pattern Program...!!");
        System.out.println("==================================================================================");
        
        //Asking for ready to explore
        System.out.print("Are you ready to explore? ==>");
        String yn=sc.nextLine();
        Pattern_Data pd=new Pattern_Data();
        int flag=0;
        //use flag & do while loop for get the answer must be in yes or no
        //here we use ignore case to compare to yes and no
        do{
            if(yn.equalsIgnoreCase("Yes")){
                System.out.println("==================================================================================");
                System.out.println("Yeah... \nLet's go to selection");
                System.out.println("==================================================================================");
                flag=0;
                System.out.println("\nSelect option by chossing number;");
                System.out.println("1) Simple Triangle");
                System.out.print("Your input is: ");
                int input_selection=sc.nextInt();
                
                switch(input_selection){
                    case 1: pd.simple_triangle();
                }
            }
            else if(yn.equalsIgnoreCase("no")){
                 System.out.println("Okay Thanks for visit..!");
                 flag=0;
            }
            else 
                {
                    flag=1;
                    System.out.println("Please enter yes or no");
                    yn=sc.nextLine();
                }
        }while(flag==1);
      
    }
}
class Pattern_Data{
    Scanner sc=new Scanner(System.in);
    void simple_triangle(){
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                }
                System.out.println();
            }
            System.out.print("Source code is avilable want to See... ==>");
            String yn=sc.nextLine();
            int flag=0;
        //use flag & do while loop for get the answer must be in yes or no
        //here we use ignore case to compare to yes and no
        do{
            if(yn.equalsIgnoreCase("Yes")){
                System.out.println("==================================================================================");
                System.out.println("Source CODE::\npublic class TrianglePattern {\npublic static void main(String[] args) {\nint rows = "+rows+";"+"\nfor (int i = 1; i <= "+rows+";"+" i++) {\nfor (int j = 1; j <= i; j++) {\nSystem.out.print(\"* \");\n}\n            System.out.println();\n        }\n    }\n}");
                System.out.println("In this code, the rows variable is used to set the number of rows in the triangle pattern.\nThe outer for loop is used to iterate over each row of the pattern.\nThe inner for loop is used to print the stars in each row.\nThe number of stars printed in each row is equal to the row number.\nFinally, a new line is printed using System.out.println() after printing each row.");
                System.out.println("==================================================================================");
                flag=0;
                
            }
            else if(yn.equalsIgnoreCase("no")){
                 System.out.println("Okay Thanks for visit..!");
                 flag=0;
            }
            else 
                {
                    flag=1;
                    System.out.println("Please enter yes or no");
                    yn=sc.nextLine();
                }
        }while(flag==1);
            
            }
        
        
    
}