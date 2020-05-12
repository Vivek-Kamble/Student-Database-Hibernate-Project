-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 12, 2020 at 09:15 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hibernatedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `Student`
--

CREATE TABLE `Student` (
  `enrollmentNumber` int(11) NOT NULL,
  `studentFirstName` varchar(255) DEFAULT NULL,
  `studentLastName` varchar(255) DEFAULT NULL,
  `studentMiddleName` varchar(255) DEFAULT NULL,
  `studentPercentage` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Student`
--

INSERT INTO `Student` (`enrollmentNumber`, `studentFirstName`, `studentLastName`, `studentMiddleName`, `studentPercentage`) VALUES
(101, 'Sachin', 'Tendulkar', 'Ramesh', 80.56),
(102, 'Rahul', 'Dravid', 'Sharad', 85.96),
(103, 'Virat', 'Kohli', 'S.', 92.96),
(104, 'Mahendra', 'Dhone', 'Singh', 80.41),
(105, 'Sunil', 'Gavaskar', 'Manohar', 82.31),
(106, 'Virender', 'Sehwag', 'S', 60.52),
(107, 'Yuvraj', 'Singh', 'S', 70.52),
(108, 'Harbhajan', 'Plaha', 'Singh', 65.52),
(109, 'Zaheer', 'Khan', 'A.', 60.23),
(110, 'Rohit', 'Sharma', 'Gurunath', 76.56),
(111, 'Ravindrasinh', 'Jadeja', 'Anirudhsinh', 78.25),
(112, 'Ravichandran', 'Ashwin', 'K.', 63.98),
(113, 'Kannur', 'Rahul', 'Lokesh', 78.42),
(114, 'Shikhar', 'Dhawan', 'G.', 75.56),
(115, 'Gautam', 'Gambhir', 'E.', 46.12),
(116, 'Ajinkya', 'Rahane', 'Madhukar', 96.36),
(117, 'Jasprit', 'Bumrah', 'Jasbirsingh', 57.89),
(118, 'Bhuvneshwar', 'Singh', 'Kumar', 75.29),
(119, 'Suresh', 'Raina', 'Kumar', 49.58),
(120, 'Hardik', 'Pandya', 'Himanshu', 79.65);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`enrollmentNumber`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
