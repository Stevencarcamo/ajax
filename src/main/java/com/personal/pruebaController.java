package com.personal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("prueba")
public class pruebaController {
	
	@GetMapping(value="index")
	public String index() {
		return new String ("ejemplo");
	}
	
	@GetMapping(value="index2")
	public String index2() {
		return new String ("ejemplo2");
	}
	
	@GetMapping(value="index3")
	public String index3() {
		return new String ("ejemplo3");
	}
	
	@GetMapping(value="pruebaAjax", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String>pruebaAjax(){
		List<String> lista = new ArrayList();
		lista.add("Jose");
		lista.add("Miguel");
		lista.add("Julia");
			return lista;
	}
	


@GetMapping(value="cuadrado", produces=MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public HashMap<String, Double> cuadrado (@RequestParam Double num){
	
 HashMap<String, Double>hm = new HashMap<String, Double>();
  hm.put("res", num*num);
  return hm;

}


@GetMapping(value="operaciones", produces=MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public HashMap<String, Double> operaciones (@RequestParam Double num1,@RequestParam Double num2){
	
 HashMap<String, Double>hm = new HashMap<String, Double>();
  hm.put("suma" ,         num1 + num2);
  hm.put("resta",         num1 - num2);
  hm.put("multiplicacion",num1 * num2);
  hm.put("division",      num1 / num2);
  return hm;

}}