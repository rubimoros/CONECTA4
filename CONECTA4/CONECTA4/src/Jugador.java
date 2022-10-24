public class Jugador {
    private char color;
    private Tablero tablero;

    public Jugador(char color,Tablero tablero){
        this.color=color;
        this.tablero=tablero;
    }
    public void setTablero(Tablero tablero){
        this.tablero=tablero;
    }
    public Tablero getTablero(){
        return this.tablero;
    }


    public void poner() {
        Console console = new Console();
        int aux;
       do{
           System.out.println("Elige columna para poner ficha: ");
           aux = console.leer();
       }while(!tablero.validarColumna(aux));
       aux--;
        tablero.setCasillas(tablero.elegirFila(aux),aux,this.color);
    }
}
