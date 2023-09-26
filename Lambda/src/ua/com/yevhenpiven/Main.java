package ua.com.yevhenpiven;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operation operation=new Operation() {
	
	@Override
	public double getResult(double value1, double value2) {
		// TODO Auto-generated method stub
		return value1+value2;
	}
};
System.out.println(operation.getResult(1.02, 2.358));
System.out.println("---------");
Operation operationLambda=(value1, value2)->value1+value2;
System.out.println(operationLambda.getResult(1.45, 14.58));
System.out.println("---------");

Printer printer=string->System.out.println(string);
printer.println("Hello world");
System.out.println("---------");
Factorial factorial= value->{
	int result =1;
	for (int i = 1; i <= value; i++) {
		result *=i;
	}return result;
};
System.out.println(factorial.getResult(6));
	}

}
