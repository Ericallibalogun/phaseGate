import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SecondArrayLowestTest{

	@Test
	public void testThatArrayReturnsCorrectValue(){
	int[] value = {12,23,34,56,32,13};
		SecondArrayLowest myArray = new SecondArrayLowest();
		int[] result = myArray.getTwoLowestNum(value);
		assertArrayEquals(new int[] {12,13}, result);		
	

   }
}	