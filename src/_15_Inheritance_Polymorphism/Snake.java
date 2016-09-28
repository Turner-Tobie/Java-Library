package _15_Inheritance_Polymorphism;

public class Snake extends Animal{
	
	public boolean venom;
	
	
	@Override
	public void eat(){
	System.out.println("I like to eat small rodents. Especially mice.");
	}
	
	public void poison(){
		if(venom){
			System.out.println("I am poisonous and will attack if provoked.");
		}else{
			System.out.println("I am not poisonous but will still bite if cornered.");
		}
	}
	
	
	
	
	
	
}
