package ifsc.projeto.pesquisa.sd.ws.resources;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ifsc.projeto.pesquisa.sd.ws.modelos.Projeto;
import ifsc.projeto.pesquisa.sd.ws.modelos.rest.RequestSituacao;
import ifsc.projeto.pesquisa.sd.ws.modelos.rest.ResponseBase;
import ifsc.projeto.pesquisa.sd.ws.utilidades.ProjetosUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Euro Tour")
public class ProjetosApi {
	
	
	@ApiOperation(value = "Consulta todos os projetos de pesquisa do Campus-Lages")
	@RequestMapping(value = "/projetos", method = RequestMethod.GET)
	public ResponseEntity<ResponseBase<List<Projeto>>> projetos() {
		List<Projeto> listProjetos = new ArrayList<Projeto>();
		ResponseBase<List<Projeto>> baseResponse = new ResponseBase<>();
		try {
			listProjetos.addAll(ProjetosUtil.criarProjetos());
			baseResponse = new ResponseBase<>(true, "Informações carregadas com sucesso", listProjetos);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível carregar as informações", listProjetos);
		}
		return new ResponseEntity<ResponseBase<List<Projeto>>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Consulta todos os projetos por Situação")
	@RequestMapping(value = "/projetosSituacao", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<Projeto>>> projetosPorSituacao(@RequestBody @Valid RequestSituacao aSituacao) {
		List<Projeto> listProjetos = ProjetosUtil.pegarProjetosSituacao(aSituacao.getSituacao());
		ResponseBase<List<Projeto>> baseResponse = new ResponseBase<>();
		try {
			if(!listProjetos.isEmpty()) {
				baseResponse = new ResponseBase<>(true, "Informações carregadas com sucesso", listProjetos);
			} else {
				baseResponse = new ResponseBase<>(true, "Nenhum projeto encontrado com essa situação", listProjetos);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível carregar as informações", listProjetos);
		}
		return new ResponseEntity<ResponseBase<List<Projeto>>>(baseResponse, HttpStatus.OK);
	}

}
