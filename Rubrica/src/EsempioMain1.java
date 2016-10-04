import rubrica.*;


public class EsempioMain1 {
	
	public static void main(String[] args) throws VoceGiaEsiste, UtenteNonEsiste{
		
		Rubrica r =new Rubrica();
		
		r.aggiungiVoce("Martina", "Debernardi", "3401256348");
		r.aggiungiVoce("Biagio", "Gallucci", "3489563214");
		r.aggiungiVoce("Pippo", "Topolino", "3336547895");
		
		for(Voce v:r.getTutteVoci()){
			System.out.println(v);
		}
		
		System.out.println();
				
		System.out.println(r.getVoce("Martina", "Debernardi"));
		
		System.out.println();
		
		r.cancellaVoce("Pippo", "Topolino");
		
		for(Voce v:r.getTutteVoci()){
			System.out.println(v);
		}
		
	}

}
