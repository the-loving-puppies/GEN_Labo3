import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DieTest {
	@Test
	void ADieShouldRollANumberFromOneToSix() {
		Die d = new Die();
		for(int i = 0; i < 1000; ++i) {
			d.roll();
			assertTrue((d.getFaceValue() >= 1 && d.getFaceValue() <= 6));
		}
	}
}