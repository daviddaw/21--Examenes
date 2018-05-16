
public class Alumno {

	private String nombre;
	private double notaFinal;
	private boolean repetidor;
	
	public Alumno (String nombre){
		
		this.nombre=nombre;
		repetidor=false;
	}
	
	public String getNombre (){
		
		return nombre;
	}
	
	public double getNotafinal (){
		
		return notaFinal;
	}
	
	public void setNombre (String nombre){
		
		this.nombre=nombre;
	}
	
	public void evaluar (double nota1, double nota2, double nota3){
		
		notaFinal=(nota1+nota2+nota3)/3;
		
		if (notaFinal<5){
			
			repetidor=true;
			System.out.println("El alumno tiene que repetir");
		}
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", notaFinal=" + notaFinal
				+ ", repetidor=" + repetidor;
	}
	
	
	
	
	
}
