package uni.wonkwang.exam.test1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1Controller5 {
	
	//구구단을 출력해보세요.
	// test5_1 치면 구구단 출력
	// test5_2 치면  test5.jsp에서 구구단 출력

	@RequestMapping("/test5_1")
	@ResponseBody
	String test5_1() {
		
		String kuku = "";
		
		for( int i = 1; i <= 9; i++ ) {
			for( int j = 1; j <= 9; j++ ) {
				kuku += i + " * " + j + " = " + i*j + "<br />";
			}
		
			kuku += "<br />";
		}		
		
		return kuku;
	}
	
	@RequestMapping("/test5_2")
	String test5_2(HttpServletRequest req) {
		String kuku = "";
		
		for( int i = 1; i <= 9; i++ ) {
			for( int j = 1; j <= 9; j++ ) {
				kuku += i + " * " + j + " = " + i*j + "<br />";
			}
			kuku += "<br />";
		}
		
		req.setAttribute("kuku", kuku);
		
		return "test5";
		
	}
	
}
