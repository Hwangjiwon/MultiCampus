<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="side.jsp"></jsp:include>
<td>

	*** 회원 가입 *** <br> <br>
	
	<form action = "/2Study/Main?sign=member_insert" method="get">
		ID <input type = "text" name = "id" > <br>
		PW <input type = "text" name = "pw" > <br>
		Name <input type = "text" name = "name"> <br>
		Gender <input type = "radio" name = gender" value = "male" checked /> 남성
			<input type = "radio" name = gender" value = "female" /> 여성 <br>
		Hobby <input type ="checkbox" name = "hobby" value = "movie" /> 영화 
			<input type ="checkbox" name = "hobby" value = "drive" /> 드라이브 
			<input type ="checkbox" name = "hobby" value = "soccer" /> 축구
			<input type ="checkbox" name = "hobby" value = "music" /> 음악 <br>
		Image <input type = "file" name = "filename" > <br>
	</form>
</td>
</tr>

<jsp:include page="copyright.jsp"></jsp:include>