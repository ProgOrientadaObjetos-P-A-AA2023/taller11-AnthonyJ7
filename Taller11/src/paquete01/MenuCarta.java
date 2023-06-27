package paquete01;



/**
 *
 * @author ASUS
 */
public class MenuCarta extends Menu {
    
    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;
    
    public MenuCarta(String n, double vI, double vP, double vB,
            double p) {
        super(n, vI);
        valorPorcionGuarnicion = vP;
        valorBebida = vB;
        porcentajeAdicional = p;
    }
    
    public void establecerValorPorcionGuarnicion(double v) {
        valorPorcionGuarnicion = v;
    }
    
    public void establecerValorBebida(double v) {
        valorBebida = v;
    }
    
    public void establecerPorcentajeAdicional(double p) {
        porcentajeAdicional = p;
    }
    
    // Sobre escritura del método abstracto de la superclase
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPorcionGuarnicion + valorBebida +
                (valorInicial * (porcentajeAdicional/100));
    }
    
    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }
    
    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\nMenú a la Carta:\n"
                + "Plato: %s\n"
                + "Valor Inicual: $%.2f\n"
                + "Valor Guarnición: $%.2f\n"
                + "Valor Bebida: $%.2f\n"
                + "Porcentaje Adicional: %.2f%%\n"
                + "Valor Menú: $%.2f\n",
                nombrePlato,
                valorInicial,
                valorPorcionGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return cadena;
    }
    
}
