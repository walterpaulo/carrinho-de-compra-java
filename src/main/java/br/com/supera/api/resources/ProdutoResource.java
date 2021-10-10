package br.com.supera.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.supera.api.models.Product;
import br.com.supera.api.services.ProdutoService;


@Controller
@RequestMapping("")
public class ProdutoResource {
	private final String PAGINA_LISTA = "listaProduto";
	private final String PAGINA_CARRINHO = "carrinhoDeProdutos";
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(PAGINA_LISTA);
		List<Product> produtos = service.getProduto();
		mv.addObject("produtos", produtos);
		return mv;
	}

}
