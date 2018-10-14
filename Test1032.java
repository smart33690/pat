package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] count=new int[100000];
		int max = 0,flag=0;
		for (int i = 0; i <n; i++) {
			String str=br.readLine();
			String[] strs=str.split(" ");
			
			count[Integer.parseInt(strs[0])]+=Integer.parseInt(strs[1]);
			if(count[Integer.parseInt(strs[0])]>max){
				max=count[Integer.parseInt(strs[0])];
				flag=Integer.parseInt(strs[0]);
			}
		}
		System.out.println(flag+" "+max);

	}

}
