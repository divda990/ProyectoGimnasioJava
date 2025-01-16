import java.util.Scanner;
import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};
    private ArrayList<String> Usuarios;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        this.Usuarios = new ArrayList<>();
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void registrarUsuario(String usuario) {
        Usuarios.add(nombreUsuario);
        System.out.println("Usuario " + usuario + " registrado en el gimnasio " + nombre + ".");
    }
    public void mostrarUsuariosRegistrados() {
        System.out.println("Usuarios registrados:");
        for (String usuario : Usuarios) {
            System.out.println(usuario);
        }
    }

    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez");
    }
}
