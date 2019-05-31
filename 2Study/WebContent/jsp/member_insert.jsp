<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="side.jsp"></jsp:include>
<td>

	*** 회원 가입 *** <br> <br>
	
	<form action = "/2Study/Main?sign=member_insert" method="post">
	<input type = "hidden" name = "sign" value ="member_insert"/>
		<fieldset id = "must">
			<legend>필수사항</legend>
		ID <input type = "text" name = "id" > <br>
		PW <input type = "text" name = "pw" > <br>
		Name <input type = "text" name = "name"> <br>
		</fieldset>
		<fieldset id = "option">
			<legend>인적사항</legend>
		E-Mail <input type ="email" name = "email" placeholder="OOO@OOO.OOO" /> <br>
		Gender <input type = "radio" name = "gender" value = "male" checked /> 남성
			<input type = "radio" name = "gender" value = "female" /> 여성 <br>
		Age <input type = "number" name ="age" min = "1" max ="99" step ="1" value ="20"/> <br>
		GitHub <input type = "url" name = "git" placeholder="http://******"/> <br>
		Tel <input type ="tel" name = "tel" pattern ="[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}" placeholder ="0**-****-****"/><br>
		Birth <input type ="date" name ="birth"/> <br>
		National <select name ="country">
					<option value = "Korea" selected> 대한민국 </option>
					<option value = "USA"> 미국 </option>
					<option value = "UK"> 영국 </option>
					<option value = "Japan"> 일본 </option>
					<option value = "China"> 중국 </option>
				</select> <br>
		</fieldset>			
		<fieldset id = "etc">
			<legend>기타사항</legend>
		Hobby <input type ="checkbox" name = "hobby" value = "movie" /> 영화 
			  <input type ="checkbox" name = "hobby" value = "drive" /> 드라이브 
		 	  <input type ="checkbox" name = "hobby" value = "soccer" /> 축구
			  <input type ="checkbox" name = "hobby" value = "music" /> 음악 <br>
		Color <input type = "color" name = "color" value = "#FF8080"><br>
		Image <input type = "file" name = "filename" > <br>
		Favorite <input type = "image" height="50" src = "https://i.pinimg.com/originals/a1/60/71/a16071849d7eaf5ef3d6554710451f05.png" alt ="Cat"/>
				 <input type = "image" height="50" src = "https://smallimg.pngkey.com/png/small/42-426056_cats-dogs-cats-and-dogs-heart-shaped-svg.png" alt ="Dog"/> <br>
		</fieldset>
		<fieldset id = "add">
			<legend>추가사항</legend>
		<textarea rows = "3" cols ="50" name ="desc">
자기소개를 입력해주세요.
		</textarea> <br>
		</fieldset>
		<input type ="submit" value ="Sign Up">
	</form>
</td>
</tr>

<jsp:include page="copyright.jsp"></jsp:include>