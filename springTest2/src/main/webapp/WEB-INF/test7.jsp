<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script>
	
</script>
<body>
	<form action="test7_1" method="GET">
		<input type="text" name="testParam" />
		<input type="submit" value="보내기" />
	</form>
	
	<form action="test7_2" method="GET">
		<input type="text" name="testParam" placeholder="funSpring을 입력해주세요." />
		<input type="submit" value="보내기" />
	</form>
	<hr>
	
	<form action="test7_3" method="GET">
		<div>
			아이디 <input type="text" name="loginId" />
		</div>
		<div>
			비밀번호 <input type="password" name="password" />
		</div>
		
		<input type="submit" value="보내기" />
	</form>
</body>
</html>