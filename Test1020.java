package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

public class Test1020 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] ss1=(br.readLine().split(" "));
		int n=Integer.parseInt(ss1[0]);
		int d=Integer.parseInt(ss1[1]);
		HashMap<Double, Integer> map=new HashMap<>();
		String[] ss2=(br.readLine().split(" "));
		String[] ss3=(br.readLine().split(" "));
		Double[] res=new Double[n];
		for (int i = 0; i < n; i++) {
			res[i]=Double.parseDouble(ss3[i])/Double.parseDouble(ss2[i]);
			map.put(res[i], Integer.parseInt(ss2[i]));
		}
		Arrays.sort(res);
		double result=0;
		for (int i = res.length-1; i < res.length; i--) {
			if(map.get(res[i])>d){
				result=d*res[i];
				break;
			}
		}
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(result));

	}

}
