-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Янв 11 2018 г., 09:32
-- Версия сервера: 5.5.25
-- Версия PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `schedule`
--

-- --------------------------------------------------------

--
-- Структура таблицы `group`
--

CREATE TABLE IF NOT EXISTS `group` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id Группы',
  `name` text NOT NULL COMMENT 'Имя группы',
  `place` text NOT NULL COMMENT 'Место, где проводятся занятия в этой группе',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `group`
--

INSERT INTO `group` (`id`, `name`, `place`) VALUES
(1, 'Водное поло', 'Спортзал/Бассейн'),
(2, 'Семейное плавание', 'Бассейн');

-- --------------------------------------------------------

--
-- Структура таблицы `lesson`
--

CREATE TABLE IF NOT EXISTS `lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id занятия',
  `idGroup` int(11) NOT NULL COMMENT 'id группы, в котором проводится это занятия',
  `day` int(11) NOT NULL DEFAULT '0' COMMENT 'день проведения занятия',
  `timeStart` time NOT NULL COMMENT 'время начала проведения занятия',
  `timeEnd` time NOT NULL COMMENT 'время окончания занятия',
  `idTrainer` int(11) NOT NULL COMMENT 'id тренера, который проводит занятие',
  PRIMARY KEY (`id`),
  KEY `idGroup` (`idGroup`),
  KEY `idTrainer` (`idTrainer`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=16 ;

--
-- Дамп данных таблицы `lesson`
--

INSERT INTO `lesson` (`id`, `idGroup`, `day`, `timeStart`, `timeEnd`, `idTrainer`) VALUES
(11, 1, 0, '15:30:00', '16:30:00', 1),
(12, 1, 0, '16:30:00', '17:30:00', 1),
(13, 2, 1, '18:00:00', '19:00:00', 2),
(15, 1, 2, '15:30:00', '16:30:00', 1);

-- --------------------------------------------------------

--
-- Структура таблицы `trainer`
--

CREATE TABLE IF NOT EXISTS `trainer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id тренера',
  `name` text NOT NULL COMMENT 'ФИО тренера',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='Тренеры' AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `trainer`
--

INSERT INTO `trainer` (`id`, `name`) VALUES
(1, 'Мухин Е.М'),
(2, 'Криницкая Т.А.');

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` text NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`id`, `login`, `password`) VALUES
(1, 'anton', '123'),
(2, 'root', 'root'),
(3, 'admin', 'admin'),
(4, 'login0', 'password');

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `lesson`
--
ALTER TABLE `lesson`
  ADD CONSTRAINT `lesson_ibfk_1` FOREIGN KEY (`idGroup`) REFERENCES `group` (`id`),
  ADD CONSTRAINT `lesson_ibfk_2` FOREIGN KEY (`idTrainer`) REFERENCES `trainer` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
