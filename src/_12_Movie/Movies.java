package _12_Movie;

public class Movies {
	
	
	String title;
	String genre;
	String leadActor;
	String leadActress;
	
	int movieLength;
	
	double grossEarnings;
	
	boolean redBox;
	boolean netflix;
	
	
	
	//Methods
	public void getMovieLength(){
		System.out.println(movieLength);
		
		
	}
	public void getGrossEarnings(){
		System.out.println(grossEarnings);
	}
	
	Movies(String title, String genre, String leadActor, String leadActress, int movieLength){
		this.title = title;
		this.genre = genre;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.movieLength= movieLength;
		
	}
	
	

}
