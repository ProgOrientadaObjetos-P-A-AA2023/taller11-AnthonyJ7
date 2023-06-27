package paquete01;



/**
 *
 * @author santy
 */
public class MenuNinios extends Menu {
    
    private double valorPorcionHelado;
    private double valorPorcionPastel;
    
    public MenuNinios(String n, double vI, double vH, double vP) {
        super(n, vI);
        valorPorcionHelado = vH;
        valorPorcionPastel = vP;
    }
    
    public void establecerValorPorcionHelado(double v) {
        valorPorcionHelado = v;
    }
    
    public void establecerValorPorcionPastel(double v) {
        valorPorcionPastel = v;
    }
    
    // Sobre escritura del método abstracto de la superclase
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPorcionHelado + valorPorcionPastel;
    }
    
    public double obtenerValorPorcionHelado() {
        return valorPorcionHelado;
    }
    
    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\nMenú de Niños:\n"
                + "Plato: %s\n"
                + "Valor Inicual: $%.2f\n"
                + "Valor Helado: $%.2f\n"
                + "Valor Pastel: $%.2f\n"
                + "Valor Menú: $%.2f\n",
                nombrePlato,
                valorInicial,
                valorPorcionHelado,
                valorPorcionPastel,
                valorMenu);
        return cadena;
    }
    
}
