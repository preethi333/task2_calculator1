package com.task;
/**
 * Program for addition,multiplication,division
 * of 2 numbers
 * @author PREETHI
 *
 */
public class calculator {
	/**
	 * fun for addition of 2 numbers
	 * @param num1
	 * @param num2
	 * @return additions of numbers
	 */
     public double addition(double num1,double num2) {
         return num1+num2;	 
     }
     
     /**
      * fun for multiplication of 2 numbers
      * @param num1
      * @param num2
      * @return multiplication of numbers
      */
     public double multiplication(double num1,double num2) {
    	 return num1*num2;
     }
     
     /**
      * fun for division of 2 numbers
      * @param num1
      * @param num2
      * @return division of 2 numbers
      */
     public double division(double num1,double num2) {
    	 if(num2==0) {
    		 throw new ArithmeticException("can't divide by zero");
    	 }
    	 return num1/num2;
     }

	}

