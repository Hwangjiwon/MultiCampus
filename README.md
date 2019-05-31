# MultiCampus

**데이터베이스 Openeg로 연동하기 위한 기본작업**  
1. VMware의 Ubuntu에 mysql Docker Container 실행  
  : docker run -d -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=true --name mysql -v $(pwd)/mysql_data:/var/lib/mysql mysql:5.7 
 ps. 에러날경우, docker rm -f mysql 하고서 다시 시도
2. docker exec -it mysql bash
3. mysql -uroot -p
4. pw : apmsetup  
5. mysql> show databases; 데이터베이스 확인
