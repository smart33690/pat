package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine().toLowerCase();
		int count=0;
		char[] chars=str.toCharArray();
		for(char c:chars){
			if(c >= 'a' && c<= 'z') {
			int a=(c-'a'+1);
			count+=a;
			}
		}
		int count0=0,count1=0;
		 while(count != 0) {
	            if(count % 2 == 0)
	                count0++;
	            else
	                count1++;
	            count = count / 2;
	        }
		System.out.println(count0+" "+count1);
	}

}
