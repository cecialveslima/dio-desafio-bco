import java.util.ArrayList;

//Não pode ser instânciada, somente os filhos instanciam 

public abstract class Conta implements IConta {
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected Cliente cliente;

	@Override
	public void ImprimirExtrato() {
		// TODO Auto-generated method stub

	}

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected ArrayList<Double> ocrs = new ArrayList<>();

	// Construtor padrão
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;

	}

	public ArrayList<Double> getOcrs() {
		return ocrs;
	}

	public void armazenar(Double valor) {
		ocrs.add(valor);
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor; // neste caso pode usar ou nao o this.
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		armazenar(valor);
	}

	@Override
	public void transferir(double valor, Conta contadestino) {
		this.sacar(valor); // origem
		contadestino.depositar(valor);// destino

	}

	protected void imprimirInfoComuns() {
		System.out.println("Titular da conta: " + this.cliente.getNome());
		System.out.println(String.format("Agência :  %d", this.agencia));
		System.out.println(String.format("Número  :  %d", this.numero));
		System.out.println(String.format("Saldo   :  %.2f", this.saldo));
		// System.out.println(this.ocrs);

		System.out.println("=========");
		for (Double lcts : ocrs) {
			System.out.println("Lançamentos: " + lcts);
		}
		System.out.println("=========");

	}

	// Gets/Sets
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
