package segundoExamen;

public class Sala {
	static int cont;
private static int numeroSala;
private int capacidadSala;
private double alturaMax;
private Cuadro arrayCuadros;
public Sala(int capacidadSala, double alturaMax) {
	numeroSala=cont;
	cont++;
	this.capacidadSala = capacidadSala;
	this.alturaMax = alturaMax;
	
}
public static int getNumeroSala() {
	return numeroSala;
}
public void setNumeroSala(int numeroSala) {
	this.numeroSala = numeroSala;
}
public int getCapacidadSala() {
	return capacidadSala;
}
public void setCapacidadSala(int capacidadSala) {
	this.capacidadSala = capacidadSala;
}
public double getAlturaMax() {
	return alturaMax;
}
public void setAlturaMax(double alturaMax) {
	this.alturaMax = alturaMax;
}

public void altaCuadro() {
	



	System.out.println("Alta de cuadro");


}





@Override
public String toString() {
	return "Sala [numeroSala=" + numeroSala + ", capacidadSala="
			+ capacidadSala + ", alturaMax=" + alturaMax + ", arrayCuadros="
			+ arrayCuadros + "]";
}



}
