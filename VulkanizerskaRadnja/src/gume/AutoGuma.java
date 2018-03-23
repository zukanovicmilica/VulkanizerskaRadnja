package gume;

/**
 * Klasa koja predstavlja Autogume sa nekim svojim funkcionalnostima
 * 
 * @author Milica Zukanovic
 * @version 1.0
 *
 */

public class AutoGuma {
	/**
	 * Atribut koji predstavlja marku i model gume
	 */
	private String markaModel = null;
	/**
	 * Atribut koji oznacava precnik gume
	 */
	private int precnik = 0;
	/**
	 * Atribut koji oznacava sirinu gume
	 */
	private int sirina = 0;
	/**
	 * Atribut koji oznacava visinu gume
	 */
	private int visina = 0;

	/**
	 * Vraca marku i model auto gume
	 * 
	 * @return String sa nazivom marke i modela auto gume
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda koja postavlja marku i model auto gume
	 * 
	 * @param markaModel
	 *            naziv marke i modela
	 * @throws java.lang.RuntimeException
	 *             ako je uneta marka i model null ili ima manje od 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik auto gume
	 * 
	 * @return precnik gume
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Metoda postavlja precnik auto gume
	 * 
	 * @param precnik
	 *            velicina precnika gume
	 * @throws java.lang.RuntimeException
	 *             ako je precnik gume manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu auto gume
	 * 
	 * @return sirina gume
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Metoda postavlja sirinu auto gume
	 * 
	 * @param sirina
	 *            sirina gume
	 * @throws java.lang.RuntimeException
	 *             ako je sirina gume manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu auto gume
	 * 
	 * @return visina gume
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Metoda postavlja visinu auto gume
	 * 
	 * @param visina
	 *            visina gume
	 * @throws java.lang.RuntimeException
	 *             ako je visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Metoda vraca String sa svim podacima o auto gumi
	 * 
	 * @return String sa svima podacima o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava da li su dve auto gume iste, poredi sve parametre (marku i model,
	 * precnik, sirinu i visinu)
	 * 
	 * @return true, ako su parametri obe gume isti, a false u ostalim slucajevima
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
