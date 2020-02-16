package CsWashinton;

public class EggFigures {

	public static void main(String[] args) {
		//
		EggBottom();
		Eggup();
		System.out.println();
		Cup();
		System.out.println();
		StopSign();
		System.out.println();
		Hat();
		
	}
		public static void Eggup() {
			  System.out.println( "\\         /");
			  System.out.println( " \\_______/");
		}
			public static void EggBottom() {
			System.out.println(  "  _______");
			System.out.println( " /       \\");
			System.out.println("/         \\");	
			}
			public static void Cup() {
				Eggup();
				System.out.println("+---------+");
			}
			public static void StopSign() {
				EggBottom();
				System.out.println("|  Stop   |");
				Eggup();
			}
			public static void Hat() {
				EggBottom();
				System.out.println("+---------+");
				
			}
		
		}
		
	



	


