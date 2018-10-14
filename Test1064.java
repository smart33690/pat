package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Test1064 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String str=br.readLine();
		br.close();
		String[] strs = str.split(" ");
		int[] result = new int[10000];
		for(int i=0;i<n;i++) {
			String[] shuzu=strs[i].split("");
			for(int j=0;j<shuzu.length;j++) {
				result[i]+=Integer.parseInt(shuzu[j]);
			}
		}
		HashSet<Integer> hSet=new HashSet<>();
		for (int i = 0; i < result.length; i++) {
			if(result[i]>0)
				hSet.add(result[i]);
		}
		System.out.println(hSet.size());
		List<Integer> setList = new ArrayList<Integer>(hSet);
		for (int i = 0; i < setList.size(); i++) {
			if(i==setList.size()-1) {
				System.out.print(setList.get(i));
			}else {
			System.out.print(setList.get(i)+" ");
			}
		}
	}

}
