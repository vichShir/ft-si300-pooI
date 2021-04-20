public class ListaTransacoes
{
  public enum tipoTransacao { DEBITO, CREDITO }

  private String data;
  private double valor;
  private String descricao;
  private tipoTransacao tipo;

  public ListaTransacoes(String data, double valor, String descricao)
  {
    this.data = data;
    this.valor = valor;
    this.descricao = descricao;
    this.tipo = (valor < 0) ? tipoTransacao.DEBITO : tipoTransacao.CREDITO;
  }

  @Override
  public String toString()
  {
    StringBuilder transacao = new StringBuilder();

    transacao.append("\n\nData:               " + data);
    transacao.append("\nValor da Transação: " + valor);
    transacao.append("\nDescrição:          " + descricao);
    transacao.append("\nTipo Transacao:     " + tipo + "\n");

    return transacao.toString();
  }
}