package uni.wonkwang.exam.test1;

@Controller
public class Test1Controller3 {

	// 주소창에 localhost:8081/test3을 치면  test.jsp가 화면에 나오도록 해야함.
	@RequestMapping("test3")
	String test3() {

		return "test3";
	}

}
