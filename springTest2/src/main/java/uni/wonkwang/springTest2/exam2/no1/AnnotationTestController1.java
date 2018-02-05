package uni.wonkwang.springTest2.exam2.no1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnnotationTestController1 {

	@RequestMapping("/exam2/_test1")
	@ResponseBody
	String test1() {
		return "hello";
	}
}
