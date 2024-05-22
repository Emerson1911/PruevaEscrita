public class App {
    public static void main(String[] args) throws Exception {
        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 34, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Pep", "Guardiola", 50, "E12345");
        Masajista masajista = new Masajista(13, "Juan", "Perez", 40, "Fisioterapia", 15);

        futbolista.concentrarse();
        entrenador.concentrarse();
        masajista.concentrarse();

        futbolista.viajar();
        entrenador.viajar();
        masajista.viajar();

        futbolista.jugarpartido();
        futbolista.entrenador();

        entrenador.dirigirpartido();
        entrenador.dirigirentrenamiento();

        masajista.darmasaje();
    }
}
