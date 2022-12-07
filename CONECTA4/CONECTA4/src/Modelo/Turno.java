package Modelo;
public class Turno {

    private int turno;
    private Jugador[] jugadores;
    private Jugador color;

    public Turno(){
        this.turno=0;
    }

    Turno generarColor(Turno turno){
        if(turno == 0){
            color = 'R';
        }
        else color = 'Y'
    }

    public int actual(){
        return turno;
    }

    public void cambiar(){
        if(turno==0) turno=1;
        else turno=0;
    }
}
