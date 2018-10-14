package test;

import java.util.Scanner;

public class Test1022 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int d=scanner.nextInt();
//		scanner.close();
		int ab=a+b;
		fun1(ab, d);

	}
	   public static void fun1(int c,int d){
	        if(c/d==0){
	            System.out.print(c);
	        }else{
	            fun1(c/d, d);
	            System.out.print(c%d);
	        }
	    }

}
