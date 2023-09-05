
package ArrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tesla
 */
public class arraylists {
    
    public static void main(String[] args){
        
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1,"Cypher",22));
        lista.add(new Persona(2,"Reyna",10));
        lista.add(new Persona(3,"Omen",43));
        lista.add(new Persona(4,"Viper",52));
        
        
        System.out.println("FOR ----------------------------");
        
        //recorrer por indice
        for(int i=0; i<lista.size();i++){
        System.out.println("Prueba: " + lista.get(i).getNombre());
    }
        
        //recorrido foreach
        System.out.println("FOREACH ----------------------------");
        for(Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        }
        
    }
}
