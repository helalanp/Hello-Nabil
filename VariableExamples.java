package CsWashinton;

public class VariableExamples {

	public static void main(String[] args) {
		// 
		int x=2+2;//4
		int y=2*x;//2*4=8
		int z=y-x-1;//8-4-1=3
		y--;//y=y-1 //8-1=7
		x++;//x=x+1//4+1=5
		System.out.println("x = " + x);//5
		System.out.println("y = " + y);//7
		System.out.println("z = " + z);//3
		x*=y;//x=x*y//x=5*7//x=35
		x*=z;//x=x*z//x=35*3//x=105
		y=x/y/z;//105/7/3=15/3=5
		z=x/y/z;//105/5/3=21/3=7
		x=x/y/z;//105/5/7=21/7=3
		System.out.println("x = " + x);//3
		System.out.println("y = " + y);//5
		System.out.println("z = " + z);//7

	}

}
