-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 23-Abr-2020 às 01:37
-- Versão do servidor: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lucas_lopes_martins_registro_escolar`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_alunos`
--

CREATE TABLE `lm_alunos` (
  `LM_nome` varchar(30) DEFAULT NULL,
  `LM_serie` varchar(30) DEFAULT NULL,
  `LM_nota1` float DEFAULT NULL,
  `LM_nota2` float DEFAULT NULL,
  `LM_nota3` float DEFAULT NULL,
  `LM_matricula` int(11) NOT NULL,
  `LM_senha` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_biblioteca`
--

CREATE TABLE `lm_biblioteca` (
  `LM_bibliotecaria` varchar(50) DEFAULT NULL,
  `LM_acervo` int(11) DEFAULT NULL,
  `LM_emprestimos` varchar(50) DEFAULT NULL,
  `LM_pedidos` varchar(50) DEFAULT NULL,
  `LM_livros` varchar(50) DEFAULT NULL,
  `LM_localizarLivro` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_professor`
--

CREATE TABLE `lm_professor` (
  `LM_nome` varchar(50) DEFAULT NULL,
  `LM_cargo` varchar(50) DEFAULT NULL,
  `LM_cargaHoraria` float DEFAULT NULL,
  `LM_turnos` varchar(20) DEFAULT NULL,
  `LM_salario` float DEFAULT NULL,
  `LM_usuario` varchar(50) DEFAULT NULL,
  `LM_senha` varchar(20) DEFAULT NULL,
  `LM_turmas` varchar(50) DEFAULT NULL,
  `LM_disciplinas` varchar(80) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_series`
--

CREATE TABLE `lm_series` (
  `LM_serieEspecifica` varchar(20) DEFAULT NULL,
  `LM_professorResponsavel` varchar(20) DEFAULT NULL,
  `LM_TotalDeAlunos` int(11) DEFAULT NULL,
  `LM_turnoDaAula` varchar(20) DEFAULT NULL,
  `LM_SalaDeAula` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_turmas`
--

CREATE TABLE `lm_turmas` (
  `LM_totalDeTurmas` int(11) DEFAULT NULL,
  `LM_totalDeAlunos` int(11) DEFAULT NULL,
  `LM_series` varchar(200) DEFAULT NULL,
  `LM_professores` varchar(200) DEFAULT NULL,
  `LM_Disciplinas` varchar(200) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lm_alunos`
--
ALTER TABLE `lm_alunos`
  ADD PRIMARY KEY (`LM_matricula`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `lm_alunos`
--
ALTER TABLE `lm_alunos`
  MODIFY `LM_matricula` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
