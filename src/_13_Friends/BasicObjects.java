package _13_Friends;

public class BasicObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Friends sean = new Friends();
		
			sean.Friend = "Sean";
			sean.yrsKnown = 13 ;
			sean.messages = 3 ;
			sean.isOnline = false;
			sean.isFriend = true;
			sean.gender = "male";
			sean.currCity = "Wanamaker";
			sean.hometown = "Franklin" ; 
			
			sean.getFriend();
			sean.getNumMessages();
			sean.getYrsKnown();
			sean.getIsFriend();
			sean.getOnlineCheck();
			sean.gender();
//			sean.cityCheck(String getGender);
		
	}

}
