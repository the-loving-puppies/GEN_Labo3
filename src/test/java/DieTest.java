import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class DieTest {
	static Die die;

	@BeforeAll
	static void init() {
		die = new Die();
	}

	@RepeatedTest(100)
	void ADieShouldRollANumberFromOneToSix() {
		die.roll();
		assertTrue((die.getFaceValue() >= 1 && die.getFaceValue() <= 6));
	}


}