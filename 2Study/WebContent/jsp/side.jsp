<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<tr>
	<td width="20%">
		<!-- Java code가 들어갈 수 있는 부분 -->
		<%
			String username = (String)session.getAttribute("username");
			if(username != null) { //login_ok
		%>
		
			${username}님, 환영합니다.
				
		<form action="/2Study/Main?sign=logout" method="post">
			<input type="submit" value="Logout">
		</form>
		
		<%		
			} else {
		%>	
			<!-- 절대경로화 해서 서블릿으로 요청 보내기 -->
			<form style="width: 242px;" method="post" action="/2Study/Main?sign=login">
				ID <input name="id" style="width: 165px;"><br> 
				PW <input name="pw" type="password"><br> 
					<input type="submit" value="Login" style="width: 87px;"> 
					<a href = "/2Study/jsp/member_insert.jsp"> 
						<input type="button" value="Sign up" style="width: 87px;">
					</a>
			</form>
			
		<%	
			}
		%>
		
		<ul>
			<!-- Context명부터 써줘서 절대경로화! /프로젝트명/... -->
			<li><a href="/2Study/jsp/audio_video.jsp">Audio/Video</a></li>
			<li><a href="/2Study/jsp/iframe.jsp">Iframe</a></li>
			<li>Iframe</li>
			<li>Iframe</li>
			<li>Iframe</li>
		</ul>
	</td>