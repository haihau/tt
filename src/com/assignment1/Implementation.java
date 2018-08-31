package com.assignment1;

import java.util.Scanner;

public class Implementation implements Distance, Equation, Gradient {
	
	private static double x1;
	private static double y1;
	private static double x2;
	private static double y2;
	
	
	public static void main(String[] args) {
		
		Implementation implementation = new Implementation();
		
		Scanner ug=new Scanner(System.in);
		 
        System.out.println("enter x1 point");
  
            x1=ug.nextInt();
   
        System.out.println("enter y1 point");
  
            y1=ug.nextInt();

        System.out.println("enter x2 point");
  
            x2=ug.nextInt();

        System.out.println("enter y2 point");
  
            y2=ug.nextInt();
		
		
		implementation.ditanceCalculate(x1, y1, x2, y2);
		implementation.equationCalculate(x1, y1, x2, y2);
		implementation.gradientCalculate(x1, y1, x2, y2);
		
	}
	
	
	@Override
	public double gradientCalculate(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double gradientValuex;
		double gradientValuey;
		double gradientValue;
		
		
            
            gradientValuex=x2-x1; 	    
            gradientValuey=y2-y1;
            gradientValue = (gradientValuey/gradientValuex);
 	    	 	    
	        System.out.println("("+x1+","+y1+")and"+"("+x2+","+y2+") Gradient is ===>"+ gradientValue);
	        	   
	        return gradientValue;
	         
	}

	@Override
	public double equationCalculate(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double equationValueb;
		double equationValuex; 	    
		double equationValuey;
		double equationValuexm;
		
		
            
            equationValuex =x2-x1; 	    
            equationValuey =y2-y1;
            equationValuexm = (y2-y1)/(x2-x1);
            equationValueb = y1-(x1*equationValuexm);
            
 	    	if (equationValueb >0) {
 	    		 System.out.println("("+x1+","+y1+")and"+"("+x2+","+y2+")+ Equation is ===> y="
 	    		        + equationValuey/equationValuex +"x+"+ equationValueb);
 	    	}
 	    	
 	    	else {
 	    		 System.out.println("("+x1+","+y1+")and"+"("+x2+","+y2+")+ Equation is ===> y="
 	    		        + equationValuey/equationValuex +"x"+ equationValueb);
 	    	}
 	    
	          
	   
	        return equationValueb;
	}

	@Override
	public double ditanceCalculate(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		
		double distanceValue;
		
 	    
            distanceValue=Math.pow(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)),0.5);
 	    	 	    
	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is "+distanceValue);

	     return distanceValue;
	}

}
