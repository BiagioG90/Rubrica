package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {

	private Map<String, Voce> voci = new TreeMap<String, Voce>();
	private String nomeR;
	
	//primo metodo
	//altro commento
	//altro commento
	public Voce aggiungiVoce(String nome, String cognome, String telefono) throws VoceGiaEsiste{
		
		if(voci.containsKey(nome + " " + cognome)){
			throw new VoceGiaEsiste("era dentro classe rubrica metodo aggiungi");
		}
		
		Voce v = new Voce(nome, cognome, telefono);
		voci.put(nome + " " + cognome, v);
		return v;
	}
}
