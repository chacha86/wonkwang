package uni.wonkwang.exam.test1;

import org.springframework.web.bind.annotation.ResponseBody;

public class Test1Controller2 {

	// 주소창에 localhost:8087/test2를 치면 아래 문자가 나오도록 해야함.
	@ResponseBody
	String test2() {
		return "hello world2";	
	}
	
}

