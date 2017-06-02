package blackJack;

import java.util.*;

///isti projekat, treci put, pa aj nek je sa srecom
//BLACKJACK by Gengar, May 18. 2017
//Learning Java
public class Diler {
												//var vrednost2 je pomocna ukloniti ako ne treba, sve su setovane
	private int vrednost1 = 1,vrednost2 = 1; 	//na 1 jer r.NextInt(14) vraca od 0 do 13 a meni treba 1-14	
	private String[] vrstaKarte = {"Karo","Pik","Hertz","Tref"};
	private String karta;
	private int vr;
	private String vrednostS;
	
	
	Random r = new Random();
	
	
	//ova metoda se poziva na pocetku programa, i svaki put kad korisnik trazi novu kartu
	public void Deal(){
		
		vrednost1 += r.nextInt(14);  //izvlaci nasumicnu vrednost za kartu
		vr = r.nextInt(4);
		
		
		
		vrednostS = Integer.toString(vrednost1);
		
		provera(vrednost1);
		//proveraVrednosti(vrednost1);
		karta = vrednostS +" " + vrstaKarte[vr];
		
	}
	
	//metoda vraca celu kartu(Vrednost + vrstu) kao String
	public String getKarta(){
		return karta;

	}
	
	//vraca vrednost1 u program, projcanu vrednost karte
	public int getVrednost(){
		return vrednost1;
	}
	
	//metoda uzima za parametar vrednost1 i proverava da li pdgovara vrednosti karata J,Q,K ili A,
	//i ako odgovara, int vrednost postavlja na odgovarajucu kao i string vrednost 
	
	public void provera(int vrednost){
		if(vrednost == 1 || vrednost == 11){
			vrednostS = "A";
		}
		if(vrednost == 12){
			vrednostS = "J";
			vrednost1 = 10;
		}
		if(vrednost == 13){
			vrednostS = "Q";
			vrednost1 = 10;
		}
		if(vrednost == 14){
			vrednostS = "Q";
			vrednost1 = 10;	
		}
		
		
	}
	public void setVrednost(){
		vrednost1 = 1;
	}

	
}
