package fracCalc;

import java.util.Scanner;
import java.util.Arrays;

public class FracCalc {

    public static void main(String[] args) 
    {
    	boolean cont = true;
    	System.out.print("Welcome to FracCalc! ");
    	while (cont)
    	{
        	String input = "";
        	//String output = "";
        	
        	System.out.print("Enter in an expression to compute: ");
        	Scanner console = new Scanner(System.in);
        	input = console.nextLine();
        	
        	System.out.println(produceAnswer(input));

        	
        	System.out.print("Type \"quit\" to stop, or type anything: ");
        	input = console.nextLine();
        	if (input.equals("quit"))
        	{
        		cont = false;
        	}
        	console.close();
    	}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    //can use substring or indexOf
    
    public static String produceAnswer(String input)
    { 
        String[] splitIn = input.split(" ");
        Fraction f1 = new Fraction(splitIn[0]);
        String operator = splitIn[1];
        Fraction f2 = new Fraction(splitIn[2]);
        
        if (operator.equals("+"))
        {
        	//System.out.println(f1.add(f2).toString());
        	return f1.add(f2).toString();
        }
        else if(operator.equals("-"))
        {
        	return f1.subtract(f2).toString();
        }
        else if(operator.equals("*"))
        {
        	return f1.multiply(f2).toString();
        }
        else
        {
        	return f1.divide(f2).toString();
        }
        /* part 2
        //1_1/2
    	if (f2.indexOf("_") != -1)
        {
            String[] f2_1 = f2.split("_");
            whole2 = Integer.parseInt(f2_1[0]);
            
            frac2 = new Fraction(f2_1[1]);
        }
        //1/2
        else if(f2.indexOf("/") != -1)
        {
        	whole2 = 0;
        	frac2 = new Fraction(f2);
        }
        //1
        else
        {
        	whole2 = Integer.parseInt(f2);
        	frac2 = new Fraction("0/1");
        }
    	return "whole:" + whole2 + " " + frac2;
    	*/
        /*
        int num1 = 0;
        int den1 = 0;
        int whole1 = 0;
        
        int num2 = 0;
        int den2 = 0;
        int whole2 = 0;
        
        String[] splitIn = input.split(" ");
        String f1 = splitIn[0];
        String operator = splitIn[1];
        String f2 = splitIn[2];
        

        //splitting operand2
        //full frac 1_1/2
        if (f2.indexOf("_") != -1)
        {
            String[] f2_1 = f2.split("_");
            whole2 = Integer.parseInt(f2_1[0]);
            
            String[] f2_2 = f2_1[1].split("/");
            num2 = Integer.parseInt(f2_2[0]);
            den2 = Integer.parseInt(f2_2[1]);  
        }
        //1/2
        else if(f2.indexOf("/") != -1)
        {
            String[] f2_3 = f2.split("/");
            num2 = Integer.parseInt(f2_3[0]);
            den2 = Integer.parseInt(f2_3[1]);        	
        }
        //1
        else
        {
        	whole2 = Integer.parseInt(f2);
        	den2 = 1;
        }
      
        String out = "";
        out = "whole:" + whole2 + " numerator:" + num2 + " denominator:" + den2;      
        return out;
   */
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
