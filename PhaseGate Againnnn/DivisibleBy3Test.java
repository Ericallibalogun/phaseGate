import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DivisibleBy3Test{

	@Test
	public void testThatDivisorByThreeReturnCorrectValue(){
		DivisibleBy3 myDivisor = new DivisibleBy3();
		int divisor = myDivisor.getDivisorsByThree(9);
		assertEquals(18,divisor);
		


	}

}
