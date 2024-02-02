#########################################
#
# 데이터 조작 언어 (DML: Data Manipulation Language)
#
#########################################

/*
* 2. Update
*
*       UPDATE 테이블
*             SET 필드명1=값1, 필드명=값2, ..., 필드명n=값n
*             WHERE 조건;                  # 조건 - 프라이머리 키 = 값
*/

UPDATE kcity SET name='수원', population=12000000 WHERE id=2340;
UPDATE kcity SET name='용인', population=11000000 WHERE id=2362;
# ID가 2391 이상인 도시의 인구를 10만 추가
UPDATE kcity SET population=population+100000 WHERE id>2390;

/*
* 3. Insert
*
*       INSERT INTO 테이블(필드명1, 필드명2, ...., 필드명 n)
*           VALUES (값1, 값2, ..., 값n) [, 값1, 값2, ..., 값n)];
*
*        INSERT INTO 테이블 VALUES (모든 필드의 값) [,  (모든 필드의 값)];  
*/
# 경기도 화성시, 의정부시 추가
INSERT INTO kcity
    VALUES (default, '화성', 'KOR', 'Kyonggi', 9000000),
           (default, '의정부', 'KOR', 'Kyonggi', 200000);

# 강원도 속초시 추가 - default value 활용(auto_increment 포함)
INSERT INTO kcity(name, countrycode, district) VALUES('속초', 'KOR', 'Kang-won')

# 경기도 광주시 추가 - auto_increment 속성이 설정되어 있어도 ID 값을 임의로 부여 가능
INSERT INTO kcity VALUES (2600. '광주', 'KOR'm "Kyonggi", 3000000);

/*
* 4. Delete
*
*
*      Delete FROM 테이블명 WHERE 조건;             # 조건 - Primary key = value
*/
# 강원도 속초시 삭제
Delete FROM kcity won id=2503;
