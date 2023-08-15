package controller;

public class MultiplicacaoController {

	public MultiplicacaoController() {
		super();
	}
	public int Multipli(int a, int b) {
		if (a == 0) {
			// assim que "a" chega á zero, á função deixa de ser chamada e os valores são somados para efetuar a multiplicação 
			return 0;
		}
		else {
			// "b" vai sendo adicionado á fila para ser somado aos demais
			return b + Multipli(a-1,b);
		}
			
	}
}
