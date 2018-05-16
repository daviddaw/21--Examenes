package segundoExamen;

public class Museo {
	static Cuadro arrayCuadros[];
	Sala arraySalas[];
public static void main(String[] args) {
	String nombre;
	String autor;
	double altura;
	
	

		int n1,n2,menu;
		System.out.println("============================");
		System.out.println("       Menú principal");
		System.out.println(" ");
		
		System.out.println("============================");
		System.out.println(" ");
		System.out.println("> Pulse 1 dar de alta un cuadro");
		System.out.println("> Pulse 2 para cerrar la sala 2 temporalmente");
	
		System.out.println(" ");
		System.out.println("============================");
		menu=LeerTeclado.readInteger();
		switch (menu) {
		case 1:altaCuadro();

		break;

		default:System.out.println("No has introducido ningun numero");
		break;
		}
		System.out.println(" ");
	
		System.out.println("Sesión finalizada.");
	}
public static void altaCuadro() {
	String resp;

	int numeroSala;
	double alturaCuadro;
	String nombrecuadro;
    Sala salaAux;
	Cuadro cuadroAux;
    arrayCuadros=new Cuadro[3];


	do { 



		System.out.println("Dime el numero de sala 1 o 2");
		numeroSala=LeerTeclado.readInteger();
		 numeroSala = Sala.getNumeroSala();
		 System.out.println("nombre del cuadro");
		 nombrecuadro=LeerTeclado.readString();
		 System.out.println("autor del cuadro");
		 String autorCuadro=LeerTeclado.readString();
		 System.out.println("altura del cuadro");
		 alturaCuadro=LeerTeclado.readDouble();
		 
		 
		cuadroAux=new Cuadro(nombrecuadro,autorCuadro,alturaCuadro);
		
		arrayCuadros[0]=cuadroAux;
				
				
		System.out.println(cuadroAux.toString());
		 
		 
		System.out.println("¿Deseas dar de alta otro cuadro (s/n)");
             
		
		
		
		
		
		resp=LeerTeclado.readString();



	}while (resp.toLowerCase().equals("s"));





	
}

}
