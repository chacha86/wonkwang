package crudExam;

import java.util.ArrayList;
import java.util.List;

public class Management {

	private List<Customer> customers;
	
	public Management() {
		this.customers = new ArrayList<Customer>();
	}
	
	
	public void insertCustomer(Customer c) {
		if(getIndex(c.getId()) == -1) {
			customers.add(c);			
		} else {
			System.out.println(c.getId() + "아이디는 "
					+ "이미 등록되어있는 아이디입니다.");
		}
	}
	
	public int getCount() {
		//1. ArrayList는 자신이 가지고 있는 배열의 길이를 
		//size() 메서드로 얻을 수 있다.
		int count; 
		
		count = customers.size();
		//2. 자신을 호출한 곳으로 길이를 반환한다.
		return count;
		
	}
	
	// A문자.equals(B문자)   --> A문자와 B문자 비교
	int getIndex(String id) {
		for(int index = 0; index < customers.size(); index++ ) {
			if(id.equals(customers.get(index).getId())) {
				return index;
			}
		}
		
		return -1;
	}
	
	Customer searchCustomer(String id) {
		
		Customer c1 = new Customer();
		
		if(getIndex(id) != -1) {
			c1 = customers.get(getIndex(id));
		} else {
			System.out.println("없는 id");
		}
		
		return c1;
	}
}








