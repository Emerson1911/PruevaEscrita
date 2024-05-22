public class Entrenador extends Personas {
    private String idFederacion;

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " "+"El en trenador le pega");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " "+"El entrenador gasta cuando viaja");
    }

    public void dirigirpartido() {
        System.out.println(getNombre() + " "+"El es un entrenador no dirige");
    }

    public void dirigirentrenamiento() {
        System.out.println(getNombre() + " "+"El es dirige el entrenamiento");
    }
}