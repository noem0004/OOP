-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 21, 2025 lúc 07:59 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `test`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cauhoi`
--

CREATE TABLE `cauhoi` (
  `MC` int(5) NOT NULL,
  `noidungch` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `A` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `B` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `C` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `D` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DapAn` char(10) NOT NULL,
  `loaida` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `cauhoi`
--

INSERT INTO `cauhoi` (`MC`, `noidungch`, `A`, `B`, `C`, `D`, `DapAn`, `loaida`) VALUES
(1, 'ai dẹp trai nhất', 'D', 'H', 'H', 'K', 'A', 1),
(2, 'Trong Java, từ khóa nào dùng để kế thừa lớp?', 'super', 'extends', 'this', 'inherits', 'AB', 2),
(3, 'Phép chia 15 / 4 trong Java (kiểu int) cho kết quả là?', '3.75', '4', '3', 'Lỗi chia kiểu', 'C', 1),
(4, 'Trong SQL, câu lệnh nào dùng để lấy dữ liệu?', 'INSERT', 'SELECT', 'UPDATE', 'DELETE', 'BC', 2),
(5, 'Trong HTML, thẻ nào để chèn hình ảnh?', '<image>', '<img>', '<picture>', '<src>', 'B', 1),
(6, 'Kết quả của 5 + 2 * 3 là?', '21', '11', '13', '10', 'B', 1),
(7, 'Trong lập trình hướng đối tượng, \"Encapsulation\" có nghĩa là gì?', 'Gộp dữ liệu và phương thức lại', 'Chia nhỏ chương trình', 'Kế thừa', 'Đa hình', 'A', 1),
(8, 'Trong MySQL, để xóa bảng dùng lệnh nào?', 'DROP TABLE', 'DELETE TABLE', 'REMOVE TABLE', 'CLEAR TABLE', 'A', 1),
(9, 'Kiểu dữ liệu nào lưu chuỗi ký tự trong Java?', 'int', 'String', 'char', 'float', 'B', 1),
(10, 'Đâu là cú pháp đúng để khai báo mảng trong Java?', 'int[] arr;', 'int arr[];', 'Cả hai đều đúng', 'arr int[];', 'C', 1),
(11, 'Câu lệnh SQL nào dùng để cập nhật dữ liệu?', 'INSERT', 'UPDATE', 'ALTER', 'CHANGE', 'B', 1),
(12, '5 % 2 trong Java cho kết quả là?', '1', '2', '2.5', '0', 'A', 1),
(13, 'Biến static trong Java thuộc về?', 'Đối tượng', 'Lớp', 'Phương thức', 'Biến cục bộ', 'B', 1),
(14, 'Trong SQL, hàm COUNT() dùng để?', 'Đếm số bản ghi', 'Tính tổng', 'Lấy giá trị lớn nhất', 'Lấy giá trị nhỏ nhất', 'A', 1),
(15, 'Kết quả của 2 + 2 * 2 = ?', '6', '8', '4', '2', 'A', 1),
(16, 'Trong MySQL, khóa chính được định nghĩa bằng?', 'PRIMARY KEY', 'FOREIGN KEY', 'UNIQUE KEY', 'IDENTITY', 'A', 1),
(17, 'Phép toán nào có độ ưu tiên cao nhất?', '+', '-', '*', '=', 'C', 1),
(18, 'Kết quả của biểu thức (true && false) || true là?', 'true', 'false', 'error', 'null', 'A', 1),
(19, 'Phần mở rộng của file Java là?', '.jav', '.java', '.class', '.jar', 'B', 1),
(20, 'Phương thức main() trong Java phải có dạng nào?', 'public void main(String args[])', 'static void main(String args[])', 'public static void main(String[] args)', 'void main()', 'C', 1),
(21, 'Trong SQL, để sắp xếp dữ liệu dùng từ khóa nào?', 'GROUP BY', 'ORDER BY', 'SORT', 'ARRANGE', 'B', 1),
(24, 'Thủ đô của Việt Nam là gì?', 'Hà Nội', 'TP. Hồ Chí Minh', 'Đà Nẵng', 'Huế', 'A', 0),
(25, '1 + 1 = ?', '1', '2', '3', '4', 'B', 0),
(26, 'Mặt Trời mọc ở hướng nào?', 'Đông', 'Tây', 'Nam', 'Bắc', 'A', 0),
(27, 'Ai là người phát minh ra bóng đèn?', 'Newton', 'Edison', 'Einstein', 'Tesla', 'B', 0),
(28, 'Quốc gia nào có diện tích lớn nhất thế giới?', 'Trung Quốc', 'Mỹ', 'Nga', 'Canada', 'C', 0),
(29, 'Sông nào dài nhất Việt Nam?', 'Sông Hồng', 'Sông Mê Kông', 'Sông Đồng Nai', 'Sông Thu Bồn', 'B', 0),
(30, 'Năm nhuận có bao nhiêu ngày?', '365', '366', '364', '367', 'B', 0),
(31, 'Hệ điều hành của Microsoft là gì?', 'macOS', 'Linux', 'Windows', 'Android', 'C', 0),
(32, 'Ngôn ngữ lập trình dùng cho web là?', 'HTML', 'Java', 'Python', 'C', 'A', 0),
(33, 'Trái Đất có mấy châu lục?', '5', '6', '7', '8', 'C', 0),
(34, 'Ai là tác giả Truyện Kiều?', 'Nguyễn Du', 'Nguyễn Trãi', 'Hồ Xuân Hương', 'Tố Hữu', 'A', 0),
(35, 'CPU viết tắt của từ gì?', 'Central Processing Unit', 'Computer Personal Unit', 'Control Program Unit', 'Central Personal Unit', 'A', 0),
(36, 'Nước nào có tháp Eiffel?', 'Pháp', 'Anh', 'Ý', 'Đức', 'A', 0),
(37, 'Tác giả của “Nhật ký trong tù”?', 'Hồ Chí Minh', 'Phan Bội Châu', 'Tố Hữu', 'Nguyễn Du', 'A', 0),
(38, 'Tốc độ ánh sáng là khoảng bao nhiêu km/s?', '3000', '30000', '300000', '3000000', 'C', 0),
(39, 'Ai là người đầu tiên đặt chân lên Mặt Trăng?', 'Neil Armstrong', 'Yuri Gagarin', 'Buzz Aldrin', 'Einstein', 'A', 0),
(40, 'Cá heo thuộc nhóm động vật nào?', 'Bò sát', 'Lưỡng cư', 'Có vú', 'Giáp xác', 'C', 0),
(41, 'Từ “CPU” thường nằm ở đâu trong máy tính?', 'Bàn phím', 'Ổ cứng', 'Bo mạch chủ', 'Màn hình', 'C', 0),
(42, 'Hà Nội nằm ở miền nào của Việt Nam?', 'Miền Bắc', 'Miền Trung', 'Miền Nam', 'Miền Tây', 'A', 0),
(43, 'Việt Nam giành độc lập năm nào?', '1940', '1945', '1954', '1975', 'B', 0),
(44, 'HTML dùng để làm gì?', 'Tạo hiệu ứng', 'Thiết kế cấu trúc trang web', 'Chạy chương trình', 'Lưu dữ liệu', 'B', 0),
(45, 'Châu lục nhỏ nhất thế giới là?', 'Châu Á', 'Châu Âu', 'Châu Đại Dương', 'Châu Phi', 'C', 0),
(46, 'Hệ điều hành Android được phát triển bởi công ty nào?', 'Apple', 'Google', 'Microsoft', 'Samsung', 'B', 0),
(47, 'Thủ đô của Việt Nam là gì?', 'Hà Nội', 'TP. Hồ Chí Minh', 'Đà Nẵng', 'Huế', 'A', 1),
(48, 'Kết quả của 2 + 3 là?', '4', '5', '6', '7', 'B', 1),
(49, 'Trái đất quay quanh gì?', 'Mặt Trăng', 'Sao Hỏa', 'Mặt Trời', 'Sao Kim', 'C', 1),
(50, 'Ai là tác giả Truyện Kiều?', 'Nguyễn Du', 'Nguyễn Trãi', 'Tố Hữu', 'Xuân Diệu', 'A', 1),
(51, 'Tháng có 28 hoặc 29 ngày là?', 'Tháng 2', 'Tháng 4', 'Tháng 6', 'Tháng 8', 'A', 1),
(52, 'Nước có công thức hóa học là?', 'CO2', 'H2O', 'NaCl', 'O2', 'B', 1),
(53, 'Số nguyên tố nhỏ nhất là?', '1', '2', '3', '5', 'B', 1),
(54, 'Từ “Hello” nghĩa là gì trong tiếng Việt?', 'Tạm biệt', 'Xin chào', 'Cảm ơn', 'Chúc ngủ ngon', 'B', 1),
(55, 'Ai là người đầu tiên đặt chân lên Mặt Trăng?', 'Yuri Gagarin', 'Neil Armstrong', 'Buzz Aldrin', 'Elon Musk', 'B', 1),
(56, 'Biển Đông giáp với quốc gia nào sau đây?', 'Lào', 'Campuchia', 'Philippines', 'Myanmar', 'C', 1),
(57, 'Các hành tinh trong Hệ Mặt Trời gồm?', 'Trái Đất', 'Sao Hỏa', 'Sao Kim', 'Mặt Trăng', 'ABC', 2),
(58, 'Các ngôn ngữ lập trình phổ biến hiện nay là?', 'Python', 'Java', 'HTML', 'C++', 'ABD', 2),
(59, 'Thiết bị đầu ra của máy tính gồm?', 'Màn hình', 'Bàn phím', 'Chuột', 'Máy in', 'AD', 2),
(60, 'Các bộ phận cơ bản của máy tính gồm?', 'CPU', 'RAM', 'Ổ cứng', 'Màn hình', 'ABCD', 2),
(61, 'Các nước thuộc Đông Nam Á là?', 'Việt Nam', 'Lào', 'Thái Lan', 'Nhật Bản', 'ABC', 2),
(62, 'Những đại dương lớn nhất thế giới là?', 'Thái Bình Dương', 'Đại Tây Dương', 'Ấn Độ Dương', 'Bắc Băng Dương', 'ABCD', 2),
(63, 'Các giác quan của con người gồm?', 'Thị giác', 'Thính giác', 'Vị giác', 'Khứu giác', 'ABCD', 2),
(64, 'Các thao tác cơ bản với tệp tin gồm?', 'Mở', 'Lưu', 'Xóa', 'Đổi tên', 'ABCD', 2),
(65, 'Những thiết bị lưu trữ gồm?', 'USB', 'Ổ cứng', 'RAM', 'CD/DVD', 'ABD', 2),
(66, 'Các hình thức năng lượng gồm?', 'Điện năng', 'Nhiệt năng', 'Quang năng', 'Âm năng', 'ABCD', 2),
(67, 'Kết quả của 10 / 2 là?', '3', '4', '5', '6', 'C', 1),
(68, 'Tác giả bài thơ “Sóng” là?', 'Xuân Quỳnh', 'Nguyễn Du', 'Hàn Mặc Tử', 'Tố Hữu', 'A', 1),
(69, 'Thủ đô của Nhật Bản là?', 'Tokyo', 'Seoul', 'Osaka', 'Kyoto', 'A', 1),
(70, 'Kết quả của 9 * 9 là?', '80', '81', '90', '99', 'B', 1),
(71, 'Sông nào dài nhất Việt Nam?', 'Sông Hồng', 'Sông Mekong', 'Sông Đồng Nai', 'Sông Lam', 'B', 1),
(72, 'Chất nào dẫn điện tốt nhất?', 'Sắt', 'Đồng', 'Nhôm', 'Nhựa', 'B', 1),
(73, 'Ngôn ngữ lập trình dùng để làm web?', 'HTML', 'Python', 'Java', 'C', 'A', 1),
(74, 'Ai là tác giả “Lão Hạc”?', 'Nam Cao', 'Ngô Tất Tố', 'Tô Hoài', 'Nguyễn Công Hoan', 'A', 1),
(75, 'Màu cơ bản của ánh sáng là?', 'Đỏ', 'Lục', 'Lam', 'Đen', 'ABC', 2),
(76, 'Các thành phần của HTML gồm?', 'Thẻ mở', 'Thẻ đóng', 'Nội dung', 'Thuộc tính', 'ABCD', 2),
(77, 'Các phần mềm diệt virus gồm?', 'Avast', 'Kaspersky', 'Norton', 'Paint', 'ABC', 2),
(78, 'Những hệ điều hành phổ biến?', 'Windows', 'Linux', 'macOS', 'Chrome OS', 'ABCD', 2),
(79, 'Các loại bộ nhớ máy tính?', 'RAM', 'ROM', 'Cache', 'Ổ cứng', 'ABCD', 2),
(80, 'Thành phần của không khí gồm?', 'Oxy', 'Nitơ', 'CO2', 'Hiđrô', 'ABC', 2),
(81, 'Ai sáng lập Microsoft?', 'Steve Jobs', 'Bill Gates', 'Mark Zuckerberg', 'Larry Page', 'B', 1),
(82, 'Ai phát minh ra bóng đèn?', 'Thomas Edison', 'Albert Einstein', 'Newton', 'Tesla', 'A', 1),
(83, 'Các loại năng lượng tái tạo?', 'Gió', 'Mặt trời', 'Thủy triều', 'Than đá', 'ABC', 2),
(84, 'Ngôn ngữ lập trình bậc cao đầu tiên?', 'C', 'Fortran', 'Assembly', 'COBOL', 'B', 1),
(85, 'Các loại thiết bị nhập dữ liệu?', 'Bàn phím', 'Chuột', 'Máy quét', 'Màn hình', 'ABC', 2),
(86, 'Các hành tinh gần Mặt Trời nhất?', 'Sao Thủy', 'Sao Kim', 'Trái Đất', 'Sao Hỏa', 'ABC', 2),
(87, 'Thủ đô của Việt Nam là gì?', 'Hà Nội', 'TP. Hồ Chí Minh', 'Đà Nẵng', 'Huế', 'A', 1),
(88, 'Kết quả của 2 + 3 là?', '4', '5', '6', '7', 'B', 1),
(89, 'Trái Đất quay quanh đâu?', 'Mặt Trăng', 'Sao Hỏa', 'Mặt Trời', 'Sao Kim', 'C', 1),
(90, 'Ai là tác giả Truyện Kiều?', 'Nguyễn Du', 'Nguyễn Trãi', 'Tố Hữu', 'Xuân Diệu', 'A', 1),
(91, 'Tháng có 28 hoặc 29 ngày là?', 'Tháng 2', 'Tháng 4', 'Tháng 6', 'Tháng 8', 'A', 1),
(92, 'Công thức hóa học của nước là?', 'CO2', 'H2O', 'NaCl', 'O2', 'B', 1),
(93, 'Số nguyên tố nhỏ nhất là?', '1', '2', '3', '5', 'B', 1),
(94, 'Từ \"Hello\" dịch sang tiếng Việt là?', 'Tạm biệt', 'Xin chào', 'Cảm ơn', 'Chào buổi sáng', 'B', 1),
(95, 'Ai là người đầu tiên đặt chân lên Mặt Trăng?', 'Yuri Gagarin', 'Neil Armstrong', 'Buzz Aldrin', 'Michael Collins', 'B', 1),
(96, 'Biển Đông giáp với quốc gia nào?', 'Lào', 'Campuchia', 'Philippines', 'Myanmar', 'C', 1),
(97, 'Các hành tinh: Trái Đất, Sao Hỏa, Sao Kim, Mặt Trăng (Được phép chọn nhiều, tối đa 4)', 'Trái Đất', 'Sao Hỏa', 'Sao Kim', 'Mặt Trăng', 'ABC', 2),
(98, 'Ngôn ngữ lập trình phổ biến: Python, Java, HTML, C++ (Được phép chọn nhiều, tối đa 4)', 'Python', 'Java', 'HTML', 'C++', 'ABD', 2),
(99, 'Thiết bị đầu ra của máy tính (Được phép chọn nhiều, tối đa 4)', 'Màn hình', 'Bàn phím', 'Chuột', 'Máy in', 'AD', 2),
(100, 'Các bộ phận cơ bản của máy tính (Được phép chọn nhiều, tối đa 4)', 'CPU', 'RAM', 'Ổ cứng', 'Màn hình', 'ABCD', 2),
(101, 'Các nước Đông Nam Á: Việt Nam, Lào, Thái Lan, Nhật Bản (Được phép chọn nhiều, tối đa 4)', 'Việt Nam', 'Lào', 'Thái Lan', 'Nhật Bản', 'ABC', 2),
(102, 'Các đại dương lớn nhất thế giới (Được phép chọn nhiều, tối đa 4)', 'Thái Bình Dương', 'Đại Tây Dương', 'Ấn Độ Dương', 'Bắc Băng Dương', 'ABCD', 2),
(103, 'Các giác quan của con người (Được phép chọn nhiều, tối đa 4)', 'Thị giác', 'Thính giác', 'Vị giác', 'Khứu giác', 'ABCD', 2),
(104, 'Các thao tác cơ bản với tệp tin (Được phép chọn nhiều, tối đa 4)', 'Mở', 'Lưu', 'Xóa', 'Đổi tên', 'ABCD', 2),
(105, 'Thiết bị lưu trữ: USB, Ổ cứng, RAM, CD/DVD (Được phép chọn nhiều, tối đa 4)', 'USB', 'Ổ cứng', 'RAM', 'CD/DVD', 'ABD', 2),
(106, 'Hình thức năng lượng: Điện, Nhiệt, Quang, Âm (Được phép chọn nhiều, tối đa 4)', 'Điện năng', 'Nhiệt năng', 'Quang năng', 'Âm năng', 'ABCD', 2),
(107, 'Kết quả của 10 / 2 là?', '3', '4', '5', '6', 'C', 1),
(108, 'Tác giả bài thơ \"Sóng\" là?', 'Xuân Quỳnh', 'Nguyễn Du', 'Hàn Mặc Tử', 'Tố Hữu', 'A', 1),
(109, 'Thủ đô của Nhật Bản là?', 'Tokyo', 'Seoul', 'Osaka', 'Kyoto', 'A', 1),
(110, 'Kết quả của 9 * 9 là?', '80', '81', '90', '99', 'B', 1),
(111, 'Sông dài nhất Việt Nam là?', 'Sông Hồng', 'Sông Mekong', 'Sông Đồng Nai', 'Sông Cả', 'B', 1),
(112, 'Chất dẫn điện tốt nhất trong lựa chọn là?', 'Sắt', 'Đồng', 'Nhôm', 'Nhựa', 'B', 1),
(113, 'Ngôn ngữ dùng để làm web (đơn giản) là?', 'HTML', 'Python', 'Java', 'C', 'A', 1),
(114, 'Ai là tác giả \"Lão Hạc\"?', 'Nam Cao', 'Ngô Tất Tố', 'Tô Hoài', 'Nguyễn Công Hoan', 'A', 1),
(115, 'Màu cơ bản của ánh sáng (Được phép chọn nhiều, tối đa 4)', 'Đỏ', 'Lục', 'Lam', 'Đen', 'ABC', 2),
(116, 'Các thành phần cơ bản của HTML (Được phép chọn nhiều, tối đa 4)', 'Thẻ mở', 'Thẻ đóng', 'Nội dung', 'Thuộc tính', 'ABCD', 2),
(117, 'Các phần mềm diệt virus (Được phép chọn nhiều, tối đa 4)', 'Avast', 'Kaspersky', 'Norton', 'Paint', 'ABC', 2),
(118, 'Hệ điều hành phổ biến (Được phép chọn nhiều, tối đa 4)', 'Windows', 'Linux', 'macOS', 'Chrome OS', 'ABCD', 2),
(119, 'Các loại bộ nhớ máy tính (Được phép chọn nhiều, tối đa 4)', 'RAM', 'ROM', 'Cache', 'Ổ cứng', 'ABCD', 2),
(120, 'Thành phần chính của không khí (Được phép chọn nhiều, tối đa 4)', 'Oxy', 'Nitơ', 'CO2', 'Hiđrô', 'ABC', 2),
(121, 'Ai sáng lập Microsoft?', 'Steve Jobs', 'Bill Gates', 'Mark Zuckerberg', 'Larry Page', 'B', 1),
(122, 'Ai phát minh bóng đèn?', 'Thomas Edison', 'Albert Einstein', 'Isaac Newton', 'Nikola Tesla', 'A', 1),
(123, 'Các dạng năng lượng tái tạo (Được phép chọn nhiều, tối đa 4)', 'Gió', 'Mặt trời', 'Thủy triều', 'Than đá', 'ABC', 2),
(124, 'Ngôn ngữ lập trình bậc cao đầu tiên là?', 'C', 'Fortran', 'Assembly', 'COBOL', 'B', 1),
(125, 'Thiết bị nhập dữ liệu (Được phép chọn nhiều, tối đa 4)', 'Bàn phím', 'Chuột', 'Máy quét', 'Màn hình', 'ABC', 2),
(126, 'Hành tinh gần Mặt Trời nhất (Được phép chọn nhiều, tối đa 4)', 'Sao Thủy', 'Sao Kim', 'Trái Đất', 'Sao Hỏa', 'AB', 2),
(127, 'Trong văn học, tác phẩm \"Chí Phèo\" của ai?', 'Nam Cao', 'Nguyễn Du', 'Ngô Tất Tố', 'Tô Hoài', 'A', 1),
(128, 'Đơn vị đo cường độ dòng điện là?', 'Volt', 'Ohm', 'Ampere', 'Watt', 'C', 1),
(129, 'Công thức tính diện tích hình vuông?', 'a + a', 'a * a', '2a', 'a^2 / 2', 'B', 1),
(130, 'Phương trình bậc nhất có dạng?', 'ax + b = 0', 'ax^2 + bx + c = 0', 'a/x + b = 0', 'ax^3 + b = 0', 'A', 1),
(131, 'Trong tiếng Anh, \"book\" nghĩa là?', 'Sách', 'Bàn', 'Cửa', 'Ghế', 'A', 1),
(132, 'Từ \"run\" trong tiếng Anh thường là?', 'Đọc', 'Chạy', 'Ngủ', 'Ăn', 'B', 1),
(133, 'Chất nào là axit trong chọn lựa?', 'NaOH', 'HCl', 'KOH', 'Ca(OH)2', 'B', 1),
(134, 'Nhiệt độ sôi của nước ở 1 atm là?', '0°C', '50°C', '100°C', '212°C', 'C', 1),
(135, 'Lịch sử: Việt Nam giành độc lập vào năm nào?', '1945', '1954', '1975', '1930', 'A', 1),
(136, 'Địa lý: Dãy núi cao nhất Việt Nam là?', 'Hoàng Liên Sơn', 'Trường Sơn', 'Dãy Bạch Mã', 'Ngân Sơn', 'A', 1),
(137, 'Tin học: Ký hiệu mở thư mục thường là?', 'Ctrl+S', 'Ctrl+O', 'Ctrl+N', 'Ctrl+P', 'B', 1),
(138, 'Hóa học: Phân tử NaCl gồm nguyên tố nào?', 'Natri và Clo', 'Natri và Oxy', 'Clo và Hiđrô', 'Nito và Clo', 'A', 1),
(139, 'Sinh học: Tế bào là đơn vị cơ bản của?', 'Cơ thể', 'Tế bào', 'Mô', 'Cá thể', 'A', 1),
(140, 'Vật lý: Đơn vị đo khối lượng là?', 'Newton', 'Kg', 'Watt', 'Joule', 'B', 1),
(141, 'Ngữ văn: Thể thơ lục bát có số tiếng mỗi câu?', '6-8', '8-6', '7-7', '6-6', 'A', 1),
(142, 'Toán: Số nguyên tố giữa 10 và 20 là?', '11', '12', '13', '14', 'AC', 2),
(143, 'Anh văn: \"How are you?\" thường trả lời bằng?', 'I am fine', 'Thank you', 'Goodbye', 'See you', 'A', 1),
(144, 'Công nghệ: Thiết bị để in tài liệu là?', 'Máy quét', 'Máy in', 'Máy ảnh', 'Loa', 'B', 1),
(145, 'Tin học: HTML là viết tắt của?', 'Hyper Text Markup Language', 'High Text Machine Language', 'Hyperlink and Text Markup Lang', 'Hyper Transfer Markup Language', 'A', 1),
(146, 'Sinh học: Phân loại cơ bản của động vật gồm?', 'Sâu bọ', 'Bò sát', 'Chân đốt', 'Động vật có xương sống (Được phép chọn nhiều, tối đa 4)', 'A,B,C,D', 2),
(147, 'Vật lý: Đơn vị đo điện trở là?', 'Ampere', 'Volt', 'Ohm', 'Watt', 'C', 1),
(148, 'Hóa học: Phương trình phản ứng cháy cơ bản là?', 'C + O2 -> CO2', 'H2 + O2 -> H2O', 'CH4 + 2O2 -> CO2 + 2H2O', 'Cả A và C', 'D', 1),
(149, 'Toán: Góc vuông có độ lớn?', '30°', '45°', '90°', '180°', 'C', 1),
(150, 'Lịch sử: Chiến tranh thế giới thứ hai kết thúc năm?', '1918', '1939', '1945', '1950', 'C', 1),
(151, 'Địa lý: Quốc gia có diện tích lớn nhất thế giới?', 'Mỹ', 'Trung Quốc', 'Canada', 'Nga', 'D', 1),
(152, 'Văn học: Tác giả \"Đất Rừng Phương Nam\" là?', 'Nguyễn Nhật Ánh', 'Đoàn Giỏi', 'Nguyễn Thi', 'Bùi Chí Vinh', 'B', 1),
(153, 'Anh: Từ \"teacher\" nghĩa là?', 'Học sinh', 'Giáo viên', 'Người bán hàng', 'Người lái xe', 'B', 1),
(154, 'Toán: 15% của 200 là?', '15', '20', '30', '40', 'C', 1),
(155, 'Hóa học: Chất nào là bazơ?', 'HCl', 'NaOH', 'CO2', 'H2O', 'B', 1),
(156, 'Sinh: Quá trình quang hợp xảy ra ở phần nào của thực vật?', 'Rễ', 'Thân', 'Lá', 'Hoa', 'C', 1),
(157, 'Tin học: Các loại dữ liệu cơ bản trong lập trình (Được phép chọn nhiều, tối đa 4)', 'Integer', 'Float', 'String', 'Boolean', 'ABCD', 2),
(158, 'Vật lý: Ánh sáng trong chân không truyền với tốc độ?', '3x10^8 m/s', '3x10^6 m/s', '3x10^5 m/s', '3x10^7 m/s', 'A', 1),
(159, 'Địa lý: Thủ đô của Pháp là?', 'Lyon', 'Marseille', 'Paris', 'Nice', 'C', 1),
(160, 'Lịch sử: Cách mạng Tháng Tám năm nào?', '1917', '1945', '1954', '1975', 'B', 1),
(161, 'Văn: \"Nỗi buồn chiến tranh\" là tác giả?', 'Bảo Ninh', 'Nguyễn Tuân', 'Thanh Tịnh', 'Thạch Lam', 'A', 1),
(162, 'Toán: Tổng góc trong tam giác bằng?', '180°', '360°', '90°', '270°', 'A', 1),
(163, 'Hóa: Phương án chứa muối là?', 'H2O', 'NaCl', 'O2', 'CO2', 'B', 1),
(164, 'Sinh: ADN mang thông tin ở dạng?', 'Lipid', 'Protein', 'Axit nucleic', 'Carbohydrate', 'C', 1),
(165, 'Anh: \"Good morning\" dùng vào thời gian?', 'Buổi tối', 'Buổi trưa', 'Buổi sáng', 'Buổi chiều', 'C', 1),
(166, 'Công nghệ: Thiết bị để sao lưu dữ liệu thường là?', 'USB', 'Ổ cứng ngoài', 'Đám mây', 'Tất cả các đáp án trên', 'D', 1),
(167, 'Toán: Số chẵn tiếp theo sau 14 là?', '15', '16', '17', '18', 'B', 1),
(168, 'Vật lý: Lực hấp dẫn giữa hai khối lượng luôn?', 'Hấp dẫn', 'Đẩy', 'Không tác dụng', 'Phụ thuộc', 'A', 1),
(169, 'Hóa: Phân tử glucose có công thức?', 'C6H12O6', 'C12H22O11', 'CH4', 'C2H5OH', 'A', 1),
(170, 'Sinh: Hệ tuần hoàn của người có thành phần chính?', 'Máu', 'Huyết quản', 'Tim', 'Tất cả', 'D', 1),
(171, 'Địa: Dãy Alps nằm ở châu nào?', 'Châu Á', 'Châu Âu', 'Châu Mỹ', 'Châu Phi', 'B', 1),
(172, 'Lịch sử: Ai là lãnh tụ của cách mạng tháng Mười Nga?', 'Lenin', 'Stalin', 'Trotsky', 'Kerensky', 'A', 1),
(173, 'Tin học: Phần mềm soạn thảo văn bản phổ biến là?', 'Microsoft Word', 'Photoshop', 'Excel', 'PowerPoint', 'A', 1),
(174, 'Văn: Thể loại \"thơ thất ngôn\" có bao nhiêu chữ?', '7 chữ', '6 chữ', '8 chữ', '9 chữ', 'A', 1),
(175, 'Anh: \"Thank you\" tương đương với?', 'Xin lỗi', 'Cảm ơn', 'Tạm biệt', 'Xin chào', 'B', 1),
(176, 'Công nghệ: IoT viết tắt của?', 'Internet of Things', 'Internet of Technology', 'Internal of Things', 'Info on Tech', 'A', 1),
(177, 'Kết quả của 15 + 28 là?', '43', '42', '44', '41', 'A', 1),
(178, 'Giá trị của √81 là?', '8', '9', '7', '10', 'B', 1),
(179, 'Phân số nào bằng 1/2?', '2/4', '3/6', '4/8', 'Cả A và B', 'ABC', 2),
(180, 'Đạo hàm của x² là?', '2x', 'x', 'x²', '2', 'A', 1),
(181, 'Tích của (-3) × (-5) là?', '-15', '15', '8', '-8', 'B', 1),
(182, 'Số nào là số nguyên tố?', '4', '6', '7', '9', 'C', 1),
(183, 'Diện tích hình tròn có bán kính r là?', 'πr²', '2πr', 'r²π/2', 'π/2r', 'A', 1),
(184, 'Một tam giác có các cạnh bằng nhau gọi là?', 'Cân', 'Đều', 'Vuông', 'Tù', 'B', 1),
(185, 'Giá trị của (2³ × 2²) là?', '2⁵', '2⁶', '2¹⁰', '2⁴', 'A', 1),
(186, 'Các số chia hết cho 5 là?', '10', '25', '30', 'Cả A, B, C', 'ABCD', 2),
(187, 'Vận tốc có đơn vị là?', 'm/s', 'N', 'kg', 'm', 'A', 1),
(188, 'Nguồn sáng là vật?', 'Tự phát sáng', 'Phản xạ ánh sáng', 'Không phát sáng', 'Trong suốt', 'A', 1),
(189, 'Các dạng năng lượng gồm?', 'Cơ năng', 'Điện năng', 'Hóa năng', 'Cả A, B, C', 'ABCD', 2),
(190, 'Tác dụng của dòng điện gồm?', 'Từ', 'Nhiệt', 'Hóa học', 'Cả ba tác dụng', 'ABCD', 2),
(191, 'Đơn vị điện trở là?', 'V', 'Ω', 'A', 'J', 'B', 1),
(192, 'Cường độ dòng điện ký hiệu là?', 'I', 'U', 'R', 'P', 'A', 1),
(193, 'Âm thanh truyền trong?', 'Chất rắn', 'Chất lỏng', 'Chất khí', 'Cả ba môi trường', 'ABCD', 2),
(194, 'Tốc độ ánh sáng là khoảng?', '3×10⁸ m/s', '3×10⁶ m/s', '3×10⁵ m/s', '1×10⁸ m/s', 'A', 1),
(195, 'Khi vật rơi tự do, vận tốc?', 'Tăng dần', 'Giảm dần', 'Không đổi', 'Bằng 0', 'A', 1),
(196, 'Áp suất được tính bằng công thức?', 'F/S', 'S/F', 'm×a', 'P×V', 'A', 1),
(197, 'Nguyên tử gồm?', 'Electron', 'Proton', 'Neutron', 'Cả A, B, C', 'ABCD', 2),
(198, 'Công thức hóa học của nước là?', 'H₂O', 'CO₂', 'NaCl', 'O₂', 'A', 1),
(199, 'Nguyên tố kim loại là?', 'Na', 'Fe', 'O', 'N', 'AB', 2),
(200, 'Hợp chất là gì?', 'Chất tạo từ hai hay nhiều nguyên tố', 'Chất nguyên chất', 'Hỗn hợp', 'Dung dịch', 'A', 1),
(201, 'Khi đốt cháy C trong O₂ thu được?', 'CO₂', 'CO', 'C₂O', 'C₂O₃', 'A', 1),
(202, 'Dung dịch axit làm quỳ tím?', 'Hóa đỏ', 'Hóa xanh', 'Không đổi', 'Vàng', 'A', 1),
(203, 'Kim loại dẫn điện tốt nhất là?', 'Đồng', 'Sắt', 'Nhôm', 'Vàng', 'A', 1),
(204, 'Phản ứng hóa hợp là?', 'Hai chất → một chất', 'Một chất → hai chất', 'Trao đổi', 'Phân hủy', 'A', 1),
(205, 'Các chất oxit là?', 'CO₂', 'SO₂', 'Na₂O', 'Cả A, B, C', 'ABCD', 2),
(206, 'Nguyên tố có hóa trị thay đổi là?', 'Fe', 'Cu', 'Hg', 'Cả A, B, C', 'ABCD', 2),
(207, 'Đơn vị cơ bản của sự sống là?', 'Tế bào', 'Cơ quan', 'Cơ thể', 'Hệ cơ quan', 'A', 1),
(208, 'Cây xanh hấp thụ khí nào để quang hợp?', 'CO₂', 'O₂', 'N₂', 'H₂', 'A', 1),
(209, 'Các cơ quan hô hấp gồm?', 'Phổi', 'Khí quản', 'Mũi', 'Cả ba', 'ABCD', 2),
(210, 'Nhóm máu của người gồm?', 'A', 'B', 'AB', 'O', 'ABCD', 2),
(211, 'Động vật có vú sinh con bằng?', 'Trứng', 'Sinh con', 'Phân đôi', 'Nảy chồi', 'B', 1),
(212, 'Cơ quan tiêu hóa ở người là?', 'Dạ dày', 'Ruột non', 'Ruột già', 'Cả A, B, C', 'ABCD', 2),
(213, 'Thực vật hấp thụ nước qua?', 'Rễ', 'Thân', 'Lá', 'Hoa', 'A', 1),
(214, 'Quá trình hô hấp tạo ra?', 'CO₂', 'O₂', 'H₂O', 'Cả A và C', 'AC', 2),
(215, 'Hệ tuần hoàn vận chuyển?', 'Máu', 'Chất dinh dưỡng', 'Oxy', 'Cả ba', 'ABCD', 2),
(216, 'Cấu tạo của ADN gồm?', 'Adenin', 'Thymin', 'Guanin', 'Xitôzin', 'ABCD', 2),
(217, 'Tác phẩm “Chí Phèo” do ai sáng tác?', 'Nam Cao', 'Ngô Tất Tố', 'Nguyễn Du', 'Tố Hữu', 'A', 1),
(218, 'Tác giả “Hai đứa trẻ” là?', 'Nguyễn Minh Châu', 'Thạch Lam', 'Tô Hoài', 'Nam Cao', 'B', 1),
(219, 'Thể thơ lục bát có?', '6 chữ và 8 chữ', '7 chữ và 8 chữ', '5 chữ và 7 chữ', '8 chữ và 8 chữ', 'A', 1),
(220, 'Nhân vật chính trong “Lão Hạc” là?', 'Ông giáo', 'Lão Hạc', 'Cậu Vàng', 'Vợ ông giáo', 'B', 1),
(221, '“Truyện Kiều” có bao nhiêu câu?', '2540', '3254', '3258', '3250', 'C', 1),
(222, 'Biện pháp tu từ là?', 'So sánh', 'Ẩn dụ', 'Hoán dụ', 'Cả ba', 'ABCD', 2),
(223, 'Tác phẩm “Vội vàng” thuộc thể loại?', 'Thơ trữ tình', 'Thơ tự sự', 'Văn xuôi', 'Kịch', 'A', 1),
(224, 'Nhân vật Tnú thuộc tác phẩm?', 'Rừng xà nu', 'Đất rừng phương Nam', 'Chiếc lược ngà', 'Người lái đò sông Đà', 'A', 1),
(225, 'Các yếu tố miêu tả trong văn bản tự sự?', 'Người', 'Vật', 'Cảnh', 'Cả ba', 'ABCD', 2),
(226, 'Tác giả “Tây Tiến” là?', 'Quang Dũng', 'Tố Hữu', 'Huy Cận', 'Xuân Diệu', 'A', 1),
(227, 'Bộ nhớ trong của máy tính là?', 'RAM', 'ROM', 'Cache', 'Cả ba', 'ABCD', 2),
(228, 'Ngôn ngữ lập trình hướng đối tượng?', 'Java', 'Python', 'C++', 'Cả A, B, C', 'ABCD', 2),
(229, 'Đơn vị lưu trữ dữ liệu là?', 'Bit', 'Byte', 'MB', 'GB', 'ABCD', 2),
(230, 'Hệ điều hành nào phổ biến?', 'Windows', 'Linux', 'macOS', 'Cả ba', 'ABCD', 2),
(231, 'Trình duyệt web là?', 'Chrome', 'Edge', 'Firefox', 'Cả ba', 'ABCD', 2),
(232, 'Phần cứng máy tính gồm?', 'CPU', 'RAM', 'Ổ cứng', 'Cả ba', 'ABCD', 2),
(233, 'Tập tin có đuôi .docx là của?', 'Word', 'Excel', 'PowerPoint', 'Access', 'A', 1),
(234, 'Shortcut Ctrl+C dùng để?', 'Copy', 'Paste', 'Cut', 'Undo', 'A', 1),
(235, 'Shortcut Ctrl+V dùng để?', 'Paste', 'Copy', 'Cut', 'Save', 'A', 1),
(236, 'Shortcut Ctrl+Z dùng để?', 'Undo', 'Redo', 'Save', 'Select all', 'A', 1),
(237, 'Thủ đô của Pháp là?', 'Paris', 'London', 'Berlin', 'Rome', 'A', 1),
(238, 'Châu lục có diện tích lớn nhất?', 'Châu Phi', 'Châu Á', 'Châu Âu', 'Châu Mỹ', 'B', 1),
(239, 'Các nước thuộc ASEAN gồm?', 'Việt Nam', 'Lào', 'Thái Lan', 'Cả ba', 'ABCD', 2),
(240, 'Sông dài nhất thế giới là?', 'Amazon', 'Nile', 'Mekong', 'Yangtze', 'B', 1),
(241, 'Việt Nam nằm ở châu lục nào?', 'Châu Á', 'Châu Âu', 'Châu Phi', 'Châu Mỹ', 'A', 1),
(242, 'Cuộc kháng chiến chống Mỹ kết thúc năm?', '1973', '1975', '1978', '1980', 'B', 1),
(243, 'Chủ tịch Hồ Chí Minh sinh năm?', '1890', '1900', '1920', '1889', 'A', 1),
(244, 'Chiến thắng Điện Biên Phủ năm?', '1953', '1954', '1955', '1956', 'B', 1),
(245, 'Cột mốc 2/9/1945 là?', 'Quốc khánh VN', 'Chiến thắng Điện Biên', 'Thành lập ĐCSVN', 'Giải phóng miền Nam', 'A', 1),
(246, 'Biển Đông giáp nước nào?', 'Philippines', 'Campuchia', 'Malaysia', 'Cả ba', 'ABCD', 2),
(247, 'Trong Java, phương thức main có dạng nào đúng?', 'public static void main(String[] args)', 'static public void main()', 'void main()', 'main()', 'A', 1),
(248, 'Kiểu dữ liệu nào sau đây không phải kiểu nguyên thủy trong Java?', 'int', 'float', 'String', 'boolean', 'C', 1),
(249, 'Từ khóa dùng để kế thừa lớp trong Java là?', 'this', 'extends', 'super', 'import', 'B', 1),
(250, 'Từ khóa nào dùng để tạo đối tượng trong Java?', 'object', 'create', 'new', 'class', 'C', 1),
(251, 'Tập tin bytecode Java có phần mở rộng là?', '.java', '.jav', '.class', '.exe', 'C', 1),
(252, 'Gói chuẩn chứa các lớp cơ bản của Java là?', 'java.lang', 'java.io', 'java.util', 'java.core', 'A', 1),
(253, 'Interface trong Java được khai báo bằng từ khóa?', 'class', 'implements', 'interface', 'extends', 'C', 1),
(254, 'Phương thức nào dùng để đọc chuỗi nhập từ bàn phím?', 'System.out()', 'Scanner.nextLine()', 'input()', 'System.in()', 'B', 1),
(255, 'Từ khóa nào ngăn kế thừa trong Java?', 'static', 'private', 'final', 'super', 'C', 1),
(256, 'Biến static thuộc về?', 'Đối tượng', 'Lớp', 'Phương thức', 'Gói', 'B', 1),
(257, 'Câu lệnh nào dùng để xử lý ngoại lệ trong Java?', 'try-catch', 'throw-catch', 'error-handler', 'if-catch', 'A', 1),
(258, 'Đa hình (polymorphism) là gì?', 'Nhiều hàm cùng tên khác tham số', 'Kế thừa lớp cha', 'Ẩn phương thức', 'Ghi đè biến', 'A', 1),
(259, 'Từ khóa super dùng để?', 'Truy cập lớp cha', 'Truy cập biến static', 'Tạo đối tượng', 'Gọi phương thức cùng lớp', 'A', 1),
(260, 'Java hỗ trợ lập trình?', 'Hướng đối tượng', 'Hướng cấu trúc', 'Hàm thuần túy', 'Tất cả đúng', 'A', 1),
(261, 'Constructor là gì?', 'Phương thức đặc biệt khởi tạo đối tượng', 'Một lớp con', 'Một interface', 'Một phương thức static', 'A', 1),
(262, 'Overloading là?', 'Ghi đè cùng tên khác tham số', 'Ghi đè cùng tên cùng tham số', 'Kế thừa lớp', 'Ẩn lớp cha', 'A', 1),
(263, 'Overriding là?', 'Ghi đè phương thức cùng tên cùng tham số ở lớp con', 'Tạo biến cùng tên', 'Ghi đè constructor', 'Ghi đè package', 'A', 1),
(264, 'Java có hỗ trợ multiple inheritance qua?', 'Lớp', 'Interface', 'Package', 'Không hỗ trợ', 'B', 1),
(265, 'Kiểu dữ liệu cho ký tự trong Java là?', 'char', 'string', 'character', 'text', 'A', 1),
(266, 'Phương thức equals() dùng để?', 'So sánh nội dung chuỗi', 'So sánh tham chiếu', 'So sánh đối tượng', 'Gộp chuỗi', 'A', 1),
(267, 'Tập tin mã nguồn C++ có phần mở rộng là?', '.cpp', '.cc', '.cxx', 'Cả ba', 'ABCD', 2),
(268, 'Thư viện chuẩn nhập/xuất trong C++ là?', '<stdio.h>', '<iostream>', '<conio.h>', '<stdlib.h>', 'B', 1),
(269, 'Câu lệnh xuất ra màn hình trong C++ là?', 'cout', 'printf', 'cin', 'display', 'A', 1),
(270, 'Toán tử nạp chồng là?', 'operator', 'reload', 'override', 'extend', 'A', 1),
(271, 'Từ khóa nào dùng để kế thừa?', 'super', 'inherits', 'extends', 'public', 'D', 1),
(272, 'Hàm khởi tạo có tên?', 'Giống tên lớp', 'Tùy ý', 'Khác tên lớp', 'Không có tên', 'A', 1),
(273, 'Từ khóa delete dùng để?', 'Cấp phát bộ nhớ', 'Giải phóng bộ nhớ', 'Khai báo biến', 'Tạo mảng', 'B', 1),
(274, 'C++ hỗ trợ lập trình hướng đối tượng?', 'Có', 'Không', 'Một phần', 'Tùy compiler', 'A', 1),
(275, 'Toán tử con trỏ là?', '*', '&', '->', 'Cả A và C', 'AC', 2),
(276, 'Câu lệnh kết thúc chương trình là?', 'return 0;', 'exit();', 'stop();', 'break;', 'A', 1),
(277, 'Từ khóa nào để định nghĩa hằng?', 'const', 'let', 'define', 'final', 'A', 1),
(278, 'Hàm main có thể trả về?', 'int', 'void', 'float', 'Bất kỳ kiểu nào', 'A', 1),
(279, 'Namespace được dùng để?', 'Tránh trùng tên', 'Gom nhóm hàm', 'Ẩn biến', 'Tạo class', 'A', 1),
(280, 'Câu lệnh include dùng để?', 'Gọi hàm', 'Chèn file header', 'Tạo class', 'Nhập dữ liệu', 'B', 1),
(281, 'Phép gán con trỏ dùng toán tử?', '=', '*', '->', '&', 'A', 1),
(282, 'Câu lệnh cấp phát động?', 'new', 'malloc', 'alloc', 'create', 'A', 1),
(283, 'Destructor được gọi khi?', 'Kết thúc chương trình', 'Đối tượng bị hủy', 'Chạy constructor', 'Biến toàn cục tạo ra', 'B', 1),
(284, 'Từ khóa this dùng để?', 'Tham chiếu đối tượng hiện tại', 'Tạo đối tượng', 'Gọi hàm static', 'Kế thừa lớp', 'A', 1),
(285, 'Toán tử nạp chồng không thể áp dụng cho?', '=', '::', '+', '[]', 'B', 1),
(286, 'Virtual function dùng để?', 'Đa hình động', 'Ẩn hàm', 'Tạo đối tượng', 'Nạp chồng', 'A', 1),
(287, 'JavaScript được chạy chủ yếu ở?', 'Trình duyệt', 'Server', 'Database', 'Compiler', 'A', 1),
(288, 'Từ khóa khai báo biến trong JS?', 'int', 'var/let/const', 'define', 'declare', 'B', 1),
(289, 'Kiểu dữ liệu trong JS gồm?', 'Number', 'String', 'Boolean', 'Cả ba', 'ABCD', 2),
(290, 'Toán tử nối chuỗi là?', '+', '.', '&', 'concat', 'A', 1),
(291, 'Hàm alert() dùng để?', 'Hiển thị hộp thoại', 'Ghi console', 'Nhập dữ liệu', 'Tạo biến', 'A', 1),
(292, 'Phương thức getElementById() thuộc?', 'document', 'window', 'console', 'alert', 'A', 1),
(293, 'Từ khóa this trong JS trỏ đến?', 'Đối tượng hiện tại', 'Cửa sổ trình duyệt', 'Class', 'DOM', 'A', 1),
(294, 'JS là ngôn ngữ?', 'Thông dịch', 'Biên dịch', 'Cả hai', 'Không xác định', 'A', 1),
(295, 'Câu lệnh điều kiện trong JS?', 'if-else', 'switch', 'for', 'Cả A và B', 'AB', 2),
(296, 'Phương thức JSON.parse() dùng để?', 'Chuyển chuỗi thành object', 'Object thành chuỗi', 'Gộp object', 'Lặp qua object', 'A', 1),
(297, 'HTML viết tắt của?', 'Hyper Text Markup Language', 'High Text Machine Language', 'Hyperlinks Text Makeup Language', 'None', 'A', 1),
(298, 'Thẻ để xuống dòng trong HTML là?', '<br>', '<p>', '<hr>', '<nl>', 'A', 1),
(299, 'Thẻ <a> dùng để?', 'Tạo liên kết', 'Chèn ảnh', 'Tạo bảng', 'Định dạng văn bản', 'A', 1),
(300, 'Thẻ <img> có thuộc tính bắt buộc?', 'src', 'alt', 'title', 'href', 'A', 1),
(301, 'Thẻ <table> dùng để?', 'Tạo bảng', 'Tạo danh sách', 'Tạo đoạn văn', 'Tạo form', 'A', 1),
(302, 'HTML có phải là ngôn ngữ lập trình?', 'Không', 'Có', 'Một phần', 'Tùy', 'A', 1),
(303, 'Thẻ <h1> đến <h6> dùng để?', 'Tiêu đề', 'Đoạn văn', 'Liên kết', 'Chèn ảnh', 'A', 1),
(304, 'Thuộc tính style dùng để?', 'Định dạng CSS nội tuyến', 'Chèn JS', 'Tạo bảng', 'Thêm thẻ meta', 'A', 1),
(305, 'Thẻ <form> dùng để?', 'Tạo biểu mẫu nhập liệu', 'Tạo ảnh', 'Liên kết', 'Đoạn văn', 'A', 1),
(306, 'Thuộc tính placeholder thuộc thẻ?', '<input>', '<label>', '<button>', '<p>', 'A', 1),
(307, 'CPU viết tắt của?', 'Central Processing Unit', 'Computer Power Unit', 'Control Process Utility', 'Core Processing Unit', 'A', 1),
(308, 'RAM là?', 'Bộ nhớ tạm', 'Bộ nhớ ngoài', 'Ổ đĩa cứng', 'ROM', 'A', 1),
(309, 'Thiết bị nào là bộ nhớ ngoài?', 'HDD', 'SSD', 'USB', 'Cả ba', 'ABCD', 2),
(310, 'BIOS dùng để?', 'Khởi động hệ thống', 'Quản lý RAM', 'Cài đặt hệ điều hành', 'Hiển thị hình ảnh', 'A', 1),
(311, 'GPU có chức năng?', 'Xử lý đồ họa', 'Tính toán CPU', 'Lưu trữ dữ liệu', 'Kết nối mạng', 'A', 1),
(312, 'Thiết bị nhập dữ liệu gồm?', 'Bàn phím', 'Chuột', 'Máy quét', 'Cả ba', 'ABCD', 2),
(313, 'Thiết bị xuất dữ liệu gồm?', 'Màn hình', 'Loa', 'Máy in', 'Cả ba', 'ABCD', 2),
(314, 'Đơn vị tốc độ CPU là?', 'Hz', 'Byte', 'Bit', 'Pixel', 'A', 1),
(315, 'Bo mạch chủ còn gọi là?', 'Mainboard', 'CPU', 'RAM', 'PSU', 'A', 1),
(316, 'ROM dùng để?', 'Lưu firmware', 'Lưu dữ liệu tạm', 'Tăng tốc GPU', 'Giải mã CPU', 'A', 1),
(317, 'IP là viết tắt của?', 'Internet Protocol', 'Interconnect Program', 'Integrated Path', 'Internal Port', 'A', 1),
(318, 'Địa chỉ IPv4 có bao nhiêu bit?', '32', '64', '16', '8', 'A', 1),
(319, 'Giao thức truyền email là?', 'SMTP', 'HTTP', 'FTP', 'DNS', 'A', 1),
(320, 'Giao thức web là?', 'HTTP', 'FTP', 'SNMP', 'SSH', 'A', 1),
(321, 'Thiết bị định tuyến là?', 'Router', 'Switch', 'Hub', 'Modem', 'A', 1),
(322, 'Thiết bị kết nối nhiều máy tính trong LAN?', 'Switch', 'Hub', 'Router', 'Cả A và B', 'AB', 2),
(323, 'Cổng mặc định HTTP là?', '80', '21', '25', '110', 'A', 1),
(324, 'Địa chỉ MAC thuộc lớp nào?', 'Liên kết dữ liệu', 'Mạng', 'Vận chuyển', 'Ứng dụng', 'A', 1),
(325, 'Ping dùng để?', 'Kiểm tra kết nối mạng', 'Mở cổng', 'Gửi file', 'Đóng kết nối', 'A', 1),
(326, 'DNS có chức năng?', 'Phân giải tên miền', 'Mã hóa dữ liệu', 'Định tuyến', 'Gửi email', 'A', 1),
(327, 'Điện trở có đơn vị là?', 'Ohm', 'Volt', 'Ampere', 'Watt', 'A', 1),
(328, 'Tụ điện có tác dụng?', 'Tích trữ điện tích', 'Tạo dòng điện', 'Biến đổi điện áp', 'Truyền tín hiệu', 'A', 1),
(329, 'Diode cho dòng điện đi?', 'Một chiều', 'Hai chiều', 'Không chiều nào', 'Tùy nhiệt độ', 'A', 1),
(330, 'Transistor dùng để?', 'Khuếch đại', 'Chỉnh lưu', 'Phát sóng', 'Giảm áp', 'A', 1),
(331, 'Đơn vị đo công suất là?', 'Watt', 'Volt', 'Ohm', 'Ampere', 'A', 1),
(332, 'Điện áp được ký hiệu là?', 'U hoặc V', 'I', 'P', 'R', 'A', 1),
(333, 'Dòng điện xoay chiều viết tắt?', 'AC', 'DC', 'CA', 'CD', 'A', 1),
(334, 'Cầu chì dùng để?', 'Bảo vệ mạch điện', 'Tạo điện áp', 'Chuyển mạch', 'Lọc tín hiệu', 'A', 1),
(335, 'IC là viết tắt của?', 'Integrated Circuit', 'Internal Component', 'Input Control', 'Interface Chip', 'A', 1),
(336, 'Mạch in còn gọi là?', 'PCB', 'CPU', 'PSU', 'VGA', 'A', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ctdt`
--

CREATE TABLE `ctdt` (
  `IDCau` int(3) NOT NULL,
  `MC` int(5) NOT NULL,
  `MD` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `ctdt`
--

INSERT INTO `ctdt` (`IDCau`, `MC`, `MD`) VALUES
(5886, 1, 1),
(5887, 1, 1),
(5888, 1, 1),
(5889, 1, 1),
(5890, 1, 1),
(5891, 1, 1),
(5892, 1, 1),
(5893, 1, 1),
(5894, 1, 1),
(5895, 1, 1),
(5896, 1, 1),
(5897, 1, 1),
(5898, 1, 1),
(5899, 1, 1),
(5900, 1, 1),
(5901, 1, 1),
(5902, 1, 1),
(5903, 1, 1),
(5904, 1, 1),
(5905, 1, 1),
(5906, 1, 1),
(5907, 1, 1),
(5935, 6, 5),
(5936, 6, 5),
(5937, 6, 5),
(5938, 6, 5),
(5939, 6, 5),
(5940, 6, 5),
(5941, 6, 5),
(5942, 6, 5),
(5943, 6, 5),
(5944, 6, 5),
(5945, 6, 5),
(5946, 6, 5),
(5947, 6, 5),
(5948, 6, 5),
(5949, 6, 5),
(5950, 6, 5),
(5951, 6, 5),
(5952, 6, 5),
(5953, 6, 5),
(5954, 6, 5),
(5955, 6, 5),
(5956, 6, 5),
(5957, 6, 5),
(5958, 6, 5),
(5959, 6, 5),
(5960, 6, 5),
(5961, 6, 5),
(5962, 6, 5),
(5963, 6, 5),
(5964, 6, 5),
(5965, 6, 5),
(5966, 6, 5),
(5967, 6, 5),
(5968, 6, 5),
(5969, 6, 5),
(5970, 6, 5),
(5971, 6, 5),
(5972, 6, 5),
(5973, 6, 5),
(5974, 6, 5),
(5975, 6, 5),
(5976, 6, 5),
(5977, 6, 5),
(5978, 6, 5),
(5979, 6, 5),
(5980, 6, 5),
(5908, 7, 1),
(5909, 7, 1),
(5910, 7, 1),
(5911, 7, 1),
(5912, 7, 1),
(5913, 7, 1),
(5914, 7, 1),
(5915, 7, 1),
(5916, 7, 1),
(5917, 7, 1),
(5918, 7, 1),
(5919, 7, 1),
(5920, 7, 1),
(5921, 7, 1),
(5922, 7, 1),
(5923, 7, 1),
(5924, 7, 1),
(5925, 7, 1),
(5926, 7, 1),
(5927, 7, 1),
(5928, 7, 1),
(5929, 7, 1),
(5930, 7, 1),
(5931, 7, 1),
(5932, 7, 1),
(5933, 7, 1),
(5934, 7, 1),
(5981, 60, 15),
(5982, 60, 15),
(5983, 60, 15),
(5984, 60, 15),
(5985, 60, 15),
(5986, 60, 15),
(5987, 60, 15),
(5988, 60, 15),
(5989, 60, 15),
(5990, 60, 15),
(5991, 60, 15),
(5992, 60, 15),
(5993, 60, 15),
(5994, 60, 15),
(5995, 60, 15),
(5996, 60, 15),
(5997, 60, 15),
(5998, 60, 15),
(5999, 60, 15),
(6000, 60, 15),
(6001, 60, 15),
(6002, 60, 15),
(6003, 60, 15),
(6004, 60, 15),
(6005, 60, 15),
(6006, 60, 15),
(6007, 60, 15),
(6008, 60, 15),
(6009, 60, 15),
(6010, 60, 15),
(6011, 60, 15),
(6012, 60, 15),
(6013, 60, 15),
(6014, 60, 15),
(6015, 60, 15),
(6016, 60, 15),
(6017, 60, 15),
(6018, 60, 15),
(6019, 60, 15),
(6020, 60, 15),
(6021, 60, 15),
(6022, 60, 15),
(6023, 60, 15),
(6024, 60, 15),
(6025, 60, 15),
(6026, 60, 15),
(6027, 60, 15),
(6028, 60, 15),
(6029, 60, 15),
(6030, 60, 15),
(6031, 60, 15),
(6032, 60, 15),
(6033, 60, 15),
(6034, 60, 15),
(6035, 60, 15),
(6036, 60, 15),
(6037, 60, 15),
(6038, 60, 15),
(6039, 60, 15),
(6040, 60, 15),
(6041, 60, 15),
(6042, 60, 15),
(6043, 60, 15),
(6044, 60, 15),
(6045, 60, 15),
(6046, 60, 15),
(6047, 60, 15),
(6048, 60, 15),
(6049, 60, 15),
(6050, 60, 15),
(6051, 60, 15),
(6052, 60, 15),
(6053, 60, 15),
(6054, 60, 15),
(6055, 60, 15),
(6056, 60, 15),
(6057, 60, 15),
(6058, 60, 15),
(6059, 60, 15),
(6060, 60, 15),
(6061, 60, 15),
(6062, 60, 15),
(6063, 60, 15),
(6064, 60, 15),
(6065, 60, 15);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dakt`
--

CREATE TABLE `dakt` (
  `MaKT` int(11) NOT NULL,
  `MD` int(2) NOT NULL,
  `MaTaiKhoan` varchar(10) NOT NULL,
  `TrangThai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dang_nhap`
--

CREATE TABLE `dang_nhap` (
  `MaTaiKhoan` varchar(10) NOT NULL,
  `TenDangNhap` varchar(50) NOT NULL,
  `MatKhau` varchar(1000) NOT NULL,
  `PhanLoai` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `dang_nhap`
--

INSERT INTO `dang_nhap` (`MaTaiKhoan`, `TenDangNhap`, `MatKhau`, `PhanLoai`) VALUES
('1142719170', 'LMDang151105', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('1265017411', 'VTHa020105', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('1876855490', 'TPDat211205', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000001', 'NVAn010105', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000002', 'TTHoa020305', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000003', 'LQBinh050604', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000004', 'HVCuong100705', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000005', 'PTDung121004', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000006', 'NTGiang151105', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000007', 'LTHHai180205', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000008', 'DVKhiem200404', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000009', 'NBLinh220805', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000010', 'BAMinh250905', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000011', 'VNNam281204', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000012', 'DTNgoc300105', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000013', 'LTPhuc030305', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000014', 'DPQuan070504', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000015', 'NTSon090705', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000016', 'THTam110905', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000017', 'LMThanh131104', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000018', 'NPTien171205', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000019', 'VQTrung190305', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000020', 'HNTu210504', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000021', 'NTVan230705', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000022', 'LTVy250905', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000023', 'PNXuan271104', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000024', 'TNYen290105', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000025', 'NVAnh020205', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000026', 'LTBao040404', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000027', 'HTChau060605', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000028', 'PTDat080805', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000029', 'VHDuc101004', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000030', 'HQHieu121205', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000031', 'LAKhanh140105', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('2300000032', 'NMKhoi160304', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('4397759178', 'DTYen1111', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'GV'),
('5050273971', 'PMNhat240305', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('5498295965', 'LMThu250205', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('5555697626', 'HQHuy140405', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('8629326161', 'NVHien191005', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT'),
('9901007309', 'PNTNhan140305', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'NT');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dethi`
--

CREATE TABLE `dethi` (
  `MD` int(2) NOT NULL,
  `NoidungDeThi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `ThoiGian` int(11) NOT NULL,
  `NgayTao` date DEFAULT NULL,
  `NgayThi` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `dethi`
--

INSERT INTO `dethi` (`MD`, `NoidungDeThi`, `ThoiGian`, `NgayTao`, `NgayThi`) VALUES
(1, 'Đề thi Tổ Hợp', 15, '2025-10-14', '2025-10-14'),
(2, 'Đề Thi Tổ Hợp 2', 15, '2025-10-14', '2025-10-16'),
(3, 'Đề Thi Giáo Dục Thể Chất', 30, '2000-10-09', '2025-11-15'),
(4, 'Đề Thi Mạng Máy Tính', 15, '2000-11-13', '2025-05-20'),
(5, 'Đề Thi Cuối Kỳ 2025', 30, '2025-10-20', '2025-10-21'),
(6, 'Đề thi Toán học cơ bản - Phần 1', 45, '2025-01-05', '2025-01-10'),
(7, 'Đề thi Toán học cơ bản - Phần 2', 60, '2025-01-05', '2025-01-15'),
(8, 'Đề thi Tin học đại cương - Lý thuyết', 45, '2025-02-10', '2025-02-15'),
(9, 'Đề thi Tin học đại cương - Thực hành', 90, '2025-02-10', '2025-02-18'),
(10, 'Đề thi Anh văn căn bản - Kỳ 1', 60, '2025-03-01', '2025-03-10'),
(11, 'Đề thi Anh văn nâng cao - Kỳ 2', 75, '2025-03-01', '2025-03-20'),
(12, 'Đề thi Lịch sử Việt Nam', 45, '2025-03-15', '2025-03-25'),
(13, 'Đề thi Địa lý các châu lục', 60, '2025-03-20', '2025-03-28'),
(14, 'Đề thi Vật lý đại cương', 90, '2025-04-01', '2025-04-05'),
(15, 'Đề thi Hóa học cơ bản', 60, '2025-04-05', '2025-04-10'),
(16, 'Đề thi Sinh học tế bào', 60, '2025-04-10', '2025-04-15'),
(17, 'Đề thi Ngữ văn – Phân tích thơ', 90, '2025-04-15', '2025-04-22'),
(18, 'Đề thi Ngữ văn – Nghị luận xã hội', 90, '2025-04-15', '2025-04-25'),
(19, 'Đề thi Giáo dục công dân', 45, '2025-04-20', '2025-04-28'),
(20, 'Đề thi Kinh tế học đại cương', 60, '2025-05-01', '2025-05-05'),
(21, 'Đề thi Lập trình Java cơ bản', 90, '2025-05-10', '2025-05-15'),
(22, 'Đề thi Cấu trúc dữ liệu và giải thuật', 120, '2025-05-20', '2025-05-25'),
(23, 'Đề thi Mạng máy tính', 90, '2025-06-01', '2025-06-05'),
(24, 'Đề thi Cơ sở dữ liệu', 120, '2025-06-10', '2025-06-15'),
(25, 'Đề thi Phân tích thiết kế hệ thống', 90, '2025-06-20', '2025-06-25'),
(26, 'Đề thi Lập trình hướng đối tượng', 120, '2025-07-01', '2025-07-05'),
(27, 'Đề thi Trí tuệ nhân tạo cơ bản', 90, '2025-07-10', '2025-07-15'),
(28, 'Đề thi Hệ điều hành', 90, '2025-07-20', '2025-07-25');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lichsuthi`
--

CREATE TABLE `lichsuthi` (
  `MLS` int(11) NOT NULL,
  `MaTaiKhoan` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `MaDe` int(2) NOT NULL,
  `KQ` float NOT NULL,
  `socaudung` int(11) NOT NULL,
  `NgayThi` date NOT NULL,
  `ThoiGianLam` varchar(10) NOT NULL,
  `TTCT` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `lichsuthi`
--

INSERT INTO `lichsuthi` (`MLS`, `MaTaiKhoan`, `MaDe`, `KQ`, `socaudung`, `NgayThi`, `ThoiGianLam`, `TTCT`) VALUES
(32, '7273897839', 2, 0, 0, '2025-10-16', '0:0:3', '===== KẾT QUẢ CHI TIẾT BÀI LÀM =====\n\nCâu 1: ai dẹp trai nhất\n   A. D\n   B. H\n   C. H\n   D. K\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\nCâu 2: Trong HTML, thẻ nào để chèn hình ảnh?\n   A. <image>\n   B. <img>\n   C. <picture>\n   D. <src>\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 3: Biến static trong Java thuộc về?\n   A. Đối tượng\n   B. Lớp\n   C. Phương thức\n   D. Biến cục bộ\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 4: Kết quả của biểu thức (true && false) || true là?\n   A. true\n   B. false\n   C. error\n   D. null\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\nCâu 5: Trong MySQL, để xóa bảng dùng lệnh nào?\n   A. DROP TABLE\n   B. DELETE TABLE\n   C. REMOVE TABLE\n   D. CLEAR TABLE\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\nCâu 6: Trong Java, từ khóa nào dùng để kế thừa lớp?\n   A. super\n   B. extends\n   C. this\n   D. inherits\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: AB\n   Kết quả: Sai\n\nCâu 7: Kết quả của 2 + 2 * 2 = ?\n   A. 6\n   B. 8\n   C. 4\n   D. 2\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\nCâu 8: Phương thức main() trong Java phải có dạng nào?\n   A. public void main(String args[])\n   B. static void main(String args[])\n   C. public static void main(String[] args)\n   D. void main()\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: C\n   Kết quả: Sai\n\nCâu 9: Đâu là cú pháp đúng để khai báo mảng trong Java?\n   A. int[] arr;\n   B. int arr[];\n   C. Cả hai đều đúng\n   D. arr int[];\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: C\n   Kết quả: Sai\n\nCâu 10: Phép toán nào có độ ưu tiên cao nhất?\n   A. +\n   B. -\n   C. *\n   D. =\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: C\n   Kết quả: Sai\n\n=====================================\nTỔNG KẾT:\n   Tổng số câu: 10\n   Số câu đúng: 0\n   Số câu sai: 10\n   Số điểm: 0.00\n'),
(33, '7273897839', 3, 0, 0, '2025-11-15', '0:0:3', '===== KẾT QUẢ CHI TIẾT BÀI LÀM =====\n\nCâu 1: Câu lệnh SQL nào dùng để cập nhật dữ liệu?\n   A. INSERT\n   B. UPDATE\n   C. ALTER\n   D. CHANGE\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 2: Phần mở rộng của file Java là?\n   A. .jav\n   B. .java\n   C. .class\n   D. .jar\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 3: Đâu là cú pháp đúng để khai báo mảng trong Java?\n   A. int[] arr;\n   B. int arr[];\n   C. Cả hai đều đúng\n   D. arr int[];\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: C\n   Kết quả: Sai\n\nCâu 4: Trong HTML, thẻ nào để chèn hình ảnh?\n   A. <image>\n   B. <img>\n   C. <picture>\n   D. <src>\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 5: Trong MySQL, khóa chính được định nghĩa bằng?\n   A. PRIMARY KEY\n   B. FOREIGN KEY\n   C. UNIQUE KEY\n   D. IDENTITY\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\nCâu 6: Trong SQL, để sắp xếp dữ liệu dùng từ khóa nào?\n   A. GROUP BY\n   B. ORDER BY\n   C. SORT\n   D. ARRANGE\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 7: Kiểu dữ liệu nào lưu chuỗi ký tự trong Java?\n   A. int\n   B. String\n   C. char\n   D. float\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 8: Kết quả của 5 + 2 * 3 là?\n   A. 21\n   B. 11\n   C. 13\n   D. 10\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 9: ai dẹp trai nhất\n   A. D\n   B. H\n   C. H\n   D. K\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\n=====================================\nTỔNG KẾT:\n   Tổng số câu: 9\n   Số câu đúng: 0\n   Số câu sai: 9\n   Số điểm: 0.00\n'),
(34, '5555697626', 3, 0, 0, '2025-11-15', '0:0:5', '===== KẾT QUẢ CHI TIẾT BÀI LÀM =====\n\nCâu 1: Câu lệnh SQL nào dùng để cập nhật dữ liệu?\n   A. INSERT\n   B. UPDATE\n   C. ALTER\n   D. CHANGE\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 2: Phần mở rộng của file Java là?\n   A. .jav\n   B. .java\n   C. .class\n   D. .jar\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 3: Đâu là cú pháp đúng để khai báo mảng trong Java?\n   A. int[] arr;\n   B. int arr[];\n   C. Cả hai đều đúng\n   D. arr int[];\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: C\n   Kết quả: Sai\n\nCâu 4: Trong HTML, thẻ nào để chèn hình ảnh?\n   A. <image>\n   B. <img>\n   C. <picture>\n   D. <src>\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 5: Trong MySQL, khóa chính được định nghĩa bằng?\n   A. PRIMARY KEY\n   B. FOREIGN KEY\n   C. UNIQUE KEY\n   D. IDENTITY\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\nCâu 6: Trong SQL, để sắp xếp dữ liệu dùng từ khóa nào?\n   A. GROUP BY\n   B. ORDER BY\n   C. SORT\n   D. ARRANGE\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 7: Kiểu dữ liệu nào lưu chuỗi ký tự trong Java?\n   A. int\n   B. String\n   C. char\n   D. float\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 8: Kết quả của 5 + 2 * 3 là?\n   A. 21\n   B. 11\n   C. 13\n   D. 10\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 9: ai dẹp trai nhất\n   A. D\n   B. H\n   C. H\n   D. K\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\n=====================================\nTỔNG KẾT:\n   Tổng số câu: 9\n   Số câu đúng: 0\n   Số câu sai: 9\n   Số điểm: 0.00\n'),
(35, '5555697626', 5, 0, 0, '2025-10-21', '0:0:3', '===== KẾT QUẢ CHI TIẾT BÀI LÀM =====\n\nCâu 1: 5 % 2 trong Java cho kết quả là?\n   A. 1\n   B. 2\n   C. 2.5\n   D. 0\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\nCâu 2: Phép toán nào có độ ưu tiên cao nhất?\n   A. +\n   B. -\n   C. *\n   D. =\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: C\n   Kết quả: Sai\n\nCâu 3: Phần mở rộng của file Java là?\n   A. .jav\n   B. .java\n   C. .class\n   D. .jar\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 4: Trong SQL, để sắp xếp dữ liệu dùng từ khóa nào?\n   A. GROUP BY\n   B. ORDER BY\n   C. SORT\n   D. ARRANGE\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 5: Phương thức main() trong Java phải có dạng nào?\n   A. public void main(String args[])\n   B. static void main(String args[])\n   C. public static void main(String[] args)\n   D. void main()\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: C\n   Kết quả: Sai\n\nCâu 6: Đâu là cú pháp đúng để khai báo mảng trong Java?\n   A. int[] arr;\n   B. int arr[];\n   C. Cả hai đều đúng\n   D. arr int[];\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: C\n   Kết quả: Sai\n\nCâu 7: Trong SQL, câu lệnh nào dùng để lấy dữ liệu?\n   A. INSERT\n   B. SELECT\n   C. UPDATE\n   D. DELETE\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: BC\n   Kết quả: Sai\n\nCâu 8: Kiểu dữ liệu nào lưu chuỗi ký tự trong Java?\n   A. int\n   B. String\n   C. char\n   D. float\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\nCâu 9: Kết quả của biểu thức (true && false) || true là?\n   A. true\n   B. false\n   C. error\n   D. null\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: A\n   Kết quả: Sai\n\nCâu 10: Câu lệnh SQL nào dùng để cập nhật dữ liệu?\n   A. INSERT\n   B. UPDATE\n   C. ALTER\n   D. CHANGE\n   Bạn chưa chọn đáp án nào.\n   Đáp án đúng: B\n   Kết quả: Sai\n\n=====================================\nTỔNG KẾT:\n   Tổng số câu: 10\n   Số câu đúng: 0\n   Số câu sai: 10\n   Số điểm: 0.00\n');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lop`
--

CREATE TABLE `lop` (
  `MaLop` int(11) NOT NULL,
  `TenLop` varchar(20) DEFAULT NULL,
  `MaNganh` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `lop`
--

INSERT INTO `lop` (`MaLop`, `TenLop`, `MaNganh`) VALUES
(0, 'Trống', '0'),
(2, 'B023TT1', 'TT'),
(3, 'B023TT2', 'TT'),
(4, 'B023NA1', 'NA'),
(5, 'B023NA2', 'NA'),
(6, 'B024PT1', 'PT'),
(7, 'B024PT2', 'PT'),
(8, 'B023QT1', 'QT'),
(9, 'B023QT2', 'QT'),
(10, 'B023NH1', 'NH'),
(11, 'B023NH2', 'NH'),
(12, 'B023KT4', 'KT'),
(15, 'B025PT1', 'PT'),
(78, 'B025TT1', 'TT'),
(79, 'B025TT2', 'TT'),
(80, 'B025TT3', 'TT'),
(81, 'B025TT4', 'TT'),
(82, 'B025KT1', 'KT'),
(83, 'B025KT2', 'KT'),
(84, 'B025KT3', 'KT'),
(85, 'B025KT4', 'KT'),
(86, 'B025NA1', 'NA'),
(87, 'B025NA2', 'NA'),
(88, 'B025NA3', 'NA'),
(89, 'B025NH1', 'NH'),
(90, 'B025NH2', 'NH'),
(91, 'B025NH3', 'NH'),
(92, 'B025PT2', 'PT'),
(93, 'B025PT3', 'PT'),
(94, 'B025PT4', 'PT'),
(95, 'B025QT1', 'QT'),
(96, 'B025QT2', 'QT'),
(97, 'B025QT3', 'QT');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nganh`
--

CREATE TABLE `nganh` (
  `MaNganh` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenNganh` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `nganh`
--

INSERT INTO `nganh` (`MaNganh`, `TenNganh`) VALUES
('0', 'Trống'),
('KT', 'Kinh Tế'),
('NA', 'Ngôn Ngữ Anh'),
('NH', 'Tài Chính Ngân Hàng'),
('PT', 'Truyền Thông Đa Phương Tiện'),
('QT', 'Quản Trị Kinh Doanh'),
('TT', 'Công Nghệ Thông Tin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thi`
--

CREATE TABLE `thi` (
  `MD` int(2) NOT NULL,
  `MaTaiKhoan` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `trangthai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `thi`
--

INSERT INTO `thi` (`MD`, `MaTaiKhoan`, `trangthai`) VALUES
(1, '1142719170', 0),
(4, '1142719170', 0),
(15, '1142719170', 1),
(4, '1876855490', 0),
(15, '1876855490', 1),
(15, '2300000001', 1),
(15, '2300000002', 1),
(15, '2300000003', 1),
(15, '2300000004', 1),
(15, '2300000005', 1),
(15, '2300000006', 1),
(15, '2300000007', 1),
(15, '2300000008', 1),
(15, '2300000009', 1),
(15, '2300000010', 1),
(15, '2300000011', 1),
(15, '2300000012', 1),
(15, '2300000013', 1),
(15, '2300000014', 1),
(15, '2300000015', 1),
(15, '2300000016', 1),
(15, '2300000017', 1),
(15, '2300000018', 1),
(15, '2300000019', 1),
(15, '2300000020', 1),
(15, '2300000021', 1),
(15, '2300000022', 1),
(4, '5050273971', 0),
(15, '5050273971', 1),
(4, '5498295965', 0),
(5, '5498295965', 0),
(15, '5498295965', 1),
(4, '5555697626', 0),
(15, '5555697626', 1),
(4, '8629326161', 0),
(15, '8629326161', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ttnguoithi`
--

CREATE TABLE `ttnguoithi` (
  `MaTaiKhoan` varchar(10) NOT NULL,
  `HoTen` varchar(50) NOT NULL,
  `Malop` int(11) NOT NULL,
  `NgaySinh` date NOT NULL,
  `MaNganh` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SDT` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `ttnguoithi`
--

INSERT INTO `ttnguoithi` (`MaTaiKhoan`, `HoTen`, `Malop`, `NgaySinh`, `MaNganh`, `SDT`) VALUES
('1142719170', 'Lê Minh Đăng', 3, '2005-11-15', 'TT', '2321432453'),
('1876855490', 'Trương Phát Đạt', 3, '2005-12-21', 'TT', '1232144356'),
('5050273971', 'Phạm Minh Nhất', 3, '2005-03-24', 'TT', '0048322389'),
('5498295965', 'Lê Minh Thư', 5, '2007-02-25', 'NA', '5435315431'),
('5555697626', 'Hồ Quốc Huy', 3, '2005-04-14', 'TT', '0868800737'),
('8629326161', 'Nguyễn Văn Hiền', 3, '2005-10-19', 'TT', '0868800737'),
('2300000001', 'Nguyễn Văn An', 78, '2005-01-01', 'TT', '0901234501'),
('2300000002', 'Trần Thị Hòa', 78, '2005-03-02', 'TT', '0901234502'),
('2300000003', 'Lê Quang Bình', 79, '2004-06-05', 'TT', '0901234503'),
('2300000004', 'Hồ Văn Cường', 79, '2005-07-10', 'TT', '0901234504'),
('2300000005', 'Phạm Thị Dung', 80, '2004-10-12', 'TT', '0901234505'),
('2300000006', 'Nguyễn Tấn Giang', 80, '2005-11-15', 'TT', '0901234506'),
('2300000007', 'Lê Thị Hồng Hải', 81, '2005-02-18', 'TT', '0901234507'),
('2300000008', 'Đặng Văn Khiêm', 81, '2004-04-20', 'TT', '0901234508'),
('2300000009', 'Ngô Bảo Linh', 82, '2005-08-22', 'KT', '0901234509'),
('2300000010', 'Bùi Anh Minh', 82, '2005-09-25', 'KT', '0901234510'),
('2300000011', 'Vũ Ngọc Nam', 83, '2004-12-28', 'KT', '0901234511'),
('2300000012', 'Đỗ Thị Ngọc', 83, '2005-01-30', 'KT', '0901234512'),
('2300000013', 'Lê Tấn Phúc', 84, '2005-03-03', 'KT', '0901234513'),
('2300000014', 'Đặng Phước Quân', 84, '2004-05-07', 'KT', '0901234514'),
('2300000015', 'Nguyễn Tấn Sơn', 85, '2005-07-09', 'KT', '0901234515'),
('2300000016', 'Trần Hoàng Tâm', 85, '2005-09-11', 'KT', '0901234516'),
('2300000017', 'Lý Minh Thành', 86, '2004-11-13', 'NA', '0901234517'),
('2300000018', 'Ngô Phước Tiến', 86, '2005-12-17', 'NA', '0901234518'),
('2300000019', 'Võ Quang Trung', 87, '2005-03-19', 'NA', '0901234519'),
('2300000020', 'Hoàng Ngọc Tú', 87, '2004-05-21', 'NA', '0901234520'),
('2300000021', 'Nguyễn Thị Vân', 88, '2005-07-23', 'NA', '0901234521'),
('2300000022', 'Lâm Tường Vy', 88, '2005-09-25', 'NA', '0901234522');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `cauhoi`
--
ALTER TABLE `cauhoi`
  ADD PRIMARY KEY (`MC`);

--
-- Chỉ mục cho bảng `ctdt`
--
ALTER TABLE `ctdt`
  ADD PRIMARY KEY (`IDCau`),
  ADD KEY `fk_ttnt_MC_MD` (`MC`,`MD`);

--
-- Chỉ mục cho bảng `dakt`
--
ALTER TABLE `dakt`
  ADD PRIMARY KEY (`MaKT`),
  ADD KEY `fk_dakt_dethi` (`MD`),
  ADD KEY `fk_dakt_dang_nhap` (`MaTaiKhoan`);

--
-- Chỉ mục cho bảng `dang_nhap`
--
ALTER TABLE `dang_nhap`
  ADD PRIMARY KEY (`MaTaiKhoan`),
  ADD UNIQUE KEY `TenDangNhap` (`TenDangNhap`);

--
-- Chỉ mục cho bảng `dethi`
--
ALTER TABLE `dethi`
  ADD PRIMARY KEY (`MD`);

--
-- Chỉ mục cho bảng `lichsuthi`
--
ALTER TABLE `lichsuthi`
  ADD PRIMARY KEY (`MLS`),
  ADD KEY `fk_lst_dt` (`MaDe`),
  ADD KEY `fk_lst_dn` (`MaTaiKhoan`) USING BTREE;

--
-- Chỉ mục cho bảng `lop`
--
ALTER TABLE `lop`
  ADD PRIMARY KEY (`MaLop`),
  ADD KEY `FK_Lop_Nganh` (`MaNganh`);

--
-- Chỉ mục cho bảng `nganh`
--
ALTER TABLE `nganh`
  ADD PRIMARY KEY (`MaNganh`);

--
-- Chỉ mục cho bảng `thi`
--
ALTER TABLE `thi`
  ADD PRIMARY KEY (`MaTaiKhoan`,`MD`),
  ADD KEY `FK_thi_dethi` (`MD`);

--
-- Chỉ mục cho bảng `ttnguoithi`
--
ALTER TABLE `ttnguoithi`
  ADD KEY `fk_ttnt_dang_nhap` (`MaTaiKhoan`),
  ADD KEY `fk_ttnt_lop_nganh` (`Malop`,`MaNganh`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `cauhoi`
--
ALTER TABLE `cauhoi`
  MODIFY `MC` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=337;

--
-- AUTO_INCREMENT cho bảng `ctdt`
--
ALTER TABLE `ctdt`
  MODIFY `IDCau` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6066;

--
-- AUTO_INCREMENT cho bảng `dakt`
--
ALTER TABLE `dakt`
  MODIFY `MaKT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `dethi`
--
ALTER TABLE `dethi`
  MODIFY `MD` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT cho bảng `lichsuthi`
--
ALTER TABLE `lichsuthi`
  MODIFY `MLS` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT cho bảng `lop`
--
ALTER TABLE `lop`
  MODIFY `MaLop` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=98;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `ctdt`
--
ALTER TABLE `ctdt`
  ADD CONSTRAINT `FK_Dethi_ctdt` FOREIGN KEY (`MD`) REFERENCES `dethi` (`MD`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_cauhoi_ctdt` FOREIGN KEY (`MC`) REFERENCES `cauhoi` (`MC`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `dakt`
--
ALTER TABLE `dakt`
  ADD CONSTRAINT `fk_dakt_dang_nhap` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `dang_nhap` (`MaTaiKhoan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_dakt_dethi` FOREIGN KEY (`MD`) REFERENCES `dethi` (`MD`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `lop`
--
ALTER TABLE `lop`
  ADD CONSTRAINT `FK_Lop_Nganh` FOREIGN KEY (`MaNganh`) REFERENCES `nganh` (`MaNganh`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `thi`
--
ALTER TABLE `thi`
  ADD CONSTRAINT `FK_thi_dangnhap` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `dang_nhap` (`MaTaiKhoan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_thi_dethi` FOREIGN KEY (`MD`) REFERENCES `dethi` (`MD`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `ttnguoithi`
--
ALTER TABLE `ttnguoithi`
  ADD CONSTRAINT `FK_dn_ttnt` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `dang_nhap` (`MaTaiKhoan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_MaTaiKhoan` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `dang_nhap` (`MaTaiKhoan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_tt_tk` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `dang_nhap` (`MaTaiKhoan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_ttn_lop` FOREIGN KEY (`Malop`) REFERENCES `lop` (`MaLop`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_ttn_nganh` FOREIGN KEY (`MaNganh`) REFERENCES `nganh` (`MaNganh`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
