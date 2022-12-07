package Servicio;


import Modelo.Partida;
import Modelo.Resultado;
import Modelo.Tablero;
import Modelo.Turno;
import javafx.scene.control.Tab;

public class Servicio {
    private final Partida partida;
    private final Tablero tablero;

    public Servicio(Partida partida) {
        this.partida = partida;
    }
    public Resultado play(int columna){
        Resultado resultado = partida.run(columna);
        return resultado;
    }

    public Tablero getTablero() {
        return this.tablero;
    }


    public Partida getPartida(){
        return partida;
    }


    public Turno getTurno(){
        return partida.getTurno();
    }

}
