package LLd_2;

public abstract class Gen_Id_Card  extends Otp{
	
	private String barCode;
	private String College_Name;
	private String Signature;
	private Person Details;

	 int otp= Gen_OTP();
	
	public abstract boolean verfiy(int otp);
	
	

}
