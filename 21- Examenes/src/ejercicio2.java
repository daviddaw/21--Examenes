
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		
		System.out.println("Introduce un numero: ");
		x=LeerTeclado.readInteger();
		
		System.out.println(suma(x));
	}
	
	public static int suma (int x){
		int cont=0;
		if (x<10){
          return x;

		}

		else {

         cont=cont+(x%10);

			return cont+suma(x/10);

		}
			
		}

}
