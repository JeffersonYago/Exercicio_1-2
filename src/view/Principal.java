package view;
import controller.MultiplicacaoController;
public class Principal {

	public static void main(String[] args) {
		controller.MultiplicacaoController pc = new MultiplicacaoController();
		
		int a = 5;
		int b = 5;
		int result = pc.Multipli(a, b);
		
		System.out.println("Resultado da operação = "+result);
	}

}
