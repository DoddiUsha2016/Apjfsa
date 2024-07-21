package apjfsa;

abstract public class Shape1 {
	 String name;
	
	
	public Shape1(String name) {
		super();
		this.name=name;
	}
	
	void shapeInfo() {
		System.out.println("Name of shape="+name);
	}
	abstract void area();

	}


