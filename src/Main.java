public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor(100 ," John "," Doe ");
        System.out.println(profesor);

        Estudiante estudiante = new Estudiante(36644960 ," Alberto Kevin "," Perciavalle "," Analista ");
        System.out.println(estudiante);


        estudiante.getMateriasInscriptas().add("POO");


        estudiante.getMateriasInscriptas().add("Matematica");


        estudiante.getMateriasAprobadas().add("Comunicacion Visual");


        estudiante.getMateriasAprobadas().add("Base de Datos");


        estudiante.getMateriasAprobadas().add("Sistemas Empresariales");

        estudiante.imprimirMateriasAprobadas();

        estudiante.imprimirMateriasInscriptas();


    }

}
