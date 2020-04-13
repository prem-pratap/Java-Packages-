package test;
import test.Foundation;
public class Sample {

	public static void main(String[] args) {
		Foundation obj=new Foundation();
		System.out.println("I am default "+obj.var2);
		System.out.println("I am protected "+obj.var3);
		System.out.println("I am public "+obj.var4);

	}

}
