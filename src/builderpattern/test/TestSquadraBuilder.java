package builderpattern.test;

import builderpattern.builder.SquadraBuilder;
import builderpattern.model.Squadra;

public class TestSquadraBuilder {
	public static void main(String[] args) {
		//test Builder
		
		//Mi prendo prima un oggetto Builder
		SquadraBuilder squadraBuilderInstance = SquadraBuilder.newBuilder(1L).nomeSocieta("Fenice Pallavolo SRL").nome("Fenice").campionato("Serie A2").fondiMonetari(200000).numeroGiocatori(22).numeroStaff(40).presidente("Signor Giurgio");
	
		//richiamo il metodo build
		Squadra fenicePallavolo = squadraBuilderInstance.build();
		
		System.out.println(fenicePallavolo.getNome()+ " "+ fenicePallavolo.getPresidente());
	}
}
