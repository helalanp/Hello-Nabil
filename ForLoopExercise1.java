package CsWashinton;

public class ForLoopExercise1 {

	public static void main(String[] args) {
		//
		
		Temp();
		System.out.println();
		Loop();
		System.out.println();
		Nest();
		System.out.println();
		Outer();
		System.out.println();
		Inner();
		System.out.println();
		Modify();
	}
		public static void Loop() {
		System.out.println("+----+");
		for(int i=1;i<=6;i++) {
			System.out.println("\\   /");
			System.out.println("/   \\");
		}
		System.out.println("+----+");
	}
public static void Temp() {
	int hightemp=5;
	for(int i=-3;i<=hightemp/2;i++) {
		System.out.print((i*1.8+32)+" ");
		
	}
	
}
public static void Nest() {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
public static void Outer() {
	for(int i=1;i<=5;i++) {
		for(int count=1;count<=-1*i+5;count++) {
			System.out.print(".");
		}
		
		System.out.println(i);
	}
}
public static void Inner() {
	for (int line=1;line<=5;line++) {
		for(int star=1;star<=(-1*line+5);star++){
			System.out.print(".");
		}
		for(int count=1;count<=line;count++) {
			System.out.print(line);
		}
		System.out.println();
	}
	
}
public static void Modify() {
	for(int line=1;line<=5;line++) {
		for(int star=1;star<=(-1*line+5);star++) {
			System.out.print(".");
		}
		System.out.print(line);
		for(int star=1;star<=(line-1);star++) {
			System.out.print(".");
		}
		System.out.println();
	}
	
}
}
