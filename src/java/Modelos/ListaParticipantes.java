
package Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rian Alves
 */
public class ListaParticipantes {
     private static List<Participante> lstParticipantes;

    public static List<Participante> inicializarLista() {
        if (lstParticipantes == null) {
            lstParticipantes = new ArrayList<>();
            lstParticipantes.add(new Participante("Rian Alves","Rua A,numero 13","São Mateus","rianalves009.ra@gmail.com","(24)988362723","12/07/2018","12/08/2018","Estudante"));
         
          
            return lstParticipantes;
        }
        return lstParticipantes;
    }


    
    
    
}
