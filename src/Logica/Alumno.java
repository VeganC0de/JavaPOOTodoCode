
package Logica;

/**
 *
 * @author tesla
 */
public class Alumno {
    
    private int id;
    private String nombre;
    private String apellido;

    
    public void mostrarNombre(){
        System.out.println("Hola soy un alumno y se decir mi nombre");
        
    }
    
    public Alumno(){
        
    }
    
    
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    
    public void saberAprobado(double calificaion){
        if(calificaion>=6){
            System.out.println("Aprobe la materia");
        }
        else{
            System.out.println("Uyy no aprobe la materia");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    
    
    
}
