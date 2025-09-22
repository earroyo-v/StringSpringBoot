package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	Logica obj = new Logica();
	@GetMapping("/index")
	public String Index() {
		return "index";
	}
	@PostMapping("/ejercicio1")
	public String Ejercicio1(@RequestParam String val, Model model) {
		if (val == "") {
			return "redirect:/index";
		}
		model.addAttribute("m1", obj.Ejercicio1(val));
		return "index";
	}
	@PostMapping("/ejercicio2")
	public String Ejercicio2(@RequestParam String val, Model model) {
		if(val == "") {
			return "redirect:/index";
		}
		model.addAttribute("m2",obj.Ejercicio2(val));
		return "index";
	}
	@PostMapping("/ejercicio3")
	public String Ejercicio3(@RequestParam String val, Model model) {
		if(val == "") {
			return "redirect:/index";
		}
		model.addAttribute("m3",obj.Ejercicio3(val));
		return "index";
	}
}
