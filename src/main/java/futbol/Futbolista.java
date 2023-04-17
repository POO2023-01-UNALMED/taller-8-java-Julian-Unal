package futbol;

import java.util.Objects;

public abstract class Futbolista implements Comparable {
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    public abstract boolean jugarConLasManos();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return edad == that.edad && Objects.equals(nombre, that.nombre) && Objects.equals(posicion, that.posicion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, posicion);
    }

    public String toString(){
        return "El futbolista "+nombre+" tiene "+edad+ ", y juega de "+ posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
}
