
public class Dado {
	private int valor;

	public void tirar() {
		valor =  (int) (Math.random() * 6 + 1);

	}

	public void imprimir() {
		System.out.println("El valor del dado es: " + valor);
	}

	public int retornarValor() {
		return valor;
	}

	public static void main(String[] args) {

	}

}
