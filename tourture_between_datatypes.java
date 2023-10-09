// this needs to be explored further

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int i='A';
		System.out.println(" int of i = A is "+ i); //ascii value 65 is stored (how the hell im even going to remember this in exam)
		double d = 2e2;
		System.out.println(" double of d = 2e2 is "+ d); //2e2 mean 2x 10^2
		char c =32;
		System.out.println(" char of c = 32 is "+ c);  //displays a white space because ascii value of 32 is just a space lol
		long l= 5^2;
		System.out.println(" long of l = 5^2 is "+ l);
		if(i<d && d>c || i>l && i>c || c>l){
		    System.out.println("c/l "+ c/l); //this is displayed as output 4...but how and why 
		}
		else{
		    System.out.println("l/c"+ l/c);
		}
		
	}
}
