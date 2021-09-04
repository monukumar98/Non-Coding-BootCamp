package Class_Demo;



public class Car_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cars [] car = new Cars[5];
//	System.out.println(new Cars(100,1,"A"));
	
	car[0] = new Cars(1000, 20, "Black");
	car[1] = new Cars(200, 10, "White");
	car[2] = new Cars(345, 3, "Yellow");
	car[3] = new Cars(8907, 6, "Red");
	car[4] = new Cars(34, 89, "Grey");
	
	for (int i = 0; i < car.length; i++) {
		System.out.println(car[i]);
	}
		

	}

}
