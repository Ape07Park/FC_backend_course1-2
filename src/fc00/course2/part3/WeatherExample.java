package fc00.course2.part3;

import java.io.BufferedReader; 
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;

import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeatherExample {

	public static void main(String[] args) {
		String city = "Seoul";
		String apiKey = null;

		// 파일 경로
		String path = "C:/Users/ape07/eclipse-workspace/FC_backend_course1~2/src/fc00/course2/part3/apiKey.properties";

		try {
			Properties prop = new Properties();
			// 파일 읽기
			prop.load(new FileInputStream(path));

			// 프로퍼티 파일에서 원하는 것의 key 값으로 value 가져오기
			apiKey = prop.getProperty("openWeatherApiKey");

		} catch (Exception e) {
			e.printStackTrace();
		}

		String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey
				+ "&units=metric";

		// 네트워킹에서 에러 발생 시 에러 메시지 띄우기 위해 try-catch 작성
		try {
			// URL인지 아닌지 확인하기 위해 URL 객체 생성. URL이면 에러 x
			URL url = new URL(urlString);

			// URL 연결
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection(); // url을 연결한 걸 connection에 담기 위해
																						// HttpsURLConnection으로 캐스팅

			// 어떤 방식으로 연결할 것인지
			connection.setRequestMethod("GET");

			// 요청한 정보를 어떤 타입으로 받을 것인지
			connection.setRequestProperty("Accept", "application/json"); // Accept, 타입

			// 서버에서 데이터를 잘 보냈는지 확인
			int responseCode = connection.getResponseCode(); // 200이면 정상

			if (responseCode == 200) {
				/*
				 * 스트림(I/O)의 연결. 스트림은 데이터가 흐르는 통로
				 */

				// ** 1) getInputStream으로 연결된 것의 데이터 통로 생성 2) InputStreamReader를 이용해 2byte 단위(문자
				// 등의 데이터)로 데이터를 효율적으로 읽을려함 3) 데이터를 버퍼에 모아서 한번에 읽기
				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream())); 																					// 데이터 통로 생성
				
				String inputLine;

				// 데이터를 StringBuffer를 이용해 기존 데이터에 이어 붙이기 위함
				StringBuffer content = new StringBuffer();

				while ((inputLine = br.readLine()) != null) { // br의 데이터를 한 줄씩 읽고 inputLine에 저장. 그 뒤 그것이 빈값일 때 까지 반복해서 읽음
															
					content.append(inputLine);
				}
				br.close();

//				System.out.println(content.toString()); content를 string으로 변환 후 내용물 확인 

				/*
				 *  content의 main키에 있는 temp 꺼내기
				 */
				
				// parse: 기계어 번역 
				
				/*
				 * JSON 데이터 다루기 
				 */
				JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject(); // JsonParser의 parseString을 통해 String type의 content를 번역(읽은) 후 Json Obj로 변환  
				
				JsonObject mainData = weatherData.getAsJsonObject("main"); // main 키에 속한 값 가져오기

//				System.out.println(mainData); {"temp":18.64,"feels_like":17.92,"temp_min":17.69,"temp_max":21.66,"pressure":1015,"humidity":52}
				
				
				// temp라는 key를 가진 값 가져와 com.google.gson.JsonPrimitive 타입으로 출력하기 
//				System.out.println(mainData.getAsJsonPrimitive("temp")); 
				
				/*
				 * ** 타입체크 .getClass().getName()
				 */
				
//				System.out.println(mainData.getAsJsonPrimitive("temp").getClass().getName());
				
				double temp = mainData.get("temp").getAsDouble(); //  temp라는 key를 가진 값 가져와 double 타입으로 바꾸기 
				
				System.out.println("서울의 온도 = " + temp + "도"); // 서울의 온도 = 18.64도
				
			} else {
				System.out.println("error 발생");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
