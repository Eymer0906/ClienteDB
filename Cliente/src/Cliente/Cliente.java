package Cliente;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccion;
    private String fechaNacimiento;
    private String usuario;
    private String contrasena;
    private String identificacion;

    // Constructor, getters y setters

    public Cliente(int id, String nombre, String apellido, String telefono, String email, String direccion, String fechaNacimiento, String usuario, String contrasena, String identificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.identificacion = identificacion;
    }

    // Getters y setters

public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }

public String getApellido() { return apellido; }
public void setApellido(String apellido) { this.apellido = apellido; }

public String getTelefono() { return telefono; }
public void setTelefono(String telefono) { this.telefono = telefono; }

public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }

public String getDireccion() { return direccion; }
public void setDireccion(String direccion) { this.direccion = direccion; }

public String getFechaNacimiento() { return fechaNacimiento; }
public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

public String getUsuario() { return usuario; }
public void setUsuario(String usuario) { this.usuario = usuario; }

public String getContrasena() { return contrasena; }
public void setContrasena(String contrasena) { this.contrasena = contrasena; }

public String getIdentificacion() { return identificacion; }
public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

@Override
public String toString() {
    return "Cliente{" +
            "nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", telefono='" + telefono + '\'' +
            ", email='" + email + '\'' +
            ", direccion='" + direccion + '\'' +
            ", fechaNacimiento='" + fechaNacimiento + '\'' +
            ", usuario='" + usuario + '\'' +
            ", identificacion='" + identificacion + '\'' +
            '}';
}
}
