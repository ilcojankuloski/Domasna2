package zadaca2;

public class Main {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Fikt f1 = new Fikt();
			f1.nazivNaFakultet = "FIKT";
			f1.brojNaSmerovi = 4;
			f1.brojNaStudenti = 500;
			f1.dekan = "Aleksandar Markoski";
			f1.sediste = "Bitola";
			
			f1.pMetod();
			System.out.println("Namalen broj studenti: " + f1.vMetod(50));
			f1.tMetod();
			
			Fikt f2 = new Fikt();
			f2.nazivNaFakultet = "FIKT";
			f2.brojNaSmerovi = 2;
			f2.brojNaStudenti = 1500;
			f2.dekan = "Mitko Kostov";
			f2.sediste = "Bitola";
			
			f2.pMetod();
			System.out.println("Namalen broj studenti: " + f2.vMetod(30));
			f2.tMetod();
		}
	}