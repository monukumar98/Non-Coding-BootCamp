package LLd_2;

public abstract class Student extends Otp {
	
	private  String Name;
	private int age;
	private int roll_no;
	
	public abstract boolean Create_Student_data();
	
	int otp = this.Gen_OTP();
	public abstract  boolean verfiy();
	
	


}
