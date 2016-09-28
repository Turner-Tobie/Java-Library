package _13_Friends;

public class Friends {

	
	
	String Friend;
	int yrsKnown;
	int messages;
	boolean isOnline;
	boolean isFriend;
	String school;
	String gender;
	String currCity;
	String hometown;
	
	public void gender(){
		if(gender == "male"){
			System.out.println("his");
		}else if(gender  == "female"){
		  System.out.println("her");
		}else{
			System.out.println("their");
		}		
	}
	public void cityCheck(){
		if(currCity != hometown){
			System.out.println(Friend + " has moved away from " + gender + " hometown");
		}else{
			System.out.println(Friend + " is living in " + gender + "hometown" );
		}
	}
	
	
	public void getIsFriend(){
		if(isFriend){
			System.out.println(Friend + " is your friend.");
		}else{
			System.out.println(Friend + " is not your friend. Would you like to add them?");
		}
	}	
	public void getOnlineCheck(){
		if(isOnline){
			System.out.println(Friend + " is online");
		}else{
			System.out.println(Friend + " is offline");
		}
	}	
	public void getFriend(){
		System.out.println(Friend);		
		
	}
	public void getYrsKnown(){
		System.out.println("You have been friends for " + yrsKnown + "yrs");	
		
	}
	public void getNumMessages(){
		System.out.println("You have " + messages + " messages from " + Friend);
		
		
	}
	
	
	
	
}
