package blackJack;

import java.util.*;

public class Main {
	private static int sum;
	static int zbir = 0;
	public static Diler d = new Diler();
	static String[] karte = new String[6];	
	static ArrayList<Karta> karta = new ArrayList<Karta>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problems to solve
		 * Da zna kad pobedis/izgubis
		 * Da ima opciju stand
		 * Split
		 * Kad hitujem za 3 kartu, da ne prepise vrednost1, nego sve 3 da cuva da bi ih pokaza i u sl krugu
		 * Mora da cuva samo stringove
		 * 
		 */
		
		String unos;
		Scanner s = new Scanner(System.in);
		
		System.out.println("----------------BLACKJACK----------------");
		System.out.println("Let's Play: ");
		System.out.println("1. Play\n2.Quit");
		unos = s.nextLine();
		
		if(unos.equals("1")){
			firstHit();
			
		}
		else{
			System.out.println("By");
			System.exit(0);
			
		}
		
		System.out.println("----------------BLACKJACK----------------");
		System.out.println("1.Hit ");
		System.out.println("2.Stand");
		unos = s.nextLine();
		if(unos.equals("1")){
			hit();
			
			if(check(sum) == false){
			
				System.out.println("Presli ste 21");
				System.exit(0);
			}
			else{
				if(sum == 21)
					System.out.println("BlackJack");
			}
		}
		else{
			System.out.println("Patka");
			
			
		}
		System.out.println("----------------BLACKJACK----------------");
		System.out.println("1. hit");
		System.out.println("2. stand");
		unos = s.nextLine();
		
		if(unos.equals("1")){
			hit();
			
		}
		else{
			System.out.println("Stand");
		}


	}
	
	public static void firstHit(){
	
		for(int i = 0; i < 2; i++){
		d.setVrednost();
		d.Deal();
		
		Karta card = new Karta(d.getVrednost(),d.getKarta());
			karta.add(card);
	}
		ace();
		blackjack();
		for(Karta k: karta)

			System.out.println(k.getKarta());
	
		System.out.println(sum());
	}

	public static void hit(){
		//int i = 0;

		d.setVrednost();
		d.Deal();
	Karta card = new Karta(d.getVrednost(),d.getKarta());
		karta.add(card);
		ace();
		blackjack();
		for(Karta k: karta)

			System.out.println(k.getKarta());
		System.out.println(sum());
		
		
	}
	public static void print(){
		for(int i = 0; i < karte.length; i++){
			System.out.println(karte[i]);
		}
	
	}
	public static int sum() {
	      sum = 0; 

	     for (Karta k : karta)
	         sum = sum + k.getVrednost();

	     return sum;
	}
	public static boolean check(int sum){
		
		if(sum <= 21){
			return true;
		}
		else
			return false;
		
	}
	public static void ace(){
		
		for(Karta karta : karta){
			if(karta.getKarta().contains("A")){
				if(sum - 10 > 21){
					sum -= 10;
				}
				if(sum + 10 <= 21){
					sum += 10;
				}
				
			}
		}
	}
	public static void blackjack(){
		if(sum == 21){
			System.out.println("Blackjack");
	}}
}
