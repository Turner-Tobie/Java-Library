package _16_Interfaces;

public class BluRay implements IFunctions{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play BluRay");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop BluRay");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip Scene");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Main Menu");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause BluRay");
	}
	public void HD(){
		System.out.println("Play High Definition");
	}

	@Override
	public void gettitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title);
		
	}

}
