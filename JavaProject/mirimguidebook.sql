-- MySQL dump 10.13  Distrib 5.7.19, for Win64 (x86_64)
--
-- Host: 192.168.219.103    Database: mirimguidebook
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `club`
--

DROP TABLE IF EXISTS `club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `club` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `number` int(3) DEFAULT NULL,
  `club_name` varchar(30) NOT NULL,
  `club_room` varchar(35) DEFAULT NULL,
  `teacher` varchar(15) NOT NULL,
  `intro` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `club`
--

LOCK TABLES `club` WRITE;
/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` VALUES (2,1,'DIY반','가사실, 2 - 4반 교실','김보경','머핀, 쿠키 등 음식이나 작품들을 만들어내는 활동을 한다.'),(3,1,'고로수길가이드제작반','아트스튜디오실','김명준','고로수길은 가로수길과 고시촌의 합성어로 우리 학교 근처에 있는 ‘고로수길’에 대해 안내하는 가이드를 제작한다.'),(4,1,'도서반','도서실','송민정','책을 빌려주고, 반납된 책 등을 정리하는 일 등 도서실을 관리한다.'),(5,1,'독서반','3 - 1 교실','신혜정A','다양한 주제의 책들을 읽으며 사고력을 기르는 시간을 가진다.'),(6,1,'또래상담반','진로체험실','이은주','친구들의 고민을 들어주고 조언을 해주는 방법을 습득한다.'),(7,1,'만화창작반','1 - 1 교실','민주리','만화 캐릭터를 비롯한 그림 그리는 활동을 한다.'),(8,1,'무용반','체육관','고낙은','체육대회, 동아리 발표회 등의 날에 치어리딩과 댄스를 준비하여 춘다.'),(9,1,'바운드배구반','체육관','박향규','배구의 간단한 규칙을 배우고 바운드 배구 게임을 한다.'),(10,1,'바이크반','외부, 2 - 5 교실','이재민','자전거를 타며 건강과 마음의 안정을 느끼는 활동을 한다.'),(11,1,'방송반','방송실','이대형','학교 행사 무대 준비 및 아침 회화 방송, 전체 조회 등 학교의 여러 일정에 맞춰 학생들에게 방송을 틀어준다.'),(12,1,'배드민턴반','체육관','최규정','배드민턴의 규칙을 배우고 경기를 한다.'),(13,1,'보드게임반','1 - 5 교실','이호연','다양한 보드 게임들을 체험하며 즐거움을 얻는다.'),(14,1,'역사과학반','3 - 2 교실','이호걸','역사에 담겨있는 과학적 사실들에 관한 영상 등을 시청한다.'),(15,1,'영미문화반','영어카페, 2 - 3 교실','윤성웅','영미권 나라의 문화를 감상하고 배우는 시간을 가진다.'),(16,1,'영상감상반','2 - 6 교실','최정아','영상을 감상하고, 감상 후에는 서로 토론하는 시간을 가진다.'),(17,1,'일본문화연구반','1 - 4 교실','김윤환','일본의 생활 문화를 비롯하여 각종 다양한 활동을 한다.'),(18,1,'종이접기반','1 - 3 교실','박성래','종이접기를 하는 영상을 보면서 자신이 만들고 싶은 것을 종이로 접는다.'),(19,1,'중국문화연구반','3 - 6 교실','이세호','오래된 중국의 역사 및 문화에 대한 영상을 감상한다.'),(20,1,'커리어코칭반','3 - 5 교실','이정임','취업을 목표로 하는 학생들에게 면접에 관한 조언 등을 한다.'),(21,1,'컬러링북반','2 - 2 교실','백현정','컬러링북을 색칠하고, 편지지 등을 만드는 활동을 한다.'),(22,1,'패턴연구반','디자인실습실','신혜정B, 권오재','다양한 패턴을 조사하고, 연구한다.'),(23,1,'퍼즐앤게임반','2 - 1 교실','우호식','퍼즐 게임 및 간단한 수학 게임, 보드 게임 등을 한다.'),(24,1,'프레지반','뉴미디어솔루션 2실','윤선희','많이 사용하는 ppt와 달리 조금 생소한 프레지를 다루는 연습을 한다.'),(25,1,'합창반','음악실','정혜선','피아노를 비롯해 합창 연습을 한다.'),(26,1,'환경과학반','과학실','권지웅','과학 관련 실험 체험 및 관련 영상물을 감상한다.'),(27,2,'크리에이티브디자인반','앱창작터2실','김민혜','떡메모지, 엽서, 노트 등 쉽게 다가갈 수 있는 디자인 작품들을 디자인하며 일반 학생들에게 전시한다.'),(28,2,'8Eight(愛it)','진로활동실(커리어존)','박성래','귀걸이, 엽서, 노트 등 쉽게 다가갈 수 있는 디자인 작품들을 디자인하며 일반 학생들에게 전시한다.'),(29,2,'C언어프로젝트','인터랙티브미디어1실','민주리','C언어를 공부함과 동시에 프로젝트를 진행하면서 실력을 쌓는다.'),(30,2,'JCC','뉴미디어디자인 1실','이재민','java create club의 약자로, 학교 교육과정의 하나인자바를 예습 및 복습을 하면서 전공 실력을 쌓는다.'),(31,2,'JS스터디','수준별 3실','백현정','자바를 중심으로 프로그래밍에 관심있는 학생들이 모여서 공부한다.'),(32,2,'SPACE','과학실','권지웅','선후배들 간 힘을 합쳐 외부 공모전에 나가며 전공 실력을 쌓는다.'),(33,2,'리눅스','뉴미디어솔루션1실','이호걸','운영체제의 하나인 리눅스에 대해 스스로 공부한다.'),(34,2,'COP','수준별 1실','이호연','학교에서 배우는 전공을 심화적으로 공부한다.'),(35,2,'프로그래밍프로젝트(PP)','뉴미디어솔루션2실','최규정','프로그래밍 프로젝트를 통해 전공 실력을 쌓는다.'),(36,3,'3D기능영재반','기능영재실','김민혜','3DS MAX를 사용하여 다양한 3D 작품을 만든다.'),(37,3,'게임메이커',' 게임메이커 동아리실, 인터랙티브미디어1실',' 박지우, 박진형','학생들끼리 게임을 만들며 전공 실력을 쌓는다.'),(38,3,' 창업반(미벤)',' 창업동아리실, 1-6 교실, 1-2 교실',' 이철호, 김지훈, 김영철','창업에 대한 여러 가지 지식들을 쌓고, 여러 공모전에 참가한다.'),(39,3,' 사진반(Mslr)',' 이하얀',' 이하얀','학교의 행사를 기록하기 위해 사진을 찍거나, 정기적으로 출사를 나가 사진을 찍는다.'),(40,3,'영상미디어',' 디지털스튜디오실',' 이종태','학교에 관련된 영상이나 동아리에서 자체적으로 제작하는 영상을 만든다.'),(41,3,'앱앤미(AppAndMe)','앱창작터지원센터, 앱창작터 1실, 앱창작터 2실','임정훈, 함기훈, 유병석','학생들끼리 앱을 기획하고 제작하는 동아리이다.'),(42,3,' 미림웹진',' 웹진동아리실, 수준별 2실','최영진, 이형섭','학교의 교지(미림여자정보과학고등학교는 책자가 아니라 학교 홈페이지에 탑재된다)를 만든다.');
/*!40000 ALTER TABLE `club` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employment1`
--

DROP TABLE IF EXISTS `employment1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employment1` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `year` int(4) NOT NULL,
  `employ_now` varchar(7) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employment1`
--

LOCK TABLES `employment1` WRITE;
/*!40000 ALTER TABLE `employment1` DISABLE KEYS */;
INSERT INTO `employment1` VALUES (1,2016,'92.01%'),(5,2014,'94.83%'),(6,2013,'98.25%'),(7,2015,'92.44%'),(9,2012,'100%');
/*!40000 ALTER TABLE `employment1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employment2`
--

DROP TABLE IF EXISTS `employment2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employment2` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(30) NOT NULL,
  `field` varchar(35) DEFAULT NULL,
  `website` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=267 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employment2`
--

LOCK TABLES `employment2` WRITE;
/*!40000 ALTER TABLE `employment2` DISABLE KEYS */;
INSERT INTO `employment2` VALUES (1,'삼성SDS','소프트웨어자문, 개발 및 공급업','http://www.sds.samsung.co.kr'),(2,'이트라이브','홈페이지 제작','http://www.etribe.co.kr'),(6,'케이엘미디어','방송장비, 소프트웨어','없음'),(7,'한빛소프트','게임 제작','http://www.hanbitsoft.co.kr/'),(8,'컨스메이커','이러닝, 프리젠테이션, 애니메이션','http://www.consmaker.co.kr'),(9,'엑츠솔루션','가상화, 보안, 웹하드 솔루션','http://www.acts-sol.com/'),(10,'에이치피죤','IT 비즈니스','http://www.hpzone.co.kr'),(11,'와이비엠시사','서적 출판업','http://www.sisajr.com'),(12,'WAXsoft','소프트웨어 개발','없음'),(13,'프릭스미디어','기타 소프트웨어 자문, 개발 및 공급업','http://www.prixmedia.co.kr'),(14,'롯데관광 주식회사','관광','http://www.lottetour.com'),(15,'동화면세점','기타 대형 종합소매업','http://www.dutyfree24.com/'),(16,'동화투자개발주식회사','기타 대형 종합소매업','없음'),(17,'피싱트리','기타 소프트웨어 자문, 개발 및 공급업','http://www.fishingtree.com'),(18,'미디어루트디에스피','기타 소프트웨어 자문, 개발 및 공급업','http://www.mediaroute.co.kr'),(19,'에스큐아이소프트','기타 소프트웨어 자문, 개발 및 공급업','http://www.sqisoft.com/'),(20,'롯데관광개발','일반 및 국제여행 사업','http://www.lottetours.com '),(21,'이모션(노엘미디어)','동영상 제작','없음'),(22,'디엠씨미디어','광고 대행업','http://www.dmcmedia.co.kr'),(23,'인켈','방송수신기의 기타영상, 음향기기제조업','http://www.inkel.co.kr'),(24,'하몬소프트','IT 개발','http://www.hamonsoft.co.kr'),(26,'싸이터스씨앤아이','컴퓨터 및 패키지소프트웨어 도매업','없음'),(27,'오롬시스템','서적 출판업','http://www.orom.co.kr/'),(28,'인터텐츠','영상컨텐츠 제작','http://www.intertents.com'),(29,'에이시에스','기타 소프트웨어 자문, 개발 및 공급업','http://www.acs.co.kr/'),(30,'모아시스','솔루션','http://www.moasys.com'),(31,'애니픽스','기타 소프트웨어 자문, 개발 및 공급업','없음'),(32,'나우텍아이','기타 소프트웨어 자문, 개발 및 공급업','http://www.nowtechi.com/'),(33,'알에프앤유','미들웨어솔루션','http://www.yisunshinforum.or.kr/'),(34,'더위버크리에이티브','웹사이트 광고 제작','http://www.theuber.co.kr/'),(35,'플루토미디어','교육, 서적 출판업','http://www.plutomedia.co.kr/'),(36,'지모트시스템즈','솔루션','없음'),(37,'뱅크이십오','유선통신기기제조업','없음'),(38,'시오닉스','기타 소프트웨어 자문, 개발 및 공급업','없음'),(39,'멘토르출판사','출판','http://www.mentorbook.co.kr/'),(40,'이너큐브','기타 소프트웨어 자문, 개발 및 공급업','없음'),(41,'트루셀','디지털 콘텐츠 제작','http://www.truesell.co.kr'),(42,'그라비티','IPTV','http://www.gravity.co.kr'),(43,'DIMA Entertainment','디지털 콘텐츠 제작','http://www.dimaent.com/'),(44,'롯데정보통신','기타 소프트웨어 자문, 개발 및 공급업','http://www.ldcc.co.kr/'),(45,'육아방송주식회사','방송','http://www.ugatv.net'),(46,'프레임 36.5','영상제작','없음'),(47,'디플러그','디지털 콘텐츠 제작','없음'),(48,'정보프리미엄에듀(KT정보에듀)','방문 및 통신교육 학원','http://www.keduh.co.kr/'),(49,'티비라떼','IPTV','없음'),(50,'크레디프','데이터베이스 및 온라인 정보 제공업','http://www.credif.co.kr/'),(51,'㈜시오닉스','GUI 디자인','없음'),(52,'아이티비엠지','기타 소프트웨어 자문, 개발 및 공급업','없음'),(53,'㈜티컴솔루션','컨텐츠 개발','없음'),(55,'티컴미디어','시스템','없음'),(56,'넥솔텔레콤','IT 솔루션 ','없음'),(57,'다온솔루션','컨텐츠개발','http://www.daoninc.com/'),(58,'스트림비젼','방송 및 무선통신 기기 제조업','http://www.streamvision.co.kr/'),(59,'코리아센터닷컴 (메이크업샵)','기타 소프트웨어 자문, 개발 및 공급업','http://www.makeshop.co.kr/'),(60,'심플렉스인터넷(cafe24)','기타 소프트웨어 자문, 개발 및 공급업','http://www.simplexi.com/'),(61,'젠소프트웨어','IT 솔루션','없음'),(62,'조선일보사','신문발행업','http://www.chosun.com'),(63,'한메소프트','웹솔루션','http://www.hanmesoft.com/'),(64,'지겟츠','기타 소프트웨어 자문, 개발 및 공급업','http://www.zgets.com'),(65,'한국디지털에이전시산업협회','IT 협회','http://www.kdaia.or.kr/'),(66,'이노그리드','웹사이트 제작','http://www.innogrid.com/'),(67,'디알CT','디지털 콘텐츠 제작','없음'),(68,'테크빌닷컴','디지털 콘텐츠 제작','http://www.tekville.com/'),(69,'대흥프린코','인쇄, 광고','없음'),(70,'KMH','IPTV 솔루션','http://www.ikmh.co.kr'),(71,'한국경제교육협회','협회','http://www.beacon.or.kr'),(72,'네오데이타','유통시스템','http://www.neodata.co.kr/'),(73,'관악구보건소 서울대스포츠의학실','스포츠의학','http://health.gwanak.go.kr'),(74,'이브로드캐스트','IPTV 솔루션','http://www.ebroadcast.kr/'),(75,'CJ시스템즈','소프트웨어자문, 개발 및 공급업','http://www.cjsystems.co.kr/'),(76,'나이츠넷','네트웍장비 운용','http://www.knightnet.co.kr/'),(77,'올인원 커뮤니케이션','웹에이전시','http://www.all-1.com'),(78,'CJ시스템즈','웹에이전시','http://www.inpix.com'),(79,'디자인퍼프','웹디자인','http://www.designpuff.com'),(80,'러빈모션','방송영상모션','http://www.loveinmotion.kr/'),(81,'(사)벤처기업협회','벤처협회','http://www.venture.or.kr/'),(82,'엠에이지픽쳐스','영상제작','없음'),(83,'다온커뮤니케이션','그래픽 디자인','없음'),(84,'브랜딩포커스','BI제작','http://www.brandingfocus.com'),(85,'심테크시스템','소프트웨어','http://www.simtech.co.kr'),(86,'미디어트리','영상제작','http://www.mediatree.kr'),(87,'아이워크','웹에이전시','http://www.iwalk.co.kr/'),(88,'Westminister Kingsway College','대학','없음'),(89,'디자인피버','웹에이전시','http://www.designfever.com'),(90,'고도소프트','쇼핑몰','http://www.godo.co.kr/'),(91,'컴투스','게임 제작','http://www.com2us.com'),(92,'디지탈모션','영상제작','http://www.digitalmotion.co.kr'),(93,'삼성전자','반도체','http://www.samsung.com'),(94,'한진정보통신','소프트웨어','http://www.hist.co.kr'),(95,'레스코드','소프트웨어','없음'),(96,'포이미디어','영상','없음'),(97,'이니라인','정보보안','http://www.iniline.co.kr'),(98,'IBK기업은행','금융','http://www.ibk.co.kr'),(99,'넷플스','IT','없음'),(100,'SK C&C','IT','http://www.skcc.co.kr'),(101,'한국생산기술연구원','기관','http://www.kitech.re.kr'),(102,'한국품질명장협회','협회','http://www.kqm.kr'),(103,'미디어포스','웹에이전시','http://www.media4th.co.kr'),(104,'한국생산성본부','기관','http://www.kpc.or.kr'),(105,'서울비젼','영상제작','http://www.seoulvisions.co.kr'),(106,'아이엔엠디','온라인마케팅','http://www.inmd.co.kr'),(107,'금천세무서','공공기관','http://s.nts.go.kr/gc'),(108,'동국대학교 창업지원단','단체','http://www.dongguk.edu/'),(109,'연세대학교 창업지원단','단체','http://www.yonsei.ac.kr/'),(110,'대한민국명장회','협회','http://www.masteror.kr'),(111,'위즈데이타','이미지','http://www.wizdata.co.kr/'),(112,'띵소프트','게임제작','없음'),(113,'비스킷크리에이티브','앱개발','없음'),(114,'KTis','온라인마케팅','http://www.ktis.co.kr/'),(115,'멘토르스쿨','출판','http://www.mtrschool.co.kr/'),(116,'넥스트리밍','모바일 멀티미디어 소프트웨어','http://www.nexstreaming.com/'),(117,'태오컴즈','이러닝','http://www.taeocoms.com'),(118,'서울관악고용센터','산관학 협력기관','http://www.work.go.kr/seoulgwanak'),(119,'미라지크리에이티브','GUI 디자인','없음'),(120,'이모션북스','디지털출판','http://www.ebookstory.com/'),(121,'뉴로컴','그래픽디자인','http://www.neurocom.co.kr/'),(122,'대한한의사협회','한의사협회','http://www.akom.org/'),(123,'서울테크노파크','신산업 연구단지','http://www.seoultp.or.kr/'),(124,'양재미디어','소프트웨어개발','http://www.yjmedia.com/'),(125,'리즘 인터랙티브','GUI 디자인','http://www.leezm.co.kr/'),(126,'엔큐게임즈','게임','http://www.nqgames.com'),(127,'디지털에이전시산업협회 공주대학교','대학교','http://edu.kdaia.or.kr/'),(128,'주식회사 케이티 주식회사 케이티디에스','정보통신','http://www.ktds.co.kr'),(129,'CJ대한통운','물류','http://www.korex.co.kr/'),(130,'네비웍스','게임,  IT','http://www.naviworks.com'),(131,'팔도 DB','산학연링크시스템','없음'),(132,'마이컴소프트','소프트웨어','http://www.mycomsoft.co.kr/'),(133,'알피지팩토리','게임','http://www.rpgfactory.co.kr'),(134,'인콘텐츠','e-book','http://www.incontents.com'),(135,'한국운동발달연구소','건강증진','없음'),(136,'ZERO-ONE','교육기관','없음'),(137,'크레노바','게임제작','http://www.crenova.co.kr'),(138,'아이온커뮤니케이션즈','컨텐츠 관리 솔루션','http://www.i-on.net'),(139,'플립커뮤니케이션즈','모바일 앱','http://www.pulipinc.com/'),(140,'아이티에이치','소셜미디어 마케팅 솔루션','없음'),(141,'미디어풀','방송통신서비스','http://www.mediapool.co.kr'),(142,'게임어스','게임제작','http://www.gameus.co.kr'),(143,'나란테크','모바일','http://www.narantech.co.kr'),(144,'제이씨원','게임제작','http://www.jcone.co.kr'),(145,'티엔지소프트','TV, 게임','없음'),(146,'모스트비주얼','소프트웨어','http://www.mostvisual.co.kr'),(147,'트리즈코퍼레이션','게임, 모바일광고','http://www.trizcorp.com'),(148,'한국디지털산업협화 디지털인재개발원','IT 협회','http://www.edu.kdaia.or.kr/'),(149,'그래피티','웹에전시','http://www.grafiti.co.kr/'),(150,'유투시스템','UX디자인','http://www.u2system.co.kr/'),(151,'중소기업인력개발원','중소기업중앙회','http://www.sbhrdc.re.kr'),(152,'숲프린트','간판디자인','http://www.gurim.com'),(153,'에카디자인','산업디자인','http://www.ekka.co.kr/'),(154,'펜타시큐리티시스템','IT보안서비스','http://www.pentasecurity.com/'),(155,'티엔티크라우드','이러닝','http://www.tntcrowd.com'),(156,'케이씨넷','SI','http://www.kcnet.co.kr'),(157,'엔미디어솔루션','솔루션 마케팅','없음'),(158,'한국소프트웨어기술진흥협회','협회','http://www.kosta.or.kr'),(159,'INC 솔루션','디자인','http://www.incs.co.kr'),(160,'프리스트 커뮤니케이션','디자인','http://www.pristcom.com'),(161,'디자인티스트','디자인','http://www.designtist.co.kr '),(162,'소셜네트워크','디자인','http://www.nsocialnetwork.com'),(163,'피씨앤','웹에이전시','http://www.pcninc.co.kr'),(164,'한국소프트웨어산업협회','협회','http://www.sw.or.kr/'),(165,'쇼유커뮤니케이션','소프트웨어 개발','http://www.shou.co.kr'),(166,'미림미디어랩','소프트웨어 개발','http://www.mirimmedialab.co.kr'),(167,'그레트로','소프트웨어 개발','없음'),(168,'유보트아이엔씨','소프트웨어 개발','http://www.u-bot.co.kr'),(169,'야인소프트','소프트웨어 개발','http://www.yainsoft.com'),(170,'라이프시맨틱스','의료 정보 개발','http://www.lifesemantics.kr/'),(171,'트루토리','앱 개발','http://www.trutory.co.kr/'),(172,'마이어스데이타','IT 솔루션','http://www.dinnoplus.com'),(173,'솔트웨어주식회사','IT 솔루션 ','http://www.saltware.co.kr'),(174,'디노플러스','IT 솔루션','http://www.dinnoplus.com'),(175,'코비젼','IT 솔루션','http://www.covision.co.kr'),(176,'VCNC','모바일','http://www.vcnc.co.kr'),(177,'메이블','모바일','http://www.mayble.me'),(178,'유누스','IT, 모바일','http://www.theunus.com'),(179,'와이제트 인터랙티브','모바일게임','http://www.yz-i.com'),(180,'한국중견기업연합회','경제단체','http://www.komia.or.kr'),(181,'쿠나이앤티','소프트웨어 개발','http://www.koonaent.com'),(182,'관악구청','관공서','http://www.gwanak.go.kr'),(183,'핸드스튜디오','응용 소프트웨어 개발','http://www.handstudio.net'),(184,'씨에프정보통신','시스템소프트웨어 개발 및 공급','http://www.cfic.co.kr'),(185,'코아테크코리아','온라인 마케팅','http://www.core21.co.kr'),(186,'한국클라우드서비스협회','협회','http://www.kcsa.or.kr'),(187,'씨아이피시스템','소프트웨어 개발','http://www.cipsystem.co.kr'),(188,'나모인터랙티브','소프트웨어 개발','http://www.namo.co.kr'),(189,'록.앤.올','소프트웨어 개발','http://www.locnall.com'),(190,'유라클','소프트웨어 개발','http://www.uracle.co.kr'),(191,'엘에스웨어','시스템 소프트웨어 개발 및 공급','http://www.lsware.co.kr'),(192,'휴레이포지티브','모바일, 웹 개발','http://www.huray.net'),(193,'인터메이저','시스템 소프트웨어 개발 및 공급','http://www.intermajor.com'),(194,'틸론','프로그래밍 서비스업','http://www.tilon.co.kr'),(195,'한주C&S','보안 솔루션 개발 및 서비스업','http://www.hanjucs.co.kr'),(196,'디지엠정보기술','시스템소프트웨어 개발 및 공급','http://www.dgmit.com'),(197,'플래닛보떼','화장품 개발, 판매','http://www.nellafantasia.co.kr'),(198,'아이앤컴바인','컴퓨터소프트웨어 서비스업','http://www.bapul.net'),(199,'굿모닝아이텍','컴퓨터 소프트웨어 서비스업','http://www.goodmit.co.kr'),(200,'나인플래닛','홈쇼핑 방송 전문업체','http://www.nineplanet.co.kr'),(201,'중앙ICS','온라인 교육학원','http://www.ichoongang.com'),(202,'산돌커뮤니케이션','한글폰트 디자인','http://www.sandoll.co.kr'),(203,'에프닷베이직','광고 대행업','http://www.fbasic.co.kr'),(204,'씨온드림','응용 소프트웨어 개발 및 공급','http://www.c-ondream.com'),(205,'이모션웨이브','디자인','http://www.emotionwave.com'),(206,'빙글','소셜 마케팅 솔루션','http://www.vingle.net'),(207,'디앤피코퍼레이션','컨텐츠 개발','http://www.dnpltd.com'),(208,'엘스트로','인터넷 등기 솔루션 개발','http://www.lstro.co.kr'),(209,'케이알시스','응용 소프트웨어 개발 및 공급','http://www.krsys.net'),(210,'아이유웰','스포츠 - 여가 - 휘트니스','http://www.smartwellcare.com'),(211,'씨드커뮤니티','모바일 솔루션','없음'),(212,'솔루피아','보안 솔루션 개발 및 서비스업','http://www.solupia.co.kr'),(213,'워크커뮤니케이션즈','모바일 솔루션 개발 및 서비스업','http://www.korwork.com'),(214,'모바일희망나눔협동조합','모바일 콘텐츠 개발','http://www.fabianstar.com'),(215,'바텍','핸드폰 액세사리 제조','http://www.fabianstar.com'),(216,'삼정데이타서비스','호스팅 및 관련서비스','http://www.sds.co.kr'),(217,'블루소프트','SW 개발 및 공급','http://www.bluesw.net'),(218,'이에스게임즈','게임','http://www.esgames.co.kr'),(219,'씨엔티테크','시스템 소프트웨어 개발','http://www.cntt.co.kr'),(220,'한국건설생활환경시험연구원','품질인증, 컨설팅, 계측교정','http://www.kcl.re.kr'),(221,'한국기계전기전자시험연구원','시험평가, 안전인증, 품질인증','http://www.ktc.re.kr'),(222,'한국산업기술시험원','인증, 품질평가, 교육','http://www.ktl.re.kr'),(223,'한국의류시험연구원','섬유, 의류 품질보증, 검사','http://www.katri.re.kr'),(224,'한국화학융합시험연구원','시험, 인증, 교육','http://www.ktr.or.kr'),(225,'FITI시험연구원','섬유제품 연구 및 설비, 품질검사','http://www.fiti.re.kr'),(226,'KOTITI시험연구원','섬유 시험검사, 연구개발, 교육','http://www.kotiti.re.kr'),(227,'한국시험인증산업협회','시험인증, 경영공시, 교육훈련','http://www.kotica.or.kr'),(228,'숀픽쳐스','애니메이션 제작','http://www.seanpics.com'),(229,'유비벨록스모바일','소프트웨어 개발','http://www.ubivelox.com'),(230,'코디스페이스','위치기반서비스','http://www.coordispace.com'),(231,'스타십벤딩머신','S/W개발 및 공급','http://www.insertcoin.me'),(232,'와이에스케이미디어','제조업기타(광고,홍보,전시,이벤트)','http://www.yskmedia.com'),(233,'사이버메드','의료정밀.시계.광학기기','http://www.ondemand3d.com'),(234,'애드라','모바일 광고 ','http://www.adrra.com'),(235,'말랑스튜디오','모바일웹개발','http://www.malangstudio.com'),(236,'서울지방고용노동청서울관악지청','고용정책총괄','http://www.moel.go.kr/seoulgwanak'),(237,'한국산업인력공단서울남부지사 ','기술인력양성','http://hrdc.hrdkorea.or.kr/hrdc/seouls'),(238,'미드키스','콘텐츠 제작','http://www.kees.co.kr'),(239,'월드팩토리','제품컨설팅','www.wfactory.co.kr'),(240,'브릿지랩','콘텐츠 제작','www.bridgelab.co.kr/'),(241,'상상인커뮤니케이션','광고, 모바일개발, 판촉','www.sangsangin.com'),(242,'알서포트','정보통신업(S/W 개발 및 유통)','www.rsupport.com'),(243,'노크크리에이티브','시스템 소프트웨어 개발 및 공급업 ','www.knockcreative.com'),(244,'오레듀 ','콘텐츠제작','www.myalledu.com'),(245,'모니터랩','시스템 소프트웨어 개발 및 공급업 ','www.monitorapp.co.kr'),(246,'스포츠한국TV','웹기획, 편집보조','www.helloshn.com/'),(247,'에이팀벤처스','서비스소프트웨어개발 ','www.ateamventures.com'),(248,'퓨전데이타','시스템 소프트웨어 개발 및 공급업','www.fusiondata.co.kr'),(249,'쉐이커미디어','영상미디어','www.shark.com'),(250,'비코닉스','소프트웨어 개발','www.beaconyx.com'),(251,'아이퀘스트','소프트웨어 개발','www.iquest.co.kr'),(252,'삼립전기','조명','www.samlipelec.co.kr'),(253,'커리어디스커버리','교육서비스/심리검사','없음'),(254,'캐리마','3D프린터','http://www.carima.co.kr'),(255,'루트게임즈','모바일게임 및 교육용앱 개발','http://www.rootgames.co.kr'),(256,'퍼플랩','모바일 게임 개발','http://www.perplelab.com/ '),(257,'태성에스엔아이','토목엔지니어링 서비스 소프트웨어 개발','http://www.tssni.com'),(258,'티움씨앤씨','IT 시스템 개발','http://www.tiumcnc.com'),(259,'루키스','소프트웨어 개발 공급','http://www.lucis.co.kr'),(260,'NEXA','소프트웨어 개발','http://www.nexa.kr'),(261,'우리아이친환경','친환경제품 제조판매','htttp://www.wuriai.co.kr'),(262,'포스플레이파티','모바일 게임 개발','http://www.4thplayparty.com'),(263,'다누온','응용 소프트웨어 개발 및 공급','http://www.danuon.co.kr'),(264,'가온테스팅','응용 소프트웨어 개발 및 공급','http://www.gaontest.com'),(265,'두리반테크','소프트웨어 개발','www.dooribantech.com'),(266,'플라고','소프트웨어 개발','없음');
/*!40000 ALTER TABLE `employment2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrance1`
--

DROP TABLE IF EXISTS `entrance1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrance1` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `major` varchar(26) NOT NULL,
  `major_intro` text NOT NULL,
  `image_type` varchar(5) DEFAULT NULL,
  `imgae_location` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrance1`
--

LOCK TABLES `entrance1` WRITE;
/*!40000 ALTER TABLE `entrance1` DISABLE KEYS */;
INSERT INTO `entrance1` VALUES (3,'뉴미디어디자인','스마트폰, 스마트TV, 웹환경 등 다양한 사용자 환경 디자인을 구현하며, 뉴미디어환경을 구조화하고 시각화하는 UIㆍUXㆍGUI 디자인 전문가와 뉴미디어콘텐츠 제작을 위한 디자인 전문가를 양성한다.','png','1509269252_903.png'),(4,'뉴미디어솔루션','IT 분야의 핵심 기술인 스마트폰, 웹 개발에 관한 특화된 교육과정(어플리케이션 제작, 웹사이트 구축, 데이터베이스 관리)을 운영하여 모바일 웹, 앱 개발 전문가를 양성','png','1509269297_062.png'),(5,'인터랙티브미디어','차세대 뉴미디어 분야의 선두주자인 IPTV, 스마트TV, 스마트폰에 관한 특화된 교육과정(어플리케이션 제작, 웹사이트 구축, 데이터베이스 관리)을 운영하여 모바일 웹, 앱 개발 전문가를 양성','png','1509269377_709.png');
/*!40000 ALTER TABLE `entrance1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrance2`
--

DROP TABLE IF EXISTS `entrance2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrance2` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `date` varchar(15) NOT NULL,
  `room` varchar(30) NOT NULL,
  `apply` varchar(70) NOT NULL,
  `image_type` varchar(5) DEFAULT NULL,
  `image_location` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrance2`
--

LOCK TABLES `entrance2` WRITE;
/*!40000 ALTER TABLE `entrance2` DISABLE KEYS */;
INSERT INTO `entrance2` VALUES (7,'2017년 5월 27일','본교 다목적실','홈페이지 상단메뉴에서 \\\'입학안내 > 입학설명회 > 51번 글 클릭\\\' 후 작성','jpg','1509271378_579.jpg'),(8,'2017년 7월 22일','본교 다목적실','홈페이지 상단메뉴에서 \\\'입학안내 > 입학설명회 > 52번 글 클릭\\\' 후 작성','jpg','1509271481_789.jpg'),(9,'2017년 9월 2일','본교 다목적실','홈페이지 상단메뉴에서 \\\'입학안내 > 입학설명회 > 53번 글 클릭\\\' 후 작성','jpg','1509271509_927.jpg'),(10,'2017년 9월 23일','본교 다목적실','홈페이지 상단메뉴에서 \\\'입학안내 > 입학설명회 > 54번 글 클릭\\\' 후 작성','jpg','1509271527_875.jpg'),(11,'2017년 10월 14일','본교 다목적실','홈페이지 상단메뉴에서 \\\'입학안내 > 입학설명회 > 55번 글 클릭\\\' 후 작성','jpg','1509271540_013.jpg'),(12,'2017년 10월 21일','본교 다목적실','홈페이지 상단메뉴에서 \\\'입학안내 > 입학설명회 > 56번 글 클릭\\\' 후 작성','jpg','1509271559_197.jpg');
/*!40000 ALTER TABLE `entrance2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrance3`
--

DROP TABLE IF EXISTS `entrance3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrance3` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `number` int(3) NOT NULL,
  `title` varchar(20) DEFAULT NULL,
  `content` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrance3`
--

LOCK TABLES `entrance3` WRITE;
/*!40000 ALTER TABLE `entrance3` DISABLE KEYS */;
INSERT INTO `entrance3` VALUES (1,1,'진학','취업 후 3년 뒤, 직장과 병행하며 전공심화 교육을 위해 학위취득(대학진학)이 가능합니다. 사교육이나 취업 걱정 없이 열심히 학교 커리큘럼에 따라 공부를 한다면 20대 중, 후반이 되었을 때 관련 분야에서 수년간의 경력뿐 아니라, 학위까지 취득하여 중견 기술인으로 기존의 회사 취업 뿐 아니라, 해외 취업, 창업 등 다양한 분야에서 무한한 능력을 펼칠 수 있습니다.'),(2,2,'취업','졸업후 전공 관련 기업에 취업을 합니다. 현재 전공학과별로 삼성전자, ktds, 삼성SDS, 솔트웨어, 네비웍스, SQL 소프트등 200여개 기업과 협약이 체결되어 있으며 지속적으로 확대할 예정입니다. 협약업체 정보는 ‘미림가이드북 – 취업 – MOU업체’에서 확인이 가능합니다.'),(3,3,'입학원서 제출서류','지원 시 제출하는 서류는 다음과 같습니다. 단, 년도별 전형계획에 따라 다소 변경될 수 있습니다. 공통서류 – 입학원서, 진로지도 동의서(입학원서 내 포함), 자기소개서, 학교생활기록부 사본 전형 별 추가 제출 서류 - 마이스터인재: 학교장추천서, 증빙서류(수상, 자격증 사본 등) - 캠프수료자: 학교장추천서, 캠프 수료증 사본 - 사회통합전형: 해당 증빙서류 - 일반전형: 없음'),(4,4,'원서접수','전형료는 10,000원(고입선발계획에 따라 변동 가능)이며 특별전형 불합격 시 일반전형으로 자동 전환됩니다. 우편접수는 가능하며 접수마감일 도착분에 한합니다. (인터넷 접수는 불가)'),(5,5,'지원자격','일반전형 및 특별전형은 성적 등의 지원 자격 제한이 없습니다.  특별전형의 사회통합전형은 서울에 거주하고 원서 접수일 현재 서울 소재 중학교에 재학하고 있는 학생만 지원 가능합니다. '),(6,6,'수업 및 일과 시간','마이스터고는 산업체와의 맞춤형 교육과정에 의해 진행이 됩니다.  수업내용은 1학년때는 일반 고등학교와 거의 유사하며(인문교과+기초 전공교과) 2,3학년은 심화전공수업으로 진행됩니다. 구체적인 교과목은 ‘미림가이드북의 과목’에서 확인이 가능합니다. '),(7,7,'해외연수','전공과 관련된 선진국의 직업교육현장체험으로 관련 전시회 및 학교탐방 등의 기회를 제공합니다.'),(8,8,'연봉','현재 전문대를 졸업한 수준의 연봉(전공관련직종)으로 평균 2천만원 정도이며 회사에 따라 차이가 있습니다. 매년 일정부분 상승하는 사무직과 달리 2-3년 이상의 경력이 있으면 개인의 능력에 따라 연봉은 상승합니다.');
/*!40000 ALTER TABLE `entrance3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `event_name` varchar(50) NOT NULL,
  `date` varchar(40) NOT NULL,
  `content` text NOT NULL,
  `event_image` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (3,'전체조회','매달 마지막 주 수요일 7교시','강당에 모든 학생, 선생님들이 모여 조회를 하는 시간으로 교장 선생님의 말씀과 학교 내부 또는 외부 상장을 수상하는 시간으로 이루어진다.','1509272838_487.jpg'),(4,'대의원회의','매달 마지막 수 수요일 8교시','전체조회가 끝난 후 학생회와 학급 임원(회장, 부회장)들이 한 곳에 모여 학교에 관한 주제들에 서로 의견을 내며 학교가 더 좋아질 수 있도록 회의하는 자리이다.','1509273121_618.gif'),(5,'사제동행 산행','4월 초중반 ','학생들과 선생님들이 함께 모여 관악산을 등산하는 프로그램으로, 선생님과 학생과의 유대감을 형성한다.','1509273280_406.jpg'),(6,'백일장 및 사생대회','4월 후반 또는 5월 초반','학교가 아닌 어린이대공원이나 서울대공원(매년마다 장소 다름)에서 친구들과 즐거운 시간을 보내며 소프트웨어과는 백일장을 디자인과는 사생대회를 진행한다.','1509276000_161.jpg'),(7,'비즈쿨마켓','5월 초중반','알뜰마켓과 동아리 별로 부스를 만들어 직접 음식을 만들어 판매하거나 일부 디자인 동아리들은 직접 디자인한 제품들을 판매하기도 한다. 또한 페이스페인팅, 상담 등이 있다.','1509276123_751.jpg'),(8,'체육대회','5월 초중반','팀은 세 팀으로, 과별로 나누어진다. 반티가 아닌 과티를 입으며 종목으로는 공넘기기, 줄다리기, 개인 달리기, 과 계주 달리기, 반 계주 달리기, 2인 3각, 피구(1학년), 농구(2학년), 발야구(3학년) 등이 있다. 또한, 체육대회가 끝난 후에는 장기자랑 시간이 마련되어 있다.','1509276177_258.jpg'),(9,'모교방문의 날','5월 초중반, 9월 후반','출신 중학교를 직접 방문하면서 오랫동안 못 뵈었던 중학교 때 선생님께 인사도 드리면서 현재 재학중인 미림여자정보과학고등학교에 진학을 희망하는 중학교 후배가 있다면 어떻게 하는게 좋을지 답변도 해주며, 중학교에서 학교를 홍보하는 시간을 가진다.','1509276334_552.gif'),(10,'뉴미디어디자인쇼','9월 초반','3학년 디자인과 학생들의 작품을 진행하는 행사로, 3년동안 디자인했던 오직 자신만의 이야기가 담긴 자신만의 작품을 전시한다.','1509276386_980.jpg'),(11,'동아리 활동 발표회 (CA발표회)','10월 후반','모든 동아리 별로 각각의 교실에서 자신의 동아리와 관련된 것들로 다른 학생들이 와서 체험할 수 있도록 교실을 꾸민다. 또한 1시 이후부터 댄스부와 합창부의 공연과 다른 학생들의 장기자랑 시간도 포함되어 있다.','1509276796_547.jpg'),(12,'지역문화탐방','매년 신입생 전형일','강원도 원주, 인천(매년마다 장소 다름)에서 다른 지역의 문화를 탐방하면서 즐거운 시간을 보낸다.','1509276945_396.jpg'),(13,'뉴미디어소프트웨어쇼','11월 중후반','2학년 소프트웨어과(인터랙티브미디어, 뉴미디어솔루션)과 학생들의 작품을 진행하는 행사로, 학생들 스스로 팀을 짜 안드로이드 프로젝트(어플리케이션)을 전시하며, 자바 또는 C++프로젝트의 우수작품을 전시하기도하며 소프트웨어 전공 동아리의 작품을 전시한다.','1509277138_056.jpg');
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experience1`
--

DROP TABLE IF EXISTS `experience1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experience1` (
  `id` int(5) NOT NULL,
  `major` varchar(40) NOT NULL,
  `word` varchar(30) DEFAULT NULL,
  `means` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experience1`
--

LOCK TABLES `experience1` WRITE;
/*!40000 ALTER TABLE `experience1` DISABLE KEYS */;
INSERT INTO `experience1` VALUES (1,'디자인','레이아웃','텍스트, 이미지, 버튼 등 여러 가지 요소를 정해진 공간 안에서 효과적으로 배치하는 것'),(2,'디자인','그리드','격자라는 의미로, 일관도니 레이아웃을 구현하는데 필요함'),(3,'디자인','목업','디자인한 제품이 실제로 구현되는 형태'),(4,'디자인','아이콘','작은 이미지 또는 기호를 만들어서 표시한 것으로 한 번에 의미를 알 수 있도록 쉽고 직관적인 기능을 함'),(5,'디자인','픽토그램','공공시설 등을 상징적으로 나타내 주는 일종의 그림 문자'),(6,'디자인','타이포그래피','글자를 소재로하여 나타내고자 하는 의미를 표현하는 그래픽 방식'),(7,'디자인','썸네일','아이디어 정리를 간단히 표현하기 위해 사용되는 일종의 스케치'),(8,'디자인','dpi','프린트의 해상도를 측정하는 단위로 1인치 안에 들어가는 점의 수를 의미'),(9,'디자인','세리프','획의 일부 끝이 돌출된 형태의 글꼴'),(10,'디자인','산세리프','획의 일부 끝이 돌출 되지 않은 형태의 글꼴');
/*!40000 ALTER TABLE `experience1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experience2`
--

DROP TABLE IF EXISTS `experience2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experience2` (
  `id` int(5) NOT NULL,
  `major` varchar(40) NOT NULL,
  `coding` text NOT NULL,
  `result` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experience2`
--

LOCK TABLES `experience2` WRITE;
/*!40000 ALTER TABLE `experience2` DISABLE KEYS */;
INSERT INTO `experience2` VALUES (5,'소프트웨어','class  E\r\n{\r\n	public static void main(String[] args) \r\n	{\r\n		int a=3, b=21;\r\n		a+=b;\r\n		System.out.println(\\\"a의 값은 \\\"+a);\r\n	}\r\n}','a의 값은 24'),(6,'소프트웨어','class  F\r\n{\r\n	public static void main(String[] args) \r\n	{\r\n		String s=\\\"hello!\\\";\r\n		System.out.println(s+\\\"의 문자열 갯수 : \\\"+s.length);\r\n	}\r\n}','hello!의 문자열 갯수 : 6'),(7,'소프트웨어','class  G\r\n{\r\n	public static void main(String[] args) \r\n	{\r\n		int a=4,b=3;\r\n		String s=\\\"hello!\\\";\r\n		System.out.println(a+b+s+\\\"의 문자열 갯수 : \\\"+s.length);\r\n	}\r\n}','7hello!의 문자열 갯수 : 7'),(8,'소프트웨어','class  H\r\n{\r\n	public static void main(String[] args) \r\n	{\r\n		int a=4,b=3;\r\n		String s=\\\"hello!\\\";\r\n		System.out.println(s+a+b+\\\"의 문자열 갯수 : \\\"+s.length);\r\n	}\r\n}','hello!43의 문자열 갯수 : 8'),(9,'소프트웨어','class  I\r\n{\r\n	public static void main(String[] args) \r\n	{\r\n		int a=5,b=2;\r\n		int avg=a/b;\r\n		System.out.println(\\\"평균 : \\\"+avg);\r\n	}\r\n}','평균 : 2'),(11,'소프트웨어','public class Star {\r\n	public static void main(String args[]) {\r\n		for(int i=0;i<5;i++) {\r\n			System.out.println(i);\r\n		}\r\n	}\r\n}','*****');
/*!40000 ALTER TABLE `experience2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location1`
--

DROP TABLE IF EXISTS `location1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location1` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `address` varchar(50) NOT NULL,
  `subway` varchar(100) NOT NULL,
  `bus` varchar(200) DEFAULT NULL,
  `image_type` varchar(5) NOT NULL,
  `image_location` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location1`
--

LOCK TABLES `location1` WRITE;
/*!40000 ALTER TABLE `location1` DISABLE KEYS */;
INSERT INTO `location1` VALUES (21,'서울시 관악구 호암로 546 (대학동)','2호선 신림역 3번출구 5522, 152 중 하나 승차후 본교앞에서 하차 / 2호선 서울대입구역 3번출구 5517, 6515 중 하나 승차후 본교앞에서 하차','신림역 - 신림6동 시장 5516, 5518, 5519, 5528, 5614, 6513, 6514 시흥방면으로 도보 10분 / 서울대입구역 - 국민은행 5528, 5515, 6512, 5517 시흥방면으로 도보 10분','jpg','1509413436_367.jpg');
/*!40000 ALTER TABLE `location1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location2`
--

DROP TABLE IF EXISTS `location2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location2` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `school_office` varchar(40) NOT NULL,
  `floor` int(2) NOT NULL,
  `teacher` text NOT NULL,
  `intro` text NOT NULL,
  `image_type` varchar(5) NOT NULL,
  `image_location` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location2`
--

LOCK TABLES `location2` WRITE;
/*!40000 ALTER TABLE `location2` DISABLE KEYS */;
/*!40000 ALTER TABLE `location2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rule`
--

DROP TABLE IF EXISTS `rule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rule` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `number` int(5) DEFAULT NULL,
  `division_number` int(3) DEFAULT NULL,
  `content` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rule`
--

LOCK TABLES `rule` WRITE;
/*!40000 ALTER TABLE `rule` DISABLE KEYS */;
INSERT INTO `rule` VALUES (1,3,2,'학칙에 따라 규정된 수업기간에 따라 운영하되 필요에 따라 학교장의 승인을 받아 연장 또는 단축할 수 있다.'),(2,8,3,'미림여자정보과학고등학교에 진학하는 신입생과 재학생 중에서 단체생활에 결격사유가 없는 자여야 한다,'),(3,12,3,'학생들이 지켜야 할 생활규범을 정하여 자율적인 생활 습관을 길러 자기 주도적 학습 능력 향상을 목적으로 한다.'),(4,4,3,'기숙사의 효율적인 운영을 위하여 다음과 같이 운영위원회를 구성한다.\r\n1) 기숙사운영위원회는 교감, 행정실장, 각부부장, 각 학년부장, 각 학년 학부모회장, 사감으로 구성한다. (총 14명)\r\n2) 기숙사 운영위원회의 위원장은 교장이 되고 부위원장은 교감이 한다.'),(5,5,3,'기숙사 운영 및 급식 관리에 관한 제반 사항을 협의 결정한다.\r\n1) 운영규정에 관한 사항\r\n2) 기숙사 시설 전반에 관한 사항\r\n3) 기숙사 급식 전반에 관한 사항 : 양질의 안전한 급식이 제공되도록 한다.\r\n4) 필요한 방과후 교육활동 일정표 수립 및 실시에 관한 사항 : 각 학과 과장을 중심으로 만들어진 교육활동 일정표를 심의하고 확정하여 실시하게 한다.\r\n5) 기타 운영에 필요한 사항'),(6,7,3,'학생들의 생활에 안전과 편의 등을 제공하고 다음의 임무를 수행한다.\r\n1) 학생들의 학력신장을 위하여 항상 조용하고 즐거운 분위기가 되도록 힘쓴다.\r\n2) 학생의 신분에 어긋나는 생활을 하지 않도록 생활지도를 철저히 한다.\r\n3) 시설물들을 수시로 점검하여 화재예방 등 안전사고를 사전에 예방하고, 시설물에 하자가 있을 시는 신속하게 행정실에 연락하여 수리 및 복구토록 한다.\r\n4) 학업이나 진로 및 기숙사내 생활 등의 여러 문제에 대하여 수시로 상담활동을 전개하고 상담일지를 작성하여 비치한다.\r\n5) 청소 및 쓰레기 처리 등 기숙사내의 청결을 유지하여 학생들의 보건위생에 힘쓰도록 전개한다.\r\n6)아침기상 및 저녁취침 시에는 항상 인원 점검을 한다.\r\n7) 매일 일일 점검표를 작성하여 익일 오전 중 운영위원장의 결재를 득한다.\r\n8) 불가피한 경우를 제외하고는 사전에 허가를 득하지 않은 학생의 외출 및 외박을 통제한다.\r\n9) 응급환자 발생 시는 사감에게 즉시 알리고 사감실에 구비되어 있는 구급약을 이용하여 응급조치 후, 상태가 심할 경우 즉시 병원으로 이송하고 교장에게 알린다.\r\n10) 기타 기숙사 운영에 필요한 모든 사항을 수시로 확인 점검한다.\r\n11) 기숙사 사감은 계약 시 정해진 출퇴근 시간을 준수한다.'),(7,9,3,'1) 전년도 12월에 받은 신청서를 기준으로 매년 2월 입사자를 선발한다.\r\n2) 통학거리를 기본으로 하여 직전학년도의 기숙사 상벌점과 성적, 전반적인 학교생활을 반영한 총점이 높은 자를 우선 선발한다.\r\n3) 퇴사로 인해 결원이 발생할 경우에는 동학년의(삭제) 선순위 대기자가 입사한다.\r\n4) 호실배정은 학기마다 이루어진다. 1학기는 동학급생과 생활할 수 있도록 배정한다. 2학기는 동학년 내에서 다양한 전공과가 섞이도록 배정한다.'),(8,10,3,'다음 각 항에 해당되는 자에 대하여 학교자의 승인을 받아 퇴사를 명할 수 있다.\r\n1) 전염병 질환자 및 보균자\r\n2) 사감이 판단하여 기숙사 생활을 도저히 할 수 없다고 판단된 자\r\n3) 다른 학생의 생활에 불편을 줄 수 있다고 판단되는 자\r\n4) 기숙사 상벌점규정에 의한 벌점이 30점 이상이 되는 자\r\n5) 기숙사 운영규정 제23조(금지사항)을 위반한 자\r\n6) 기타 개인적인 사정(근거리 이사 등)으로 퇴사를 희망하는 자'),(9,11,3,'1) 다음 각 항에 해당되는 자에 대하여 학교장의 승인을 받아 임시 퇴사를 명할 수 있다. 기숙사 규정을 위반하여 벌점 15점 이상, 주의, 경고 조치를 받은 자. 개인적인 사정으로 기숙사 생활을 잠시 중단해야 하는 자\r\n2) 임시 퇴사 기간은 기숙사운영위원회의 회의를 통해 결정한다.\r\n3) 기숙사 규정을 위반하여 임시 퇴사를 명받은 자는 임시 퇴사 기간 동안 매일 학생복지부 담당교사(기숙사계)에게 반성문을 제출해야 한다.'),(10,13,3,'다음 각 항의 기숙사 생활 규범을 준수하여야 한다.\r\n1) 부단한 노력과 집중력으로 면학분위기를 유지하여 실력 향상에 힘쓴다.\r\n2) 화합분위기를 조성하여 건전하고 활기찬 공동생활이 되도록 노력한다.\r\n3) 건강관리를 위하여 규칙적인 생활과 적절한 운동으로 체력관리를 한다.\r\n4) 실내에서는 절대 정숙하여야 하며 타인에게 피해를 주는 행위는 금지된다.\r\n5) 주기적으로 실내 청소와 기물 정리를 하고 항상 위생을 청결하게 유지한다.\r\n6) 화재예방과 기타 안전사고 예방을 위하여 최선을 다한다.\r\n7) 선향한 주인의식을 가지고 시설물을 보호 유지하고 공용물품을 관리 보존한다.\r\n8) 방을 비울 시에는 반드시 방문과 사물함을 잠그고 도난 방지에 최선을 다한다.\r\n9) 고가품, 귀중품의 반입을 금지하며 자신의 물건은 자신이 관리한다.\r\n10) 사감 및 교사의 정당한 지시에 순응하고 점검 및 대청소에 적극 참여한다.'),(11,14,3,'1) 출입문은 매일 06:00~8:30, 16:30~23:00에 개방한다. 단, 개방 중이라 할지라도 일과 시간 중 자유로운 출입은 제한한다.\r\n2) 개방시간 준수를 원칙으로 하되, 학교 일정(각종 행사, 외부 활동, 방학식 등)에 따라서 개방시간을 변동할 수 있다.\r\n3) 고사기간에는 13:00부터 개방한다.\r\n4) 기숙사 미개방 시간에 부득이한 사정으로 출입이 불가피한 경우에는 담임교사와 담당교사(기숙사계)의 확인 후에 출입할 수 있다.\r\n5) 일과 중 외부활동 준비로 기숙사 입실이 필요할 때에는 한시적으로 기숙사 개방이 가능하다.'),(12,15,3,'1) 매주 금요일과 토요일에는 희망자에 한하여 외박을 허용한다. 매주 수요일까지 외출 외박 신청서 외박란에 체크하여 담임에게 제출하고, 담당교사(기숙사계)는 담임의 확인 날인한 신청서를 받아 사감에게 전달한다. 사감은 신청서를 기준으로 외박 희망자에게 외박증을 발급하며, 외박증을 발급받은 학생에 한하여 외박을 할 수 있다.\r\n2) 평일에는 외박이 허용되지 않는다. \r\n3) 다음과 같은 상황에서는 전원외박을 실시할 수 있다. 기숙사 시설 정비 또는 소독, 방역 실시, 명정 등과 같은 연휴기간\r\n4) 기숙사 적응 교육기간은 외박을 금지한다. 기숙사 생활 적응 프로그램의 운영,\r\n5) 부득이한 사유로 인하여 규정된 날 외에 외박을 희망할시에는 다음과 같은 절차를 밟아야 한다. 사전에 보호자가 담임과 연락하여 사유서 및 증빙서류를 외박증과 함께 작성하여 담임 확인 날인 후 담당교사(기숙사계)에게 제출한다. 담당교사는 사감에게 전달하고 사감은 외박을 허락한다.\r\n6) 외박자는 금요일 16:30~18:00, 토요일 07:00~08:00 사이에 퇴실 한다.\r\n7) 외박자는 일요일 16:30~21:00 사이에 복귀한다.\r\n8) 복귀 후 외박 확인자의 서명을 받은 외박증을 사감에게 제출해야 한다.'),(13,16,3,'1) 매주 토요일과 일요일은 희망자에 한하여 외출을 허용한다. 매주 수요일까지 외출 외박 신청서의 외출란에 체크하여 담임에게 제출하고, 담당교사(기숙사계)는 담임이 확인 날인한 신청서를 받아 사감에게 전달한다. 사감은 신청서를 기준으로 외출을 허락한다.\r\n2) 주말 외출시간은 07:00부터이며 외출 전 외출 장부에 외출 시간과 장소를 명확하게 기재해야 한다.\r\n3) 외출자는 21:00까지 복귀하며, 외출 장부에 복귀 시간을 명확하게 기재해야 한다.\r\n4) 단 기숙사 입사일은 제한된 시간에 한하여 외출을 허락한다. 기숙사 생활 적응 프로그램의 운영 시간을 고려하여 외출 허락\r\n5) 다음과 같은 상황에서는 평일 외출을 허용한다. 평일 정상수업 종료 후부터 방과 후 수업 시간까지 자유 외출 가능, 정기고사 마지막 날 자유 외출 가능(21:00까지 복귀), 방학 중 수업 기간(21:00까지 복귀)'),(14,17,3,'1) 매주 금~일요일 희망자에 한하여 잔류 할 수 있다.\r\n2) 매주 수요일까지 외박 외출 신청서에 잔류를 신청한다.\r\n3) 잔류자는 기숙사에 규칙에 따라 생활한다.'),(15,18,3,'외출, 외박 시의 복장은 학생 신분을 벗어나지 않아야 한다.(화장 금지)'),(16,19,3,'1) 기숙사 내에서의 면회는 사전에 사감의 허락을 받은 후에 할 수 있다.\r\n2) 면회는 가족에 한하여 허용한다.\r\n3) 면회시간은 평일은 20:00!21:00, 토요일과 일요일은 13:00~20:30으로 한다.\r\n4)면회 장소는 휴게실을 원칙으로 하되 특별한 경우 사감이 특정 장소를 지정할 수 있다.'),(17,20,3,'1) 기숙사 개방은 학기당 1회, 연 2회 실시한다. (1학기 : 기숙사 입사일, 2학기 : 입사일) 기숙사생의 가족 및 친구, 미림여자정보고등학교 교사에 한하여 오픈한다. 기숙사 개방의 날에는 방 간의 교류를 자유롭게 실시할 수 있다. 기숙사 개방 전 날에는 기숙사 대청소를 실시한다.\r\n2) 방간 교류의 날, 매주 토요일과 일요일에는 타호실과의 교류의 시간을 가진다. 교류의 시간은 18:00~21:00까지로 한다.\r\n3) 기숙사 생활 적응 프로그램, 신학년 기숙사 입사 후 기숙사 생활적응 프로그램을 운영한다. 기숙사 생활 적응 프로그램의 운영 기간 동안에는 외출, 외박을 제한한다.'),(18,21,3,'1) 취침은 24:00이며, 24:00시에 사감은 취침 알림 방송을 한다.\r\n2) 6:00에는 기상하여 침구를 정돈한 후 지정된 장소에서 아침점호를 받는다.\r\n3) 아침식사는 07:00부터 7:50까지이며 식사예절과 질서를 지킨다.\r\n4) 차례를 지켜 세면을 하고 책상 주변을 정리하며 호실의 전원을 소등한 후 지정된 시간까지 등교한다.\r\n5) 건전한 기숙사 생활을 위하여 인원, 시설, 위생, 생활 상태 등 전반적인 안전관리 상태를 점검한다.\r\n6) 점검은 사감이 하는 것을 원칙으로 하며 경우에 따라 교사에게 위임할 수 있다.'),(19,22,3,'1) 기숙사 학생의 경우 조식, 중식, 석식을 먹는 것을 원칙으로 한다.\r\n2) 단, 연수나 질병 등으로 인하여 장기간 결석하는 경우나 질병으로 인하여 급식형탱의 식사가 어려운 경우에는 급식을 미신청할 수 있다.\r\n3) 급식시간 (평일) 조식-기숙사생(07:00~07:50), 중식-전교생(12:10~13:00), 석식-전교생(17:20~18:30)\r\n4) 기숙사생 주말 급식, 기숙사 학생들의 주말 및 휴일 급식은 학교 인근 식당에서 먹도록 한다.'),(20,23,3,'1) 호실 내에서 생일파티 등의 소란 또는 촛불 점등 등은 일절 금한다.\r\n2) 개개인의 사물 및 침구정리, 휴지통 비우기, 호실 내부 및 세면실을 항상 청결하게 오지하며 청소는 분담해서 한다.\r\n3) 호실 내에서 악기 연주를 금한다.\r\n4) 퇴실 시 반드시 소등 상태 및 호실 정돈상태를 확인한다.\r\n5) 개인 소지품과 책상 및 옷장의 열쇠를 철저하게 관리하고, 기물 등에 낙서 훼손 시에는 원상 회복하며 분실사고 발생 시에는 본인이 책임져야 한다.\r\n6) 각 호실의 전등은 24:00까지 사용할 수 있으며 이후는 완전 소등해야 한다.\r\n7) 소등 시간(00:00~06:00) 중에 기숙사 내에서의 이동 및 소란 행위는 금한다.\r\n8) 단, 고사기간에는 소등 시간을 조정할 수 있다. 고사 전 주: 개인 스탠드 소등 시간을 02:00까지 연장 운영, 고사기간 : 개인 스탠드 소등시간에 제한을 두지 않음\r\n9) 기숙사 내에서 음주, 흡연, 배달음식 반입 등을 일체 금지한다.\r\n10) 식당 이외의 장소에서 식사(도시락, 취사행위)를 금한다.\r\n11) 각 호실은 호실 장을 선정하여 방 정리를 점검하고 사감은 매일 정리 상태를 확인 한다.\r\n12) 임의로 실을 이동할 수 없다. 다만, 부득이한 사유로 실 이동을 하여야 할 경우에는 사유를 담당교사(기숙사계)에게 제출하여 사전허가를 받아야 한다.\r\n13) 음료, 유제품, 과일을 제외한 외부 음식물의 섭취를 금한다.'),(21,6,3,'위원회의 소집은 위원장이 필요할 경우 소집하며 위원 과반수의 출석과 출석위원 과반수의 찬성으로 의결한다.'),(22,1,3,'미림여자정보과학고등학교 기숙사운영규정이라 칭하고 기숙사의 명칭을 생활관이라 한다.'),(23,2,3,'학생들에게 면학의 편의를 최대한 제공하고 자기 주도적이고 규칙적인 공동생활을 통해 근면성실하고, 창의적이며, 자율적이고, 책임감 있는 미래의 글로벌 인재를 길러내는 산실로 그 역할을 수행하는데 있다.'),(24,24,3,'1) 기숙사 내의 모든 기물은 임의로 이동할 수 없으며, 특히 공용물건을 임의로 이동하거나 독점 사용할 수 없다.\r\n2) 세탁물의 세탁은 지정된 세탁장을 이용해야 한다.\r\n3) 세면장, 샤워장, 세탁실은 취침시간(23:30~06:00) 중에는 사용할 수 없다.\r\n4) 화장실과 주변을 깨끗이 사용한다.\r\n5) 신발은 반드시 신발장에 정리하도록 한다.\r\n6) 정수기 주변을 항상 청결하게 하고 이물질을 버리지 않도록 한다.\r\n7) 호실내 섭취가 허가되지 않은 간단한 음식물(예를 들면 과자, 빵 등)은 휴게실에서만 섭취할 수 있다.\r\n8) 휴게실은 사용 후 깨끗하게 정리하도록 한다.\r\n9) 쓰레기의 분리수거를 철저히 한다.'),(25,25,3,'고의 또는 과실로 기숙사의 시설이나 물품을 훼손하였거나 파손하였을 시에는 변상하여야 한다.'),(26,26,3,'다음의 사항이 발생하였을 때에는 지체 없이 이를 사감에게 보고하여야 한다.\r\n1) 시설, 물품 등을 훼손하였거나 파손하였을 때\r\n2) 화재, 도난, 응급환자, 기타 이변이 발생하였을 때\r\n3) 전기, 수도, 스팀 등의 고장이나 시설, 물품 등의 파손을 발견하였을 때\r\n4) 기타 위의 각 호에 준하는 사태가 발생하였을 때'),(27,27,3,'다음의 행위는 기숙사 내에서는 엄격히 금지해야 하며 이를 위반 했을 때는 퇴사조치를 받을 수 있다.\r\n1) 화재(실화 및 방화) 및 절도 행위\r\n2) 무단 외박\r\n3) 폭력으로 인한 상해 행위 또는 집단 폭행 행위\r\n4) 고의적 기물 파손 행위\r\n5) 허가 없이 외부인의 기숙사 숙박을 허용하는 행위\r\n6) 도박 행위\r\n7) 흡연 행위\r\n8) 음주 행위\r\n9) 동물 사육 행위\r\n10) 폐문 후 기숙사 이탈 행위\r\n11) 공동생활에서 타인에게 심각한 불편을 주는 행위\r\n12) 각종 선동 행위\r\n13) 불건전한 조직결성이나 활동\r\n14) 선도위원회로부터 사회봉사활동 이상의 징계를 받는 경우'),(28,28,3,'1) 침구류 : 이불(1인용 침대에서 사용할 정도의 크기의 깔개와 덮개), 베개, 매트리스커버(900mmx2,000mmx180mm 크기의 옆면 까지 덮을 수 있는 것)\r\n2) 의류 : 학생 신분에 맞는 단정한 의류(불필요한 의류의 반입을 피할 것)\r\n3) 세면도구 : 비누, 샴푸, 치약, 칫솔, 수건, 로션, 화장지, 개인용 컵 등\r\n4) 학습자료 : 교과서, 참고서, 노트, 연습장 등\r\n5) 현금의 소지를 최소화하고 학교 근처의 금융기관을 이용할 것\r\n6) 학습을 위한 전자 제품(분실 위험 관리 철저)'),(29,29,3,'1) 선풍기, 다리미, 전기장판, 고데기 등의 전기제품이나 화재위험이 있는 전열기(USB로 연결하여 사용하는 모든 전기제품도 해당 됨)\r\n2) 성냥, 라이터 등의 인화물질\r\n3) 만화, 불건전 서적 등 학업과 관련이 없는 서적류\r\n4) 컵라면, 피자, 통닭, 케이크 등의 허가되지 않은 음식물\r\n5) 부피가 크거나 다른 학생의 생활을 침해할 수 있는 물건(책꽂이, 옷상자, 바닥의 공간을 차지하는 물품 등)\r\n6) 화투, 카드 등 도박과 관련되는 물건\r\n7) 과도, 면도칼과 같은 흉기류(면도기는 날이 없는 여성용만 사용 가능)\r\n8) 학생 신분에 어긋나는 화장품(파우더, 색조 화장품 등) 및 의류(하이힐, 짧은치마 등)\r\n9) 바둑, 장기 등의 오락기구\r\n10) 에완동물\r\n11) 기타 다른 학생에게 불쾌감을 줄 수 있는 물건'),(30,30,3,'본인이 원하는 경우 신청서를 작성하여 상담을 신청하면 상담 받을 수 있다.'),(31,31,3,'기숙사의 면학 여건 조성 및 환경개선에 깅한 학생에 대하여 사감과 지도교사는 학교장에게 포상을 상신할 수 있다.'),(33,2,2,'모든 재학생은 지정된 복장과 용의를 하여야 한다.'),(34,3,3,'교복은 동복과 하복으로 나뉘어 지정된 교복을 착용하여야 한다.'),(35,4,2,'학생복지부에서는 다음과 같은 표준 복장을 게시하고, 학생을 이에 따라 교복을 마련해야한다.\r\n1) 동복 - 상의 (색상 : 진회색, 옷감 : wool 60% polyester 40%, 디자인 : 긴 라운드형 칼라의 싱글형 상의로 허리부위에 아웃포켓을 단다. 단추는 몸판에 3개, 소매 양끝에 2개로 검은색 계열의 단추를 단다.\r\n2) 동복 - 조끼 (색상 : 상의 색상과 같음, 옷감 : 상의 옷감과 같음, 디자인 : 단추는 몸판에 3개로 검은색 계열의 단추를 단다.)\r\n3) 동복 - 블라우스와 타이(색상 : 흰색, 옷감 폴리에스테르 100% 또는 면, 디자인 기본 형태, 타이 : 자주색)\r\n4) 동복 - 스커트(색상 : 상의 색상과 같음, 옷감 : 상의 옷감과 같음, 디자인 : 플레어 스커트로 옆 지퍼와 주머니를 단다. 길이 : 무릎이 덮여야 한다.)\r\n5) 하복 - 상의(색상 : 흰색바탕에 collar에 회색 바이어스, 옷감 : 레이온 35% 폴리에스테르 65%, 디자인 : 라운드형 칼라의 싱글형 상의로 왼쪽 가슴에 아웃포켓을 단다. 단추는 몸판에 5개로 흰색 계열의 단추를 단다. 앞 뒤 허리부분에 단추가 2개씩 있다.\r\n6) 하복 - 스커트(색상 : 회색, 옷감 : 혼방(폴리에스테르40% + 울 60%), 디자인 : 동복과 같음, 길이 : 동복과 같음)'),(36,5,2,'교복의 착용기간은 다음과 같으며 기온에 따라 착용 시기를 조정할 수 있다.\r\n1) 동복 착용 : 11월 1일 ~ 4월 30일\r\n2) 춘추복 착용 : 5월 1일 ~ 5월 31일, 10월 1일 ~ 10월 31일\r\n3) 하복 착용 : 6월 1일 ~ 9월 30일'),(37,6,2,'모든 재학생은 평일 등교일과 공휴일을 포함하여 학교에 출입할 때는 반드시 교복을 착용하여야 한다. 다만, 다음과 같은 경우에는 예외로 한다.\r\n1) 공휴일에 학교 등교 시 교복을 수선하거나 세탁을 해야 하는 부득이한 경우.  단 이경우 사복을 입을 수 있되 검소한 학생다운 차림이어야 하며, 다리를 감출 수 있는 바지나 치마를 입어야 한다.\r\n2) 학교 밖 행사나 학교 밖 교육활동 시 학교장이 허용하는 경우 :  (예) 수학여행, 야외 백일장, 소풍, 그리고 특별활동시간 등 활동목적에 적합한 교복 아닌 특별한 복장이 필요하다고 학교장이 허용하는 경우'),(38,7,2,'(동복 착용) 모든 재학생은 제5조 1항에 규정된 기간에 제4조에 규정된 동복을 착용해야한다.'),(39,8,2,'(동복 착용) 동복착용 시 니트 조끼 및 니트 가디건 착용 가능'),(40,9,2,'(동복 착용) 동복착용 시 외투를 착용할 수 있다.\r\n1) 정규시간에는 입을 수 없으며, 단 등하교, 점심시간, 방과후에는 착용이 가능하다.\r\n2) 외투는 형광색을 제외한 학생용으로, 엉덩이를 덮을 수 있는 정도의 길이어야 하며 발목까지 내려오는 것은 아니 된다.'),(41,10,2,'(동복 착용) 동복착용 시 학생용 검정색 스타킹 착용을 원칙으로 한다. 단, 겨울철 추위정도에 따라 학생복지부장의 결정에 의해 검정색 래깅스 스타킹을 허용한다.\r\n1) 검정색 스타킹 착용시 검정색 반 카바 양말 착용 자유\r\n2) 검정색 래깅스 스타킹 착용시 검정색 반 카바 양말 발목 부분을 접어서 신는다.'),(42,11,2,'(동복 착용)\r\n1) 실외화(등하교) - 학생용 검정색 단화 또는 형광색을 제외한 흰색, 검정색 계열의 운동화를 신을 수 있으나 발목 위로 올라오는 운동화는 신을 수 없으며 3학년은 취업면접시 단화를 신어야 한다. 다음과 같은 구두는 허용되지 아니 한다. 신발 굽높이가 4cm이상인 구도, 신발 앞축이 객관적으로 보아 너무 길거나 너무 둥근 것, 구두가 검정색이 아닌 것, 신발이 발목 복사뼈를 덮는 것, 여학생 신분에 어울리지 않는 것(하이힐, 부츠, 샌들형, 성인형, 에나멜화, 앞이 뾰족한 사치성과 유행형 등)\r\n2) 실내화(교내) - 흰색 실내화 착용을 원칙으로 하며 발목위로 올라오는 실내화, 장식이 달린 실내화는 금지한다. 실내화를 착용하고 운동장으로 나갈 수 없다.'),(43,12,2,'(동복 착용) 동복 착용 시 추위의 정도에 따라 검정색, 회색, 또는 감청색의 목도리와 장갑을 할 수 있으며 교내에 들어와서는 착용할 수 없다.'),(44,13,2,'(하복 착용) 모든 재학생은 제 5조 제3항에 규정된 기간에 제4조에 규정된 하복을 착용해야 한다.'),(45,14,2,'(하복 착용) 하복을 착용할 때에는 스타킹을 신지 아니 하며, 다만 흰색의 반양말을 발목 위에서 접어 신도록 한다.'),(46,15,2,'(하복 착용) 하복을 착용 할 때도 제11조 제1항에 규정된 구두와 운동화를 신어야 한다.'),(47,16,2,'(하복 착용) 제11조 제2항에 규정된 구두와 운동화를 신어야 한다.'),(48,17,2,'(두발) 머리는 묶음을 원칙으로 하되 규정에 의해 단발머리를 허용한다.'),(49,18,2,'(두발)\r\n1) 단발(일자형으로 자르고 옆머리가 귀 앞으로 내려오지 못한다. 길이는 5cm 이내로 하며, 5cm가 넘지 않더라도 칼라 깃에 닿지 않도록 한다. 앞머리는 자연스럽게 내려오는 정도로 자를 수 있으며, 머리띠로 고정하는 것을 허용한다. 단정한 머리모양을 위하여 3개 이내의 검정색 보조핀을 사용할 수 있으며, 옆가리마를 권장한다. 파마를 하거나 염색을 할 수 없고 헤어 스프레이, 무스 등을 바를 수 없다.)\r\n2) 묶는 머리(머리는 너무 올려서 묶지 않고 자연스럽게 아래쪽에 검정색 고무줄이나 끈을 이용하여 묶되, 그 길이는 제한을 두지 않는다. 머리를 풀었을 때 머리끝의 층이 5cm를 넘지 못한다. 머리를 풀고 학생출입 금지구역에 출입하여 적발되거나 품행이 바르지 못한 학생, 청결하지 못한 학생은 학교 규정에 의해서 머리묶음 허용을 취소할 수 있다. 단정한 머리모양을 위하여 3개 이내의 검정색 보조 핀을 사용할 수 있다.)\r\n3) 쇼트 커트(원칙적으로 금지하며, 단 개인적인 정당한 사유가 있을 때 학교장의 허락하에 허용할 수 있다.'),(50,19,2,'(두발) 앞머리는 자연스럽게 내려오는 정도로 자를 수 있으며, 머리띠로 고정하는 것을 금한다. 다만, 제20조 제 4항에 의해 제한적 사용은 허용된다.'),(51,20,2,'(두발)\r\n1) 머리염색\r\n2) 머리파마\r\n3) 머리에 무스와 헤어 스프레이 사용\r\n4) 머리띠와 머리핀 사용. 단, 교실 내에서의 머리띠와 머리핀 착용은 허용하나, 검정색 또는 검정색에 가까운 것에 한한다.\r\n5) 일체의 장신구 착용을 금한다.(신앙이나 종교를 빙자한 것도 예외일 수 없다.)'),(52,21,2,'(두발) 학교장의 명에 의하여 다음 사항에 해당되는 학생은 머리묶음을 블허한다. 제20조'),(53,22,2,'(명찰 교포 착용) 모든 재학생은 교내에서 명찰과 교표를 달아야 한다.'),(54,23,2,'(명찰 교표 착용) 명찰과 교표의 패용 위치는 다음과 같다.\r\n1) 명찰을 교복 상의 왼쪽 윗주머니 스티치 끝 굴림한 중앙에 달도록 한다.\r\n2) 교표는 교복 상의 왼쪽 부분의 지정된 위치에 부착한다.'),(55,24,2,'(책가방 장신구 및 기타 용의) 책가방은 형광색을 제외한 검정색과 감색 계통의A4파일이 들어가는 크기의 (학생다운 배낭가방)을 사용하여야 한다. 책가방 속에는 학용품 이외의 것은 일체 넣지 않는다. 특히, 특별한 사유 없이 사복을 넣고 다니는 것을 금한다.'),(56,25,2,'(책가방 장신구 및 기타 용의) 모든 재학생은 다음에 열거하는 각종의 장신구를 착용할 수 없다.\r\n1) 귀걸이\r\n2) 각종의 목걸이\r\n3) 각종의 팔지\r\n4) 각종의 반지\r\n5) 기타 학생이 착용할 수 없다고 판단되는 장신구'),(57,26,2,'(책가방 장신구 및 기타 용의) 모든 재학생은 다음과 같은 미용행위를 해서는 아니된다.\r\n1) 진한 얼굴 화장\r\n2) 눈썹 밀기 및 눈썹 화장\r\n3) 손톱 기르기및 매니큐어 사용\r\n4) 진한 색의 미용 립스틱\r\n5) 학기 중 성형 수술은 불허 한다.'),(58,1,1,'정보사회의 급격한 발달에 따른 가정교육 기능의 약화와 학교주변의 비교육적 유해 환경으로부터 학생들의 폭력과 비행문제 등의 사전 예방과 해결에 힘쓰고, 동시에 쾌적한 교육환경에서 건전한 면학풍토를 조성하고, 올바른 생활습관을 갖도록 생활지도에 관해 규정함을 목적으로 한다.'),(60,2,1,'모든 재학생은 학교의 모든 규칙을 준수해야 하고, 교사의 생활지도에 성실히 응해야 한다.'),(61,3,1,'학교규칙 또는 학교방침 및 교사의 지도에 순응하지 아니 한 학생은 언제든지 관계 규정에 의거, 처벌을 받을 수 있다.'),(62,4,1,'학생복지부는 학생들이 올바른 생활태도와 안정된 학교생활을 할 수 있도록 생활지도에 관련된 제반 계획을 세워 시행할 수 있다.'),(63,5,1,'기본질서교육은 다음과 같은 인성교육을 기본 내용으로 한다.\r\n1) 고운 말 쓰기\r\n2) 기초인사예절 및 전통예절\r\n3) 쓰레기 버리지 않기 및 줍기\r\n4) 교통질서 : 본 규정 제13조, 제29조, 제30조 제1항, 제31조에 준한 지도\r\n5) 청소방법'),(64,6,1,'학생복지부는 제5조 규정을 근간으로 한 기본 질서교육 계획을 수립, 이를 시행해야 한다.'),(65,7,1,'기본질서교육은 그 목표에 따라 등교 시 정문지도시간, 학기초 신입생 오리엔테이션, 단체 활동, 전체회의, 담임조례시간, 교과시간이나, 기타  특별계획에 의해 실시할 수 있다.'),(66,8,1,'모든 재학생은 기본질서교육을 받고 이를 실천해야하며, 수범하지 않을 때는 징계규정에 의해 선도 처분을 받는다.'),(67,9,1,'모든 재학생은 특별한 경우를 제외하고는 정시(08:00)에 등교를 해야 한다.'),(68,10,1,'부득이 지각이 불가피한 학생은 담임교사에게 사전에 지각사유를 통보하여야 한다.'),(69,11,1,'등교시에는 단정한 용의 복장을 하고 인사예절을 지켜야 하며, 위반사항에 대해서는 학생복지부 교사 또는 선도부 학생의 지도와 선도처분을 받을 수 있다.'),(70,12,1,'등교 후 모든 학생의 교문 출입은 금지된다. 다만 출입이 필요한 경우에는, 담인 교사와 학생복지부의 검인을 받은 외출증 또는 조퇴증을 발급 받아야 한다.'),(71,13,1,'등교시 자가용을 이용할 수 있으나 교문 앞 정차는 금지되며, 정차의 위치는 학교의 지시에 따라야 한다.'),(72,14,1,'하교시에는 정상적인 교복차림이어야 하며, 복장 용의 규정 및 본 규정의 제5장에서 제한하고 있는 차림으로 나가서는 아니 된다.'),(73,15,1,'학생복지부장은 등하교에 관련한 별도의 지도계획을 세워 시행할 수 있다.'),(74,16,1,'근태는 출결석 규정에 따른다.'),(75,17,1,'결석, 지각, 조퇴, 외출을 할 때는 사전에 사유서를 갖추어 담임교사와 학생복지부 담당교사의 허가를 받아야 한다.'),(76,18,1,'무단으로 결석, 지각, 조퇴, 외출을 하였을 때에는 담임교사와 협의, 학생복지부의 담당교사는 그 사유조사와 함께 적절한 지도, 선도, 징계 등의 조치를 취하여야 한다.'),(77,19,1,'모든 재학생은 용의 복장 규정의 모든 규칙을 준수해야 하며, 위반 시에는 학생 선도(징계) 규정 의거 처분된다.'),(79,20,1,'학생복지부는 일정수의 교사 및 선도부 학생을 아침 정문지도에 배치하거나, 또는 수시 일제검사를 통해 복장 용의 상태를 점검 검사해서 전체 학생이 단정한 상태를 유지하도록 한다.'),(80,21,1,'모든 재학생은 규정된 복장과 용의를 해야 하며, 다음 사항은 규제를 받거나 처벌된다.\r\n1) 규정에 맞지 않은 교복 또는 스타일이 변형된 교복\r\n2) 규정에 어긋난 신발, 책가방 착용\r\n3) 규정에 맞지 않은 머리 및 화장행위\r\n4) 교표 및 명찰 미패용 행위\r\n5) 교내에서 필요시간 이외의 체육복 또는 사복 착용\r\n6) 공휴일에 규정복 이외의 복장에 의한 교내 출입\r\n7) 기타 장신구 등 복장 용의 규정에서 제한하고 있는 사항'),(81,22,1,'학생 비행 탈선 및 학교폭력예방을 위해 학교폭력대책자치위원회(이하 자치위원회)를 아래와 같이 조직한다.\r\n1) 위원장 : 교감\r\n2) 위원 : 교사 - 학생복지부장, 학생복지부 교사3명 / 학부모 - 1명 / 유관기관 - 관악산 지구대 경찰 1명, 변호사 1명'),(82,23,1,'위원회의 기능과 중점 지도사항은 학교폭력예방 및 대책에 관한 규정(법률 제7119호, 2004.01.29)에 따르며 다음과 같다.\r\n1) 기본생활습과 및 예절지도 강화\r\n2) 휴대폰, 무선호출기 등 소지제한(등교 후 학급 조회 시간에 담임교사에게 보관 후 하고 시 인수함)\r\n3) 학교폭력 추발 및 불량배 일소\r\n4) 학교폭력 예방지도 및 상담활동 강화\r\n5) 홍보물 이용 유해업소 정화\r\n6) 교내의 생활지도 철저\r\n7) 가정 학교의 연계지도 강화'),(83,24,1,'위원회는 다음과 같은 실천 계획을 구체화시켜 시행한다.'),(84,25,1,'본부장은 필요시 위원회를 소집, 협의회를 가짐, 학생복지부장(책임교사)은 제24조에 규정한 필요사항을 기획 추진해 나가야 한다.'),(85,26,1,'학생은 절대로 폭력행위와 불법 서클조직 및 활동, 약물 오남용 불법 유흥업소 출입 등의 행위를 해서는 아니 되며, 적발시에는 선도처분의 대상이 된다.'),(86,27,1,'학생복지부는 학생 생활 안정과 건전한 학습 분위기 조성, 학생비행탈선 및 폭력 예방, 청결한 교육환경 조성을 위해 별도의 교내외 순시 계획을 세워 실천할 수 있다.'),(89,28,1,'교내외 생활지도는 제22조~제26조를 기본목표와 내용으로 하여 아래와 같은 교내외 지도를 할 수 있다.\r\n1) 교내 순시 지도 내역\r\n1교시 전 - 담임과 교감(실내정숙, 지각 지도, 기본생활습관지도, 자율학습지도, 폭력사고 예방, 아침 청소지도)\r\n점심시간 - 담임과 교감, 학생복지부장(실내정숙,  중간 청소지도, 기본생활습관지도, 폭력사고 예방, 식사지도)\r\n청소시간 - 담임과 복지부 청소담당(청소지도, 정숙지도, 기본생활습관지도)\r\n종례 후 - 담임과 학생복지부장(청소 및 교실 뒷정리 상태점검, 귀가지도)\r\n2) 교외 순찰(생활)지도\r\n1. 연간 교외 생활지도 계획에 의해 실시함을 원칙으로 하나, 필요시 수시로 시행할 수 있다.\r\n2. 교외 생활지도 담당교사는 교외생지도 일시, 장소, 참여교사를 계획하고 실행한다.\r\n3. 폭력사안 발생 시에는 담임교사도 함께 참여하여 지도한다.\r\n4. 교외생활지도 장소는 유흥업소와 유해업소의 밀집지역인 신림동 녹두거리, 신림사거리, 가야소핑 앞거리 등을 중심으로 우리 학교 학생들이 많이 출입할 수 있는 PC방, 비디오방, 노래방, 단란주점, 호프집, 카페, 콜라텍 등을 집중 단속 한다.\r\n5. 교외생활지도시 청소년 유해업소추방 홍보물 전단도 준비하여 배포토록 한다.'),(90,29,1,'학생복지부는 안전지도에 제22조~제26조 및 제27조~제28조)의 실천을 포함하여, 각종 안전사고예방 및 지도에 관한 제반 계획을 수립 시행한다.'),(91,30,1,'안전디오의 영역과 지도 중점사항은 다음과 같다.\r\n1) 교통지도 (등하교 시 학교 앞 건널목 교통지도, 각종 수련활동 시 교통사고 및 안전사고 예방 지도-수학여행, 단체수련, 간부학생수련, 사제 등반대회, 현장 체험학습, 단체관람, 백일장 등)\r\n2) 교내외 폭력예방지도 : 제22조~제26조 및 제27조~제28조에 준한 지도\r\n3) 시설 안전사고 예방 : 행정실의 협조를 받아 건축, 기계, 전기, 가스 등의 시설 안전점검 및 보수\r\n4) 약물 오남용 예방지도 : 제22조~제 26조에 준한지도\r\n5) 전염병 예방지도 : 보건교육 계획에 의한 지도\r\n6) 급식 및 위생 안전지도\r\n7) 봉사활동 : 사전 안전지도 및 현장지도\r\n8) 교과교육 : 체육, 과학실험실습, 가정 가사 실습 시 안전사고예방지도\r\n9) 학교주변 유해업소 출입금지 : 제22조~제26조 및 제27조, 제28조에 준한 지도'),(92,31,1,'학생복지부는 상기 제27조 및 제 28조의 효율적인 지도방법, 필요인원, 예산 등의 사전대책을 마련하고, 학생은 교사의 지도에 적극 따라야 한다.'),(93,32,1,'교내에서 습득된 모든 금품과 물건은 담임 또는 학생복지부에 신고가 되어야 한다.'),(94,33,1,'습득물은 광고 후 1개월이 경과하면 학생복지부에서 자체 처리한다.'),(95,34,1,'교외에서 습득물의 취득 또는 금품이나 물건의 분실이 있을 때에는 가까운 파출소에 신고하고 학생복지부에 통보하여야 한다.'),(96,35,1,'모든 소지품에는 본인의 이름을 명기해야 한다.'),(97,36,1,'학생복지부는 학기 초에 절전 절수 및 교구 아껴 쓰기 지도계획을 수립, 시행할 수 있다.'),(98,37,1,'모든 재학생은 절전 절수를 솔선수범해야 하며, 학교의 지도방침을 따라야 한다.'),(99,38,1,'학교의 모든 시설과 교구는 아끼고 가꾸어져야 하며, 기물의 파손, 훼손, 낙서 등의 행위가 이뤄지면 상벌규정에 의해 처벌될 수 있다.'),(100,39,1,'모든 재학생은 휴대폰 사용 및 소지 규정을 준수 하여야 하며 위반시 규제를 받는다.\r\n1) 조회시간(08:00) ~ 종례시간(16:30) 소지 및 사용 금지\r\n2) 종례시간 이후(16:30) ~ 소지 및 사용 가능\r\n3) 방과후 수업시간 소지는 가능하나 사용 금지\r\n4) 1차 적발 시 3개월, 2차 적발시 6개월, 3차 적발시 졸업식 때 돌려 준다.'),(101,1,2,'이 규정은 학생들로 하여금 단정하고 정숙한 학생상을 유지하고 건전한 학풍을 조성하고자 복장과 용의에 관해 규정함을 목적으로 한단.');
/*!40000 ALTER TABLE `rule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `id` int(5) NOT NULL,
  `grade` int(3) NOT NULL,
  `major` varchar(40) NOT NULL,
  `name_sub` varchar(40) NOT NULL,
  `intro_sub` varchar(205) NOT NULL,
  `teacher` varchar(20) NOT NULL,
  `room` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (1,2,'인터랙티브미디어','국어II','여러 시대의 문학 작품을 통해 국어 문법과 당시의 시대 상황을 간접적으로 배운다.','최영진','각 반 교실'),(2,2,'인터랙티브미디어','수학II','집합, 명제, 수학적 귀납적, 로그 등을 배우며 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실,  수준 별 교실'),(3,2,'인터랙티브미디어','영어I','영어 문법과 다양한 본문을 통해서 영어 지식을 습득한다.','정혜선, 윤성웅, 최정아','각 반 교실, 수준 별 교실'),(4,2,'인터랙티브미디어','과학','빅뱅이론과 생명복제 등의 철학적 요소가 감미된 융합과학에 대한 지식들을 습득한다.','권지웅','과학실'),(5,2,'인터랙티브미디어','프로그래밍(JAVA)','객체지향 언어인 JAVA의 특징인 정보은닉, 캡슐화, 클래스 등에 대한 심화된 지식들을 배운다.','유병석','뉴미디어솔루션 1실'),(6,2,'인터랙티브미디어','프로그래밍(C++)','JAVA의 틀이 된 언어로, 기존의 C에서 클래스와 상속 등이 추가된 언어를 배운다.','민주리','뉴미디어솔루션 1실'),(7,2,'인터랙티브미디어','자료구조(DS)','프로그램이 어떤 방식으로 동작하고, 조금 더 하드웨어적으로 덜 부담을 주는 코드의 방식들을 배운다.','이재민','각 반 교실'),(8,2,'인터랙티브미디어','SW공학','일학년 때 배운 웹 콘텐츠 제작일반 보다 심화된 과정으로, javascript 심화 과정의 지식을 습득한다.','백현정','인터랙티브미디어 1실'),(9,2,'뉴미디어솔루션','국어II','여러 시대의 문학 작품을 통해 국어 문법과 당시의 시대 상황을 간접적으로 배운다.','최영진','각 반 교실'),(10,2,'뉴미디어솔루션','수학II','집합, 명제, 수학적 귀납적, 로그 등을 배우며 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실, 수준 별 교실'),(11,2,'뉴미디어솔루션','확률과 통계','순열과 조합, 확률, 통계를 배우며 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실, 수준 별 교실'),(12,2,'뉴미디어솔루션','영어I','영어 문법과 다양한 본문을 통해서 영어 지식을 습득한다.','정혜선, 윤성웅, 최정아','각 반 교실, 수준 별 교실'),(13,2,'뉴미디어솔루션','과학','빅뱅이론과 생명복제 등의 철학적 요소가 감미된 융합과학에 대한 지식들을 습득한다.','권지웅','과학실'),(14,2,'뉴미디어솔루션','프로그래밍(JAVA)','객체지향 언어인 JAVA의 특징인 정보은닉, 캡슐화, 클래스 등에 대한 심화된 지식들을 배운다.','백현정','인터랙티브미디어 1실'),(15,2,'뉴미디어솔루션','프로그래밍(C++)','JAVA의 틀이 된 언어로, 기존의 C에서 클래스와 상속 등이 추가된 언어를 배운다.','민주리','뉴미디어솔루션 1실'),(16,2,'뉴미디어솔루션','자료구조(DS)','프로그램이 어떤 방식으로 동작하고, 조금 더 하드웨어적으로 덜 부담을 주는 코드의 방식들을 배운다.','이재민','각 반 교실'),(17,2,'뉴미디어솔루션','운영체제(OS)','windows에 대한 심화된 지식들과 또 다른 운영체제인 Linux를 배운다.','이철희','각 반 교실'),(18,2,'뉴미디어솔루션','디자인 일반','소프트웨어과 학생들에게 디자인적 감각을 습득하도록 도와준다.','박진형','각 반 교실'),(19,2,'뉴미디어솔루션','체육','몸을 건강하게 유지할 수 있는 운동들을 배우고 실습한다.','박향규','체육관, 강당'),(20,2,'뉴미디어솔루션','서버구축실무(SB)','데이터베이스에 대한 기본적인 개념과 데이터베이스 조작어 등을 배운다.','이형섭','각 반 교실'),(21,2,'뉴미디어디자인','국어II','여러 시대의 문학 작품을 통해 국어 문법과 당시의 시대 상황을 간접적으로 배운다.','최영진','각 반 교실'),(22,2,'뉴미디어디자인','수학II','집합, 명제, 수학적 귀납적, 로그 등을 배우며 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실, 수준 별 교실'),(23,2,'뉴미디어디자인','확률과 통계','순열과 조합, 확률, 통계를 배우며 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실, 수준 별 교실'),(24,2,'뉴미디어디자인','영어I','영어 문법과 다양한 본문을 통해서 영어 지식을 습득한다.','정혜선, 윤성웅, 최정아','각 반 교실, 수준 별 교실'),(25,2,'뉴미디어디자인','과학','빅뱅이론과 생명복제 등의 철학적 요소가 감미된 융합과학에 대한 지식들을 습득한다.','권지웅','각 반 교실'),(26,2,'뉴미디어디자인','웹콘텐츠제작일반','html과 css, javascript의 기본적인 지식을 습득한다.','이하얀','각 반 교실'),(27,2,'뉴미디어디자인','조형','다양한 프로젝트를 통해서 그래픽에 관련된 디자인 지식을 습득한다.','김민혜','각 반 교실'),(28,2,'뉴미디어디자인','뉴미디어디자인기초(NDB)','어플리케이션의 내부 화면과 같은 앱 디자인을 배우며, 실습한다.','박진형','각 반 교실'),(29,2,'뉴미디어디자인','미디어콘텐츠일반(MC)','게임캐릭터와 같은 3D관련된 디자인을 배우며, 실습한다.','김명준','앱 창작터 2실'),(30,2,'인터랙티브미디어','디자인 일반','소프트웨어과 학생들에게 디자인적 감각을 습득하도록 도와준다.','박진형','각 반 교실'),(31,2,'인터랙티브미디어','체육','몸을 건강하게 유지할 수 있는 운동들을 배우고 실습한다.','박향규','체육관, 강당'),(33,2,'인터랙티브미디어','운영체제(OS)','windows에 대한 심화된 지식들과 또 다른 운영체제인 Linux를 배운다.','이철희','각 반 교실'),(34,2,'뉴미디어디자인','체육','몸을 건강하게 유지할 수 있는 운동들을 배우고 실습한다.','박향규','체육관, 강당'),(35,1,'인터랙티브미디어','국어I','다양한 문학 작품과 국어 문법을 통해 올바른 우리 말 습관을 형성한다.','이대형, 최영진','각 반 교실'),(36,1,'인터랙티브미디어','수학I','다항식과 방정식, 부등식 그리고 도형의 방정식을 통해 기본적인 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실, 수준별 교실'),(37,1,'인터랙티브미디어','실용영어I','기본적인 영어 문법과 다양한 본문을 통해서 기본적인 영어 지식을 습득한다.','정혜선, 이은주, 최정아, 김지훈','각 반 교실, 수준 별 교실'),(38,1,'인터랙티브미디어','한국사','고조선부터 대한민국까지의 역사와 우리나라와 관련된 세계 여러 나라들의 역사를 배운다.','이철호, 김영철','각 반 교실'),(39,1,'인터랙티브미디어','사회','우리가 살아가고 있는 사회의 전반적인 흐름과 기본 상식들을 배운다.','이철호, 김영철','각 반 교실'),(40,1,'인터랙티브미디어','기술 가정','일상 생활에서 필요한 지식인 성, 의식주, 가족 등에 대해 배운다.','김보경','각 반 교실'),(41,1,'인터랙티브미디어','일본어I','히라가나와 가타카나를 통해 일본 회화 표현과 일본 문화를 배운다.','김윤환','각 반 교실'),(42,1,'인터랙티브미디어','뉴미디어론(NM)','방송 미디어의 역사와 주목받는 미디어에 대해 배운다.','이규응','각 반 교실'),(43,1,'인터랙티브미디어','정보기술과 활용(ITA)','엑셀, 파워포인트, 한글 등 프로그램을 다루는방법과 진법 변환, 하드웨어의 구성들을 배운다.','임정훈','각 반 교실'),(44,1,'인터랙티브미디어','체육','몸을 건강하게 유지할 수 있는 운동들을 배우고 실습한다.','고낙은','체육관, 강당'),(45,1,'인터랙티브미디어','프로그래밍(JAVA)','객체지향 언어인 JAVA의 특징인 정보은닉, 캡슐화, 클래스 등에 대한 기초적인 지식들을 배운다.','최규정','각 반 교실'),(46,1,'뉴미디어솔루션','국어I','다양한 문학 작품과 국어 문법을 통해 올바른 우리 말 습관을 형성한다.','이대형, 최영진','각 반 교실'),(47,1,'뉴미디어솔루션','수학I','다항식과 방정식, 부등식 그리고 도형의 방정식을 통해 기본적인 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실,  수준 별 교실'),(48,1,'뉴미디어솔루션','실용영어I','기본적인 영어 문법과 다양한 본문을 통해서 기본적인 영어 지식을 습득한다.','정혜선, 이은주, 최정아, 김지훈','각 반 교실,  수준 별 교실'),(49,1,'뉴미디어솔루션','한국사','고조선부터 대한민국까지의 역사와 우리나라와 관련된 세계 여러 나라들의 역사를 배운다.','이철호, 김영철','각 반 교실'),(50,1,'뉴미디어솔루션','사회','우리가 살아가고 있는 사회의 전반적인 흐름과 기본 상식들을 배운다.','이철호, 김영철','각 반 교실'),(51,1,'뉴미디어솔루션','기술⋅가정','일상 생활에서 필요한 지식인 성, 의식주, 가족 등에 대해 배운다.','김보경','각 반 교실'),(52,1,'뉴미디어솔루션','일본어I','히라가나와 가타카나를 통해 일본 회화 표현과 일본 문화를 배운다.','김윤환','각 반 교실'),(53,1,'뉴미디어솔루션','뉴미디어론(NM)','방송 미디어의 역사와 주목받는 미디어에 대해 배운다.','이규응','각 반 교실'),(54,1,'뉴미디어솔루션','정보기술과 활용(ITA)','엑셀, 파워포인트, 한글 등 프로그램을 다루는방법과 진법 변환, 하드웨어의 구성들을 배운다.','임정훈','각 반 교실'),(55,1,'뉴미디어솔루션','체육','몸을 건강하게 유지할 수 있는 운동들을 배우고 실습한다.','고낙은','체육관, 강당'),(56,1,'뉴미디어솔루션','프로그래밍(JAVA)','객체지향 언어인 JAVA의 특징인 정보은닉, 캡슐화, 클래스 등에 대한 기초적인 지식들을 배운다.','최규정','각 반 교실'),(57,1,'뉴미디어디자인','국어I','다양한 문학 작품과 국어 문법을 통해 올바른 우리 말 습관을 형성한다.','이대형, 최영진','각 반 교실'),(58,1,'뉴미디어디자인','수학I','다항식과 방정식, 부등식 그리고 도형의 방정식을 통해 기본적인 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실, 수준 별 교실'),(59,1,'뉴미디어디자인','실용영어I','기본적인 영어 문법과 다양한 본문을 통해서 기본적인 영어 지식을 습득한다.','정혜선, 이은주, 최정아, 김지훈','각 반 교실,  수준 별 교실'),(60,1,'뉴미디어디자인','한국사','고조선부터 대한민국까지의 역사와 우리나라와 관련된 세계 여러 나라들의 역사를 배운다.','이철호, 김영철','각 반 교실'),(61,1,'뉴미디어디자인','사회','우리가 살아가고 있는 사회의 전반적인 흐름과 기본 상식들을 배운다.','이철호, 김영철','각 반 교실'),(62,1,'뉴미디어디자인','기술 가정','일상 생활에서 필요한 지식인 성, 의식주, 가족 등에 대해 배운다.','김보경','각 반 교실'),(63,1,'뉴미디어디자인','일본어I','히라가나와 가타카나를 통해 일본 회화 표현과 일본 문화를 배운다.','김윤환','각 반 교실'),(64,1,'뉴미디어디자인',' 뉴미디어론(NM)','방송 미디어의 역사와 주목받는 미디어에 대해 배운다.','이규응','각 반 교실'),(65,1,'뉴미디어디자인','정보기술과 활용(ITA)','엑셀, 파워포인트, 한글 등 프로그램을 다루는방법과 진법 변환, 하드웨어의 구성들을 배운다.','임정훈','각 반 교실'),(66,1,'뉴미디어디자인','체육','몸을 건강하게 유지할 수 있는 운동들을 배우고 실습한다.','고낙은','체육관, 강당'),(67,2,'인터랙티브미디어','확률과 통계','순열과 조합, 확률, 통계를 배우며 수학 지식을 습득한다.','송민정, 우호식, 박성래, 이호연','각 반 교실, 수준 별 교실'),(72,1,'뉴미디어디자인','컴퓨터그래픽','컴퓨터 그래픽에 관련된 기초적인 지식을 습득하며 그에 관련된 디자인 실습을 한다.','박진형','각 반 교실'),(73,1,'뉴미디어디자인','조형','조형에 관련된 기초적인 지식을 습득하며 그에 관련된 디자인 실습을 한다.','신혜정B','각 반 교실'),(74,3,'인터랙티브미디어','커뮤니케이션문학','1, 2학년 때 배운 ‘국어I, II’과목과 비슷하며, 국어 전반에 관련된 지식을 배운다.','이대형','각 반 교실'),(75,3,'인터랙티브미디어','미디어실무영어','전공에 관련된 영어 지식을 습득하고 배운다.','김지훈','각 반 교실, 수준 별 교실'),(76,3,'인터랙티브미디어','뉴미디어실무','인포그래픽에 관련된 지식을 배우며 그에 관련된 것을 을 실습한다.','신혜정B','각 반 교실'),(77,3,'뉴미디어솔루션','커뮤니케이션문학','1, 2학년 때 배운 ‘국어I, II’과목과 비슷하며, 국어 전반에 관련된 지식을 배운다.','이대형','각 반 교실'),(78,3,'뉴미디어디자인','커뮤니케이션문학','1, 2학년 때 배운 ‘국어I, II’과목과 비슷하며, 국어 전반에 관련된 지식을 배운다.','이대형','각 반 교실'),(79,3,'뉴미디어디자인','뉴미디어실무','인포그래픽에 관련된 지식을 배우며 그에 관련된 것을 을 실습한다.','신혜정B','각 반 교실'),(80,3,'뉴미디어디자인','뉴미디어UI디자인','웹사이트 구축에 관련된 디자인에 대한 지식을 습득하며 그에 관련된 디자인을 한다.','이하얀','각 반 교실'),(81,3,'뉴미디어디자인','인터랙션디자인','편집 디자인에 관련된 전반적인것들에 대한 지식을 습득한다. 타이포 그래픽부터 편집디자인에 대한 기초부터 심화과정까지 배운다.','김종성','각 반 교실'),(82,3,'뉴미디어디자인','스마트문화앱콘텐츠제작','앱 디자인에 관련된 디자인 지식들을 습득하고, 그에 관련된 디자인을 한다.','김명준, 김민혜','각 반 교실'),(83,3,'뉴미디어디자인','뉴미디어콘텐츠제작','저작권과 GUI 제작 기초에 관련된 지식을 습득한다.','김종성','각 반 교실'),(84,3,'뉴미디어솔루션','커뮤니케이션문학','1, 2학년 때 배운 ‘국어I, II’과목과 비슷하며, 국어 전반에 관련된 지식을 배운다.','이대형','각 반 교실'),(85,3,'뉴미디어솔루션','미디어실무영어','전공에 관련된 영어 지식을 습득하고 배운다.','김지훈','각 반 교실'),(86,1,'인터랙티브미디어','인터랙티브미디어기초(IMB)','html과 css, javascript등을 배우며 웹 사이트 구축에 대한 기본적인 지식을 습득한다.','유병석, 윤선희','인터랙티브미디어1실'),(87,1,'뉴미디어솔루션','인터랙티브미디어기초(IMB)','html과 css, javascript등을 배우며 웹 사이트 구축에 대한 기본적인 지식을 습득한다.','유병석, 윤선희','인터랙티브미디어1실'),(88,3,'뉴미디어디자인','미디어실무영어','전공에 관련된 영어 지식을 습득하고 배운다.','김지훈','각 반 교실, 수준 별 교실'),(89,3,'인터랙티브미디어','뉴미디어콘텐츠프로그래밍','뉴미디어콘텐츠프로그래밍에 관련된 지식을 습득하고 실습한다.','모름','각 반 교실'),(90,3,'인터랙티브미디어','데이터베이스프로그래밍','데이터베이스프로그래밍에 관련된 지식을 습득하고 실습한다.','모름','각 반 교실'),(91,3,'인터랙티브미디어','웹프로그래밍','웹프로그래밍에 관련된 지식을 습득하고 실습한다.','모름','각 반 교실'),(92,3,'인터랙티브미디어','뉴미디어전송','뉴미디어 전송에 관련된 지식을 습득하고 실습한다.','박지우','각 반 교실'),(93,3,'뉴미디어솔루션','뉴미디어콘텐츠프로그래밍','뉴미디어콘텐츠프로그래밍에 관련된 지식을 습득하고 실습한다.','박지우','각 반 교실'),(94,3,'뉴미디어솔루션','데이터베이스프로그래밍','데이터베이스프로그래밍에 관련된 지식을 습득하고 실습한다.','모름','각 반 교실'),(95,3,'뉴미디어솔루션','웹프로그래밍','웹프로그래밍에 관련된 지식을 습득하고 실습한다.','모름','각 반 교실'),(96,3,'뉴미디어솔루션','뉴미디어전송','뉴미디어 전송에 관련된 지식을 습득하고 실습한다.','모름','각 반 교실'),(97,3,'뉴미디어솔루션','웹사이트제작','웹 사이트 제작에 관련된 지식을 습득하며 웹사이트를 구축한다.','모름','각 반 교실');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-16 17:58:32
