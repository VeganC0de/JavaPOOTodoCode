
package Logica;

/**
 *
 * @author tesla
 */
public class Main {
    
    
    public static void main(String[] args){
        
        Alumno alu1 = new Alumno (35,"Luisina","de Paula");
        Alumno alu2 = new Alumno();
        Alumno alu3 = new Alumno();
        
        System.out.println("La id del alumno 1 es: "+ alu1.getId());
        System.out.println("El nombre es : "+ alu1.getNombre());
        System.out.println("El apellido es : "+ alu1.getApellido());
        System.out.println("---------------");
        
        alu2.setId(1);
        alu2.setNombre("Daniel");
        alu2.setApellido("Bobadilla");
        
        alu3.setId(2);
        alu3.setNombre("Daniel");
        alu3.setApellido("Rodriguez");
        
        System.out.println("La id del alumno 2 es: "+ alu2.getId());
        System.out.println("El nombre es : "+ alu2.getNombre());
        System.out.println("El apellido es : "+ alu2.getApellido());
        
        
         System.out.println("---------------");
         alu1.setId(5);
        System.out.println("La id del alumno 1 es: "+ alu1.getId());
        System.out.println("El nombre es : "+ alu1.getNombre());
        System.out.println("El apellido es : "+ alu1.getApellido());
        
        System.out.println("---------------");
        System.out.println("La id del alumno 3 es: "+ alu3.getId());
        System.out.println("El nombre es : "+ alu3.getNombre());
        System.out.println("El apellido es : "+ alu3.getApellido());
    }
}
