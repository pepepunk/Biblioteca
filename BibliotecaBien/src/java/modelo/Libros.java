package modelo;
// Generated 18/05/2017 09:53:17 PM by Hibernate Tools 4.3.1



/**
 * Libros generated by hbm2java
 */
public class Libros  implements java.io.Serializable {


     private String numAdquisicion;
     private String titulo;
     private String autor;
     private String seccion;

    public Libros() {
    }

    public Libros(String numAdquisicion, String titulo, String autor, String seccion) {
       this.numAdquisicion = numAdquisicion;
       this.titulo = titulo;
       this.autor = autor;
       this.seccion = seccion;
    }
   
    public String getNumAdquisicion() {
        return this.numAdquisicion;
    }
    
    public void setNumAdquisicion(String numAdquisicion) {
        this.numAdquisicion = numAdquisicion;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getSeccion() {
        return this.seccion;
    }
    
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }




}


