package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa koja predstavlja Vulkanizersku Radnja sa nekim svojim funkcionalnostima
 * 
 * @author Milica Zukanovic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {

	/**
	 * Lista dostupnih guma u vulkanizerskoj radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje novu gumu u ponudu vulkanizerske radnje
	 * 
	 * @param a
	 *            nova guma koja se dodaje u vulkanizersku radnju
	 * @throws java.lang.NullPointerException
	 *             ako je uneta guma null
	 * @throws java.lang.RuntimeException
	 *             ako uneta guma vec postoji
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi i vraca listu guma koje su dostupne za odredjenu marku i model
	 * 
	 * @param markaModel
	 *            marka i model auto gume
	 * @return lista sa gumama koje odgovaraju upitu
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
