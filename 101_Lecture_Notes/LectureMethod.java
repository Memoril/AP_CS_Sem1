/* 
    Lecture note example - Methods
*/
import java.util.Scanner;
class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1: ");
        int one = sc.nextInt();
        System.out.println("Number 2: ");
        int two = sc.nextInt();
        
        int onesqr = sqr(one);
        System.out.println(onesqr);
        System.out.println(sqr(two));
        
        System.out.println(absolute(one));
        System.out.println(absolute(two));
	}
	
	public static int sqr(int a){
	    return a * a;
	}
	
	public static int absolute(int a){
	    if(a < 0){
	        return a * (-1);
	    }
	    else{
	        return a;
	    }
	}
}