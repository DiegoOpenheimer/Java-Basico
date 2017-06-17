package trabalho;

import java.util.ArrayList;

public class Clientes implements Relatorio {
	private String nome;
	private float valorGasto;

	ArrayList<Pedido> pedidos = new ArrayList<>();

	public Clientes(String nome) {
		this.nome = nome;
	}

	public void addPedido(Pedido novo)throws Exception {
		if(novo.isStatus()) {
			throw new Exception("Pedido ja está feito para outro cliente ou pedido ja feito");
		}
		this.valorGasto = 0;
		novo.setStatus(true);
		pedidos.add(novo);
		
		for (Pedido pedido : pedidos) {
			this.valorGasto += pedido.calcPedido();
		
		}
	}

	@Override
	public String gerarRelatorio() {
		this.valorGasto = 0;
		String relat = "--------CLIENTE-----\n" + "Nome: " + this.nome + "\n" + "----PRODUTOS-----\n";
		for (Pedido pedido : pedidos) {
			this.valorGasto += pedido.calcPedido();
			relat += "===Pedido: " + pedido.getCodigo() + " ===\n";
			relat += pedido.relatorioPedido();
		}
		relat += "\nVALOR TOTAL: " + this.valorGasto+"\n\n";
		return relat;

	}

	public float getValorGasto() {
		return this.valorGasto;
	}
	
	public void atualizar() {
		this.valorGasto = 0;
		for (Pedido pedido : pedidos) {
			this.valorGasto += pedido.calcPedido();
		}
		
	}
}
