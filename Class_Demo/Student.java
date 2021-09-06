package Class_Demo;

public class Student {

	private String name="hey";
	private int age=89;

	public Student() {

	}

	public Student(String name, int  age) {
		this.name=name;
		this.age=age;
		
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		
		return age;
	}

	public void setAge(int age) throws Exception {
		
		if(age<0) {
			throw new Exception("-ve age");
		}
		this.age = age;
	}

}
