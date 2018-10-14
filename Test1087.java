package test;

import java.util.HashSet;
import java.util.Scanner;

public class Test1087 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		HashSet<Integer> set=new HashSet<>();
		for (int i = 1; i <= num; i++) {
			int result=i/2+i/3+i/5;
			set.add(result);
		}
		System.out.println(set.size());

	}

}
