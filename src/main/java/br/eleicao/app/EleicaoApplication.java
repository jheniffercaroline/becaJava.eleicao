package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.VotoRepository;
import br.eleicao.app.repository.ZonaEleitoralRepository;

@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner {

	final MunicipioRepository _municipioRepository;
	final CandidatoRepository _candidatoRepository;
	final ZonaEleitoralRepository _zonaEleitoralRepository;
	final EleitorRepository _eleitorRepository;
	final VotoRepository _votoRepository;

	public EleicaoApplication(MunicipioRepository municipioRepository) {
		_municipioRepository = municipioRepository;
	}

//	public EleicaoApplication(CandidatoRepository candidatoRepository) {
//		_candidatoRepository = candidatoRepository;
//	}
//
//	public EleicaoApplication(ZonaEleitoralRepository zonaEleitoralRepository) {
//		_zonaEleitoralRepository = zonaEleitoralRepository;
//
//	}
//
//	public EleicaoApplication(EleitorRepository eleitorRepository) {
//		_eleitorRepository = eleitorRepository;
//
//	}
//
//	public EleicaoApplication(VotoRepository votoRepository) {
//		_votoRepository = votoRepository;
//
//	}

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Salvar Município
 		Municipio municipio = new Municipio ();
 		municipio.setNome ("sao roque");
 		municipio.setPopulacao (18000);		
 		_municipioRepository.save (municipio);		
 		System.out.println ("Município salvo com sucesso!");		
//		
		
// 		SALVAR CANDIDATO
// 		Candidato candidato = new Candidato ();
// 		Municipio municipio = new Municipio ();
// 		municipio.setId (new Long (5));
//		
// 		candidato.setNome ("André Sampaio");
// 		candidato.setNumero ("13");
// 		candidato.setCategoria ("Prefeito");
// 		candidato.setMunicipio (municipio);
// 		_candidatoRepository.save (candidato);
//		
// 		candidato.setNome ("João Rocha");
// 		candidato.setNumero ("70");
// 		candidato.setCategoria ("Prefeito");
// 		candidato.setMunicipio (municipio);
// 		_candidatoRepository.save (candidato);
		
		//SALVAR ZONA
// 		Zona zona = new Zona ();
// 		zona.setNumero ("1459-2");
// 		_zonaRpository.save (zona);
//		
// 		zona = new Zona ();
// 		zona.setNumero ("300-0");
// 		_zonaRpository.save (zona);
//		
// 		zona = new Zona ();
// 		zona.setNumero ("314-6");
// 		_zonaRpository.save (zona);
		
// 		SALVAR ELEITOR
// 		Eleitor eleitor = new Eleitor ();
// 		eleitor.setNome ("Cleiton");
// 		_eleitorRepository.save (eleitor);
//		
// 		eleitor = new Eleitor ();
// 		eleitor.setNome ("Neves");
// 		_eleitorRepository.save (eleitor);
//		
// 		eleitor = new Eleitor ();
// 		eleitor.setNome ("Imaria");
// 		_eleitorRepository.save (eleitor);
		
// 	
		
// 		SALVAR VOTO
// 		Voto voto = novo Voto ();
// 		Eleitor eleitor = new Eleitor ();
// 		Candidato candidato = novo Candidato ();
// 		Zona zona = new Zona ();
// 		eleitor.setId (new Long (2));
// 		candidato.setId (new Long (2));
// 		zona.setId (new Long (3));
//		
// 		voto.setEleitor (eleitor);
// 		voto.setCandidato (candidato);
// 		voto.setZona (zona);
// 		_votoRepository.save (voto);
		
		
		
// 		DELETANDO MUNICIPIO
// 		Municipio municipio = new Municipio ();		
// 		municipio.setId (new Long (2));
// 		_municipioRepository.delete (municipio) ;;
// 		System.out.println ("Município deletado com sucesso!");
		
		
// 		Atualizando um ELEITOR
// 		Eleitor eleitor = new Eleitor ();
// 		eleitor.setId (new Long (2));
// 		eleitor.setNome ("Sophia");
// 		_eleitorRepository.save (eleitor);		
// 		System.out.println ("Eleitor atualizado com sucesso!");
		
		
// 		Selecionando apenas UM ELEITOR
// 		Opcional <Eleitor> eleitor = _eleitorRepository.findById (new Long (3));
// 		System.out.println ("Eleitor:" + eleitor.get (). GetNome ());
		
		
		// Selecionando todos os ELEITORES
// 		Iterable <Eleitor> eleitor = _eleitorRepository.findAll ();		
// 		para (Eleitor e: eleitor) {
// 			System.out.println ("Eleitor:" + e.getNome ());
// 		}
	}
}