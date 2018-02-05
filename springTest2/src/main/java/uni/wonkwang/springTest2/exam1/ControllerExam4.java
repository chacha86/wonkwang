package uni.wonkwang.springTest2.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerExam4 {

	//localhost:8081/test4_1을 치면 test4.jsp가 화면에 나와야 하고
	@RequestMapping("test4_1")
	String test4_1() {
		
		return "test4";
	}
	
	//localhost:8081/test4_2를 치면 '안녕하세요 저는 글자 그대로 나와요~'가 나오도록 해야함.
	@RequestMapping("test4_2")
	@ResponseBody
	String test4_2() {
		
		return "안녕하세요 저는 글자 그대로 나와요~'";
	}
	
	
}
