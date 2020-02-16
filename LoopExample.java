package CsWashinton;

public class LoopExample {

	public static void main(String[] args) {
		// 
		System.out.println("1 squared is" + (1*1));
		System.out.println("2 squared is" + (2*2));
		System.out.println("3 squared is" + (3*3));
		System.out.println("4 squared is" + (4*4));
		System.out.println("5 squared is" + (5*5));
		System.out.println("6 squared is" + (6*6));
		System.out.println();
		for(int i=1;i<=6;i++) {
			System.out.println(i+"squared is"+i*i);
		}
		System.out.println("Done!");
System.out.println();
int HighestTemp=7;
for(int i=-3;i<=HighestTemp/2;i++) {
	System.out.println(i*1.8+32);
	
}
System.out.println();
for(int i=10;i>=1;i--) {
	System.out.println(i+",");
}
System.out.println("Great job!");
	}

}
