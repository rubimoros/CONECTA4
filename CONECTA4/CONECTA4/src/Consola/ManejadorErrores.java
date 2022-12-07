package Consola;

public class ManejadorErrores {
    private final Console consola;
    private final Vista vista;

    public ManejadorErrores(Console consola, Vista vista) {
        this.consola = consola;
        this.vista = vista;
    }

    public void manejadorErrores(){
        try {
            this.consola.mensajeValido();
        }catch (Exception e){
            this.vista.print("ERROR (" + e.getClass().getSimpleName() + ")" + e.getMessage());
            this.manejadorErrores();
        }
    }
}