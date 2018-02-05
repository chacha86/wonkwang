package uni.wonkwang.exam.test2.no2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2Controller2 {

	@Autowired
	Test2Service2 service;
	
	@RequestMapping("/exam2/test2")
	@ResponseBody
	String test2() {
		return service.getString();
	}
}
