package Class_Demo;

public class Student_Cilent {
	public static void main(String[] args)  {
		Student s = new Student();
		Student s1 = new Student();
		s.setName("kaju");
		try {
			s.setAge(-90);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.setName("Hardik");
		try {
			s1.setAge(90);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bye");
		Student s11 = new Student("k",90);
		System.out.println("hey");
		System.out.println(s11.getName());
		
		
		
		

	}
}
