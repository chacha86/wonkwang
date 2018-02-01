package uni.wonkwang.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import uni.wonkwang.exam.model.Article;

@Controller
public class testController {

	@RequestMapping("test__1")
	@ResponseBody
	// 확인주소 :
	// http://localhost:8081/test__1?input1=20&input1=10&input1=5
	int test6_1(int input1, int input2) {
		return input1 + input2;
	}

	@RequestMapping("test__2")
	@ResponseBody
	// 확인주소 :
	// http://localhost:8081/test__2?input1=20&input1=10&input1=5
	String test6_1(String str) {
		return str;
	}


	@RequestMapping("test__3")
	@ResponseBody
	// 확인주소 :
	// http://localhost:8081/test__3?input1=20&input1=10&input1=5
	List exam2_param_intArrayList(@RequestParam ArrayList<Integer> input1) {
		input1.add(99);
		input1.add(100);
		input1.add(101);

		input1.remove(3);

		return input1;
	}

	@RequestMapping("test__4")
	@ResponseBody
	// 확인주소 : http://localhost:8081/test__4?input1=1&input2=2&input3=3
	Map exam2_param_Map(@RequestParam Map<String, String> param) {
		return param;
	}

	@RequestMapping("test__5")
	@ResponseBody
	// 확인주소 : http://localhost:8081/test__5?input1=1&input2=2&input3=3
	Map exam2_param_Map_v2(@RequestParam Map<String, Object> param) {
		return param;
	}

	@RequestMapping("test__6")
	@ResponseBody
	// 확인주소 :
	// http://localhost:8081/test__6
	Article exam3_return_Article() {
		Article article = new Article();

		article.setId(1);
		article.setTitle("제목1");
		article.setBody("내용1");

		return article;
	}
}
