/* 
CODED BY: SHIVAM R JAYSWAL
Contact: +91 9054401780
insta: @shivamrj_1035
*This assistant use file reading for Source code so we have to add txt file at same location as Pattern assistant's class file stored*
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Pattern_Assistant {
    public static void main(String[] args){
        // Welcome message
        Scanner sc=new Scanner(System.in);

        System.out.println("\t\t\t===============================================================================================");
        System.out.println("\u001B[41m"+"\t\t\t\t\t\tWelcome to the Shivam's Pattern Assistant"+"\u001B[40m"+"\n\t\t\t\tIt is always ready to solve your problems related to Java Pattern Program...!!");
        System.out.println("\t\t\t===============================================================================================");
        Asking a=new Asking();
        a.getAnswer();

    }
} 
class Asking{
    JFrame x=new JFrame();
    Scanner sc=new Scanner(System.in);
    void getAnswer(){
         
        //Asking for ready to explore
        System.out.print("Are you ready to explore? ==> ");
        String yn=sc.nextLine();
        Pattern_Data pd=new Pattern_Data();
        int flag=0;
        //use flag & do while loop for get the answer must be in yes or no
        //here we use ignore case to compare to yes and no
        do{
            if(yn.equalsIgnoreCase("Yes")){
                flag=0;
                System.out.println("==================================================================================");
                System.out.println("Yeah... \nLet's go to selection");
                System.out.println("==================================================================================");
                
				System.out.println("\t\t\t\t______________________________________________________");
                System.out.println("\t\t\t\t#     "+"\u001B[31m"+"Select option by chossing number"+"\u001B[0m"+"               #");
                System.out.println("\t\t\t\t#  1) Normal Half Triangle(Left Triangle)            #");
                System.out.println("\t\t\t\t#  2) Inverted Half Triangle(Left Triangle)          #");
                System.out.println("\t\t\t\t#  3) Normal Triangle(Pyramid)                       #");
                System.out.println("\t\t\t\t#  4) Inverted Triangle(Inverted Pyramid)            #");
                System.out.println("\t\t\t\t#  5) Diamond Shape                                  #");
                System.out.println("\t\t\t\t#  6) Exit from System                               #");
				System.out.println("\t\t\t\t______________________________________________________");
                System.out.print("\t\t\t\t\t"+"\u001B[31m"+"Your INPUT: "+"\u001B[0m");
                String input_selection=sc.nextLine();
                int flag_2=0;
                while(flag_2==0){
					switch(input_selection){
						case "1": pd.leftTriangle(); flag_2=1; break;
						case "2": pd.iLeftTriangle(); flag_2=1; break;
						case "3": pd.pyramid(); flag_2=1; break;
						case "4": pd.invertedPyramid(); break;
						case "5": pd.diamond(); break;
						case "6": exit(); flag_2=1; break;
						default: System.out.println("\u001B[31m"+"\n{\"Select the correct option\"}"+"\u001B[0m"); 
								System.out.println("Choose number from given option ");
								input_selection=sc.nextLine();
								break;
					}
				}
            }
			
            else if(yn.equalsIgnoreCase("no")){
                exit();
                 flag=0;
            }
            else 
                {
                    flag=1;
                    System.out.println("\u001B[31m"+"Please enter yes or no"+"\u001B[0m");
                    yn=sc.nextLine();
                }
        }while(flag==1);
      
    }
	void exit()
	{
		JFrame f=new JFrame();
		JOptionPane.showMessageDialog(f,"\nThanks for visit\n\"SRJ's Pattern Assistant is always ready to help you!!\"" );
		System.exit(0);
	}
}
class Pattern_Data{
    Scanner sc=new Scanner(System.in);
    Asking a=new Asking();
	
	//LEFT TRIANGLE
    void leftTriangle()
    {
		System.out.println("1) Go with Default parameters ==>");
		System.out.println("2) Go with your Inputs:");
		String choose=sc.next();
		switch (choose)
		{
			case "1":new LeftTriangle().defaultPara();break;
			case "2":new LeftTriangle().dynamicPat();break;
			default :System.out.println("\u001B[31m"+"Wrong Input!!"+"\u001B[0m");this.leftTriangle();break; 
		}
		    
    }
	class LeftTriangle//Nested Class
	{	
		void defaultPara()
		{
			System.out.println("Enter Name:");
			String name=sc.next();
       
        //char charactor=take.charAt(0);(If Want to print only one charactor)
        for (int i = 0; i <name.length(); i++) 
			{
            for (int j =0; j <=i; j++) {
				
                System.out.print("\u001B[31m"+name.charAt(j)+"\u001B[0m"+" ");
                }
                System.out.println();
        }
		a.getAnswer();
		}
		void dynamicPat()
		{
		JFrame f=new JFrame();
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter character you Want print: ");
        String take=sc.nextLine();
        //char charactor=take.charAt(0);(If Want to print only one charactor)
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\u001B[31m"+take+"\u001B[0m"+" ");
                }
                System.out.println();
            }
            System.out.println("Source code is avilable want to See... ");
            String yn=sc.nextLine();
            int flag=0;
        //use flag & do while loop for get the answer must be in yes or no
        //here we use ignore case to compare to yes and no
        do{
            if(yn.equalsIgnoreCase("Yes")){
                
                System.out.println("==================================================================================");
				File sourceCode=new File("LeftTriangle.txt");
                try{
					Scanner read=new Scanner(sourceCode);
					while(read.hasNextLine()){
						String line=read.nextLine();
						System.out.println(line);
					}
				}
				catch(FileNotFoundException a){
					System.out.println("No Data Avialable!!");
				}
                System.out.println("");
                JOptionPane.showMessageDialog(f,"In this code, \nthe rows variable is used \nto set the number of rows in the triangle pattern.\nThe outer for loop is used to iterate over each row of the pattern.\nThe inner for loop is used to print the stars in each row.\nThe number of stars printed in each row is equal to the row number.\nFinally, a new line is printed using System.out.println() after printing each row." );
                System.out.println("==================================================================================");
                
                System.out.println("For Go Back to Menu Press 0 or type \"Back\"");
                String back=sc.nextLine();
                if(back.equalsIgnoreCase("back")||back.equals("0")){
                    a.getAnswer();
                }
                else{
                    flag=1;
                    System.out.print("==>Please enter 0 or Back: ");
                    yn=sc.nextLine();
                }
                flag=0;
                
            }
            else if(yn.equalsIgnoreCase("no")){
				a.exit();
            }
            else 
                {
                    flag=1;
                    System.out.print("==>Please enter yes or no: ");
                    yn=sc.nextLine();
                }
        }while(flag==1);
		}
	}
	
	
	//INVERTED LEFT TRIANGLE
    void iLeftTriangle()
    {
        System.out.println("1) Go with Default parameters ==>");
		System.out.println("2) Go with your Inputs:");
		String choose=sc.next();
		switch (choose)
		{
			case "1":new ILeftTriangle().defaultPara();break;
			case "2":new ILeftTriangle().dynamicPat();break;
			default :System.out.println("\u001B[31m"+"Wrong Input!!"+"\u001B[0m");iLeftTriangle();break; 
		}
    }
	class ILeftTriangle//Nested Class
	{	
		void defaultPara()
		{
			System.out.println("Enter Name:");
			String name=sc.next();
       
        //char charactor=take.charAt(0);(If Want to print only one charactor)
        for (int i = name.length(); i >= 1; i--) 
			{
            for (int j =0; j <i; j++) {
				
                System.out.print("\u001B[31m"+name.charAt(j)+"\u001B[0m"+" ");
                }
                System.out.println();
        }
		a.getAnswer();
		}
		void dynamicPat()
		{
		JFrame f=new JFrame();
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter character you Want print: ");
        String take=sc.nextLine();
        for(int i=rows; i>=1; i--) {
            
            for(int j=1; j<=i; j++) {
                System.out.print("\u001B[31m"+take+"\u001B[0m"+" ");
            }
            
            System.out.println();
        }
            System.out.println("Source code is avilable want to See... ");
            String yn=sc.nextLine();
            int flag=0;
        //use flag & do while loop for get the answer must be in yes or no
        //here we use ignore case to compare to yes and no
        do{
            if(yn.equalsIgnoreCase("Yes")){
                
                System.out.println("==================================================================================");
                File sourceCode=new File("ILeftTriangle.txt");
                try{
					Scanner read=new Scanner(sourceCode);
					while(read.hasNextLine()){
						String line=read.nextLine();
						System.out.println(line);
					}
				}
				catch(FileNotFoundException a){
					System.out.println("No Data Avialable!!");
				}
				
                JOptionPane.showMessageDialog(f,"This code prompts the user to\n enter the number of rows for \nthe inverted half triangle, \nand then uses nested for loops to \nprint out the taken character in an \ninverted half triangle pattern.\n The outer loop iterates from the\n number of rows down to 1, and the inner loop\n prints out the taken character for each row." );
                System.out.println("");
                System.out.println("==================================================================================");
                
                System.out.println("For Go Back to Menu Press 0 or type \"Back\"");
                String back=sc.nextLine();
                if(back.equalsIgnoreCase("back")||back.equals("0")){
                    a.getAnswer();
                }
                else{
                    flag=1;
                    System.out.print("==>Please enter 0 or Back: ");
                    yn=sc.nextLine();
                }
                flag=0;
                
            }
            else if(yn.equalsIgnoreCase("no")){
                 a.exit();
            }
            else 
                {
                    flag=1;
                    System.out.print("==>Please enter yes or no: ");
                    yn=sc.nextLine();
                }
        }while(flag==1);
		}
	}
	
	
    //PYRAMID
    void pyramid()
    {
        System.out.println("1) Go with Default parameters ==>");
		System.out.println("2) Go with your Inputs:");
		String choose=sc.next();
		switch (choose)
		{
			case "1":new PyramidData().defaultPara();break;
			case "2":new PyramidData().dynamicPat();break;
			default :System.out.println("\u001B[31m"+"Wrong Input!!"+"\u001B[0m");pyramid();break; 
		}
    }
	class PyramidData//Nested Class
	{	
		void defaultPara()
		{
			System.out.println("Enter Name:");
			String name=sc.next();
			int rows=name.length();
       
        //char charactor=take.charAt(0);(If Want to print only one charactor)
        
        
        for(int i=1; i<=rows; i++) {
            //int k=0;
            for(int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }
            
            for(int k=0;k<i;k++){
				System.out.print("\u001B[31m"+name.charAt(k)+"\u001B[0m"+" ");
				
			}
            
            System.out.println();
        }
		a.getAnswer();
		}
		void dynamicPat()
		{
		JFrame f=new JFrame();
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter character you Want print: ");
        String take=sc.nextLine();
        for(int i=1; i<=rows; i++) {
           
            for(int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }
            
            for(int k=0;k<i;k++){
				System.out.print("\u001B[31m"+take+"\u001B[0m"+" ");
				
			}
            
            System.out.println();
        }
            System.out.println("Source code is avilable want to See... ");
            String yn=sc.nextLine();
            int flag=0;
        //use flag & do while loop for get the answer must be in yes or no
        //here we use ignore case to compare to yes and no
        do{
            if(yn.equalsIgnoreCase("Yes")){
                
                System.out.println("==================================================================================");
                File sourceCode=new File("Pyramid.txt");
                try{
					Scanner read=new Scanner(sourceCode);
					while(read.hasNextLine()){
						String line=read.nextLine();
						System.out.println(line);
					}
				}
				catch(FileNotFoundException a){
					System.out.println("No Data Avialable!!");
				}
               JOptionPane.showMessageDialog(f,"In this code, first outer loop for printing Columns\n which is asked as a row\n first inner loop is for spacing \n & second inner loop is for printing taken character" );
                System.out.println("");
                System.out.println("==================================================================================");
                
                System.out.println("For Go Back to Menu Press 0 or type \"Back\"");
                String back=sc.nextLine();
                if(back.equalsIgnoreCase("back")||back.equals("0")){
                    a.getAnswer();
                }
                else{
                    flag=1;
                    System.out.print("==>Please enter 0 or Back: ");
                    yn=sc.nextLine();
                }
                flag=0;
                
            }
            else if(yn.equalsIgnoreCase("no")){
                a.exit();
            }
            else 
                {
                    flag=1;
                    System.out.print("==>Please enter yes or no: ");
                    yn=sc.nextLine();
                }
        }while(flag==1);
		}
	}
	
    //Inverted PYRAMID
    void invertedPyramid()
    {
        System.out.println("1) Go with Default parameters ==>");
		System.out.println("2) Go with your Inputs:");
		String choose=sc.next();
		switch (choose)
		{
			case "1":new InvertedPyramidData().defaultPara();break;
			case "2":new InvertedPyramidData().dynamicPat();break;
			default :System.out.println("\u001B[31m"+"Wrong Input!!"+"\u001B[0m");invertedPyramid();break; 
		}
    }
	class InvertedPyramidData//Nested Class
	{	
		JFrame f=new JFrame();
		void defaultPara()
		{
			System.out.println("Enter Name:");
			String name=sc.next();
			int rows=name.length();
       
        //char charactor=take.charAt(0);(If Want to print only one charactor)
        
        
        for(int i=rows; i>=1; i--) {
            //int k=0;
			for(int j=i;j<=rows;j++){
				System.out.print(" ");
			}
            for(int k=0;k<i;k++){
				System.out.print("\u001B[31m"+name.charAt(k)+"\u001B[0m"+" ");
				
			}
            System.out.println();
        }
		a.getAnswer();
		}
		void dynamicPat()
		{
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter character you Want print: ");
        String take=sc.nextLine();
        for(int i=rows; i>=1; i--) {
            //int k=0;
			for(int j=i;j<=rows;j++){
				System.out.print(" ");
			}
            for(int k=0;k<i;k++){
				System.out.print("\u001B[31m"+take+"\u001B[0m"+" ");
			}
            System.out.println();
        }
            System.out.println("Source code is avilable want to See... ");
            String yn=sc.nextLine();
            int flag=0;
        //use flag & do while loop for get the answer must be in yes or no
        //here we use ignore case to compare to yes and no
        do{
            if(yn.equalsIgnoreCase("Yes")){
                
                System.out.println("==================================================================================");
                File sourceCode=new File("IPyramid.txt");
                try{
					Scanner read=new Scanner(sourceCode);
					while(read.hasNextLine()){
						String line=read.nextLine();
						System.out.println(line);
					}
				}
				catch(FileNotFoundException a){
					System.out.println("No Data Avialable!!");
				}
               JOptionPane.showMessageDialog(f,"In this code, first outer loop for printing Columns\n which is asked as a row\n first inner loop is for spacing \n & second inner loop is for printing taken character" );
                System.out.println("");
                System.out.println("==================================================================================");
                
                System.out.println("For Go Back to Menu Press 0 or type \"Back\"");
                String back=sc.nextLine();
                if(back.equalsIgnoreCase("back")||back.equals("0")){
                    a.getAnswer();
                }
                else{
                    flag=1;
                    System.out.print("==>Please enter 0 or Back: ");
                    yn=sc.nextLine();
                }
                flag=0;
                
            }
            else if(yn.equalsIgnoreCase("no")){
                 a.exit();
				 break;
            }
            else 
                {
                    flag=1;
                    System.out.print("==>Please enter yes or no: ");
                    yn=sc.nextLine();
                }
        }while(flag==1);
		}
	}
    //Diamond
    void diamond()
    {
        System.out.println("1) Go with Default parameters ==>");
		System.out.println("2) Go with your Inputs:");
		String choose=sc.next();
		switch (choose)
		{
			case "1":new Diamond().defaultPara();break;
			case "2":new Diamond().dynamicPat();break;
			default :System.out.println("\u001B[31m"+"Wrong Input!!"+"\u001B[0m");diamond();break; 
		}
    }
	class Diamond//Nested Class
	{	
		JFrame f=new JFrame();
		void defaultPara()
		{
			System.out.println("Enter Name:");
			String name=sc.next();
			int rows=name.length();
       
        //char charactor=take.charAt(0);(If Want to print only one charactor)
        
        int spaces = rows - 1;
        int stars = 1;
        
        // Print upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Print characters
            for (int k = 0; k <stars; k++) {
                System.out.print("\u001B[31m"+name.charAt(k)+"\u001B[0m"+" ");
            }
            
            // Move to next line
            System.out.println();
            
            // Update spaces and stars for the next row
            spaces--;
            stars++;
        }
        
        spaces = 1;
        stars = name.length()-1;
        
        // Print lower half of the diamond
        for (int i = 1; i <= rows - 1; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Print characters
            for (int k = 0; k <stars; k++) {
                System.out.print("\u001B[31m"+name.charAt(k)+"\u001B[0m"+" ");
            }
            
            // Move to next line
            System.out.println();
            
            // Update spaces and stars for the next row
            spaces++;
            stars--;
        }
		a.getAnswer();
		}
		void dynamicPat()
		{
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter character you Want print: ");
        String take=sc.nextLine();
        int spaces = rows - 1;
        int stars = 1;
        
        // Print upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Print characters
            for (int k = 1; k <= stars; k++) {
                System.out.print("\u001B[31m"+take+"\u001B[0m");
            }
            
            // Move to next line
            System.out.println();
            
            // Update spaces and stars for the next row
            spaces--;
            stars += 2;
        }
        
        spaces = 1;
        stars = rows * 2 - 3;
        
        // Print lower half of the diamond
        for (int i = 1; i <= rows - 1; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Print characters
            for (int k = 1; k <= stars; k++) {
                System.out.print("\u001B[31m"+take+"\u001B[0m");
            }
            
            // Move to next line
            System.out.println();
            
            // Update spaces and stars for the next row
            spaces++;
            stars -= 2;
        }
            System.out.println("Source code is avilable want to See... ");
            String yn=sc.nextLine();
            int flag=0;
        //use flag & do while loop for get the answer must be in yes or no
        //here we use ignore case to compare to yes and no
        do{
            if(yn.equalsIgnoreCase("Yes")){
                
                System.out.println("==================================================================================");
                File sourceCode=new File("Diamond.txt");
                try{
					Scanner read=new Scanner(sourceCode);
					while(read.hasNextLine()){
						String line=read.nextLine();
						System.out.println(line);
					}
				}
				catch(FileNotFoundException a){
					System.out.println("No Data Avialable!!");
				}
               JOptionPane.showMessageDialog(f,"Source code and Explaination::" );
                System.out.println("");
                System.out.println("==================================================================================");
                
                System.out.println("For Go Back to Menu Press 0 or type \"Back\"");
                String back=sc.nextLine();
                if(back.equalsIgnoreCase("back")||back.equals("0")){
                    a.getAnswer();
                }
                else{
                    flag=1;
                    System.out.print("==>Please enter 0 or Back: ");
                    yn=sc.nextLine();
                }
                flag=0;
                
            }
            else if(yn.equalsIgnoreCase("no")){
                 a.exit();
				 break;
            }
            else 
                {
                    flag=1;
                    System.out.print("==>Please enter yes or no: ");
                    yn=sc.nextLine();
                }
        }while(flag==1);
		}
	}

}
