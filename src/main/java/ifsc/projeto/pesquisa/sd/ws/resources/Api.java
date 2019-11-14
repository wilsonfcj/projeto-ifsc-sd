package ifsc.projeto.pesquisa.sd.ws.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ifsc.projeto.pesquisa.sd.ws.modelos.Projeto;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class Api {
	
	@RequestMapping(value = "/projetos", method = RequestMethod.GET)
	public ResponseEntity<List<Projeto>> projetos() {
		List<Projeto> listProjetos = new ArrayList<Projeto>();
		
		Projeto lProjeto = new Projeto();
		lProjeto.setCodigo("PVLGS1135-2019");
		lProjeto.setTitulo("Desenvolvimento de um aplicativo para o ensino e aprendizagem e produtos notáveis e polinômios");
		lProjeto.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto.setCategoria("Pesquisa aplicada");
		lProjeto.setSituacao("EM EXECUÇÃO");
		lProjeto.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto.setEmailCoordenador("ailton.durigon@ifsc.edu.br");
		lProjeto.setCoordenador("AILTON DURIGON");
		listProjetos.add(lProjeto);
		
		Projeto lProjeto2 = new Projeto();
		lProjeto2.setCodigo("PILGS1234-2019");
		lProjeto2.setTitulo("Guia de qualidade para provedores de serviços web");
		lProjeto2.setTipo("Projeto Interno por Editais (Projeto Novo)");
		lProjeto2.setCategoria("Pesquisa aplicada");
		lProjeto2.setSituacao("EM EXECUÇÃO");
		lProjeto2.setArea("COORDENADORIA DO CURSO DE CIÊNCIAS DA COMPUTAÇÃO (CAMPUS LAGES) (11.01.21.02.17)");
		lProjeto2.setEmailCoordenador("alexandre.perin@ifsc.edu.br");
		lProjeto2.setCoordenador("ALEXANDRE PERIN DE SOUZA");
		listProjetos.add(lProjeto2);
		
		
		return new ResponseEntity<List<Projeto>>(listProjetos, HttpStatus.OK);
	}

}
