-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 11 fév. 2019 à 23:02
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `magasin`
--

-- --------------------------------------------------------

--
-- Structure de la table `chaussure`
--

DROP TABLE IF EXISTS `chaussure`;
CREATE TABLE IF NOT EXISTS `chaussure` (
  `codeB` int(11) NOT NULL AUTO_INCREMENT,
  `nomA` varchar(100) NOT NULL,
  `descriptionA` varchar(100) NOT NULL,
  `unite` varchar(100) NOT NULL,
  `couleur` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `marque` varchar(100) NOT NULL,
  `pointure` varchar(100) NOT NULL,
  PRIMARY KEY (`codeB`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `chemise`
--

DROP TABLE IF EXISTS `chemise`;
CREATE TABLE IF NOT EXISTS `chemise` (
  `codeB` int(11) NOT NULL AUTO_INCREMENT,
  `nomA` varchar(100) NOT NULL,
  `descriptionA` varchar(100) NOT NULL,
  `prixU` varchar(100) NOT NULL,
  `unite` varchar(100) NOT NULL,
  `couleur` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `marque` varchar(100) NOT NULL,
  `model` varchar(100) NOT NULL,
  `taille` varchar(100) NOT NULL,
  PRIMARY KEY (`codeB`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fruit`
--

DROP TABLE IF EXISTS `fruit`;
CREATE TABLE IF NOT EXISTS `fruit` (
  `codeB` int(11) NOT NULL AUTO_INCREMENT,
  `nomA` varchar(100) NOT NULL,
  `descriptionA` varchar(100) NOT NULL,
  `prixU` varchar(100) NOT NULL,
  `unite` varchar(100) NOT NULL,
  `saison` varchar(100) NOT NULL,
  `dateEx` varchar(100) NOT NULL,
  `estFrais` varchar(100) NOT NULL,
  PRIMARY KEY (`codeB`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `magasin`
--

DROP TABLE IF EXISTS `magasin`;
CREATE TABLE IF NOT EXISTS `magasin` (
  `idMagasin` int(11) NOT NULL AUTO_INCREMENT,
  `nomM` varchar(100) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `capaciteAli` int(11) NOT NULL,
  `capaciteElectro` int(11) NOT NULL,
  `capaciteVetement` int(11) NOT NULL,
  PRIMARY KEY (`idMagasin`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `pantallon`
--

DROP TABLE IF EXISTS `pantallon`;
CREATE TABLE IF NOT EXISTS `pantallon` (
  `codeB` int(11) NOT NULL AUTO_INCREMENT,
  `nomA` varchar(100) NOT NULL,
  `descriptionA` varchar(100) NOT NULL,
  `prixU` varchar(100) NOT NULL,
  `unite` varchar(100) NOT NULL,
  `tissu` varchar(100) NOT NULL,
  `couleur` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `marque` varchar(100) NOT NULL,
  `fit` varchar(100) NOT NULL,
  `taille` varchar(100) NOT NULL,
  PRIMARY KEY (`codeB`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `produitlaitier`
--

DROP TABLE IF EXISTS `produitlaitier`;
CREATE TABLE IF NOT EXISTS `produitlaitier` (
  `codeB` int(11) NOT NULL AUTO_INCREMENT,
  `nomA` varchar(100) NOT NULL,
  `descriptionA` varchar(100) NOT NULL,
  `prixU` varchar(100) NOT NULL,
  `unite` varchar(100) NOT NULL,
  `dateEx` varchar(100) NOT NULL,
  `estFrais` varchar(100) NOT NULL,
  `typeL` varchar(100) NOT NULL,
  PRIMARY KEY (`codeB`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `telephone`
--

DROP TABLE IF EXISTS `telephone`;
CREATE TABLE IF NOT EXISTS `telephone` (
  `codeB` int(11) NOT NULL AUTO_INCREMENT,
  `nomA` varchar(100) NOT NULL,
  `descriptionA` varchar(100) NOT NULL,
  `prixU` varchar(100) NOT NULL,
  `unite` varchar(100) NOT NULL,
  `marque` varchar(100) NOT NULL,
  `codeSerie` varchar(100) NOT NULL,
  `livrable` varchar(100) NOT NULL,
  `modele` varchar(100) NOT NULL,
  PRIMARY KEY (`codeB`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `television`
--

DROP TABLE IF EXISTS `television`;
CREATE TABLE IF NOT EXISTS `television` (
  `codeB` int(11) NOT NULL AUTO_INCREMENT,
  `nomA` varchar(100) NOT NULL,
  `descriptionA` varchar(100) NOT NULL,
  `prixU` varchar(100) NOT NULL,
  `unite` varchar(100) NOT NULL,
  `marque` varchar(100) NOT NULL,
  `codeSerie` varchar(100) NOT NULL,
  `livrable` varchar(100) NOT NULL,
  `diametre` int(11) NOT NULL,
  `typeTv` varchar(100) NOT NULL,
  PRIMARY KEY (`codeB`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
