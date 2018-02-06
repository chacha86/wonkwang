package uni.wonkwang.springTest2.exam2.no3;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import uni.wonkwang.springTest2.Article;

@Component
public class Test2Repository3 {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void insertCustomer(Article a) {
		
		String sql = "insert into article(title, body, regDate) values (?, ?, ?)";
		
		jdbcTemplate.update(sql, a.getTitle(), a.getBody(), a.getRegDate());
	}
	
	public void updateCustomer(Article a) {
		
		String sql = "update article set title = ?, body = ?, regDate = ? where id = ?";
		
		jdbcTemplate.update(sql, a.getTitle(), a.getBody(), a.getRegDate(), a.getId());
	}

	public void deleteCustomer(int id) {
	
		String sql = "delete from article where id = ?";
		
		jdbcTemplate.update(sql, id);
	}
	
	public List<Map<String, Object>> getArticles() {
		
		String sql = "select * from article";
		
		return jdbcTemplate.queryForList(sql);
		
	}
	
	public Article getArticle(int id) {

		String sql = "select * from article where id = ?";
		
		//Object[] args = {id};
		
		return jdbcTemplate.queryForObject(sql, new ArticleRowMapper(), id);
	}
	
}
