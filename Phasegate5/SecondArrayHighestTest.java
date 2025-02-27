import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SecondArrayHighestTest{

	@Test
	public void testThatArrayReturnsCorrectValue(){
	int[] value = {12,23,34,56,32,13};
		SecondArrayHighest myArray = new SecondArrayHighest();
		int[] result = myArray.getTwoHighestNum(value);
		assertArrayEquals(new int[] {56,34}, result);		
	

   }
}	