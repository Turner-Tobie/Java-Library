package _15_Inheritance_Polymorphism;

public class Kangaroo extends Animal{

	
	public boolean isJumping;
	public boolean bigFeet;
	
	
//	Use polymorphism to overide the speak
//	method from animal make the kangaroo say
//	something new
	
	
	@Override
	public void speak(){
		System.out.println("Well that was excessive.");
	}
	
	public void eat(){
		System.out.println("I like to eat plants.");
	}
	
	
	
	
	
	
	
}
