public class Anagram{
	public static void main(String... ericalli){

	String s = "anagram";

	String t = "nagaram";
	
	s = t;

	System.out.println("""
		s = "anagram"
		t = "nagaram"
	""");	

	if (s == t){
	System.out.println("true");
	}

	if (s != t){
	System.out.println("false");
	}
} 
}