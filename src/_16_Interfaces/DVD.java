package _16_Interfaces;

public class DVD implements IFunctions{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play DVD");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop DVD");		
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
		System.out.println("Pause DVD");
	}
	public void superSecret(){
		System.out.println("All Hail Megatron");
	}

	@Override
	public void gettitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title);
		
	}

}
