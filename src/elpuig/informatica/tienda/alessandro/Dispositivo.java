package elpuig.informatica.tienda.alessandro;

public class Dispositivo {
        private TipoDispositivo tipoDispositivo;
        private String marca;
        private String modelo;
        private float precio;


    public Dispositivo(TipoDispositivo tipo, String marca, String modelo, float precio) {
        this.tipoDispositivo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void informacionDispositivo() {
        System.out.println("═══════════════════════════════════════════════════════════════════════════");
        System.out.println("Dispositivo: "+"Tipo : "+tipoDispositivo+", Marca: "+marca+", Modelo: "+modelo+", Precio: "+precio+"€");
        //System.out.println("╚═══════════════════════════════════════════════════════");

    }
}
