package elpuig.informatica.tienda.alessandro;

public class Trabajador {
    private String id;
    private String nombre;
    private String apellido;
    private Departamento departamento;

    public Trabajador(String id, String nombre, String apellido, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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


    public void infomarcionTrabajador() {
        System.out.println("═════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("Trabajador: "+"ID : "+id+", Nombre: "+nombre+", Apellido: "+apellido+", Departamento: "+ departamento);
        //System.out.println("╚═══════════════════════════════════════════════════════");

    }
}
