<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="side.jsp"></jsp:include>
			<td>
				<a href="#audio">오디오테스트 가기</a>
				<a href="#video1">비디오1테스트 가기</a>
				<a href="#video2">비디오2테스트 가기</a>
				<h3><a id ="audio">Audio</a></h3> 
					 1. <audio src="music01.mp3" controls loop volume=0.2></audio>
				<br> 2. <audio src="music02.mp3" controls loop volume=0.2></audio>
				<br> 3. <audio src="music03.mp3" controls loop volume=0.2></audio>
				<br>


				<h3><a id ="video1">Video1</a></h3> <video src="video00.mp4" controls width="300"
					height="200"></video> <video src="video00.mp4" controls width="300"
					height="200"></video>

				<h3><a id ="video2">Video2</a></h3> <video src="video00.mp4" controls width="300"
					height="200"></video> <video src="video00.mp4" controls width="300"
					height="200"></video>
			</td>
<jsp:include page="copyright.jsp"></jsp:include>
