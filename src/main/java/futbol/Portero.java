package futbol;

public class Portero extends Futbolista{
    public Short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, Short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public Portero(Short golesRecibidos, byte dorsal) {
        super("Maradona", 30, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Object f) {
        if (f instanceof Portero){
            int diff = this.getGolesRecibidos() - ((Portero) f).getGolesRecibidos();
            if (diff<0) {
                diff= diff*-1;
            }
            return diff;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+" con el dorsal "+dorsal+ ". Le han marcado "+golesRecibidos;
    }

    public Short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(Short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
