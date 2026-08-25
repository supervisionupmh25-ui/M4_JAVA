package S09.abstraccion;

public abstract class Envio {
    // Atributo
    protected String destino;


    // Constructor
    public Envio(String destino) {
        this.destino = destino;
    }


    // Método abstracto
    public abstract double calcularCosto(double peso);
}
