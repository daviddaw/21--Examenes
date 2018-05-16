
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="nombre";
		int nota1, nota2, nota3;
		
		Alumno a1, a2;
		
			a1= new Alumno(nombre);
			a2= new Alumno(nombre);
			
		System.out.println("Introduce nombre para a1");
		nombre=LeerTeclado.readString();
		a1.setNombre(nombre);
		System.out.println("Introduce nombre para a2");
		nombre=LeerTeclado.readString();
		a2.setNombre(nombre);
		
		System.out.println();
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println();
		
		System.out.println("Intrdoce nota1 para a1");
		nota1=LeerTeclado.readInteger();
		System.out.println("Intrdoce nota2 para a1");
		nota2=LeerTeclado.readInteger();
		System.out.println("Intrdoce nota3 para a1");
		nota3=LeerTeclado.readInteger();
		
		a1.evaluar(nota1, nota2, nota3);
		System.out.println();
		
		System.out.println("Intrdoce nota1 para a2");
		nota1=LeerTeclado.readInteger();
		System.out.println("Intrdoce nota2 para a2");
		nota2=LeerTeclado.readInteger();
		System.out.println("Intrdoce nota3 para a2");
		nota3=LeerTeclado.readInteger();
		
		a2.evaluar(nota1, nota2, nota3);
		System.out.println();
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println();
		
		if(a1.getNotafinal()>a2.getNotafinal()){
			
			System.out.println("a1 tiene la nota más alta");
		}else 
			System.out.println("a2 tiene la nota más alta");
	}

}
