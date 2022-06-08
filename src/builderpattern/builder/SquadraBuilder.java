package builderpattern.builder;

import java.util.ArrayList;
import java.util.List;

import builderpattern.model.Squadra;

public final class SquadraBuilder {

	private Long id;
	private String nomeSocieta;
	private String nome;
	private Integer numeroGiocatori;
	private Integer fondiMonetari;
	private String presidente;
	private String campionato;
	private Integer numeroStaff;
	private List<String> giocatori = new ArrayList<String>();

	// costruttore Builder
	private SquadraBuilder(Long id) {
		this.id = id;
	}

	// Metodo newBuilder
	public static SquadraBuilder newBuilder(Long id) {
		return new SquadraBuilder(id);
	}

	// Metodi per le proprietà
	public SquadraBuilder nomeSocieta(String nomeSocieta) {
		this.nomeSocieta = nomeSocieta;
		return this;
	}

	public SquadraBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}

	public SquadraBuilder numeroGiocatori(Integer numeroGiocatori) {
		this.numeroGiocatori = numeroGiocatori;
		return this;
	}

	public SquadraBuilder fondiMonetari(Integer fondiMonetari) {
		this.fondiMonetari = fondiMonetari;
		return this;
	}

	public SquadraBuilder presidente(String presidente) {
		this.presidente = presidente;
		return this;
	}

	public SquadraBuilder campionato(String campionato) {
		this.campionato = campionato;
		return this;
	}

	public SquadraBuilder numeroStaff(Integer numeroStaff) {
		this.numeroStaff = numeroStaff;
		return this;
	}

	public SquadraBuilder giocatori(List<String> giocatori) {
		this.giocatori = giocatori;
		return this;
	}

	// METODO BUILD
	public Squadra build() {
		if (fondiMonetari < 100)
			throw new RuntimeException("Errore, non ci sono fondiMonetari");

		if (presidente == null)
			throw new RuntimeException("Errore, presidente non esistente");

		return new Squadra(id, nomeSocieta, nome, numeroGiocatori, fondiMonetari, presidente, campionato, numeroStaff,
				giocatori);
	}

}
