class Demo{
		public static void main(String args[]){
				System.out.println("hoi");
				int getal = 34;
				System.out.println(getal);
				double kommagetal = 55.6;
				System.out.println(kommagetal);
				String woord = "woensdag";
				System.out.println(woord);
				Speler speler1= new Speler();
				Speler speler2= new Speler();
				speler1.voornaam = "Johan";
				System.out.println(speler1.voornaam);
				System.out.println(speler1);
				System.out.println(speler1.leeftijd);
				System.out.println(speler2.voornaam);
				speler1.voorstellen();
		}
}	
 

 class Schaakspel{
	 Speler zwart;
	 Speler wit;
 }
 
 /// methode functie, redelijk hetzelfde 
 class Speler{
	String voornaam;
	int leeftijd;
	void voorstellen(){
			System.out.println("Hoi ik ben: " +voornaam);
	}
 }