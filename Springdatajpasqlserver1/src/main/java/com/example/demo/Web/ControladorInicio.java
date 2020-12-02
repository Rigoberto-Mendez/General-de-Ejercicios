package com.example.demo.Web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.DA0.PersonaDAO;

@Controller

public class ControladorInicio {
    
	@Autowired
	private PersonaDAO perDAO;

	@GetMapping("/")
	public String Inicio() {
		
		var MostrarPersonas = perDAO.findAll();
		
		for (var iteracion:MostrarPersonas) {
			
			 System.out.println("Nombre "+iteracion.getNombre() + " Apellido "+iteracion.getApellido());
			
		}
		
		return "Index";	
	}
	
}
