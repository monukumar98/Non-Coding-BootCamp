package LLd_LBM;

public abstract class Member extends Account {

	public String DataofMemberShip;
	int toatalCheckOut;
	
	
	
	public abstract int gettotalChecck();

	
	public boolean isCheck_out(String barCode) throws Exception {
		
		if(this.toatalCheckOut==Constant.max_linit_per_user) {
			throw new Exception("User Limit Complete kr liye");
		}
		
		BooKRevservation booKRevservation = new BooKRevservation() {
			
			@Override
			public BooKRevservation getAllDetails(String barcode) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		if(booKRevservation.user_id!=null && !this.Id.equals(booKRevservation.user_id)) {
			throw new Exception("Koi ke name pe");
		}
		
			
		
		
		
		
	}
	

}
