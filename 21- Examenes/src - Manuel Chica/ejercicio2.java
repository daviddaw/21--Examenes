
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		
		System.out.println("Introduce un numero: ");
		x=LeerTeclado.readInteger();
		
		suma(x);
	}
	
	public static void suma (int x){
		
		if (x<10){

			System.out.print(x);

		}

		else {

			System.out.print(x%10);

			suma(x/10);

		}
			
		}

}
