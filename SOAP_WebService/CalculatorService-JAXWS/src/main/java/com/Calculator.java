package com;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="CalculatorService", portName="CalculatorServicePort")

public class Calculator {
@WebMethod	
 public int add(int a, int b) {
	int c=0;
	 try {c=a+b;}
	 
	 catch(NumberFormatException e) {
		 System.out.println("Not a number"+e);}
	 return c;
 }
@WebMethod	
 public int sub(int a, int b) {
	int c=0;
	 try {c=a-b;}
	 
	 catch(NumberFormatException e) {
		 System.out.println("Not a number"+e);}
	 return c;
	 }
@WebMethod	
 public int mul(int a, int b) {
	int c=0;
	 try {c=a*b;}
	 
	 catch(NumberFormatException e) {
		 System.out.println("Not a number"+e);}
	 return c;
	 }
@WebMethod	
 public int div(int a, int b) {
	int c=0;
	 try {c=a/b;}
	 catch(ArithmeticException e) {
		 System.out.println("Can't divide by Zero"+e);}
	 catch(NumberFormatException e) {
		 System.out.println("Not a number"+e);}
	 return c;
	 }
}
