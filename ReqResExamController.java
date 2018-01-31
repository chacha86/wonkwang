package uni.wonkwang.exam.test1;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReqResExamController {

	@RequestMapping("/reqTest")
	String reqTest(HttpServletRequest req) {
		
		req.setAttribute("reqParam", "안녕하세요.");
		
		return "reqTest";
	}
	
	@RequestMapping("/resTest")
	void resTest(HttpServletResponse res) {
		
		PrintWriter writer = null; 
		
		try {
			
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=utf-8");
			
			writer = res.getWriter();
			
		} catch(Exception e) {
			
		}

		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("안녕하세요.");
		writer.println("</body>");
	}
	
}
