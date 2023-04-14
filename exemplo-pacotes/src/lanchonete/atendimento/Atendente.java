package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("Servindo a Mesa");
	}
	private void pegarLancheCozinha() {
		System.out.println("Pegando o lanche na Cozinha");
	}
	public void receberPagamento() {
		System.out.println("Recebendo pagamento");
	}
	void trocarGas() {
		System.out.println("Atemdemte trocando o Gas");
	}
	private void pegarPediddoBalcao() {
		System.out.println("Pegando o pedido no balcao");
	}
}
