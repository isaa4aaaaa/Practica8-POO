package mx.unam.fi.poo.g1.p8;

/**
 * Clase abstracta Empleado
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public abstract class Empleado{

    private String nombre;
    private String rol;

    /**
     * Método constructor para Empleado.
     * @param nombre -> Para modificar el atributo nombre.
     * @param rol -> Para modificar el atributo rol.
     */
    public Empleado(String nombre, String rol){
        setNombre(nombre);
        setRol(rol);
    }

    /**
     * Método para modificar el atributo nombre.
     * @param nombre -> Para definir el nombre.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para acceder al atributo nombre.
     * @return nombre -> Retorna el nombre.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método para modificar el atributo rol.
     * @param rol -> Para definir el rol.
     */
    public void setRol(String rol){
        this.rol = rol;
    }

    /**
     * Método para acceder al rol.
     * @return rol -> Retorna el rol.
     */
    public String getRol(){
        return rol;
    }

    /**
     * Método abstracto a definir por las sub-clases.
     */
    public abstract double calcularSalario();

    /**
     * Método abstracto a definir por las sub-clases.
     */
    public abstract void imprimirInformacion();

}


