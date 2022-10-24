public class Tablero {
    private char [][] casillas;
    private final int DIMENSIONX=6;
    private final int DIMENSIONY=7;
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

    public void setCasillas(int columna,int fila,char x) {
        this.casillas[columna][fila]=x;
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

    public boolean validarColumna(int columna){
        if(columna>0&&columna<8) {
            if (casillas[0][columna - 1] == vacio) {
                return true;
            }
            System.out.println("Columna completa!!!");
            return false;
        }

        System.out.println("Columna no valida!!! Valores[1-7]");
        return false;
    }

    public int elegirFila(int columna){
        int i=DIMENSIONX-1;
        while(casillas[i][columna]!=vacio){
            i--;
        }
        return i;
    }

    public void visualizar(){
        System.out.println("---------------");
        for (int i = 0; i < DIMENSIONX; i++) {
            System.out.print("|");
            for (int j = 0; j < DIMENSIONY; j++) {
                System.out.print(casillas[i][j]);
                System.out.print("|");

            }
            System.out.println();
        }
       System.out.println("---------------");
    }

}
