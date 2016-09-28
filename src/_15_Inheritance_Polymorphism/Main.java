package _15_Inheritance_Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal george = new Animal();
		george.name = "George the Animal";
//		george.printName();
		
		Bear barney = new Bear();
		barney.name = "Barney";
		barney.isHibernating = true;
		barney.isWarmBlooded = true;
		barney.printName();
		barney.eat();
		
		Kangaroo jack = new Kangaroo();
		jack.name = "Kangaroo Jack";
		barney.isWarmBlooded = true;
		jack.printName();
		jack.eat();
		
//		jack.bloodType();
//		
//		barney.speak();
//		jack.speak();
		
		Snake sam = new Snake();
		sam.name = "Viper Sam";
		sam.isWarmBlooded = false;
		sam.venom = true;
		sam.printName();
//		sam.bloodType();
//		sam.poison();
		sam.eat();
		
		
		Mouse mickey = new Mouse();
		mickey.name = "Mickey Mouse";
		mickey.printName();
		mickey.eat();
		
		
		
		
		
		
		
		
		
	}

}
