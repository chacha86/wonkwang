package uni.wonkwang.springTest2.exam2.no4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2Controller4 {

	@Autowired
	Test2Service4 service;
	
	@RequestMapping("/exam2/test4")
	@ResponseBody
	List Test2() {
		
		List<String> list = service.getList();
//		String result = "";
		
//		for (int i = 0; i < list.size(); i++) {
//			result += list.get(i) + "<br />";
//		}
//		
		return list;
	}
}
