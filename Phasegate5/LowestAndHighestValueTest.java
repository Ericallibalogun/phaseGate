import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class LowestAndHighestValueTest{

	@Test
	public void testThatArrayReturnsHighestValue(){
	int[] value = {12,23,34,56,32,13};
		LowestAndHighestValue myArray = new LowestAndHighestValue();
		int[] result = myArray.getHighestNum(value);
		assertArrayEquals(new int[] {56}, result);		
	

   }
	



@Test
	public void testThatArrayReturnsLowesttValue(){
	int[] value = {12,23,34,56,32,13};
		LowestAndHighestValue myArray = new LowestAndHighestValue();
		int[] result = myArray.getLowestNum(value);
		assertArrayEquals(new int[] {12}, result);		
	

   }
}	