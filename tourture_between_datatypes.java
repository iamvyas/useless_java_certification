// this needs to be explored further

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int i='A';
		System.out.println(" int of i = A is "+ i); //ascii value 65 is stored (how the hell im even going to remember this in exam)
		double d = 2e2;
		System.out.println(" double of d = 2e2 is "+ d); //2e2 mean 2x 10^2 so 200.0 is displayed
		char c =32;
		System.out.println(" char of c = 32 is "+ c);  //displays a white space because ascii value of 32 is just a space lol
		long l= 5^2;
		System.out.println(" long of l = 5^2 is "+ l); // displayed as 7, because ^ is not used as exponential operator but is used as an XOR operator
		//which basically does an XOR operation between binary values of 5(0101) and 2(0010) which is 7(0111) , Seems Java certifications are Nolanesque for no reason
		if(i<d && d>c || i>l && i>c || c>l){
		    System.out.println("c/l "+ c/l); //this is displayed as output 4 because it comes down to 32/7 , question is how l is 7
		}
		else{
		    System.out.println("l/c"+ l/c);
		}
		
	}
}
