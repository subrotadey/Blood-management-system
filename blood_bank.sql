-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 13, 2021 at 07:08 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `blood_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `post_table`
--

CREATE TABLE `post_table` (
  `ID` int(20) NOT NULL,
  `Message` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Number` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `post_table`
--

INSERT INTO `post_table` (`ID`, `Message`, `Email`, `Number`) VALUES
(5, 'I need blood! It\'s urgent.', 'irfan@chow.com', '01777'),
(7, 'AB- blood needed', 'sakib@gmail.com', '01911'),
(8, 'Emergency O- blood needed', 'irfan@chow.com', '01777'),
(10, 'I am in need of getting some blood AB+', 'fff', '01711'),
(11, 'Who can give o- blood', '2312', '3333'),
(14, 'erw', 'afasfd', '01777'),
(15, 'A+ blood needed at Agrabad,\nChittaong.', 'irfan@chow.com', '01777');

-- --------------------------------------------------------

--
-- Table structure for table `user_table`
--

CREATE TABLE `user_table` (
  `Timestamp` timestamp NOT NULL DEFAULT current_timestamp(),
  `Name` varchar(255) NOT NULL,
  `City` varchar(255) NOT NULL,
  `BloodGroup` varchar(5) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Number` varchar(255) NOT NULL,
  `NID` int(255) NOT NULL,
  `Available` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_table`
--

INSERT INTO `user_table` (`Timestamp`, `Name`, `City`, `BloodGroup`, `Password`, `Number`, `NID`, `Available`) VALUES
('2021-07-30 16:12:49', 'AAAA', 'Dhaka', 'AB-', '1', '01110', 1, 1),
('2021-07-30 16:15:45', 'BBBB', 'Narsingdi', 'AB-', '111', '0211', 111, 1),
('2021-07-30 16:37:41', 'Kamal', 'Sylhet', 'A+', '123', '01199', 2412, 1),
('2021-07-28 15:22:41', 'Sakib Rahman', 'Chittagong', 'AB-', '12345', '01911', 61111, 1),
('2021-07-28 15:28:26', 'Irfan Chowdhury', 'Chittagong', 'A-', '123', '01777', 121212, 1),
('2021-08-09 05:29:53', 'Shuvo', 'Dhaka', 'A-', '123', '01144', 6021547, 0),
('2021-07-30 10:47:28', 'Mostafa', 'Dhaka', 'A+', '123456', '01711', 987654321, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `post_table`
--
ALTER TABLE `post_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `user_table`
--
ALTER TABLE `user_table`
  ADD PRIMARY KEY (`NID`),
  ADD UNIQUE KEY `Number` (`Number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `post_table`
--
ALTER TABLE `post_table`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
