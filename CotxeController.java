package gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.controllers;

import java.io.IOException;

import gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.model.configuration.Configuracio;
import gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.model.domain.Cotxe;
import gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.model.repository.CotxeRepository;

public class CotxeController {
	
	 private CotxeRepository cotxeRepository;

	    public CotxeController() {
	        cotxeRepository = new CotxeRepository();
	    }

	    public void serialitzarCotxe(Cotxe cotxe) {
	        try {
	            cotxeRepository.serialitzarACotxeJSON(cotxe, Configuracio.getRutaFitxerJson());
	            System.out.println("Cotxe serialitzat correctament.");
	        } catch (IOException e) {
	            System.err.println("Error en la serialització del cotxe: " + e.getMessage());
	        }
	    }

	    public Cotxe deserialitzarCotxe() {
	        try {
	            return cotxeRepository.deserialitzarDeCotxeJSON(Configuracio.getRutaFitxerJson());
	        } catch (IOException e) {
	            System.err.println("Error en la deserialització del cotxe: " + e.getMessage());
	            return null;
	        }
	    }
	
}
