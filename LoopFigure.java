package CsWashinton;

public class LoopFigure {
	public static final int Size=3;
	public static void main(String[] args) {
		// Prints out ASCII art picture of a rug with 
		//a diamond pattern
		// and is scaled based on the class 
		//constant SIZE.
		Pattern();

	}
	
	public static void Pattern() {
	for(int Line=1;Line<=Size;Line++) {
		for(int Slash=1;Slash<=(-4*Line+4*Size);Slash++) {
			System.out.print("/");	
		}
		for(int Star=1;Star<=8*Line-8;Star++) {
			System.out.print("*");
		}
		for(int Slash=1;Slash<=(-4*Line+4*Size);Slash++) {
			System.out.print("\\");
		}
		System.out.println();
	}
	
	}

}
