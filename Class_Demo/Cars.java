package Class_Demo;

public class Cars {
	
	private String color;
	private int price;
	private int speed;
	public Cars(int price,int speed,String color) {
		// TODO Auto-generated constructor stub
		this.color=color;
		this.speed=speed;
		this.price=price;
	}
	@Override
	public String toString() {
		return "P:"+this.price+" s:"+this.speed+" :c "+this.color;
		
	}

}
