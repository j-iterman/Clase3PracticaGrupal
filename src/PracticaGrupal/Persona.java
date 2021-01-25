package PracticaGrupal;

public class Persona implements Precedable<Persona>{

    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        setNombre(nombre);
        setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Persona persona){
        return persona.getDni() - getDni();
    }

    @Override
    public String toString() {
        return nombre  + " " + dni;
    }
}
