package test;

import java.util.Scanner;

public class Test1026 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int c1=scanner.nextInt();
		int c2=scanner.nextInt();
		int seconds = (int)((c2 - c1) * 1.0 / 100 + 0.5);
		int hour=seconds/3600;
		int min=seconds/60%60;
		int s=seconds%60;
		System.out.printf("%02d:%02d:%02d", hour,min, s);
	}

}
