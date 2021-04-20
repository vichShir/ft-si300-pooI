import java.util.ArrayList;
import java.util.List;

public class ContaBancaria implements Conta
{
  protected int numConta;
  protected String nomeCorrentista;
  protected double saldo;
  protected List<ListaTransacoes> transacoes = new ArrayList<ListaTransacoes>();

  public ContaBancaria(int numConta, String nomeCorrentista, double saldo)
  {
    this.numConta = numConta;
    this.nomeCorrentista = nomeCorrentista;
    this.saldo = saldo;
  }

  public double getSaldo()
  {
    return saldo;
  }

  public void setSaldo(double novoSaldo)
  {
    this.saldo = novoSaldo;
  }

  public void setTransacao(String data, double valor, String descricao)
  {
    ListaTransacoes novaTransacao = new ListaTransacoes(data, valor, descricao);
    transacoes.add(novaTransacao);
  }

  public String getTransacoes()
  {
    StringBuilder descricaoTransacoes = new StringBuilder();

    if(this.transacoes.size() > 0)
    {
      for(ListaTransacoes transacao : this.transacoes)
      {
        descricaoTransacoes.append(transacao);
      }
    }
    else
      descricaoTransacoes.append("Nenhuma transação efetuada pela conta.");

    return descricaoTransacoes.toString();
  }

  //@Override
  public static void Deposito(int numConta, double valorDepositado)
  {
    ContaBancaria conta = Main.getContaBancaria(numConta);

    System.out.println("Antigo saldo: " + conta.getSaldo());
    conta.saldo += valorDepositado;
    System.out.println("Novo saldo: " + conta.getSaldo());
  }

  //@Override
  public static void Retirada(int numConta, double valorDeRetirada)
  {
    ContaBancaria conta = Main.getContaBancaria(numConta);

    double _saldo = conta.getSaldo();
    System.out.println("Antigo saldo: " + conta.getSaldo());

    if(valorDeRetirada <= _saldo)
    {
      _saldo -= valorDeRetirada;
    }

    conta.setSaldo(_saldo);

    System.out.println("Novo saldo: " + conta.getSaldo());
  }

  //@Override
  public static void ImprimeExtrato(int numConta)
  {
    ContaBancaria conta = Main.getContaBancaria(numConta);
    StringBuilder extrato = new StringBuilder();

    extrato.append("\nNúmero da Conta:  " + conta.numConta);
    extrato.append("\nCliente:          " + conta.nomeCorrentista);
    extrato.append("\nSaldo:            " + conta.saldo);
    extrato.append("\nTransacoes:       " + conta.getTransacoes());

    System.out.println(extrato.toString());
  }
}