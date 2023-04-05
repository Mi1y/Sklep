package Sklep;
import java.util.*;

public class ListyProdukty  {
	List<produkt> L = new ArrayList<>(); //Pole
	
	public void DodajProdukt(produkt produkty) {
		L.add (produkty);
	}
	
	public produkt ZnajdzProdukt(String nazwy) {
		for (produkt i : L) {
			if(i.getnazwa().equals(nazwy))
				return i;
		}
		return null;
	}
/*public produkt ZnajdzProduktzOpisem(String opisy) {
		for (produkt i : L) {
			if(i.getopis().equals(opisy))
				return i;
		}
		return null;
	}
*/	

	public List<produkt> PobierzProdukty( ) {
		return L;
	}
}