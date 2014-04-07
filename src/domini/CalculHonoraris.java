package domini;

public class CalculHonoraris {
	static public double calculaAmbIVA(double factura, double colegi, double asseguransa) {
		double total;
		double iva = 0;
		double ret = 0;
		total = (factura*100+-colegi*100-asseguransa*100-colegi*iva)/(iva-ret+100);
		return total;
	}
	static public double calculaSenseIVA(double factura, double colegi, double asseguransa) {
		double total;
		double ret = 0;
		total = (factura*100+-colegi*100-asseguransa*100)/(-ret+100);
		return total;
	}
}
