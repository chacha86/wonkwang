package uni.wonkwang.springTest2.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerExam2 {

	// 주소창에 localhost:8081/test2를 치면 아래 hello world2 문자가 나오도록 해야함.
	@ResponseBody
	@RequestMapping("test2")
	String test2() {
		return "hello world2";	
	}
}