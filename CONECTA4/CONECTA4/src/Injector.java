
import Consola.Console;
import Consola.ManejadorErrores;
import Consola.Vista;
import Modelo.Partida;
import Servicio.Servicio;

public class Injector {
    public void inject(){
             Partida partida = new Partida();
            Vista vista = new Vista();
            Servicio servicio = new Servicio(partida);
            Console console = new Console(servicio, vista);
            ManejadorErrores manejadorError = new ManejadorErrores(console,vista);
            manejadorError.manejadorErrores();
    }
}