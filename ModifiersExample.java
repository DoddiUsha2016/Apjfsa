package apjfsa;

public class ModifiersExample {
	// Public variable
    public int publicVar;
    
    // Private variable
    private int privateVar;
    
    // Protected variable
    protected int protectedVar;
    
    // Default variable
    int defaultVar;
    
    // Setter for publicVar
    public void setPublicVar(int value) {
        this.publicVar = value;
    }
    
    // Getter for publicVar
    public int getPublicVar() {
        return this.publicVar;
    }
    
    // Setter for privateVar
    protected void setPrivateVar(int value) {
        this.privateVar = value;
    }
    
    // Getter for privateVar
    protected int getPrivateVar() {
        return this.privateVar;
    }
    
    // Setter for protectedVar
    public void setProtectedVar(int value) {
        this.protectedVar = value;
    }
    
    // Getter for protectedVar
    public int getProtectedVar() {
        return this.protectedVar;
    }
    
    // Setter for defaultVar
    public void setDefaultVar(int value) {
        this.defaultVar = value;
    }
    
    // Getter for defaultVar
    public int getDefaultVar() {
        return this.defaultVar;
    }
    
    // Main method
    public static void main(String[] args) {
        ModifiersExample m = new ModifiersExample();//Creating Object for class
        
        // Set values using setter methods
        m.setPublicVar(40);
        m.setPrivateVar(60);
        m.setProtectedVar(90);
        m.setDefaultVar(50);
        
        // Get and print values using getter methods
        System.out.println("Public variable: " + m.getPublicVar());
        System.out.println("Private variable : " + m.getPrivateVar());
        System.out.println("Protected variable: " + m.getProtectedVar());
        System.out.println("Default variable: " + m.getDefaultVar());
    }

}

	    
