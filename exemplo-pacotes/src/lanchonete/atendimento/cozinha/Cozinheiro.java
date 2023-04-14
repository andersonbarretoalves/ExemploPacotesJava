package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionar Lanche Natural Hanburger no Balcao");
	}
	//pode ser default
	public void adicionarSucoNoBalcao( ) {
		System.out.println("Adicionar suco no Balcao");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("Preparando Lanche tipo Hanburguer");
	}
	private void prepararVitamina() {
		System.out.println("Preparando Suco");
	}
	private void preparandoCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarImgredientesLanche( ) {
		System.out.println("Selecionando o pão, salada, ovo e carne");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionando fruta, leite e suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo Vitamina no Liquinificador");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e ovo para o Hanburguer");
	}
	private void pedindoParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
}
