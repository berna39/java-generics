package generics;

public class GenericClass<Type> {
   private Type value;

   public GenericClass() {
	   
   }
   
   public void setValue(Type value) {
	   this.value = value;
   }
   
   public Type getValue() {
	   return this.value;
   }
   
}
