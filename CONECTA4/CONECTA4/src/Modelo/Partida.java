package Modelo;


public class Partida {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;


    public Partida(){
        this.tablero = new Tablero();
        this.turno = new Turno();
        this.jugadores =new Jugador[2];
        this.jugadores[0]=new Jugador('R',tablero);
        this.jugadores[1]=new Jugador('Y',tablero);
    }

    public Turno getTurno() {
        return turno;
    }

    public Tablero getTablero(){
        return this.tablero;
    }

    public Resultado run(int columna) {
        if(turno.actual()==0) {
            tablero.insertarFicha(columna, jugadores[0]);

        }else if(turno.actual()==1){
            tablero.insertarFicha(columna,jugadores[1]);
        }
        turno.cambiar();
        return new Resultado(tablero);

    }


}
