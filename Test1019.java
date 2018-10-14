package test;
import java.util.Arrays;
import java.util.Scanner;
/**
 *  递增排列  比如 1 2 3 4 5 
	递减排列  比如 6 5 4 3 2 
	非递减排列  从小到大允许中间有相等的数  比如 2 3 3 4 5 5
	非递增排列  从大到小允许中间有相等的数  比如 6 4 4 3 2 1
 * @author apple
 *
 */
public class Test1019 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		in.close();

		while (true) {
			int d = desc(number);
			int i = incr(number);
			number = i - d;
			if (number == 0) {
				System.out.printf("%04d - %04d = %04d\n", i, d, number);
				break;
			}
			
			if (number == 6174) {
				System.out.printf("%04d - %04d = %04d\n", i, d, number);
				break;
			}
			System.out.printf("%04d - %04d = %04d\n", i, d, number);
		}
	}

	public static int desc(int number) {
		char[] array = String.format("%04d", number).toCharArray();
		Arrays.sort(array);
		int temp = 0;
		for (int i = 0; i < 4; i++) {
			temp = temp * 10 + (array[i] - '0');
		}
		return temp;
	}
	
	public static int incr(int number) {
		char[] array = String.format("%04d", number).toCharArray();
		Arrays.sort(array);
		int temp = 0;
		for (int i = 3; i >= 0; i--) {
			temp = temp * 10 + (array[i] - '0');
		}
		return temp;
	}
}
