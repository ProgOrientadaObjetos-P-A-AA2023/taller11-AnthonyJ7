package paquete01;

/**
 *
 * @author ASUS
 */
public class MenuDia extends Menu {
    
    private double valorPostre;
    private double valorBebida;
    
    public MenuDia(String n, double vI, double vP, double vB) {
        super(n, vI);
        valorPostre = vP;
        valorBebida = vB;
    }
    
    public void establecerValorPostre(double v) {
        valorPostre = v;
    }
    
    public void establecerValorBebida(double v) {
        valorBebida = v;
    }
    
    // Sobre escritura del método abstracto de la superclase
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }
    
    public double obtenerValorPostre() {
        return valorPostre;
    }
    
    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\nMenú del Día:\n"
                + "Plato: %s\n"
                + "Valor Inicual: $%.2f\n"
                + "Valor Bebida: $%.2f\n"
                + "Valor Postre: $%.2f\n"
                + "Valor Menú: $%.2f\n",
                nombrePlato,
                valorInicial,
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;
    }
    
}
