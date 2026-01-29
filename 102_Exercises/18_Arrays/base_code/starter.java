/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] ar1 = new int [1001];
		 int rm = 0;
		 int num = 1;
		 int mul = 3;
		 while (rm < ar1.length) {
		 	ar1[rm] = num * mul;
		 	num++;
		 	rm++;
		 }
		 rm = 0;
		 while (rm < ar1.length) {
		 	System.out.print(ar1[rm] + ", ");
		 	rm++;
		 }
		 System.out.println("---------------------------------");
		 int [] ar2 = new int [1001];
		 rm = 0;
		 num = 1;
		 mul = 1001;
		 while (rm < ar2.length) {
		 	ar2[rm] = mul - num;
		 	rm++;
		 	mul--;
		 }
		 rm = 0;
		 while (rm < ar2.length) {
		 	System.out.print(ar2[rm] + ", ");
		 	rm++;
		 }
	}
}
