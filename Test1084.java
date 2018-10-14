package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1084 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] strs=str.split(" ");
		int d=Integer.parseInt(strs[0]);
		int n=Integer.parseInt(strs[1]);
		
		for (int i = 1; i <=n; i++) {
			if (i==1) {
				System.out.print(d);
			}
			if(i==2){
				System.out.print(d);
				System.out.print(i-1);
			}
			
		}
		
	}

}
