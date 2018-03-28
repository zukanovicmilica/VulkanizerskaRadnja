package gume.radnja;

import static org.junit.Assert.*;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {

	private VulkanizerskaRadnja v;
	private AutoGuma ag;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();

		ag = new AutoGuma();
		ag.setMarkaModel("Audi S5");
		ag.setPrecnik(20);
		ag.setSirina(200);
		ag.setVisina(76);
	}

	@After
	public void tearDown() throws Exception {
		v = null;
		ag = null;
	}

	@Test
	public void testDodajGumu() {
		v.dodajGumu(ag);

		assertEquals(1, v.gume.size());
	}

	@Test
	public void testDodajGumu2() {
		v.dodajGumu(ag);

		AutoGuma ag2 = new AutoGuma();
		ag2.setMarkaModel("Toyota");
		ag2.setPrecnik(19);
		ag2.setSirina(195);
		ag2.setVisina(65);

		v.dodajGumu(ag2);

		assertEquals(2, v.gume.size());
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuKojaVecPostoji() {
		v.dodajGumu(ag);
		v.dodajGumu(ag);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testPronadjiGumuNull() {
		v.pronadjiGumu(null);
	}

	@Test
	public void testPronadjiGumuKojaNijeUListi() {
		v.dodajGumu(ag);

		AutoGuma ag2 = new AutoGuma();
		ag2.setMarkaModel("Toyota");
		ag2.setPrecnik(19);
		ag2.setSirina(195);
		ag2.setVisina(65);

		v.dodajGumu(ag2);

		LinkedList<AutoGuma> nova = v.pronadjiGumu("Skoda");

		assertEquals(0, nova.size());
	}

	@Test
	public void testPronadjiGumuIsteMarkeIModelaAliRazlicitihDimenzija() {
		v.dodajGumu(ag);

		AutoGuma ag2 = new AutoGuma();
		ag2.setMarkaModel("Toyota");
		ag2.setPrecnik(19);
		ag2.setSirina(195);
		ag2.setVisina(65);

		AutoGuma ag3 = new AutoGuma();
		ag3.setMarkaModel("Audi S5");
		ag3.setPrecnik(18);
		ag3.setSirina(210);
		ag3.setVisina(70);

		v.dodajGumu(ag2);
		v.dodajGumu(ag3);

		LinkedList<AutoGuma> nova = v.pronadjiGumu("Audi S5");

		assertEquals(2, nova.size());

	}

}
