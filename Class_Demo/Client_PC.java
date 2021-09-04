package Class_Demo;

public class Client_PC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj1 = new P();
//		obj1.fun();
//		obj1.fun2();
//		System.out.println(obj1.d);
//		System.out.println(obj1.d2);
		
		
		// case 1:
//		P obj2 = new C();
//		obj1.fun();
//		obj1.fun2();
	
//		System.out.println(obj2.d);//2--P
//		System.out.println(obj2.d2);//20
//		System.out.println(((C)(obj2)).d1);//10
//		System.out.println(((C)(obj2)).d);//1-->c
//		obj2.fun();//
//		obj2.fun2();
		
		
//		C obj3= new P();
//		System.out.println(obj3.d);//2--P
//		System.out.println(obj3.d2);//20
////		System.out.println(((C)(obj2)).d1);//10
////		System.out.println(((C)(obj2)).d);//1-->c
//		obj3.fun();//
//		obj3.fun2();
		
		
		
		C obj4 = new C();
		System.out.println((((P)obj4)).d);
		((P)(obj4)).fun();
		
		

	}

}
