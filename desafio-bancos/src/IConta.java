public interface IConta {
	void sacar(double valor); // por default j� � public

	void depositar(double valor);

	void transferir(double valor, Conta contadestino);

	void ImprimirExtrato();

	// void armazenar(Double valor, ArrayList<Double> ocrs);
}
