package fracCalc;

public class Fraction 
{
//fields - strongly encourage no whole number
	private int num;
	private int denom;

//constructor 
	public Fraction(String input)
	{
		int whole = 0;
		int num = 0;
		int denom = 0;
		//full frac
	       if (input.indexOf("_") != -1)
	        {
	            String[] f2_1 = input.split("_");
	            whole = Integer.parseInt(f2_1[0]);
	            
	            String[] f2_2 = f2_1[1].split("/");
	            num = Integer.parseInt(f2_2[0]);
	            denom = Integer.parseInt(f2_2[1]);  
	        }
	        //1/2
	        else if(input.indexOf("/") != -1)
	        {
	            String[] f2_3 = input.split("/");
	            num = Integer.parseInt(f2_3[0]);
	            denom = Integer.parseInt(f2_3[1]);        	
	        }
	        //1
	        else
	        {
	        	whole = Integer.parseInt(input);
	        	denom = 1;
	        }
	     if(whole<0)
	     {
	    	 this.num = -1*(Math.abs(whole)*denom + num);
	     }
	     else
	     {
	    	 this.num = (Math.abs(whole)*denom + num);
	     }
	     this.denom = denom;
		/*old constructor
       String[] theNums = input.split("/");
       num = Integer.parseInt(theNums[0]);
       denom = Integer.parseInt(theNums[1]);       
       */ 	
	}
//methods
	public Fraction add(Fraction frac2)
	{
		Fraction out = new Fraction("0/0");
	//	System.out.println(this);
	//	System.out.println(frac2);
		if(this.denom == frac2.denom)
		{
			out.num = this.num + frac2.num; 
			out.denom = this.denom;
		}
		else
		{
			out.num = this.num*frac2.denom + frac2.num*this.denom; 
			out.denom = this.denom*frac2.denom;
		}
		return out;
	}
	
	public Fraction subtract(Fraction frac2)
	{	
		Fraction out = new Fraction("0/0");
		if(out.denom == frac2.denom)
		{
			out.num = this.num - frac2.num; 
			out.denom = this.denom;
		}
		else
		{
			out.num = this.num*frac2.denom - frac2.num*this.denom; 
			out.denom = this.denom*frac2.denom;
		}
		return out;
	}
	
	public Fraction multiply(Fraction frac2)
	{	
		Fraction out = new Fraction("0/0");
		out.num = this.num*frac2.num; 
		out.denom = this.denom*frac2.denom;
		return out;
	}
	
	public Fraction divide(Fraction frac2)
	{	
		Fraction out = new Fraction("0/0");
		out.num = this.num*frac2.denom; 
		out.denom = this.denom*frac2.num;
		return out;
	}
	
	public void simplify()
	{
		if(Math.abs(this.num) > Math.abs(this.denom))
		{
			for(int i = Math.abs(this.num); i > 1; i--)
			{
				if(this.num%i == 0 && this.denom%i == 0)
				{
					this.num = this.num/i;
					this.denom = this.denom/i;
				}
			}			
		}
		else
		{
			for(int a = Math.abs(this.denom); a > 1; a--)
			{
				if(this.num%a == 0 && this.denom%a == 0)
				{
					this.num = this.num/a;
					this.denom = this.denom/a;
				}
			}		
		}
	}
	
	public String toString()
	{
		this.simplify();
		int whole = this.num/this.denom;
		int num = this.num%this.denom;
		int denom = this.denom;
		String out = "";
		Fraction frac1 = new Fraction(num + "/" + denom);
		frac1.simplify();
		num = frac1.num;
		denom = frac1.denom;
		if (denom < 0)
		{
			denom = Math.abs(denom);
			num = -1*num;
		}
		if (whole == 0 && this.num != 0)
		{
			 out = num + "/" + denom;
		}
		else if (num == 0)
		{
			out = whole+ "";
		}
		else //ex: 1_1/2
		{
			 out = whole + "_" + Math.abs(num) + "/" + denom;
		}


		//String out = this.num + "/" + this.denom;
		return out;
	}
}
