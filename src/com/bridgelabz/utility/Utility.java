package com.bridgelabz.utility;

public class Utility {
	
/******************************************Leap-Year Program****************************************/
	public static boolean  leapYear(int year){
		if (year>=1583&& year<=9999)
	   {
	    if((year%4==0)&& (year%100 !=0)){
			System.out.println(year+" is leap year");
		}
		else if((year%4==0) && (year%100==0) && (year%400==0)){
			System.out.println(year+"is leap year");
		}
		else{
			System.out.println(year+"is not leap year");
			return false;
		    }
		return true;
	   }
		System.out.println(" Please Enter Correct Vaule");
		System.out.println("Year Value Should be greater than or equal to 1583 ya lesser than 9999");
	    return false;
	}
/**************************************End Leap-Year Program*********************************/
/**************************************Start Power of 2*********************************/
      public static long powerOf2(int exponent,int base)
      {  long power=1;
    	  for(int i=1;i<=exponent;i++)
    	  {  power *=base;
    		  System.out.println(base+"*"+i +"="+ power);
    	  } 
    	  return power;
      }

/*****************************************End Power Of 2**************************************/
/*****************************************Start Flip Coin*************************************/

      public static double flipCoin(int toss)
      { 
    	  int head;
    	  int tail;
    	  double noofhead=(double)(Math.random()*toss);
    	  double percentageofhead=((noofhead*100)/toss ) ;
    	  double percentageoftail=(((toss-noofhead)*100)/toss);
    	  double result=percentageofhead+percentageoftail;
    	  System.out.println("percentage of head = "+percentageofhead+" and "+"percentage of tail = "+percentageoftail);
    	  return result;	    
      }
/***************************************End Flip Coin Program****************************************************/
/***************************************Start Factor****************************************************/

      
      public static int primeFactor(int number)
      { int count=0;
    	  for(int prime=2;prime<=number;prime++)
    	  {
    		 if(number%prime==0)
    		 {
    			 number /=prime;
    			 System.out.println(prime);
    			 count++;
    		 }
    	  }
 		 return count;

      }
/****************************************End Prime-Factor***********************************/
/**********************************!!!!!!Start Functional program!!!!!!****************************/
/**********************************Distance Program**************************************/
       public static double distance(double x1,double y1,double x2,double y2)
       {
    	 double x=y1-x1;
    	 double y=y2-x2;
    	 double result = Math.pow(x,2)+ Math.pow(y, 2);
    	 double distance=Math.sqrt(result);
    	 System.out.println("Euclidean Distance"+distance);
    	 return distance;
    	 }
 /********************************* End Distance Program********************************* /
 /**********************************Start Quadratic Program******************************/
       
       public static double quadratic(double a,double b,double c)
       {
    	   char X;
    	   double deltavalue=(( b * b )-(4 * a * c));
    	   double delta= (Math.sqrt(deltavalue));
    	   double root1=( (- b) + delta)/(2 * a);
    	   double root2=( (- b) - delta)/(2 * a);
    	   System.out.println("roots of quadratic equation :  "+root1+" , "+root2);
    	   return root1;
       }
       
       
 /************************************End Quadratic Program*******************************/      
 /************************************Gambler Program*********************************/      
  
       
       
}
