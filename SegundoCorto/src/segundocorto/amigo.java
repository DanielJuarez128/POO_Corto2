package segundocorto;

/**
 * 00012922 Daniel Isaías Juárez Gutiérrez, sección 01
 * 00117222 Paola Alexandra Pérez Pérez, sección 01
 */
public class amigo {
    
    private String nombre;
    private int edad;

    public amigo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdas(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
}
