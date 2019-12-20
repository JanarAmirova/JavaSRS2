-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: knigimagazin
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `books` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ATHNAME` varchar(30) DEFAULT NULL,
  `BOOKNAME` varchar(30) DEFAULT NULL,
  `GENRE` varchar(30) DEFAULT NULL,
  `DATEPUBL` int(11) DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,'БЛЕЙК ПИРС','КОГДА ОНА УШЛА','ДЕТЕКТИВ',2015,18),(2,'ДЖЕЙМС ДЭШНЕР','БЕГУЩИЙ В ЛАБИРИНТЕ','АНТИУТОПИЯ',2009,16),(3,'ДЖОАН РОУЛИНГ','ГАРРИ ПОТТЕР','ФЭНТЕЗИ',1997,12),(4,'ДЖОН КЕХО','ПОДСОЗНАНИЕ МОЖЕТ ВСЕ','ЭЗОТЕРИКА',1997,16),(5,'ДЖОРДЖ ОРУЭЛЛ','1984','РОМАН-АНТИУТОПИЯ',1949,16),(6,'ДЭН БРАУН','АНГЕЛЫ И ДЕМОНЫ','РОМАН',2000,16),(7,'КАССАНДРА КЛЭР','ГОРОД КОСТЕЙ','ФЭНТЕЗИ',2007,12),(8,'КЭМИ ГАРСИЯ','ПРЕКРАСНЫЕ СОЗДАНИЯ','ФЭНТЕЗИ',2009,16),(9,'ЛОРЕН ОЛИВЕР','ПРЕЖДЕ ЧЕМ Я УПАДУ','РОМАН',2010,16),(10,'РИК РИОРДАН','ПЕРСИ ДЖЕКСОН','ФЭНТЕЗИ',2006,12),(11,'РОБЕРТ КИЙОСАКИ','БОГАТЫЙ ПАПА,БЕДНЫЙ ПАПА','БИЗНЕС-ЛИТЕРАТУРА',1997,12),(12,'РЭЙ БРЕДБЕРИ','451 ГРАДУС ПО ФАРЕНГЕЙТУ','РОМАН-АНИУТОПИЯ',1953,16);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-20 13:21:14
