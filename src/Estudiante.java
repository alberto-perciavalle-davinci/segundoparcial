import java.util.ArrayList;

public class Estudiante extends Usuario{

    //ATRIBUTOS
    private String carrera;
    private ArrayList<String> materiasAprobadas = new ArrayList<String>();
    private ArrayList<String> materiasInscriptas = new ArrayList<String>();

    //CONSTRUCTOR
    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    //Getters
    public String getCarrera() {
        return carrera;
    }

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    //Setters
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    //METODOS
    public void imprimirMateriasAprobadas(){
        System.out.println("Materias Aprobadas " + materiasAprobadas);
    }

    public void imprimirMateriasInscriptas(){
        System.out.println("Materias Inscriptas " + materiasInscriptas);
    }

}
