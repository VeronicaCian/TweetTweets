package ufv.dis.extraordinaria10;

public class Tweet {
    public String nombre;
    public String mensaje;
    public String fecha;

    public Tweet(){

    }
    public Tweet(String nombre, String mensaje, String fecha) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
