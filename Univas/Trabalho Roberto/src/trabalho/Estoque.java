package trabalho;

import java.util.ArrayList;

public class Estoque {

	ArrayList<Medicamento> medicamentos = new ArrayList<>();

	public float retirar(String nome, int cod, int quantidade)
			throws QuantidadeInsuficienteException, MedicamentoInexistenteException {
		float preco = 0f;
		boolean confere = true;
		for (Medicamento run : medicamentos) {
			if(run.getNome().equals(nome) && run.getCodigo() != cod) {
				throw new MedicamentoInexistenteException("Código Diferente ao estoque");	
			}
			
			if (run.getNome().equals(nome) && run.getCodigo() == cod) {
				run.reduzirQuantidade(quantidade);
				preco = run.getPreco();
				confere = false;
				
			}
		}
		if (confere) {
			throw new MedicamentoInexistenteException("Medicamento: " + nome + " não encontrado");
		}

		return preco;
	}

	public void guardar(Medicamento medicamento) throws ProdutoRepetidoException {

		for (Medicamento run : medicamentos) {
			if (run.getNome().equals(medicamento.getNome()) && run.getCodigo() == medicamento.getCodigo()) {
				throw new ProdutoRepetidoException("Já se encontra este produto no estoque");
			}
		}

		medicamentos.add(medicamento);
	}
	
	public String veriQuantidade() {
		String confere = "=====QUANTIDADE EM ESTOQUE====\n";
		for (Medicamento medicamento : medicamentos) {
			confere += "Medicamento: " + medicamento.getNome() +
		"\nQuantidade: " + medicamento.getQtd()+"\n"
				+ "--------------\n";
		}
	return confere;	
	}
}
