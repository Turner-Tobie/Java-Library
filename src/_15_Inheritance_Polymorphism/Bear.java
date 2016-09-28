package _15_Inheritance_Polymorphism;

public class Bear extends Animal{
	
	
	public boolean isHibernating;
		@Override
	public void speak(){
		System.out.println("ROOOOOOOOAAAAAAAAARRRR!!!");
	}
	public void eat(){
		System.out.println("I like to eat salmon and honey.");
	}
	
		
		
		
	public void hibernate(){
		if(isHibernating){
			System.out.println("I like to go to sleep all winter long because I don't like the cold");
		}else{
			System.out.println("");
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	


