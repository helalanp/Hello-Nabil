package CsWashinton;

public class EggFigure2 {
//This program draws several text figures
	//its used static method to capture structure
	//eliminate redundancy
	public static void main(String[] args) {
		EggBottom();
		Cup();
		StopSign();
		Hat();
	}
	public static void EggBottom() {
		EggDown();
		EggUp();
		System.out.println();
	}
	public static void EggDown() {
		
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
		
	}
	public static void EggUp() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
		
	}
	public static void Line() {
		System.out.println("+_________+");
	}
	public static void Cup() {
		EggUp();
		Line();
		System.out.println();
	}
	public static void StopSign() {
		EggDown();
		System.out.println("|  STOP  |");
		EggUp();
		System.out.println();
	}
	public static void Hat() {
		EggDown();
		Line();
		
	}

}
