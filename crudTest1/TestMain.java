package crudExam;

public class TestMain {

	/** 
		고객 관리 시스템을 테스트하는 클래스
		
	-- 테스트를 위한 초기화 데이터
		new Customer("c001", "소지섭", "pw1111", 'M');
		new Customer("c002", "한효주", "pw2222", 'F');
		new Customer("c003", "마동석", "pw3333", 'M');
		new Customer("c004", "설현", "pw4444", 'F');
		new Customer("c005", "김연아", "pw5555", 'F');
	 */

	/** 시작 메서드 */
	public static void main(String[]args) {
		/* 고객에 대한 CRUD 기능을 수행하기 위한 객체 생성 : Management */
		Management mngr = new Management();
		
		//mngr의 insert 메서드를 구현하여 고객 등록을 해야합니다.
		System.out.println("\n### 고객 등록(Create) ###");
		
		mngr.insertCustomer(new Customer("yunajjang", "김연아", "pw5555", 'F'));
		
		
		
		//아래 mngr.getCount()로 저장되어 있는 고객의 수를 얻어야 합니다. 
		System.out.println("\n### 고객 숫자 : " + mngr.getCount());
		
		
		
		// Customer를 인자로 해당 정보를 저장할 수 있는 insertCustomer 함수 구현.
		//중복 등록 시 "c001 아이디로 이미 등록되어 있습니다." 출력. 
		System.out.println("\n### 고객 중복 등록  ###");
		mngr.insertCustomer(new Customer("yunajjang", "임꺽정", "pw5555", 'F'));
		
		
		
		//아이디를 인자로 하여 해당 아이디의 정보를 검색 할 수 있는 searchCustomer 함수를 구현.
		System.out.println("\n### 특정 고객 검색(Read) ###");
		mngr.searchCustomer("yunajjang").print();
		
		
		//아이디를 인자로 하여 해당 아이디의 정보를 변경 할 수 있는 updateCustomer 함수 구현.
		System.out.println("\n### 특정 고객 변경(Update) ###");
		
		
		
		//아이디를 인자로 하여 해당 아이디의 정보를 삭제 할 수 있는 deleteCustomer 함수 구현.
		System.out.println("\n### 특정 고객 삭제(Delete) ###");
		
		
		
		//전체 고객을 모두 보여주는 searchAllCustomer 함수 구현.
		System.out.println("\n### 전체 고객 검색 ###");
		
		
		
		//아이디와 기존 비밀번호를 인자로 하여 해당 아이디의 비밀번호를 변경 할 수 있는
		//updatePassword 함수 구현
		//아이디가 없으면 "해당 아이디가 존재하지 않습니다.", 아이디는 있으나 기존 비밀번호가 틀린 경우
		//"잘못된 비밀번호를 입력하였습니다." 출력
		System.out.println("\n### 특정 고객 암호 변경 ###");

		
		
		//아이디와 이름을 인자로 하여 해당 아이디의 비밀번호를 찾을 수 있는
		//searchPassword 함수 구현
		//아이디가 없으면 "해당 아이디가 존재하지 않습니다.", 아이디는 있으나 이름이 없는 경우
		//"정확한 이름을 입력해주세요." 출력
		System.out.println("\n### 특정 고객 암호 찾기 ###");
		
		
	}

}