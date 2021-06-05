package generics;

public class Main {
	  public static void main(String[] args) {
		  // integer
		  GenericClass<Integer> objectInt = new GenericClass<Integer>();
		  objectInt.setValue(13);
		  System.out.println(objectInt.getValue());
		  
		// double
		  GenericClass<Double> objectDouble = new GenericClass<Double>();
		  objectDouble.setValue(1345.5d);
		  System.out.println(objectDouble.getValue());
		  
		  // String
		  GenericClass<String> objectString = new GenericClass<String>();
		  objectString.setValue("Shisui uchiwa");
		  System.out.println(objectString.getValue());
	  }
}
