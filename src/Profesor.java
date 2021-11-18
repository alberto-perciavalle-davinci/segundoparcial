import java.util.ArrayList;

public class Profesor extends Usuario{

    //ATRIBUTOS
    private ArrayList<String> comisiones = new ArrayList<String>();

    //CONSTRUCTORES
    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);

    }

    //METODOS
    public void imprimirComisiones(){
        System.out.println("Comisiones");
    }


    //Getter
    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    //Setter
    public void setComisiones(ArrayList<String> comisiones) {
        comisiones = comisiones;
    }
}
