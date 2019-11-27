package com.personal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.personal.entity.Usuario;
import com.personal.repository.IUsuarioRepository;

@Controller
@RequestMapping("usuario")
public class ajaxController {
	
	
	//agregando referencia a capa de datos
	@Autowired
	IUsuarioRepository rUsuario;
	
	
	@GetMapping(value="index")
	public String index() {
		return new String ("jquery");
	}
	
	/*metodo para retornar el listado de registros en un formato JSON segun la ruta establecida
	 * @return (List<Usuario>)*/
	@GetMapping(value="all", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Usuario> getAll() {
		return (List<Usuario>) rUsuario.findAll();
	}
	

}
