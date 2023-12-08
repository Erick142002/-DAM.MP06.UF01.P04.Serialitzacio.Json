package gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.app;

import gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.controllers.CotxeController;
import gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.model.domain.Cotxe;

public class Main {
	
	public static void main(String[] args) {
        
        Cotxe cotxe = new Cotxe("1234ABC", "Marca", "Model", "987654321");


        CotxeController cotxeController = new CotxeController();

        
        cotxeController.serialitzarCotxe(cotxe);

        
        Cotxe cotxeDeserialitzat = cotxeController.deserialitzarCotxe();
        if (cotxeDeserialitzat != null) {
            System.out.println("Cotxe deserialitzat: " + cotxeDeserialitzat.toString());
        }
    }

}
   