public class Personas {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Personas() {
    }

    public Personas(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void concentrarse() {
        System.out.println(getNombre() + " "+"el es un jugador consentrado");
    }

    public void viajar() {
        System.out.println(getNombre() + " "+getEdad()+"el jugador viaja mucho");
    }

}
