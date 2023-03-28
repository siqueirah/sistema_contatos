package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcessarContaController {

	@RequestMapping(value = "/")

	public ModelAndView acessarconta() {

		ModelAndView modelAndView = new ModelAndView("acessar-conta");
		return modelAndView;
	}

}
