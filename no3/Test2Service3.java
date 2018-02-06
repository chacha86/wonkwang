package uni.wonkwang.springTest2.exam2.no3;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uni.wonkwang.springTest2.Article;

@Service
public class Test2Service3 {

	@Autowired
	Test2Repository3 repository;
	
	public void insertCustomer(Article a) {
		
		repository.insertCustomer(a);
	}
	
	public void updateCustomer(Article a) {
		
		repository.updateCustomer(a);
	}
	
	public void deleteCustomer(int id) {
		repository.deleteCustomer(id);
	}
	
	public List<Map<String, Object>> getArticles() {
		return repository.getArticles();
	}
	
	public Article getArticle(int id) {
		return repository.getArticle(id);
	}
}
