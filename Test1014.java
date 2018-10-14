package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test1014 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] strs=new String[4];
		int flag=0;
		for(int i=0;i<4;i++){
			strs[i]=br.readLine();
		}
		String[] strs1=strs[0].split("");
		String[] strs2=strs[1].split("");
		String[] strs3=strs[2].split("");
		String[] strs4=strs[3].split("");
		ArrayList<String> list=new ArrayList<>();
		for (int i = 0; i < strs2.length; i++) {
			if(list.size()==2){
				break;
			}
			if(list.size()==0){
			if((strs1[i].indexOf(strs2[i]))!=-1&&strs1[i].charAt(0)>64&&strs1[i].charAt(0)<72){
					list.add(strs1[i]);
					continue;
				}
			}
			if(list.size()==1){
				if((strs1[i].charAt(0)<58&&strs1[i].charAt(0)>47)||(strs1[i].charAt(0)>64&&strs1[i].charAt(0)<79)){
					if((strs1[i].indexOf(strs2[i]))!=-1){
					list.add(strs1[i]);
					}
				}
			}
		}
		for (int i = 0; i < strs4.length; i++) {
			if(strs3[i].charAt(0)<65||strs3[i].charAt(0)>122
					||(strs3[i].charAt(0)>90&&strs3[i].charAt(0)<97)){
				continue;
			}
			if(strs3[i].equals(strs4[i])){
				list.add(strs3[i]);
				if(list.size()==3){
					flag=i;
					break;
				}
		}
	}
		switch (list.get(0)) {
		case "A":
			System.out.print("MON"+" ");
			break;
		case "B":
			System.out.print("TUE"+" ");
			break;
		case "C":
			System.out.print("WED"+" ");
			break;
		case "D":
			System.out.print("THU"+" ");
			break;
		case "E":
			System.out.print("FRI"+" ");
			break;
		case "F":
			System.out.print("SAT"+" ");
			break;
		case "G":
			System.out.print("SUN"+" ");
			break;
		default:
			break;
		}
		if(list.get(1).charAt(0)<58&&list.get(1).charAt(0)>47){
		for (int i = 0; i < 10; i++) {
		if(Integer.parseInt(list.get(1))==i){
			System.out.print(String.format("%02d", i)+":");
		}
	}
		}
	for (int i = 65; i < 79; i++) {
		if(list.get(1).charAt(0)==i){
			System.out.print((i-55)+":");
		}
	}
		System.out.print(String.format("%02d", flag));
	}

}
