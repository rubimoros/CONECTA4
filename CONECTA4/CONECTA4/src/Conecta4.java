public class Conecta4{

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;


    public Conecta4(){
        this.tablero = new Tablero();
        this.turno = new Turno();
        this.jugadores =new Jugador[2];
        this.jugadores[0]=new Jugador('R',tablero);
        this.jugadores[1]=new Jugador('Y',tablero);
    }
    public void run() {
        System.out.println("---CONECTA 4---");
        tablero.visualizar();
        do{
            turno.visualizar();
            jugadores[turno.actual()].poner();
            turno.cambiar();
            tablero.visualizar();
        }while(!tablero.lleno());
    }




}
