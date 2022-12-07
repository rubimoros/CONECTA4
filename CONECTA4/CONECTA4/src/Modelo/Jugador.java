package Modelo;

public class Jugador {
    private char color;
    private Tablero tablero;

    public Jugador(char color,Tablero tablero){
        this.color=color;
        this.tablero=tablero;
    }

    public Turno turnoColor(Turno turno){
        return turno.generarColor(turno);
    }

    public void setTablero(Tablero tablero){
        this.tablero=tablero;
    }
    public Tablero getTablero(){
        return this.tablero;
    }

}
