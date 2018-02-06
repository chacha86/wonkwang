package uni.wonkwang.springTest2.exam2.no3;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import uni.wonkwang.springTest2.Article;

public class ArticleRowMapper implements RowMapper<Article>{

	@Override
	public Article mapRow(ResultSet rs, int row) throws SQLException{
		Article article = new Article();
		article.setId(rs.getInt("id"));
		article.setTitle(rs.getString("title"));
		article.setBody(rs.getString("body"));
		article.setRegDate(rs.getString("regDate"));
	    return article;
	}
	
}
