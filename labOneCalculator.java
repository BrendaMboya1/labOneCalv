/*@author Brenda Mboya 
 * This is a simple calculator that runs on console.
 * The division part of the program was added by my partner @Constant Likudie
 **/

import java.util.*;
public class labOneCalculator{
	public static void main (String []a){
		if(a[0].equals("add")){
			double one= Double.parseDouble(a[1]);
			double two= Double.parseDouble(a[2]);
			double ans= one+ two;
			System.out.println("the sum of the two numbers is "+ans);
		}

		if(a[0].equals("subtract")){
			double one= Double.parseDouble(a[1]);
			double two= Double.parseDouble(a[2]);
			double ans= one-two;
			System.out.println("the difference of the two numbers is : "+ans);
		}
		if(a[0].equals("multiply")){
			double one= Double.parseDouble(a[1]);
			double two= Double.parseDouble(a[2]);
			double ans= one*two;
			System.out.println("the product of the two numbers is "+ans);

		}

  /*
  Division was worked on by Constant Komla Likudie
  */
  if(a[0].equals("divide")){
			double one= Double.parseDouble(a[1]);
			double two= Double.parseDouble(a[2]);
			double ans= one/two;
			System.out.println(one + " divided by " + two + " is: " +ans);

		}
  
  /*Scanner input=  new Scanner(System.in);
  
  System.out.println ("Welcome to my calculator.My calulator can:\n 1.add \n 2.divide");
  int a= input.nextInt();
  int b= input.nextInt();
  **/
}
}