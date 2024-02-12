package fc00.model2;

import java.util.List;

public class MovieCheck {
	
	public MovieDTO checkMovieName(List<MovieDTO> movieList) {
		MovieDTO movie = new MovieDTO();
		
		// 리스트 반복 - 조건에 맞으면 list에 저장
		// 순차검색(앞에서 부터), 이진검색(중간부터)
		for(MovieDTO m: movieList) {
			if(m.getTitle().equals("기생충")) {
				// 24.02.12 에러: 1) movie 객체 생성 x, 2) movie 객체는 비어있었지만 바로 return을 movie로 할려함
				movie = m;
				break;
			}
		}
		return movie;
	}
}
