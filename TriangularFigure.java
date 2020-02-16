package CsWashinton;

public class TriangularFigure {

	public static void main(String[] args) {
		// 
		Diamond();
		Diamond();
		X();
		
		
	}
	public static void Diamond() {
		TriangleOne();
		TriangleTwo();
		System.out.println();
	}
	public static void X() {
		TriangleTwo();
		TriangleOne();
	}
	public static void TriangleOne() {
		System.out.println("  /\\");
		System.out.println(" /  \\");
		System.out.println("/    \\");
			
	}
	public static void TriangleTwo() {
		
		System.out.println("\\    /");
		System.out.println(" \\  /");
		System.out.println("  \\/");
	}

}