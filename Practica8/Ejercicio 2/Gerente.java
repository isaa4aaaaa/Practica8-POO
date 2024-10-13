package mx.unam.fi.poo.g1.p8;

/**
 * Clase Gerente extiende a la clase Empleado
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Gerente extends Empleado{
    private int numProyectos;

    /**
     * Método constructor para Gerente que hace uso del constructor de Empleado.
     * @param nombre -> Para modificar el nombre.
     * @param rol -> Para modificar el rol.
     * @param numProyectos -> Para modificar el número de proyectos al que pertenece.
     */
    public Gerente(String nombre, String rol, int numProyectos){
        super(nombre, rol);
        setNumProyectos(numProyectos);
    }

    /**
     * Método para asignar el número de proyectos del gerente.
     * @param numProyectos -> Para modificar el número de proyectos.
     */
    public void setNumProyectos(int numProyectos){
        this.numProyectos = numProyectos;
    }

    /**
     * Método para acceder al número de proyectos.
     * @return numProyectos -> Retorna el número de proyectos.
     */
    public int getNumProyectos(){
        return this.numProyectos;
    }

    /**
     * Método sobrescrito para calcular el salario del gerente.
     * @return salario -> Retorna el salario calculado.
     */
    @Override
    public double calcularSalario(){
        double salario = 0.0;
        if(getRol().equals("Coordinador") && getNumProyectos() > 4){
            salario = 50000;
        }else if(getRol().equals("Sub-coordinador") && getNumProyectos() >=3 ){
            salario = 35000;
        }else if(getRol().equals("Líder de equipo") && getNumProyectos() < 3){
            salario = 20000;
        }else {
            salario = 10000;
        }

        return salario;
    }


    /**
     * Método sobrescrito para imprimir la información del gerente.
     */
    @Override
    public void imprimirInformacion(){
        System.out.println("Nombre del gerente: "+ getNombre());
        System.out.println("Rol del gerente: "+ getRol());
        System.out.println("Número de proyectos del gerente: " + getNumProyectos());
    }
}

