-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 17, 2019 at 01:25 AM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE IF NOT EXISTS `books` (
  `B_Title` varchar(255) NOT NULL,
  `Barcode` int(255) NOT NULL,
  `B_author` varchar(255) NOT NULL,
  `B_pages` int(255) NOT NULL,
  `Status` int(255) NOT NULL,
  `ISBN` mediumtext NOT NULL,
  `Comments` varchar(255) NOT NULL,
  PRIMARY KEY (`Barcode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`B_Title`, `Barcode`, `B_author`, `B_pages`, `Status`, `ISBN`, `Comments`) VALUES
('The Sicilian Accelerated Dragon - 20th Anniversary Edition', 12367123, ' Peter Heine Nielsen , Carsten Hansen ', 912, 1, '171785295', 'Nice book on Chess Silician Method'),
('How to Play Chess', 712399123, 'Claire Summerscale', 72, 1, '1465457674', 'Learn how to play basic');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
