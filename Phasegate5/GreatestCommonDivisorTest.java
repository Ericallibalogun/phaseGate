import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest{

	@Test
	public void testThatGreatestCommonDivisorReturnCorrectValue(){
		GreatestCommonDivisor myDivisor = new GreatestCommonDivisor();
		int divisor = myDivisor.getTheGreatestCommonDivisorBetweenNumbers(4,2);
		assertEquals(2,myDivisor.getTheGreatestCommonDivisorBetweenNumbers(4, 2));
		


	}



}
