/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int num = scan.nextInt();
	    if(num>0){
	        System.out.println("Number is positive");
	    }
	    else if(num<0){
	        System.out.println("Number is negative");
	    }
	    else{
	        System.out.println("Number is Zero");
	    }
	}
}
