<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생관리프로그램</title>
</head>
<body>
<div>
<form id="register"	action="<%=request.getContextPath()%>/student.do">
 	이름:<input type="text" name="name"/>
	주민등록번호:<input type="text" name="ssn"/>
	<input type="submit" id="btn"value="확인"/>
</form>
</div>
<script>
$('#register').submit(function(){
	
});

</script>
</body>
</html>