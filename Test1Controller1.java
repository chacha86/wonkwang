package uni.wonkwang.exam.test1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1Controller1 {

// 주소창에 localhost:8084/test1을 치면  hello world가 나와야함.
@RequestMapping("test1")
@ResponseBody
List test1() {

	List list = new ArrayList();
	
	String[]t strs = {"heloo", "hi", "good"};
	
	list.add(1);
	list.add("hihi");
	list.add(2);
	list.add(strs);
	
	return list;
}
}
