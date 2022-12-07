package Consola;
import Modelo.Tablero;
import Modelo.Turno;
public class Vista {
    private Turno turno;
    private Tablero tablero;

    public void visualizarTurno(Turno turno) {
        if(turno.actual()==0) {
            System.out.println("Turno: RED");
        }else{
            System.out.println("Turno: YELLOW");
        }
    }
    public void print(String mensaje){
        System.out.println(mensaje);
    }
    public void visualizarTablero(Tablero tablero){
        System.out.println("---------------");
        for (int i = 0; i < tablero.DIMENSIONX; i++) {
            System.out.print("|");
            for (int j = 0; j < tablero.DIMENSIONY; j++) {
                System.out.print(tablero.casillas[i][j]);
                System.out.print("|");

            }
            System.out.println();
        }
        System.out.println("---------------");
    }

}
