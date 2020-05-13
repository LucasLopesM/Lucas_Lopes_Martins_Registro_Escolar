-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13-Maio-2020 às 21:14
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
  `LM_senha` varchar(10) DEFAULT NULL,
  `LM_matricula` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `lm_alunos`
--

INSERT INTO `lm_alunos` (`LM_nome`, `LM_serie`, `LM_nota1`, `LM_nota2`, `LM_nota3`, `LM_senha`, `LM_matricula`, `id`) VALUES
('Lucas', '5º serie', 10, 10, 10, 'batata', 6546949, 1),
('Maria', '4 serie', 10, 10, 10, 'f5g4h65', 499849, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_biblioteca`
--

CREATE TABLE `lm_biblioteca` (
  `id` int(11) NOT NULL,
  `LM_bibliotecaria` varchar(50) DEFAULT NULL,
  `LM_acervo` int(11) DEFAULT NULL,
  `LM_emprestimos` varchar(50) DEFAULT NULL,
  `LM_pedidos` varchar(50) DEFAULT NULL,
  `LM_livros` varchar(50) DEFAULT NULL,
  `LM_localizarLivro` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `lm_biblioteca`
--

INSERT INTO `lm_biblioteca` (`id`, `LM_bibliotecaria`, `LM_acervo`, `LM_emprestimos`, `LM_pedidos`, `LM_livros`, `LM_localizarLivro`) VALUES
(1, 'Camila', 2458, 'joão e Maria', 'Manga do Naruto', 'Ascronicas de Narnia', 'Ala B4');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_professor`
--

CREATE TABLE `lm_professor` (
  `id` int(11) NOT NULL,
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

--
-- Extraindo dados da tabela `lm_professor`
--

INSERT INTO `lm_professor` (`id`, `LM_nome`, `LM_cargo`, `LM_cargaHoraria`, `LM_turnos`, `LM_salario`, `LM_usuario`, `LM_senha`, `LM_turmas`, `LM_disciplinas`) VALUES
(1, 'Roberto Chagas', 'Professor', 5.3, 'Tarde', 3.5, 'roberto', '123654', '521A e 621A', 'Matematica');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_series`
--

CREATE TABLE `lm_series` (
  `id` int(11) NOT NULL,
  `LM_serieEspecifica` varchar(20) DEFAULT NULL,
  `LM_professorResponsavel` varchar(20) DEFAULT NULL,
  `LM_TotalDeAlunos` int(11) DEFAULT NULL,
  `LM_turnoDaAula` varchar(20) DEFAULT NULL,
  `LM_SalaDeAula` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `lm_series`
--

INSERT INTO `lm_series` (`id`, `LM_serieEspecifica`, `LM_professorResponsavel`, `LM_TotalDeAlunos`, `LM_turnoDaAula`, `LM_SalaDeAula`) VALUES
(1, '4° Serie', 'Verônica Matos', 30, 'Manhã', '421A');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lm_turmas`
--

CREATE TABLE `lm_turmas` (
  `id` int(11) NOT NULL,
  `LM_totalDeTurmas` int(11) DEFAULT NULL,
  `LM_totalDeAlunos` int(11) DEFAULT NULL,
  `LM_series` varchar(200) DEFAULT NULL,
  `LM_professores` varchar(200) DEFAULT NULL,
  `LM_Disciplinas` varchar(200) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `lm_turmas`
--

INSERT INTO `lm_turmas` (`id`, `LM_totalDeTurmas`, `LM_totalDeAlunos`, `LM_series`, `LM_professores`, `LM_Disciplinas`) VALUES
(1, 16, 465, '1°ano à 9° ano', 'Carlos, Sandra, Carla, Lurdes, Willis, ', 'Matematica, português, Ciência, história, Geografia');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lm_alunos`
--
ALTER TABLE `lm_alunos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lm_biblioteca`
--
ALTER TABLE `lm_biblioteca`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lm_professor`
--
ALTER TABLE `lm_professor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lm_series`
--
ALTER TABLE `lm_series`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lm_turmas`
--
ALTER TABLE `lm_turmas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `lm_alunos`
--
ALTER TABLE `lm_alunos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `lm_biblioteca`
--
ALTER TABLE `lm_biblioteca`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `lm_professor`
--
ALTER TABLE `lm_professor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `lm_series`
--
ALTER TABLE `lm_series`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `lm_turmas`
--
ALTER TABLE `lm_turmas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
