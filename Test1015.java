package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1015 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] strs1=br.readLine().split(" ");
		int n=Integer.parseInt(strs1[0]);
		int l=Integer.parseInt(strs1[1]);
		int h=Integer.parseInt(strs1[2]);
		int count=0;
		String[] student=new String[n];
		for (int i = 0; i < n; i++) {
			student[i]=br.readLine();
			String[] ss=student[i].split(" ");
			if(Integer.parseInt(ss[1])>=l&&Integer.parseInt(ss[2])>=l){
				if(Integer.parseInt(ss[1])>=h&&Integer.parseInt(ss[2])>=h){
					
				}
				count++;
			}
		}
		System.out.println(count);

	}

}
