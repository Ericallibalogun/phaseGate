public class TrianglePrinting{
	public static void main(String... args){
		
for (int count = 1; count <= 10; count++) {

for (int counter = 1; counter <= count; counter++) {

System.out.print('*');



}

System.out.println();


	}
System.out.println();

for (int count = 10; count >= 1; count--) {

for (int counter = 1; counter <= count; counter++) {

System.out.print('*');

}

System.out.println();

	}



for (int count = 1; count <= 10; count++) {
            for (int display = 1; display <= 10 - count; display++) {
                System.out.print(' ');
            }
            for (int counter = 1; counter <= count; counter++) {
                System.out.print('*');
            }
            System.out.println();
        }

  System.out.println();


   }
}

