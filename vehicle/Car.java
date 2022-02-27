package vehicle;

public class Car {
	
	 String color;
	 String model;
	 String Engine_type;
	 
	 public Car( String color,String model, String Engine_type){
		 this.color=color;
		 this.model=model;
		 this.Engine_type=Engine_type;
		}
	 public void print() {
		 System.out.println(color);
		 System.out.println(model);
		 System.out.println(Engine_type);
	 }
}

