public class Masajista extends Personas {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(String titulacion, int aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " "+"El masajista no soba");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " "+"La masajista viaja mucho");
    }

    public void darmasaje() {
        System.out.println(getNombre() + " "+"La masajista da el masaje");
    }

}
