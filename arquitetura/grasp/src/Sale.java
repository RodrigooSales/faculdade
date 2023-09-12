public class Sale{
  private Collection<SaleLineItem> itemsVenda;
	private double total;
	private String dataVenda;
	
	private Pagamento pagamento; 
		
	public Sale(String dataVenda){
		itemsVenda = new ArrayList<SaleLineItem>();
		this.dataVenda = dataVenda;
	}
	
	public double getTotal(){
		total = 0;
		Iterator<SaleLineItem> iteratorItemsVenda = this.itemsVenda.iterator();
		while  (iteratorItemsVenda.hasNext()){
			SaleLineItem SaleLineItem = iteratorItemsVenda.next();
			total = total + SaleLineItem.calcularSubTotal();
		}
		return total;
	}
	
	public void criarSaleLineItem(int quantidade, Product product)
		SaleLineItem SaleLineItem = new SaleLineItem(quantidade, product)
		this.itemsVenda.add(SaleLineItem);
	}
	
	
	public Collection<SaleLineItem> getItemsVenda() {
		return itemsVenda;
	}

	public String getDataVenda() {
		return dataVenda;
	}
	
	public void efetuarPagamento(double valorRecebido){
		pagamento = new Pagamento(valorRecebido);
	}
	
	public double getTroco(){
		return pagamento.getValorPago() - getTotal();
	}
}