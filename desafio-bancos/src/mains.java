
public class mains {
	public static void main(String[] args) {
		Cliente ceci = new Cliente();
		ceci.setNome("Cecilia ");

		Conta cc = new ContaCorrente(ceci);
		Conta cp = new ContaPoupanca(ceci);
		cc.depositar(1000);
		cc.depositar(10);
		cc.depositar(100);
		cc.transferir(100, cp);

		cc.ImprimirExtrato();
		cp.ImprimirExtrato();
	}
}

/*
 * 
 * 
 */
