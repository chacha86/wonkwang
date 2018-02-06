package uni.wonkwang.springTest2.exam2.no3;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uni.wonkwang.springTest2.Article;

@Controller
public class Test2Controller3 {

	@Autowired
	Test2Service3 service;
	
	@RequestMapping("/exam2/jdbcTest1")
	@ResponseBody
	void test1() {
		
		Article article = new Article();
		
		article.setTitle("JDBCTemplate test title");
		article.setBody("JDBCTemplate test body");
		article.setRegDate("20180205");
		
		service.insertCustomer(article);
	}
	
	@RequestMapping("/exam2/jdbcTest2")
	@ResponseBody
	void test2() {
		
		Article a = new Article();
		
		a.setId(5);
		a.setTitle("JDBCTemplate test 제목 변경");
		a.setBody("JDBCTemplate test 내용 변경");
		a.setRegDate("20180205");
		
		service.updateCustomer(a);
	}
	
	@RequestMapping("/exam2/jdbcTest3")
	@ResponseBody
	void test3() {
		
		int id = 5;
		service.deleteCustomer(id);
	}
	
	
	@RequestMapping("/exam2/jdbcTest4")
	@ResponseBody
	List<Map<String, Object>> test4() {
		return service.getArticles();
	}
	
	@RequestMapping("/exam2/jdbcTest5")
	@ResponseBody
	Article test5() {
		int id = 6;
		return service.getArticle(id);
	}
	
}
