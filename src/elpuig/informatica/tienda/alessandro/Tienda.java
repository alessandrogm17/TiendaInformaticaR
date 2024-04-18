package elpuig.informatica.tienda.alessandro;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Trabajador>trabajadores;
    private ArrayList<Dispositivo>dispositivos;


    public Tienda(){
        this.trabajadores = new ArrayList<Trabajador>();
        this.dispositivos = new ArrayList<Dispositivo>();

    }

    public void mostrarInformacionDelTrabajador() {
        System.out.println("___             o                   ");
        System.out.println(" |  __ _ |_  _  |  _  _| _  __ _  _ ");
        System.out.println(" |  | (_||_)(_|_| (_|(_|(_) | (/__> ");
        if (this.trabajadores.isEmpty()) {
            System.out.println("No hay nadie aún, añade a algún trabajador ;)");
            System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        } else {
            for (Trabajador t : this.trabajadores) {
                t.infomarcionTrabajador();
            }
        }
    }

    public void agregarTrabajador(Trabajador trabajador) {
        this.trabajadores.add(trabajador);
    }

    public void mostrarInformacionDelDispositivo(){
        System.out.println(" _        _                         ");
        System.out.println("| \\ o  _ |_) _  _  o _|_ o     _  _ ");
        System.out.println("|_/ | _> |  (_)_>  |  |_ | \\_/(_)_> ");
        if (this.dispositivos.isEmpty()) {
            System.out.println("No hay ningun dispositivo, toca rellenar el almacen ;)");
            System.out.println("═══════════════════════════════════════════════════════════════════════════");
        } else {
            for (Dispositivo d : this.dispositivos) {
                d.informacionDispositivo();
            }
        }
    }

    public void agregarDispositivo(Dispositivo dispositivo){
        this.dispositivos.add(dispositivo);
    }

    public Trabajador buscarTrabajador(String id) {
        for (Trabajador t : this.trabajadores) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }


    //___   ___ _____ _  _  _  _
    // | |\| | /   | |_|| \/ \|_)
    //_|_| |_|_\___|_| ||_/\_/| \
    public void Iniciador(){
        Terminal menu = new Terminal();
        Tienda tienda = new Tienda();

        while (true) {
            int opcion = menu.elMenu();

            switch (opcion) {
                case 1:
                    Trabajador nuevoTrabajador = menu.añadirEmpleado();
                    tienda.agregarTrabajador(nuevoTrabajador);
                    break;
                case 2:
                    tienda.mostrarInformacionDelTrabajador();
                    break;
                case 3:
                    Dispositivo nuevoDispotivo = menu.añadirDispositivo();
                    tienda.agregarDispositivo(nuevoDispotivo);
                    break;
                case 4:
                    tienda.mostrarInformacionDelDispositivo();
                    break;
                case 0: System.exit(0);
            }
        }
    }


}
