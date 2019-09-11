package lego.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import lego.BoiteLego;



class TestBoiteLego {

	@Test
	void testConstructor() {
		// given
		var number = 21318;
		var name = "La cabanne dans l'arbre";
		// when
		var boite = new BoiteLego(number, name);
		// then
		assertAll(
				() -> assertEquals(number, boite.getNumber(), "number"),
				() -> assertEquals(name, boite.getName(), "name")
		);
	}

}
