package modelo;
// Generated 18/05/2017 09:53:17 PM by Hibernate Tools 4.3.1



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuario;
     private String usuario;
     private String nombreUsuario;
     private String contrasena;
     private String preguntaSeguridad;
     private String respuestaSeguridad;

    public Usuarios() {
    }

    public Usuarios(String usuario, String nombreUsuario, String contrasena, String preguntaSeguridad, String respuestaSeguridad) {
       this.usuario = usuario;
       this.nombreUsuario = nombreUsuario;
       this.contrasena = contrasena;
       this.preguntaSeguridad = preguntaSeguridad;
       this.respuestaSeguridad = respuestaSeguridad;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getPreguntaSeguridad() {
        return this.preguntaSeguridad;
    }
    
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }
    public String getRespuestaSeguridad() {
        return this.respuestaSeguridad;
    }
    
    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }




}


