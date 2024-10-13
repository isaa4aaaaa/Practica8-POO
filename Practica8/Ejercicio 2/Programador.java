package mx.unam.fi.poo.g1.p8;

/**
 * Clase Programador extiende a Empleado
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Programador extends Empleado{
    
    private String titulo;

    /**
     * Método constructor para Programador que hace uso del sontructor de Empleado.
     * @param nombre -> Para asignar el nombre.
     * @param rol -> Para asignar el rol.
     * @param titulo -> Para asignar el título.
     */
    public Programador(String nombre, String rol, String titulo){
        super(nombre, rol);
        setTitulo(titulo);
    }

    /**
     * Método para modificar el atributo título.
     * @param titulo -> Para asignar el título.
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    /**
     * Método pra acceder al título.
     * @return titulo -> Retorna el atributo título.
     */
    public String getTitulo(){
        return this.titulo;
    }

    /**
     * Método sobrescrito para calcular el salario del Programador.
     * @return salario -> Retorna el salario calculado.
     */
    @Override
    public double calcularSalario(){
        double salario = 0.0;

        if(getRol().equals("Full Stack") && getTitulo().equals("Senior")){
            salario = 50000;
        }else if(getRol().equals("Backend") && getTitulo().equals("Middle")){
            salario = 35000;
        }else if(getRol().equals("Frontend") && getTitulo().equals("Junior")){
            salario = 20000;
        }else {
            salario = 10000;
        }

        return salario;
    }

     /**
     * Método sobrescrito para imprimir la información del programador.
     */
    @Override
    public void imprimirInformacion(){
        System.out.println("Nombre del programador: "+ getNombre());
        System.out.println("Rol del programador: "+ getRol());
        System.out.println("Título del programador: " + getTitulo());
    }
}

