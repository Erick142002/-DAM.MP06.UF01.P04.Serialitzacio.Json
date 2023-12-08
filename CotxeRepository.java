package gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.model.repository;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gallardo.erick.dam.mp05.uf1.p02.serialitzacio.json.model.domain.Cotxe;

public class CotxeRepository {
	
	private Gson gson;

    public CotxeRepository() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void serialitzarACotxeJSON(Cotxe cotxe, String rutaFitxer) throws IOException {
        try (FileWriter writer = new FileWriter(rutaFitxer)) {
            gson.toJson(cotxe, writer);
        }
    }

    public Cotxe deserialitzarDeCotxeJSON(String rutaFitxer) throws IOException {
        try (FileReader reader = new FileReader(rutaFitxer)) {
            return gson.fromJson(reader, Cotxe.class);
        }
    }

}
