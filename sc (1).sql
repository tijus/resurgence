-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2017 at 03:55 PM
-- Server version: 10.0.17-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sc`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `AdminId` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(15) NOT NULL,
  `remarks` varchar(50) NOT NULL,
  `Name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`AdminId`, `username`, `password`, `remarks`, `Name`) VALUES
(1, 'badalkotak@gmail.com', 'koyO', 'Tech Team Head', 'Badal Kotak');

-- --------------------------------------------------------

--
-- Table structure for table `admission`
--

CREATE TABLE `admission` (
  `Id` int(10) NOT NULL,
  `Label` varchar(100) NOT NULL,
  `Matter` varchar(100) NOT NULL,
  `URL` varchar(100) NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admission`
--

INSERT INTO `admission` (`Id`, `Label`, `Matter`, `URL`, `Date`) VALUES
(3, 'fdasf', '', '../uploads/media/pdf/student affidavit.pdf', '0000-00-00'),
(4, 'asdf', 'fads', '../uploads/media/pdf/parent affidavit.pdf', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `noticeboard`
--

CREATE TABLE `noticeboard` (
  `id` int(5) NOT NULL,
  `Label` varchar(30) NOT NULL,
  `Matter` text NOT NULL,
  `URL` varchar(100) NOT NULL,
  `Date` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `noticeboard`
--

INSERT INTO `noticeboard` (`id`, `Label`, `Matter`, `URL`, `Date`) VALUES
(11, 'SE, TE, BE admissions', 'adf', '../uploads/media/pdf/monthwise.pdf', '06/07/2016');

-- --------------------------------------------------------

--
-- Table structure for table `registrations`
--

CREATE TABLE `registrations` (
  `Timestamps` varchar(20) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `College` varchar(100) NOT NULL,
  `Contact` varchar(10) NOT NULL,
  `Branch` varchar(30) NOT NULL,
  `Participants` varchar(30) NOT NULL,
  `Amount` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL,
  `InterScore` varchar(30) NOT NULL,
  `IntraScore` varchar(30) NOT NULL,
  `Surge` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registrations`
--

INSERT INTO `registrations` (`Timestamps`, `FullName`, `College`, `Contact`, `Branch`, `Participants`, `Amount`, `type`, `InterScore`, `IntraScore`, `Surge`) VALUES
('Timestamp', 'Full Name', 'Name of the College', 'Contact No', 'Branch & Year', 'Accompanied Participants', 'Amount Paid', 'Event Type', 'Inter-Score Events', 'Intra-Score Events', 'Surge Events'),
('', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', ''),
('2/6/2016 12:01:18', 'Pushkar Mutha', 'Vidyalankar', '9011211210', 'Se-Etrx', '0', '50', 'Surge', '', '', 'EDM Night'),
('2/6/2016 22:00:53', 'Vinit Nalekar', 'Vidyalankar', '9820356001', 'Se-etrx', '5', '(paid-100)(left-150)', 'Surge', '', '', 'Treasure Hunt'),
('2/6/2016 22:03:08', 'Unath Rajula', 'Vidyalankar', '7506320783', 'Sy-It', '0', '(50/-)', 'Surge', '', '', 'FIFA'),
('2/6/2016 22:04:41', 'Karan Thakur', 'Vidyalankar', '7738568531', 'Sy-It', '0', '(50/-)', 'Surge', '', '', 'FIFA'),
('2/6/2016 22:05:56', 'Esha Kalgutkar', 'Vidyalankar', '9029476980', 'Te-It', '0', '(50/-)', 'Surge', '', '', 'Mumbais Got Talent'),
('2/6/2016 22:07:30', 'Veena Vemula', 'Vidyalankar', '9588779338', 'Sy-BBI', '0', '(50/-)', 'Surge', '', '', 'Art and Culture'),
('2/6/2016 22:08:54', 'Veena Vemula', 'Vidyalankar', '9588779338', 'Te-It', '0', '(30/-)', 'Surge', '', '', 'Art and Culture'),
('2/6/2016 22:09:59', 'Kishan Yadav', 'Vidyalankar', '8976999263', 'Sy-BBI', '0', '(50/-)', 'Surge', '', '', 'EDM Night'),
('2/6/2016 22:12:14', 'Ritesh Shelar', 'TSEC', '9820799749', 'Biomed', '0', '(100/-)', 'Surge', '', '', 'Rubik Cube Competition'),
('2/6/2016 22:26:21', 'Jigar Parekh', 'Somaiya Vidyavihar', '9987669472', '-', '0', '(50/-)', 'Surge', '', '', 'Mumbais Got Talent'),
('2/6/2016 22:27:15', 'Siddhi Satam', 'Somaiya Vidyavihar', '7208867075', '-', '0', '(50/-)', 'Surge', '', '', 'Mumbais Got Talent'),
('2/6/2016 22:28:51', 'Ganesh Patil', 'Somaiya Vidyavihar', '9594450905', '-', '0', '(paid-30/-)(left-20/-)', 'Surge', '', '', 'Art and Culture'),
('2/6/2016 22:30:01', 'Abhijeet Jadhav', 'Somaiya Vidyvihar', '8308783296', '-', '0', '(50/-)(left-50/-)', 'Surge', '', '', 'Debate'),
('2/6/2016 22:31:14', 'Abhijeet Jadhav', 'Somaiya Vidyavihar', '8308783296', '-', '5', '(100/-)(left-150/-)', 'Surge', '', '', 'Treasure Hunt'),
('2/6/2016 22:32:41', 'Amey Meher', 'Somaiya Vidyavihar', '9757260405', '-', '0', '(50/-)(left-50/-)', 'Score', 'Badminton Boys (Single)', '', ''),
('2/6/2016 22:34:13', 'Sarvesh Barve', 'Somaiya Vidyavihar', '8425024939', '-', '0', '(100/-)(left-150/-)', 'Surge', '', '', 'Treasure Hunt'),
('2/6/2016 22:35:25', 'Doravh Rathod', 'Somaiya Vidyavihar', '9892828337', '-', '0', '(50/-)(left-50/-)', 'Score', 'Badminton Boys (Single)', '', ''),
('2/6/2016 22:44:19', 'Mauthan Joshi', 'Somaiya Vidyavihar', '9833594203', '-', '4', '(150/-)(left-100/-)', 'Surge', '', '', 'CounterStrike'),
('2/6/2016 22:45:13', 'Harshil Shah', 'Somaiya Vidyavihar', '7058455221', '-', '0', '(50/-)', 'Surge', '', '', 'Mumbais Got Talent'),
('2/6/2016 22:49:24', 'Heeth Shah', 'Shah & Anchor', '9967000300', '-', '6', '(100/-)(left-600/-)', 'Score', 'Rink Football', '', ''),
('2/6/2016 23:01:13', 'Sanket', 'Vidyalankar', '9769653993', '-', '1', '100/-', 'Score', 'Carrom (Doubles)', '', ''),
('2/6/2016 23:02:14', 'Pranay', 'Vidyalankar', '9594259445', '-', '0', '50/-', 'Score', 'Carrom (Singles)', '', ''),
('2/6/2016 23:04:19', 'Chaitanya', 'Vidyalankar', '8108214966', '-', '14', '(200/-)(left-1600/-)', 'Score', 'Open Football', '', ''),
('2/6/2016 23:05:43', 'Pranay Shanbhag', 'Vidyalankar', '9869668047', '-', '0', '(50/-)', 'Score', 'Chess', '', ''),
('2/6/2016 23:06:36', 'Varun Nair', 'Vidyalankar', '9820833714', '-', '0', '(30/-)(left-20/-)', 'Score', 'Chess', '', ''),
('2/6/2016 23:07:32', 'Rajnikant', 'Vidyalankar', '9820833714', '-', '0', '(20/-)(left-30/-)', 'Score', 'Chess', '', ''),
('2/6/2016 23:09:20', 'Tanmayee Rawale', 'vidyalankar', '983367274', '-', '0', '(50/-)', 'Score', 'Carrom (Singles)', '', ''),
('2/6/2016 23:10:27', 'Jayshree Tayde', 'Vidyalankar', '7276833924', '-', '1', '(200/-)', 'Score', 'Badminton Boys (Double)', '', ''),
('2/6/2016 23:11:25', 'Minal Sawant', 'Vidyalankar', '9167137386', '-', '1', '(100/-)', 'Score', 'Carrom (Doubles)', '', ''),
('2/6/2016 23:12:18', 'Priya Patil', 'Vasantdada Patil', '8879223781', '-', '0', '(50/-)', 'Score', 'Chess', '', ''),
('2/7/2016 15:28:18', 'Abdul Rehman', 'Rizvi', '9702213118', '-', '1', '(150/-)(left-50/-)', 'Score', 'Badminton Boys (Double)', '', ''),
('2/7/2016 16:00:13', 'Abdul Rehman', 'Rizvi', '9702213118', '-', '0', '(50/-)(left-50/-)', 'Score', 'Badminton Boys (Single)', '', ''),
('2/7/2016 16:02:08', 'Payodhi', 'Rizvi', '9769960933', '-', '0', '(50/-)(left-50/-)', 'Score', 'Badminton Girls (Single)', '', ''),
('2/7/2016 16:06:46', 'Bhushan Navgire', 'Kc', '7045035626', 'Be-It', '0', '50/-', 'Surge', '', '', 'NFS'),
('2/7/2016 16:35:31', 'Umer Khan', 'Rizvi', '9820594045', '-', '0', '(200/-)(left-100/-)', 'Surge', '', '', 'Neon Cricket'),
('2/7/2016 16:36:53', 'Sadhana Jadhav', 'Vasantdada Patil', '9819503497', '-', '0', '(50/-)(left-50/-)', 'Surge', '', '', 'Masterchef'),
('2/7/2016 17:19:37', 'Rajvee Shah', 'DJ Sanghvi', '9323613514', '-', '0', '(15/-)(left-30/-)', 'Surge', '', '', 'Art and Culture');

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE `results` (
  `Id` int(5) NOT NULL,
  `Class` varchar(10) NOT NULL,
  `Class_sess` varchar(10) NOT NULL,
  `Url` varchar(100) NOT NULL,
  `date_selected` date NOT NULL,
  `Syllabus` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`Id`, `Class`, `Class_sess`, `Url`, `date_selected`, `Syllabus`) VALUES
(5, 'af', 'adsf', '../uploads/media/pdf/Question Bank.pdf', '0000-00-00', 'fsda');

-- --------------------------------------------------------

--
-- Table structure for table `sponsors`
--

CREATE TABLE `sponsors` (
  `SponsorId` int(11) NOT NULL,
  `SponsorName` varchar(50) NOT NULL,
  `URL` varchar(120) NOT NULL,
  `type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sponsors`
--

INSERT INTO `sponsors` (`SponsorId`, `SponsorName`, `URL`, `type`) VALUES
(2, 'Vodafone', 'http://www.vodafone.com', ''),
(3, 'Samsung', 'http://www.samsung.com', '');

-- --------------------------------------------------------

--
-- Table structure for table `updates`
--

CREATE TABLE `updates` (
  `id` int(11) NOT NULL,
  `UpdateTitle` varchar(20) NOT NULL,
  `UpdateDescription` varchar(50) NOT NULL,
  `ImagePath` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `updates`
--

INSERT INTO `updates` (`id`, `UpdateTitle`, `UpdateDescription`, `ImagePath`) VALUES
(2, 'asdfffssadfaf', 'dsfa', '../uploads/updates/index.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Fullname` varchar(30) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `BranchnYear` varchar(20) NOT NULL,
  `College` varchar(40) NOT NULL,
  `Contact` varchar(10) NOT NULL,
  `EventType` varchar(15) NOT NULL,
  `EventRegistered` varchar(30) NOT NULL,
  `ConfirmationStatus` varchar(1) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Fullname`, `Username`, `BranchnYear`, `College`, `Contact`, `EventType`, `EventRegistered`, `ConfirmationStatus`, `id`) VALUES
('Badal Kotak', 'badalkotak', 'SEIT', 'KJSIEIT', '9820003397', 'Event 2', 'Event2 Name 2', 'Y', 20),
('Badal Kotak', 'badalkotak', 'SEIT', 'KJSIEIT', '9820003397', 'Event 3', 'Event3 Name 2', 'Y', 22),
('Badal Kotak', 'badalkotak', 'SEIT', 'KJSIEIT', '9820003397', 'Event 3', 'Event3 Name 3', 'Y', 23),
('Nir J', 'nj@gmail.com', 'SEIT', 'SAKEC', '8877665544', 'Event 1', 'Event1 Name 1', 'N', 24),
('Nir J', 'nj@gmail.com', 'SEIT', 'SAKEC', '8877665544', 'Event 1', 'Event1 Name 2', 'N', 25);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`AdminId`);

--
-- Indexes for table `admission`
--
ALTER TABLE `admission`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `noticeboard`
--
ALTER TABLE `noticeboard`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `results`
--
ALTER TABLE `results`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `sponsors`
--
ALTER TABLE `sponsors`
  ADD PRIMARY KEY (`SponsorId`);

--
-- Indexes for table `updates`
--
ALTER TABLE `updates`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admins`
--
ALTER TABLE `admins`
  MODIFY `AdminId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `admission`
--
ALTER TABLE `admission`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `noticeboard`
--
ALTER TABLE `noticeboard`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `results`
--
ALTER TABLE `results`
  MODIFY `Id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `sponsors`
--
ALTER TABLE `sponsors`
  MODIFY `SponsorId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `updates`
--
ALTER TABLE `updates`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
