package gestionproyectos;

public class Mago extends Tarea {
    private String hechizo;
    private int nivelMana;
    
    // Constructor
    public Mago(String nombre, String hechizo, int nivelMana) {
        super(nombre);  // Llama al constructor de Tarea
        this.hechizo = hechizo;
        this.nivelMana = nivelMana;
    }
    
    // Método 1: lanzarHechizo()
    public void lanzarHechizo() {
        System.out.println("El mago " + getNombre() + " lanza " + hechizo + "!");
        nivelMana -= 10;
        if (nivelMana < 0) nivelMana = 0;
    }
    
    // Método 2: recargarMana()
    public void recargarMana(int cantidad) {
        nivelMana += cantidad;
        System.out.println("El mago " + getNombre() + " recarga " + cantidad + " puntos de mana. Mana actual: " + nivelMana);
    }
}
