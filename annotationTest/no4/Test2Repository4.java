package uni.wonkwang.exam.test2.no4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Test2Repository4 {

	List<String> getList() {
		
		List<String> list = new ArrayList<String>();
		String rs = "문자";
		
		for(int i = 0; i < 10; i++) {
			
			rs += i;
			
			list.add(rs);
			rs = "문자";
		}
		
		return list;
	}
}
