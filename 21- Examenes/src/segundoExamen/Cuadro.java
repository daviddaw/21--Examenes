package segundoExamen;

public class Cuadro {
		private String nombre;
		private String autor;
		private double altura;
		
		
		
		public Cuadro(String nombre, String autor, double altura) {
			this.nombre = nombre;
			this.autor = autor;
			this.altura = altura;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		

	
		}
