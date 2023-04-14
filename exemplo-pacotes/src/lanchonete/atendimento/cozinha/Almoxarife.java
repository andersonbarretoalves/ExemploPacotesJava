package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("Controlando a entrada dos itens");
	}
	private void controlandoSaida() {
		System.out.println("Controlando a saida dos itens");
	}
	void entregarIngredientes() {
		System.out.println("Entregando ingredientes");
		controlandoSaida();
	}
	void trocarGas() {
		System.out.println("Almoxarife trocando o Gas");
	}
}
