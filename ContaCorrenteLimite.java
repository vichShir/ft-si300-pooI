public class ContaCorrenteLimite extends ContaBancaria
{
  private double valorLimite;

  public ContaCorrenteLimite(int numConta, String nomeCorrentista, double saldo, double valorLimite)
  {
    super(numConta, nomeCorrentista, saldo);
    this.valorLimite = valorLimite;
  }

  //@Override
  public static void Retirada(int numConta, double valorDeRetirada)
  {
    ContaCorrenteLimite conta = (ContaCorrenteLimite)Main.getContaBancaria(numConta);

    double _saldo = conta.getSaldo();
    System.out.println("Antigo saldo: " + conta.getSaldo());
    
    if((_saldo - valorDeRetirada) >= conta.valorLimite)
    {
      _saldo -= valorDeRetirada;
    }
    else
      System.out.println("Valor de Retirada acima do valor limite");

    conta.setSaldo(_saldo);

    System.out.println("Novo saldo: " + conta.getSaldo());
  }

  //@Override
  public static void ImprimeExtrato(int numConta)
  {
    ContaCorrenteLimite conta = (ContaCorrenteLimite)Main.getContaBancaria(numConta);
    StringBuilder extrato = new StringBuilder();

    extrato.append("\nNúmero da Conta:  " + conta.numConta);
    extrato.append("\nCliente:          " + conta.nomeCorrentista);
    extrato.append("\nSaldo:            " + conta.saldo);
    extrato.append("\nValor limite:     " + conta.valorLimite);
    extrato.append("\nTransacoes:       " + conta.getTransacoes());

    System.out.println(extrato.toString());
  }
}