package com.personal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("prueba3")
public class pruebaAjaxController {

    @GetMapping(value="vista")
    public String getvista() {
        return new String("prueba3");
    }
    
    @GetMapping(value="vista2")
    public String getvista2() {
        return new String("vistaParcial");
    }
    
    @GetMapping(value="vista3")
    public String getvista3() {
        return new String("vistaParcial2");
    }

    @GetMapping(value="vista4")
    public String getvista4() {
        return new String("vistausers");
    }

    
    @GetMapping(value="vista5")
    public String getvista5() {
        return new String("lista-ajax");
    }
}
