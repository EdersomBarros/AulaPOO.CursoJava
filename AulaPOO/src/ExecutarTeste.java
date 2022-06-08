import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("M�dulo Orienta��o ao Objeto");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("M�dulo Spring Boot");
		produto2.setValor(BigDecimal.valueOf(158.69));

		Produto produto3 = new Produto();
		produto3.setId(65L);
		produto3.setNome("M�dulo Spring API");
		produto3.setValor(BigDecimal.valueOf(300));

		Produto produto4 = new Produto();
		produto4.setId(85L);
		produto4.setNome("M�dulo Hibernate");
		produto4.setValor(BigDecimal.valueOf(598.63));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Curso Forma��o Java");
		venda.setEnderecoEntrega("Entrega de E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Eder Barros");
		venda.setValorTotal(BigDecimal.valueOf(197.00));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);
		venda.getListaProdutos().add(produto4);

		System.out.println("Valor da vari�vel Total: " 
		+ venda.getValorTotal());

	}

}
