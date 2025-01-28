package Cuaderno_Composición_De_Clases;

public class Pack {
	private String nombrepack;
	private Figura figuras[];

	public Pack(String nombrepack) {
		this.nombrepack=nombrepack;
		this.figuras=new Figura[6];
	}

	public String getNombrepack() {
		return nombrepack;
	}

	public void setNombrepack(String nombrepack) {
		this.nombrepack = nombrepack;
	}

	public Figura[] getFiguras() {
		return figuras;
	}

	public void setFiguras(Figura[] figuras) {
		this.figuras = figuras;
	}
	public boolean AnyadirFigura(Figura figura) {
		boolean añadeonoañade = false;
		for (int i=0;i<figuras.length;i++) {
		if(this.figuras[i]== null) {
			this.figuras[i]=figura;
			 añadeonoañade=true;
			i=figuras.length;
			//También para cerrar el bucle for se podria añadir 
			// en el if && encontrado==false  
		}
		}
		return añadeonoañade;
	}
}
