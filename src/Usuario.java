public abstract class Usuario {

    //ATRIBUTOS
    private int dni;
    private String nombre;
    private String apellido;

    //CONSTRUCTOR
    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //METODOS


    //Getters
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //Setters
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Metodo toString
    @Override
    public String toString(){
        return "El dni del " + nombre + "es " + dni;
    }
}
