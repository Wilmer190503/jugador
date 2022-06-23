package ejecutable;

import modelo.Equipo;
import modelo.Jugador;

public class test {
    public static void main(String[] args)
    {
        Equipo Equipo1 = new Equipo("Andrés",19);
        Jugador Jugador1 = new Jugador("Messi", 23, 10);
        Equipo1.crearJugador();
        System.out.println(Equipo1.toString());
    }
    
}
