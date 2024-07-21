package apjfsa;
//Basic class
class Transport {
	String name;
	public Transport(String car) {
		this.name=car;
	}
  void dispaly() {
	  System.out.println("Road transport mode is selected");
	  System.out.println("Name of the vehicle"+name);
  }
		
	}
	//Road_Transport inherits from Transport 
class Roadtransport extends Transport {
	int wheels;
	public Roadtransport(String car,int wheels) {
		super(car);
		this.wheels=wheels;
	}
	void display() {
	//super.display();
	System.out.println("No_of wheels:"+wheels);
}
}
//Fourwheeler inherited from Road_Transport
class FourWheeler extends Roadtransport {
	int capacity;
	public FourWheeler(String car,int wheels,int capacity) {
		super(car,wheels);
		this.capacity=capacity;
	}
	public void display() 
	{
	super.display();
	System.out.println("total seats:"+capacity);
	}
	}
	 class Transportation {
	public static void main(String[] args) {
		//creating an object for Fourwheeler class
		FourWheeler f=new FourWheeler("Car",4,4);
		//print details of the car
		f.display();
	}
	}

	


