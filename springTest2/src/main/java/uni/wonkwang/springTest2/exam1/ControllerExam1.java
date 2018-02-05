package uni.wonkwang.springTest2.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerExam1 {

	// 주소창에 localhost:8081/test1을 치면  hello world가 나와야함.
	@ResponseBody
	@RequestMapping("test1")
	String test1() {
	
		return "hello world";
	}
}
