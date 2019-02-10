package my.BeerSong;
public class BeerSong {
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }
	
	public static void Ninety_Nine_Bottles_of_Beer() {
		int beerCount = 99;
		for (int i = 1; i <= 97; i++) {
			System.out.println(beerCount + " bottles of beer on the wall, " + beerCount + " bottles of beer. Take one down, pass it around, " + (beerCount - 1) + " bottles of beer on the wall.");
			beerCount -= 1;
		}
		
		if (beerCount == 2) {			
			System.out.println(beerCount + " bottles of beer on the wall, " + beerCount + " bottles of beer. Take one down, pass it around, 1 bottle of beer on the wall. ");
			System.out.println((beerCount - 1) + " bottle of beer on the wall, " + (beerCount - 1) + " bottle of beer. Take one down, pass it around, no more bottles of beer on the wall.");
		}
	}
}
