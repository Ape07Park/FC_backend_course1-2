package fc00.course2.part2;

import java.util.ArrayList;
import java.util.List;

import fc00.model2.MovieCheck;
import fc00.model2.MovieDTO;

public class MovieListTest {

	public static void main(String[] args) {
		List<MovieDTO> movieList = new ArrayList<MovieDTO>();
		
		movieList.add(new MovieDTO("괴물", "봉준호", 2006, "한국"));
		movieList.add(new MovieDTO("기생충", "봉준호", 2019, "한국"));
		movieList.add(new MovieDTO("완벽한 타인", "이재규", 2018, "한국"));
		
		MovieCheck mCheck = new MovieCheck();
		MovieDTO movie = mCheck.checkMovieName(movieList);
		System.out.println("영화제목" + ", " + "감독"+ ", " + "개봉년도" + ", "+ "국가");
		System.out.printf("%-4s %-6s %4s %-12s", movie.getTitle(), movie.getDirector(), 
				movie.getYear(), movie.getCountry() );
	}
}
