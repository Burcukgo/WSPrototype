-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 22 Eyl 2019, 23:00:11
-- Sunucu sürümü: 10.1.37-MariaDB
-- PHP Sürümü: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `prototype`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `applog`
--

CREATE TABLE `applog` (
  `lid` int(11) NOT NULL,
  `ltime` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `luri` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `lmethod` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `lheader` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `applog`
--

INSERT INTO `applog` (`lid`, `ltime`, `luri`, `lmethod`, `lheader`) VALUES
(1, '0', '/subscriber', 'POST', '{\"id\":\"1\",\"name\":\"Stephan King\",\"msisdn\":\"905552551122\"}'),
(2, '0', '/subscriber', 'POST', '{\"id\":\"1\",\"name\":\"Stephan King\",\"msisdn\":\"905552551122\"}'),
(3, '0', '/subscriber', 'DELETE', '{\"id\":\"11\"}');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `subscriber`
--

CREATE TABLE `subscriber` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `msisdn` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `subscriber`
--

INSERT INTO `subscriber` (`id`, `name`, `msisdn`) VALUES
(3, 'Stephan King', '905552551122'),
(5, ' Alice Gracy', '905552551133'),
(6, 'Glory Wisdom', '905552551144'),
(8, 'jack Dorsey', '905552551144'),
(10, 'Stephan King', '905552551122');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `applog`
--
ALTER TABLE `applog`
  ADD PRIMARY KEY (`lid`);

--
-- Tablo için indeksler `subscriber`
--
ALTER TABLE `subscriber`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `applog`
--
ALTER TABLE `applog`
  MODIFY `lid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `subscriber`
--
ALTER TABLE `subscriber`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
