import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        String hoje = dia_atual(); 		
		Sale venda = new Sale(hoje);
		CatalogoProdutos catalogo = new CatalogoProdutos();
		
		ControladorRealizarVenda controladorVenda = new ControladorRealizarVenda(venda, catalogo);
		
		controladorVenda.entrarItem("001", 3);
		controladorVenda.entrarItem("002", 1);
		controladorVenda.entrarItem("003", 2);
		
		controladorVenda.registrarPagamento(500.00);
		
		System.out.println("Total = " + venda.getTotal());
		System.out.println("Troco = " + venda.getTroco());
		
	}
	
	static String dia_atual(){
		return "23 Agosto 2016";
	}
    }
}
