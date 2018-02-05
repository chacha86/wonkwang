package uni.wonkwang.exam.test2.no1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2Controller1 {

	//Test2Service1 service;
	
	@RequestMapping("/exam2/test1")
	@ResponseBody
	String test1() {
		return "hi";
	}
}
