package br.com.supera.api.resources;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.supera.api.models.Product;
import br.com.supera.api.services.CarrinhoDeCompra;
import br.com.supera.api.services.CriadorDeCarrinho;
import br.com.supera.api.services.ProdutoService;

@Controller
@RequestMapping("")
public class CarrinhoResource {

	private final String PAGINA_LISTA = "listaProduto";
	private final String PAGINA_CARRINHO = "carrinhoDeProdutos";

	private CarrinhoDeCompra compra;
	private final CriadorDeCarrinho criador = new CriadorDeCarrinho();
	private CarrinhoDeCompra carrinho;

	public CarrinhoDeCompra getCompra() {
		return compra;
	}

	public void setCompra(CarrinhoDeCompra compra) {
		this.compra = compra;
	}

	@Autowired
	private ProdutoService service;

	@GetMapping("")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView(PAGINA_LISTA);
		List<Product> produtos = service.getProduto();

		mv.addObject("produtos", produtos);
		return mv;
	}

	@GetMapping("/carrinho-de-Compra")
	public ModelAndView carrinhoDeCompra() {
		ModelAndView mv = new ModelAndView(PAGINA_CARRINHO);
		
		mv.addObject("produtos", getCompra().carrinhoDeCompra());
		mv.addObject("valorFrete", getCompra().calcularFrete());
		mv.addObject("valorTotalF", getCompra().valorDaCompra());
		
		return mv;
	}

	@GetMapping("{id}")
	public ModelAndView adicionar(@PathVariable("id") Long id) {
		Product produto = this.service.findPorId(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
//		Product obj = new Product(33L, "teclado", BigDecimal.valueOf(250), Short.parseShort("30"), "//");
		carrinho = criador.pegarProduto(produto, 1).constroi();
		setCompra(carrinho);
		return new ModelAndView("redirect:/");
	}
	@GetMapping("/produtos/retirar/{id}")
	public ModelAndView retirar(@PathVariable("id") Long id) {
		Product produto = this.service.findPorId(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		carrinho = criador.tiraProdutoPorId(produto.getId()).constroi();
		setCompra(carrinho);
		return new ModelAndView("redirect:/carrinho-de-Compra");
	}
	
	@GetMapping("/produtos/editarQuantidade/{id,qtd}")
	public ModelAndView editarQuantidade(@PathVariable("id") Long id, @PathVariable("qtd") int qtd) {
		Product produto = this.service.findPorId(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		carrinho = criador.tiraProdutoPorId(produto.getId()).pegarProduto(produto, 0).constroi();
		setCompra(carrinho);
		return new ModelAndView("redirect:/");
	}

}
