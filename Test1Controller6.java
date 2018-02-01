package uni.wonkwang.exam.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import uni.wonkwang.exam.model.Article;

@Controller
public class Test1Controller6 {

	// localhost:8081/test6_1?input1=6&input2=4 를 치면 두 수의 합이 결과로 나오게 해주세요.
	@RequestMapping("test6_1")
	@ResponseBody
	int test6_1(int input1, int input2) {

		/*파라미터를 합한 후 리턴하여 jsp 또는 responseBody를 이용해 출력합니다.*/
		return input1 + input2;

	}


	// localhost:8081/test6_2 이후에 주소창에 직접 파라미터를 넘겨서 두수를 곱한 결과가 나오게 해주세요.
	// 주소창에 직접 key=value 형식으로 파라미터를 지정해줍니다. 파라미터가 2개 이상이면 &구분자를 이용해 구분해줍니다.
	@RequestMapping("test6_2")
	@ResponseBody
	int test6_2(int intA, int intB) {

		/*받아온 파라미터들을 곱하여 리턴하여 jsp 또는 responseBody를 이용해 출력합니다.*/
		return intA * intB
	}

	// localhost:8081/test6_3 에 파라미터를 넘겨 "hello world"를 출력해보세요.
	// localhost:8081/test6_3?str=hello world
	@RequestMapping("test6_3")
	@ResponseBody
	String test6_3(String str) {

		/*넘겨받은 파라미터를 리턴하여 jsp 또는 responseBody를 이용해 출력합니다.*/
		return str;
	}

	//localhost:8081/test6_4?param1=안녕하세요&param2=저는 차태진&param3=입니다.
	//를 치면  여기서 map으로 받아 결과를 출력해보세요.
	Map test6_4(@RequestParam Map<String, String> paramMap) {

		/* Map을 리턴하여 jsp 또는 responseBody를 이용해 출력합니다.*/
		return paramMap;

		//또는 paramMap.get("id") + paramMap.get("title") + paramMap.get("body") 로 String return 해도 됩니다.

	}


	//localhost:8081/test6_5 뒤로 파라미터를 넘겨주어 파라미터 값을 이용해 Article 객체를 만들어 직접 출력해보세요.
	//localhost:8081/test6_5?id=1&title=제목&body=내용
	Article test6_5(int id, String title, String body) {

		/*Article 객체를 만들어 set메서드를 이용해 받아온 파라미터로 값을 정해줍니다.*/
		Article article = new Article();

		article.setId(id);
		article.setId(title);
		article.setId(body);

		/*값이 모두 설정된 Article 객체를 리턴하여 jsp 또는 responseBody를 이용해 출력합니다.*/

		return article;
	}

}
