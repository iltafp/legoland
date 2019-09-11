package lego.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import lego.Boite;



class TestBoiteLego {

	@Test
	void testConstructor() {
		// given
		var number = 21318;
		var name = "La cabanne dans l'arbre";
		// when
		var boite = new Boite(number, name);
		// then
		assertAll(
				() -> assertEquals(number, boite.getNumber(), "number"),
				() -> assertEquals(name, boite.getName(), "name")
		);
	}

}
