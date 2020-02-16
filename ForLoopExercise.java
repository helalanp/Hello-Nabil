package CsWashinton;

public class ForLoopExercise {

	public static void main(String[] args) {
		//  
		 squares();
		 blastoff();
		 square();
		 mult();
		 pyramid();
		 dotsfigure();
	}
public static void squares() {
	for(int i=1;i<=6;i++) {
		System.out.println(i +"Square="+(i*i));
	}
		System.out.println();
	}
public static void blastoff() {
	System.out.print("T-Minus ");
	for(int i=10;i>0;i--) {
		System.out.print(i+",");
	}
	System.out.println("blastoff");
	System.out.println();
}
public static void square() {
	for(int row=1;row<=4;row++) {
		//System.out.println("********");
		for(int col=1;col<=6;col++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
public static void mult() {
	for (int row=1;row<=10;row++) {
		for(int col=1;col<=10;col++){
			System.out.print(row*col +" \t");
		}
		System.out.println();
	}
}
public static void pyramid() {
	for(int line=1;line<=5;line++) {
		for(int stars=1;stars<=line;stars++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void dotsfigure() {
	for(int lines=1;lines<=5;lines++) {
		for(int dots=1;dots<=-1*lines+5;dots++) {
			System.out.print(".");
		}
		System.out.println(lines);
	}
}
}
