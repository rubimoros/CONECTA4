public class Turno {
    private int turno;

    public Turno(){
        this.turno=0;
    }

    public int actual(){
        return turno;
    }

    public void cambiar(){
       if(turno==0) turno=1;
       else turno=0;
    }

    public void visualizar() {
        if(turno==0) {
            System.out.println("Turno: RED");
        }else{
            System.out.println("Turno: YELLOW");
        }
    }
}
