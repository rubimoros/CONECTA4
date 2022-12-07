package Modelo;

//Clase vista
public class Tablero {
    public char [][] casillas;
    public final int DIMENSIONX=6;
    public final int DIMENSIONY=7;
    private char vacio;

    public Tablero(){
        this.vacio=' ';
        this.casillas= new char[DIMENSIONX][DIMENSIONY];
        for(int i=0;i< DIMENSIONX;i++){
            for(int j=0;j< DIMENSIONY;j++){
                casillas[i][j]=vacio;
            }
        }
    }

    public char[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(int columna, int fila, char color) {
        this.casillas[columna][fila]=color;
    }

    public boolean lleno() {
        boolean lleno=true;
        for (int i = 0; i < DIMENSIONX; i++) {
            for (int j = 0; j < DIMENSIONY; j++) {
                if(casillas[i][j]==vacio){
                    lleno=false;
                }
            }
        }
        return lleno;
    }

    public void insertarFicha(int columna, Jugador jugador){
      setCasillas(elegirFila(columna),columna,jugador.getColor());
    }
    public int elegirFila(int columna){
        int i=DIMENSIONX-1;
        while(casillas[i][columna]!=vacio){
            i--;
        }
        return i;
    }

}
