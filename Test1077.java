package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test1077 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str1=br.readLine().split(" ");
		int n=Integer.parseInt(str1[0]);
		int m=Integer.parseInt(str1[1]);
		double[] result=new double[n];
		double[] flag=new double[n];
		int[] t=new int[n];
		for (int i = 0; i < n; i++) {
			int max=0,min=m;
			int maxflag=0,minflag=0;
			String strs=br.readLine();
			String[] strss=strs.split(" ");
			HashMap<Integer, Integer> map=new HashMap();
			for (int j = 0;  j< strss.length;j++) {
				t[i]=Integer.parseInt(strss[0]);
				if(Integer.parseInt(strss[j])>=0&&Integer.parseInt(strss[j])<=m){
					if(j>0){
					map.put(j,Integer.parseInt(strss[j]));
					if(Integer.parseInt(strss[j])>max){
						max=Integer.parseInt(strss[j]);
						maxflag=j;
					}
					if(Integer.parseInt(strss[j])<min){
						min=Integer.parseInt(strss[j]);
						minflag=j;
					}
					}
				}
			}
			map.remove(maxflag);
			map.remove(minflag);
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				result[i]+=entry.getValue();
				flag[i]++;
			}
			double G1=(result[i]/flag[i]);
			int G2=t[i];
			System.out.println(Math.round((G1+G2)/2));
		}
	}
	
}
