package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testMain() {
		assertDoesNotThrow( () -> App.main(null));
	}

}