package uni.wonkwang.exam.test1;

import javax.servlet.http.HttpServletRequest;

public class Test1Controller6 {

	String test_6(HttpServletRequest req) {
		
		String[] strArray = {"안녕하세요.", "저는", "차태진입니다.", "잘부탁드립니다."};
		
		req.setAttribute("text", strArray);
		
		
		return "test6";
		
		
	}
	
}
