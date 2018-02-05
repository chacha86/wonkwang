package uni.wonkwang.exam.test2.no4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test2Service4_odd implements Test2Service4{

	@Autowired
	Test2Repository4 repo;
	
	public List<String> getList() {
		List<String> list = repo.getList();
		List<String> oddList = new ArrayList<String>();
		
		
		for( int i=0; i < list.size(); i++ ) {
			
			if(i % 2 != 0 ) {				
				oddList.add(list.get(i));
			}			
		}
		
		return oddList;
	}
}
