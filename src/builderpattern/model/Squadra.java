package builderpattern.model;

import java.util.ArrayList;
import java.util.List;

public class Squadra {

	private Long id;
	private String nomeSocieta;
	private String nome;
	private Integer numeroGiocatori;
	private Integer fondiMonetari;
	private String presidente;
	private String campionato;
	private Integer numeroStaff;
	private List<String> giocatori = new ArrayList<String>();

	public Squadra(Long id, String nomeSocietà, String nome, Integer numeroGiocatori, Integer fondiMonetari,
			String presidente, String campionato, Integer numeroStaff, List<String> giocatori) {
		super();
		this.id = id;
		this.nomeSocieta = nomeSocietà;
		this.nome = nome;
		this.numeroGiocatori = numeroGiocatori;
		this.fondiMonetari = fondiMonetari;
		this.presidente = presidente;
		this.campionato = campionato;
		this.numeroStaff = numeroStaff;
		this.giocatori = giocatori;
	}

	public String getNomeSocietà() {
		return nomeSocieta;
	}

	public void setNomeSocietà(String nomeSocietà) {
		this.nomeSocieta = nomeSocietà;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroGiocatori() {
		return numeroGiocatori;
	}

	public void setNumeroGiocatori(Integer numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
	}

	public Integer getFondiMonetari() {
		return fondiMonetari;
	}

	public void setFondiMonetari(Integer fondiMonetari) {
		this.fondiMonetari = fondiMonetari;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public String getCampionato() {
		return campionato;
	}

	public void setCampionato(String campionato) {
		this.campionato = campionato;
	}

	public Integer getNumeroStaff() {
		return numeroStaff;
	}

	public void setNumeroStaff(Integer numeroStaff) {
		this.numeroStaff = numeroStaff;
	}

	public List<String> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(List<String> giocatori) {
		this.giocatori = giocatori;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
