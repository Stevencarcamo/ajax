package com.personal;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("controlador")
public class cuadradoController {

	
	
	
	@GetMapping(value="cuadrado", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public HashMap<String, Double> cuadrado (@RequestParam Double num){
		
	 HashMap<String, Double>hm = new HashMap<String, Double>();
	  hm.put("respuesta", num*num);
	  return hm;

	}}
	

