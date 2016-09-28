package _15_Inheritance_Polymorphism;

public class Animal {

	//Properties
	
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	
	public boolean isWarmBlooded;
	
	public String name;
	public String habitat;
	public String food;
	
	
	
	
	//Methods
	
	public void printName(){
		System.out.println("My name is " + name);
	}
	
	
	public void bloodType(){
		if(isWarmBlooded){
			System.out.println("I am warm blooded and like to lay in the shade.");
		}else{
			System.out.println("I am cold blooded and like lay in the sun to regulate my body temperature.");
		}
	}
	
	public void speak(){
		System.out.println("I am an animal");
	}
	
	public void eat(){
		System.out.println("I like to eat");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
