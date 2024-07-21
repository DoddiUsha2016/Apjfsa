package apjfsa;
//class with different modifiers
public class Modifiers {
	 // Public modifier - accessible from any other class
    public int publicVar = 30;
    
    
    // Protected modifier - accessible within the same package or by subclasses
    protected int protectedVar = 90;
    
    // Default modifier - accessible only within the same package
    int defaultVar = 50;
    
    
    public static void main(String[] args) {
		 Modifiers mod = new Modifiers();//creating object for Modifiers class
	        
	        System.out.println("Public Variable: " + mod.publicVar);
	        System.out.println("Protected Variable: " + mod.protectedVar);
	        System.out.println("Default Variable: " + mod.defaultVar);
	        

	}

}
 class Modifiers1 extends Modifiers {
	/* int Private;
		private String privatevar;
		 
	   public class Modifiers  {*/

		
		   private int privateVar=60;
	   

	public static void main(String[] args) {
		Modifiers1 m=new Modifiers1();
		 System.out.println("private variable: " + m.privateVar);

	}

}

