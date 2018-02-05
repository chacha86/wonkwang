package uni.wonkwang.springTest2.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerExam3 {

	// 주소창에 localhost:8081/test3을 치면  test.jsp가 화면에 나오도록 해야함.
	@RequestMapping("test3")
	String test3() {
		
		return "test3";
	}
}