package silva.cloud.practica.server;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/buscar/server")
public class BusquedaResource {

	@RequestMapping("/busca/{id}")
	public String buscar(@PathVariable Integer id) {
		String nombre = "";
		switch(id) {
		case 1: nombre = "Juan"; break;
		case 2: nombre = "Carlos"; break;
		default: nombre = "Zully"; break;
		}
		return nombre;
	}
}
