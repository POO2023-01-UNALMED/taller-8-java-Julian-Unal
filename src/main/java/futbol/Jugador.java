package futbol;

public class Jugador extends Futbolista{
    public Short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, Short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public int compareTo(Object f) {
        if (f instanceof Futbolista){
            int diff = this.getEdad() - ((Futbolista) f).getEdad();
            if (diff<0) {
                diff= diff*-1;
            }
            return diff;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+" con el dorsal "+dorsal+ ". Ha marcado "+golesMarcados;
    }
}
