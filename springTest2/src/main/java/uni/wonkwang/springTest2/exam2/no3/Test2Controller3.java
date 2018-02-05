package uni.wonkwang.springTest2.exam2.no3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2Controller3 {

	@Autowired
	Test2Service3 service;
	
	@RequestMapping("/exam2/test3")
	@ResponseBody
	String test1() {
		
		return service.getString();
		//return "hi";
		
	}
}
