package ifsc.projeto.pesquisa.sd.ws.utilidades;

import java.util.ArrayList;
import java.util.List;

import ifsc.projeto.pesquisa.sd.ws.modelos.Projeto;

public class ProjetosUtil {

	public static List<Projeto> criarProjetos() {
		List<Projeto> listProjetos = new ArrayList<>();
		
		Projeto lProjeto = new Projeto();
		lProjeto.setCodigo("PVLGS1135-2019");
		lProjeto.setTitulo("Desenvolvimento de um aplicativo para o ensino e aprendizagem e produtos notáveis e polinômios");
		lProjeto.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto.setCategoria("Pesquisa aplicada");
		lProjeto.setSituacao("EM EXECUÇÃO");
		lProjeto.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto.setEmailCoordenador("ailton.durigon@ifsc.edu.br");
		lProjeto.setCoordenador("AILTON DURIGON");
		lProjeto.setDateCadastro(DateUtil.criarData(10, 4, 2019));
		listProjetos.add(lProjeto);
		
		
		Projeto lProjeto2 = new Projeto();
		lProjeto2.setCodigo("PILGS1345-2019");
		lProjeto2.setTitulo("Um software web para o estudo de Números e Operações");
		lProjeto2.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto2.setCategoria("Pesquisa aplicada");
		lProjeto2.setSituacao("SUBMETIDO");
		lProjeto2.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto2.setEmailCoordenador("ailton.durigon@ifsc.edu.br");
		lProjeto2.setCoordenador("AILTON DURIGON");
		lProjeto2.setDateCadastro(DateUtil.criarData(4, 11, 2019));
		listProjetos.add(lProjeto2);
		
		Projeto lProjeto3 = new Projeto();
		lProjeto3.setCodigo("PILGS1234-2019");
		lProjeto3.setTitulo("Guia de qualidade para provedores de serviços web");
		lProjeto3.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto3.setCategoria("Pesquisa aplicada");
		lProjeto3.setSituacao("EM EXECUÇÃO");
		lProjeto3.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto3.setEmailCoordenador("alexandre.perin@ifsc.edu.br");
		lProjeto3.setCoordenador("ALEXANDRE PERIN DE SOUZA");
		lProjeto3.setDateCadastro(DateUtil.criarData(7, 8, 2019));
		listProjetos.add(lProjeto3);
		
		Projeto lProjeto4 = new Projeto();
		lProjeto4.setCodigo("PILGS1016-2019");
		lProjeto4.setTitulo("Demandas de Aprendizagem de Inglês no IFSC-câmpus Lages");
		lProjeto4.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto4.setCategoria("Pesquisa aplicada");
		lProjeto4.setSituacao("EM EXECUÇÃO");
		lProjeto4.setArea("COORDENADORIA DO CURSO TECNICO EM INFORMATICA PARA INTERNET (CAMPUS LAGES) (11.01.21.02.20)");
		lProjeto4.setEmailCoordenador("luciane.oliveira@ifsc.edu.br");
		lProjeto4.setCoordenador("ANA MARIA MARTINS ROEBER");
		lProjeto4.setDateCadastro(DateUtil.criarData(27, 3, 2019));
		listProjetos.add(lProjeto4);
		
		Projeto lProjeto5 = new Projeto();
		lProjeto5.setCodigo("PILGS957-2019");
		lProjeto5.setTitulo("Utilização do planejamento Simplex-Centróide para o desenvolvimento de polímeros biodegradáveis para armazenamento de alimentos: otimização das propriedades físico-químicas e antioxidantes.");
		lProjeto5.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto5.setCategoria("Pesquisa aplicada");
		lProjeto5.setSituacao("EM EXECUÇÃO");
		lProjeto5.setArea("COORDENADORIA DE CURSOS TÉCNICOS DE BIOTECNOLOGIA (CAMPUS LAGES) (11.01.21.02.01)");
		lProjeto5.setEmailCoordenador("ana.veeck@ifsc.edu.br|anaveeck@yahoo.com.br");
		lProjeto5.setCoordenador("ANA PAULA DE LIMA VEECK");
		lProjeto5.setDateCadastro(DateUtil.criarData(16, 3, 2019));
		listProjetos.add(lProjeto5);
		
	
		Projeto lProjeto6 = new Projeto();
		lProjeto6.setCodigo("PILGS1051-2019");
		lProjeto6.setTitulo("Síntese verde de nanopartículas de prata para aplicação em biopolímeros: desenvolvimento de uma embalagem bioativa, biodegradável e inteligente para a conservação de alimentos.");
		lProjeto6.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto6.setCategoria("Pesquisa aplicada");
		lProjeto6.setSituacao("EM EXECUÇÃO");
		lProjeto6.setArea("COORDENADORIA DE CURSOS TÉCNICOS DE BIOTECNOLOGIA (CAMPUS LAGES) (11.01.21.02.01)");
		lProjeto6.setEmailCoordenador("ana.veeck@ifsc.edu.br|anaveeck@yahoo.com.br");
		lProjeto6.setCoordenador("ANA PAULA DE LIMA VEECK");
		lProjeto6.setDateCadastro(DateUtil.criarData(9, 4, 2019));
		listProjetos.add(lProjeto6);
		
		
		Projeto lProjeto7 = new Projeto();
		lProjeto7.setCodigo("PILGS1325-2019");
		lProjeto7.setTitulo("Bancada didática para aferição de esforços multidirecionais");
		lProjeto7.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto7.setCategoria("Desenvolvimento tecnológico e inovação");
		lProjeto7.setSituacao("SUBMETIDO");
		lProjeto7.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto7.setEmailCoordenador("anderson.correia@ifsc.edu.br");
		lProjeto7.setCoordenador("ANDERSON LUIS GARCIA CORREIA");
		lProjeto7.setDateCadastro(DateUtil.criarData(9, 4, 2019));
		listProjetos.add(lProjeto7);
		
		
		Projeto lProjeto8 = new Projeto();
		lProjeto8.setCodigo("PILGS1309-2019");
		lProjeto8.setTitulo("Construção de módulos educacionais para eletrônica");
		lProjeto8.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto8.setCategoria("Desenvolvimento tecnológico e inovação");
		lProjeto8.setSituacao("SUBMETIDO");
		lProjeto8.setArea("COORDENADORIA EM MECATRONICA (CAMPUS LAGES) (11.01.21.02.12)");
		lProjeto8.setEmailCoordenador("anderson.borges@ifsc.edu.br");
		lProjeto8.setCoordenador("ANDERSON WILLIAM SIMOES BORGES");
		lProjeto8.setDateCadastro(DateUtil.criarData(24, 10, 2019));
		listProjetos.add(lProjeto8);
		
		
		Projeto lProjeto9 = new Projeto();
		lProjeto9.setCodigo("PILGS1446-2019");
		lProjeto9.setTitulo("Desenvolvimento e Fabricação de máquina Chaveteira Vertical.");
		lProjeto9.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto9.setCategoria("Pesquisa aplicada");
		lProjeto9.setSituacao("SUBMETIDO");
		lProjeto9.setArea("COORDENADORIA DOS CURSOS TÉCNICOS DE ELETROMECÂNICA (CAMPUS LAGES) (11.01.21.02.07)");
		lProjeto9.setEmailCoordenador("ariton.araldi@ifsc.edu.br|ariton.araldi@gmail.com");
		lProjeto9.setCoordenador("ARITON ARALDI");
		lProjeto9.setDateCadastro(DateUtil.criarData(12, 11, 2019));
		listProjetos.add(lProjeto9);
		
		
		Projeto lProjeto10 = new Projeto();
		lProjeto10.setCodigo("PILGS1068-2019");
		lProjeto10.setTitulo("Métodos Computacionais baseados em Inteligência Artificial para a Predição de Risco de Evasão de Alunos no Instituto Federal de Santa Catarina.");
		lProjeto10.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto10.setCategoria("Pesquisa aplicada");
		lProjeto10.setSituacao("EM EXECUÇÃO");
		lProjeto10.setArea("COORDENADORIA DO CURSO TECNICO EM INFORMATICA PARA INTERNET (CAMPUS LAGES) (11.01.21.02.20)");
		lProjeto10.setEmailCoordenador("andres.ferrero@ifsc.edu.br|anfer86@gmail.com");
		lProjeto10.setCoordenador("CARLOS ANDRES FERRERO");
		lProjeto10.setDateCadastro(DateUtil.criarData(9, 4, 2019));
		listProjetos.add(lProjeto10);
		
		
		Projeto lProjeto11 = new Projeto();
		lProjeto11.setCodigo("PILGS1461-2019");
		lProjeto11.setTitulo("Estruturação do laboratório de Física: provisão de equipamentos simples e kits básicos para a experimentação em ensino de física.");
		lProjeto11.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto11.setCategoria("Pesquisa aplicada");
		lProjeto11.setSituacao("SUBMETIDO");
		lProjeto11.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto11.setEmailCoordenador("eliana.borragini@ifsc.edu.br|efborragini@gmail.com");
		lProjeto11.setCoordenador("ELIANA FERNANDES BORRAGINI");
		lProjeto11.setDateCadastro(DateUtil.criarData(13, 11, 2019));
		listProjetos.add(lProjeto11);
		
		
		Projeto lProjeto12 = new Projeto();
		lProjeto12.setCodigo("PILGS1279-2019");
		lProjeto12.setTitulo("DEFINIÇÃO DE CURVA ÓTIMA PARA GEOMETRIA DE PROPULSOR A JATO DE BOCAL DIVERGENTE CONVERGENTE COM COMBUSTÍVEIS GASOSOS.");
		lProjeto12.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto12.setCategoria("Pesquisa aplicada");
		lProjeto12.setSituacao("EM EXECUÇÃO");
		lProjeto12.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto12.setEmailCoordenador("fernando.osorio@ifsc.edu.br");
		lProjeto12.setCoordenador("FERNANDO DA SILVA OSÓRIO");
		lProjeto12.setDateCadastro(DateUtil.criarData(29, 9, 2019));
		listProjetos.add(lProjeto12);
		
		
		Projeto lProjeto13 = new Projeto();
		lProjeto13.setCodigo("PILGS1333-2019");
		lProjeto13.setTitulo("CONSTRUÇÃO DE BANCADA DIDÁTICA MÁQUINAS DE FLUXO, TURBOMÁQUINAS E TÉCNICAS DE MEDIÇÃO DE VAZÃO PARA FLUIDOS.");
		lProjeto13.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto13.setCategoria("Pesquisa aplicada");
		lProjeto13.setSituacao("EM EXECUÇÃO");
		lProjeto13.setArea("COORDENADORIA DO CURSO SUPERIOR EM ENGENHARIA MECÂNICA (CAMPUS LAGES) (11.01.21.02.18)");
		lProjeto13.setEmailCoordenador("fernando.osorio@ifsc.edu.br");
		lProjeto13.setCoordenador("FERNANDO DA SILVA OSÓRIO");
		lProjeto13.setDateCadastro(DateUtil.criarData(28, 10, 2019));
		listProjetos.add(lProjeto13);
		
		return listProjetos;
	}
}
