package _16_Interfaces;

public class CD implements IFunctions{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD is now playing.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD is stopped.");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next song.");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Show CD menu.");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause song.");
	}
	
	Boolean turnUp;
	
	public void eleven() {
		if(turnUp){
		System.out.println("Turn it up to Eleven!");
		}else{
			System.out.println("I can't hear you.");
		}
	}

	@Override
	public void gettitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title);
		
	}
	
	

}
