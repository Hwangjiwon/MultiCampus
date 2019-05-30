# MultiCampus

**데이터베이스 Openeg로 연동하기 위한 기본작업**  
1. VMware의 Ubuntu에 mysql Docker Container 실행  
  : docker run -d -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=true --name mysql -v $(pwd)/mysql_data:/var/lib/mysql mysql:5.7  
2. docker exec -it mysql -uroot -p  
3. pw : apmsetup  
4. mysql> show databases; 데이터베이스 확인
