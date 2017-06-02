package blackJack;

public class Karta {
	private int vrednost;
	private String karta;
	
	public Karta(int vrednost, String karta){
		this.vrednost = vrednost;
		this.karta = karta;
	}
	
	public int getVrednost(){
		return vrednost;
	}
	public String getKarta(){
		return karta;
	}
}
