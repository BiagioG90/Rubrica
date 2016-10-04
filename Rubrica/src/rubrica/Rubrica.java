package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	private String nome;
	private String cognome;
	private String telefono;

	private Map<String, Voce> voci = new TreeMap<String, Voce>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Map<String, Voce> getVoci() {
		return voci;
	}

	public void setVoci(Map<String, Voce> voci) {
		this.voci = voci;
	}

	public Voce aggiungiVoce(String nome, String cognome, String telefono) throws VoceGiaEsiste{
		
		if(voci.containsKey(nome + " " + cognome)){
			throw new VoceGiaEsiste("era dentro classe rubrica metodo aggiungi");
		}
		
		Voce v = new Voce(nome, cognome, telefono);
		voci.put(nome + " " + cognome, v);
		return v;
	}
	
	public Voce getVoce(String nome, String cognome){
		return null;
		
	}
}
