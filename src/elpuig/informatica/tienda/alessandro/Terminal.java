package elpuig.informatica.tienda.alessandro;

import java.util.Scanner;

public class Terminal {
    Scanner in;


    Terminal(){
        in = new Scanner(System.in);
    }



    public Trabajador añadirEmpleado(){



        this.clearScreen();
        in.nextLine();
        System.out.println("╔═════════════════════╗");
        System.out.println("║    Ingrese el ID    ║");
        System.out.println("╚═════════════════════╝");
        String id = this.in.nextLine();

        this.clearScreen();
        System.out.println("╔═════════════════════╗");
        System.out.println("║  Ingrese el Nombre  ║");
        System.out.println("╚═════════════════════╝");
        String nombre = this.in.nextLine();

        this.clearScreen();
        System.out.println("╔═════════════════════╗");
        System.out.println("║ Ingrese el Apellido ║");
        System.out.println("╚═════════════════════╝");
        String apellido = this.in.nextLine();

        Departamento departamento = elegirDepartamento();

        return new Trabajador(id, nombre, apellido, departamento);

    }

    public Dispositivo añadirDispositivo(){

        TipoDispositivo tipoDispositivo = elegirTipoDispositivo();

        this.clearScreen();
        in.nextLine();
        System.out.println("╔═════════════════════╗");
        System.out.println("║  Ingrese la Marca   ║");
        System.out.println("╚═════════════════════╝");
        String marca = this.in.nextLine();

        this.clearScreen();
        System.out.println("╔═════════════════════╗");
        System.out.println("║  Ingrese el Modelo  ║");
        System.out.println("╚═════════════════════╝");
        String modelo = this.in.nextLine();

        this.clearScreen();
        System.out.println("╔═════════════════════╗");
        System.out.println("║  Ingrese el Precio  ║");
        System.out.println("╚═════════════════════╝");
        float precio = Float.parseFloat(this.in.nextLine());

        return new Dispositivo(tipoDispositivo, marca, modelo, precio);
    }



    public Departamento elegirDepartamento(){
        this.clearScreen();
        System.out.println("╔═════════════════════╗");
        System.out.println("║  Elige Departamento ║");
        System.out.println("╠═════════════════════╣");
        System.out.println("║    1: MARKETING     ║");
        System.out.println("║     2: ARREGLO      ║");
        System.out.println("║     3: TIENDA       ║");
        System.out.println("║  4: ADMINISTRACION  ║");
        System.out.println("║    DEFECTO: OTRO    ║");
        System.out.println("╚═════════════════════╝");

        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                return Departamento.MARKETING;
            case 2:
                return Departamento.ARREGLO;
            case 3:
                return Departamento.TIENDA;
            case 4:
                return Departamento.ADMINISTRACION;
            default:
                System.out.println("Opción macada a OTRO");
                return Departamento.OTRO;

        }

    }

    public TipoDispositivo elegirTipoDispositivo(){
        this.clearScreen();
        System.out.println("╔═════════════════════╗");
        System.out.println("║ Tipo de Dispositivo ║");
        System.out.println("╠═════════════════════╣");
        System.out.println("║     1: PC           ║");
        System.out.println("║     2: MOVIL        ║");
        System.out.println("║     3: TABLET       ║");
        System.out.println("║     4: TELEVISION   ║");
        System.out.println("║     5: PERIFERICO   ║");
        System.out.println("║     DEFECTO: OTRO   ║");
        System.out.println("╚═════════════════════╝");

        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                return TipoDispositivo.PC;
            case 2:
                return TipoDispositivo.MOVIL;
            case 3:
                return TipoDispositivo.TABLET;
            case 4:
                return TipoDispositivo.TELEVISION;
            case 5:
                return TipoDispositivo.PERIFERICO;
            default:
                System.out.println("Opción macada a OTRO");
                return TipoDispositivo.OTRO;

        }

    }







    public int elMenu(){
        //this.clearScreen(); 
        System.out.println("╔════════════════════════════╗");
        System.out.println("║   1: Añadir Trabajador     ║");
        System.out.println("║   2: Mostrar Trabajadores  ║");
        System.out.println("║   3: Añadir Dispositivo    ║");
        System.out.println("║   4: Mostrar Dispositivos  ║");
        System.out.println("╚════════════════════════════╝");

        int opcion = in.nextInt();

        return opcion;
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
