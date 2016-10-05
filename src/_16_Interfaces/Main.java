package _16_Interfaces;

public class Main {

	public static void main(String[] args) {
		
		
		DVD movie = new DVD();
		
		movie.gettitle("Hoosiers");
		movie.play();
		movie.skip();
		movie.pause();
		movie.menu();
		movie.stop();
		movie.superSecret();
		
				
		CD music = new CD();
		
		music.gettitle("Some Band");
		music.pause();
		music.play();
		music.stop();
		music.menu();
		music.skip();
		music.turnUp =true;
		music.eleven();
		
		BluRay newMovie = new BluRay();
		
		music.gettitle("The Hobbit");
		newMovie.pause();
		newMovie.play();
		newMovie.stop();
		newMovie.skip();
		newMovie.menu();
		newMovie.HD();

	}

}
