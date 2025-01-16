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
        Scanner s = new Scanner(System.in);
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        int menu;
      
        miGimnasio.registrarUsuario("Juan Perez");
    }
     do {
            System.out.println();
            System.out.println(" MENU ");
            System.out.println("--------------------");
            System.out.println(" 1- Mostrar actividades: ");
            System.out.println(" 2- Registrar usuario:");
            System.out.println(" 3- Mostrar usuarios registrados");
            System.out.println(" 0- Salir");
            System.out.print(" Introduzca la opción deseada:");
            menu = s.nextInt();
            s.nextLine();

            switch (menu) {
                case 1:
                    miGimnasio.mostrarActividades();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombreUsuario = s.nextLine();
                    miGimnasio.registrarUsuario(nombreUsuario);
                    break;
                case 3:
                    miGimnasio.mostrarUsuariosRegistrados();
                    break;
                case 0:
                    System.out.print(" Salir ");
                    break;
                default:
                    System.out.print(" Opción no válida");

            }
        } while (menu != 0);
    
}
