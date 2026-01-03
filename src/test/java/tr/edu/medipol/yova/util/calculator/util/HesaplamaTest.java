package tr.edu.medipol.yova.util.calculator.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HesaplamaTest {

	@Test
	void testTopla() {
		//GIVEN - ÖN koşul
		int sayi1 = 999999;
		int sayi2 = 1;
		
		//WHEN - test edilecek metodun çağırılması
		int sonuc = Hesaplama.topla(sayi1, sayi2);
		
		//THEN - Kontroller
		assertEquals(1000000, sonuc);
	}

	@Test
	void testCikar() {
		//GIVEN - ÖN koşul
		int sayi1 = 999999;
		int sayi2 = 1;
		
		//WHEN - test edilecek metodun çağırılması
		int sonuc = Hesaplama.cikar(sayi1, sayi2);
		
		//THEN - Kontroller
		assertEquals(999998, sonuc);
	}

	@Test
	void testCarp() {
		//GIVEN - ÖN koşul
		int sayi1 = 999999;
		int sayi2 = 1;
		
		//WHEN - test edilecek metodun çağırılması
		int sonuc = Hesaplama.carp(sayi1, sayi2);
		
		//THEN - Kontroller
		assertEquals(999999, sonuc);
	}

	@Test
	void testBol_SifiraBol() {
		//GIVEN - ÖN koşul
		int sayi1 = 999999;
		int sayi2 = 0;
		
		//WHEN & THEN 
		assertThrows(ArithmeticException.class, () -> Hesaplama.bol(sayi1, sayi2));
	}
	
	@Test
	void testBol() {
		//GIVEN - ÖN koşul
		int sayi1 = 999999;
		int sayi2 = 1;
		
		//WHEN - test edilecek metodun çağırılması
		int sonuc = Hesaplama.bol(sayi1, sayi2);
		
		//THEN - Kontroller
		assertEquals(999999, sonuc);
	}


}
