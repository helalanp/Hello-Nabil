package CsWashinton;

public class Receipt {

	public static void main(String[] args) {
		// // Calculate total owed, 
		//assuming 8% tax / 15% tip
		System.out.println("Subtotal:");
		System.out.println(38+40+30);
		System.out.println("Tax:");
		System.out.println((38+40+30)*.08);
		System.out.println("Tips:");
		System.out.println((38+40+30)*.15);
		System.out.println("Total:");
		System.out.println(38+40+30+(38+40+30)*.08+(38+40+30)*.15);
		System.out.println();
		Recipt();
		System.out.println();
		Recipt();
		
	}
public static void Recipt() {
	// Calculate total owed, 
	//assuming 8% tax / 15% tip
	int Subtotal=38+40+30;
	double tax=Subtotal*.08;
	double Tips=Subtotal*0.15;
	double total=Subtotal+tax+Tips;
	System.out.println("Subtotal:"+Subtotal);
	System.out.println("Tax:"+tax);
	System.out.println("Total:"+total);
}
}
