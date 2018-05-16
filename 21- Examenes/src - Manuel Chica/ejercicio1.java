
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0, y=0;
		
		do{
			
			System.out.println("Introduce un número");
			x=LeerTeclado.readInteger();
			
			if (x>0){
				
				y=contarDivisores(x);
			}
			
		}while (x!=0);
		
		System.out.print("El número que más divisores tiene es "+ y);
		
	}
	
	public static int contarDivisores(int x){
		
		int cd=1, aux=0, aux1=0;
		
		for(int i=2;i<x/2; i++){
		
			if(x%i==0){
				
				cd++;
				
			}
		}
	
		if (cd>=aux){
			
			aux=cd;
			aux1=x;
		}
		
		System.out.println(aux1);
		cd=0;
		return aux1;
			
		}	
		
	}
