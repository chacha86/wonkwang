package uni.wonkwang.exam.test2.no3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test2Service3 {

	@Autowired
	Test2Repository3 repository;
	
	public String getString() {
		return repository.getString();
	}
}
