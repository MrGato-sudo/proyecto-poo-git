java
public class Proyecto {
    private String nombre;

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }
}

package gestionproyectos;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<Tarea> tareas;
    
    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }
    
    // NUEVO MÉTODO: calcularAvance()
    public double calcularAvance() {
        if (tareas.isEmpty()) {
            return 0.0;
        }
        
        int completadas = 0;
        for (Tarea tarea : tareas) {
            if (tarea.getEstado().equals("completada")) {
                completadas++;
            }
        }
        
        return (double) completadas / tareas.size() * 100;
    }
}
