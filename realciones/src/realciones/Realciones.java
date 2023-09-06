
package realciones;

import java.util.ArrayList;
import java.util.List;

public class Realciones {

    public static void main(String[] args) {
        
        Auto aut = new Auto ();
        aut.setId(1L);
        aut.setMarca("Lamborghini");
        aut.setModelo("Huracan");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario> ();
        
        Propietario prop1 = new Propietario ();
        Propietario prop2 = new Propietario ();
        
        prop1.setId(22L);
        prop1.setNombre("Daniel");
        prop1.setApellido("Bobadilla");
        
        prop2.setId(29L);
        prop2.setNombre("Carlos");
        prop2.setApellido("Silveira");
        
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        aut.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + " le pertenece a " + aut.getListaPropietarios().toString());
        
        
    }
    
}
