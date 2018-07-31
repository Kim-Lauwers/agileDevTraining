package be.kunlabora.tellme;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FridayTellerTest {

	private FridayTeller teller;

	@Before
	public void setUp()  {
	teller = new FridayTeller();
	}

	@Test
	public void isItFridayYet_No() {
		final Boolean friday = teller.isFridayYet();
		assertFalse(friday);
	}

	@Test
	public void isItFridayYet_Yes() {
		final Boolean friday = teller.isFridayYet();
		assertTrue(friday);
	}
}