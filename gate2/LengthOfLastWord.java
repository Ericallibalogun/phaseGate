public class LengthOfString{
	public int lengthOfLastWord(String word){		
	
	int length = 0;
	boolean charFound = false;

	for(int count = word.length() - 1; count >= 0; count--){
		if(word.charAt(count) != ' '){
			charFound = true;
			length++;
		}else if (charFound){
			break;
		}

	  }
	
return length;
	}

	public static void main(String... ericalli){
	String word = "Hello world";
	LengthOfString  l = new LengthOfString();
	System.out.println(l.lengthOfLastWord(word));
	
      }
   }

