package gestionproyectos;

public class Guerrero extends Tarea {
    private String arma;
    private int nivelPoder;
    
    // Constructor
    public Guerrero(String nombre, String arma, int nivelPoder) {
        super(nombre);  // Llama al constructor de Tarea
        this.arma = arma;
        this.nivelPoder = nivelPoder;
    }
    
    // Métodos getter y setter
    public String getArma() {
        return arma;
    }
    
    public void setArma(String arma) {
        this.arma = arma;
    }
    
    public int getNivelPoder() {
        return nivelPoder;
    }
    
    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
    
    // Método adicional
    public void atacar() {
        System.out.println("El guerrero " + getNombre() + " ataca con " + arma + "!");
    }
}
