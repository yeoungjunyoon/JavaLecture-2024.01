#####################################
# 테이블 조언(TABLE join)
#####################################

/*
* 1. 테이블 생성
 */
# song TABLE
create table if not EXISTS song (
    sid int primary key auto_increment,
    title varchar(32) not null,
    lyrices varchar(64)
) auto_increment=101;           # 시작 번호 지정

# girl_grop table
create table if not exists girl_grop (
    gid int primary key auto_increment,
    name varchar(32) not null,
    debut date not null,
    hit_song_id int
) auto_increment=1001;

/*
* 2. 데이터 입력
 */
 # song table 
 insert into song (title, lyrics) values
   ('Tell Me', 'tell me tell me tetetete tel me'),
   ('Gee', 'GEE GEE GEE GEE GEE BABY BABY'),
   ('미스터', '이름이 뭐야 미스터'), 
   ('Abracadabra', '이러다 미쳐 내가 여리여리'),
   ('8282', 'Give me a call Baby baby'), ('기대해', '기대해'),
   ('I Dont care', '다른 여자들의 다리를'), 
   ('Bad Girl Good Girl', '앞에선 한 마디 말도'), ('피노키오', '뉴예삐오'),
   ('별빛달빛', '너는 내 별빛 내 마음의 별빛'), 
   ('A', 'A 워오우 워오우워 우우우'),
   ('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고'), ('LUV', '설레이나요 '),
   ('짧은치마', '짧은 치마를 입고 내가 길을 걸으면'),
   ('위아래', '위 아래 위위 아래'), ('Dumb Dumb', '너 땜에 하루종일');