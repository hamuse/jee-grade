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
<h1>로그인</h1>
<form id="login" action="<%=request.getContextPath()%>/student.do">
	이름:<input type="text"  name="name"	/>
	학번:<input type="text" name="hakbun"/>
			<input type="submit"  id="btn" value="전송"/>

</form>
</div>
<script>
$('#login').submit(function()){
	alert('학생관리프로그램');

});

</script>
</body>
</html>