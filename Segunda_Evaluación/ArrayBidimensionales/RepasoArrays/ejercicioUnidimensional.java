package RepasoArrays;

public class ejercicioUnidimensional {

	public static void main(String[] args) {
		double ta[]= {3,2,5,1};
		double tb[]= {93.23,3.5,8.24,4.5};
		double tc[]= {0.0,0.0,3.2,1.8};
		System.out.println(esMayor(tb,ta));
		System.out.println(esMayor(ta, tb));
		System.out.println(esMayor(tc, ta));
		operarTabla(ta);
	}

	private static boolean esMayor(double[] tb, double[] ta) {
		double suma1=0,suma2=0;
		boolean salida=false;
		for (int i=0;i<tb.length;i++) {
			suma1+=tb[i];
		}
		for (int i=0;i<ta.length;i++) {
			suma2+=ta[i];
		}
		if(suma1>suma2) {
			salida=true;
		}
	return salida;
			
	}
	private static void operarTabla(double[] ta) {
		int contador=1;
		for (int i=0;i<=ta.length;i++) {
			contador++;
		}
		contador=contador/2;
		double[]nuevatabla=new double[contador];
		for (int j=0;j<nuevatabla.length;j+=2) {
			nuevatabla[j]=ta[j]+ta[j+1];
		}
		for(int i=0; i<nuevatabla.length; i++){
		    System.out.print("["+nuevatabla[i]+"]");
		}
	}

}

