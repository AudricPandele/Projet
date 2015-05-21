-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 21 Mai 2015 à 09:20
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `bellino`
--

-- --------------------------------------------------------

--
-- Structure de la table `contrat`
--

CREATE TABLE IF NOT EXISTS `contrat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(255) NOT NULL,
  `tache` int(11) NOT NULL,
  `description` varchar(250) NOT NULL,
  `prix_global` float NOT NULL,
  `date` varchar(255) NOT NULL,
  `fournisseur` int(11) NOT NULL,
  `client` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `contrat`
--

INSERT INTO `contrat` (`id`, `titre`, `tache`, `description`, `prix_global`, `date`, `fournisseur`, `client`) VALUES
(5, 'développement web', 1, 'Développement d''un site e-commerce', 10000, '21-05-15', 8, 9),
(9, 'développement web', 1, 'développement web', 10000, '21-05-15', 8, 9);

-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

CREATE TABLE IF NOT EXISTS `entreprise` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `siret` varchar(255) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `telephone` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Contenu de la table `entreprise`
--

INSERT INTO `entreprise` (`id`, `nom`, `siret`, `adresse`, `telephone`) VALUES
(8, 'Cdiscount', '125L84', '89 quai des chartrons', 661386327);

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE IF NOT EXISTS `facture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fournisseur` int(11) NOT NULL,
  `client` int(11) NOT NULL,
  `est_paye` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Contenu de la table `facture`
--

INSERT INTO `facture` (`id`, `fournisseur`, `client`, `est_paye`) VALUES
(18, 8, 9, 1),
(19, 8, 9, 0),
(20, 8, 9, 0),
(21, 8, 9, 0);

-- --------------------------------------------------------

--
-- Structure de la table `facture_tache`
--

CREATE TABLE IF NOT EXISTS `facture_tache` (
  `id_facture` int(11) NOT NULL,
  `id_tache` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `frame`
--

CREATE TABLE IF NOT EXISTS `frame` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `frame_user`
--

CREATE TABLE IF NOT EXISTS `frame_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `id_frame` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `role`
--

INSERT INTO `role` (`id`, `nom`, `description`) VALUES
(1, 'Role', 'TestRole');

-- --------------------------------------------------------

--
-- Structure de la table `tache`
--

CREATE TABLE IF NOT EXISTS `tache` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prixUnitaire` int(11) NOT NULL,
  `quantite` int(11) NOT NULL,
  `prixHT` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `tache`
--

INSERT INTO `tache` (`id`, `nom`, `prixUnitaire`, `quantite`, `prixHT`) VALUES
(1, 'Tache', 50, 2, 40);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `nom`, `prenom`, `age`, `login`, `password`) VALUES
(5, 'Charbonier', 'Louis', 20, 'louis', 'louis');

-- --------------------------------------------------------

--
-- Structure de la table `user_role`
--

CREATE TABLE IF NOT EXISTS `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `id_role` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
