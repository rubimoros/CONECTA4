package Consola;

import java.util.Scanner;

import Modelo.Resultado;
import Modelo.Tablero;
import Modelo.Turno;
import Servicio.Servicio;

public class Console {
    private final Servicio servicio;
    private final Vista vista;
    private final Scanner sc;
    public final static String MENU = "Conecta4_MENU(Jugar,Salir)";
    public final static String JUGAR = "JUGAR";
    public final static String SALIR = "SALIR";


    public Console(Servicio servicio, Vista vista) {
        this.servicio = servicio;
        this.vista = vista;
        this.sc = new Scanner(System.in);
    }



    public int pedirColumna() {
        int aux;
        do{
            System.out.println("Elige columna para poner ficha: ");
            aux = leer();
        }while(aux<0&&aux>7);
    return aux;
    }

    public int leer() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }



    public void start() {
        vista.print("CONECTA 4");

        Resultado res = new Resultado(new Tablero());
        this.vista.visualizarTablero(res.getTablero());
        boolean ganador = false;
        do {
            this.vista.visualizarTablero(servicio.getPartida().getTablero());
            Tablero tab = res.getTablero();
            Turno turn = this.servicio.getTurno();
            this.vista.visualizarTurno(turn);
            int column = this.pedirColumna();
            res = this.servicio.play(column);

            this.vista.visualizarTablero(tab);
            if(this.servicio.hayGanador())
                ganador = true;
            else
                this.vista.print("No hay ganador");

        } while (!ganador);

    }

        private void stop() {
            this.vista.print("Ha salido");
        }
        
        
        
        public String leer(Scanner sc) {
            this.vista.print(Console.MENU);
            String comm = sc.next();
            switch (comm.toUpperCase()) {
                case Console.JUGAR:
                    this.start();
                    break;
                case Console.SALIR:
                    this.stop();
                    break;
                default:
                    throw new UnsupportedOperationException("Este comando no existe " + comm);
            }
            return comm;
        }


    public void mensajeValido() {
        Scanner mensaje = new Scanner(System.in).useDelimiter(CLI.DELIMITER_ANY_WHITE_SPACE);
        String comando;
        do {
            comando = leer(mensaje);
        } while (mensaje != null && !Console.SALIR.equalsIgnoreCase(comando.toUpperCase()));
    }

}
