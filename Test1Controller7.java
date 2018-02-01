package uni.wonkwang.exam.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1Controller7 {

	@RequestMapping("goTest7")
	String goTest6() {

		return "test7";

	}

	@RequestMapping("test7_1")
	@ResponseBody
	String test6_1(String testParam) {

		return "당신이 작성한 문자는 " + testParam + "입니다.";

	}

	@RequestMapping("test7_2")
	@ResponseBody
	String test7_2(String testParam) {

		String rst = "funSpring이라고 정확히 적어주세요~";
		if(testParam.equals("funSpring")) {
			rst = "잘 적어주셨습니다!";
		}

		return rst;

	}


	@RequestMapping("goTest7_2")
	String goTest7_2() {

		return "test7";

	}

	//loginId가 spring, password가 12345이면 로그인 성공이라는 문자가 나오도록 해주세요.
	@RequestMapping("test7_3")
	@ResponseBody
	String test7_3(String loginId, String password) {

		String str = "아이디와 비밀번호를 정확히 입력해주세요.";

		/*여기에서 로그인 체크를 하시면 됩니다.*/
		if(loginId.equals("spring")) {
			if(password.equals("12345")) {
				str = "로그인 성공~!";
			}
		}
			
		return str;
	}
}
