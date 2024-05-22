public class Futbolista extends Personas {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " "+getEdad()+"El es muy consentrado futbolista");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " "+getEdad()+"el jugador no le gusta viajar");
    }

    public void jugarpartido() {
        System.out.println(getNombre() + " "+getEdad()+"el jugador no juegapartido");
    }

    public void entrenador() {
        System.out.println(getNombre() + " "+"El es un entrenador");
    }

}