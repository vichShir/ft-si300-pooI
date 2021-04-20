# simple-bank-system version 0.0.1

Programa simples de um sistema bancário desenvolvido a partir de requisitos de um trabalho universitário:

    Um banco trabalha com três tipos de contas:

    * conta corrente comum;
    * conta corrente com limite;
    * conta poupança.

    Em todos os casos é necessário guardar o número da conta, o nome
    do correntista e o saldo.

    Para a conta poupança é necessário guardar o dia do aniversário
    da conta (quando são creditados os juros).

    Já para a conta com limite é necessário guardar o valor do limite.

    As contas também armazenam uma lista de transações. Uma transação
    é definida por uma data, valor da transação e descrição. Se o
    valor for negativo, a transação é considerada um débito (crédito
    caso contrário).

    As operações possíveis são: depósito, retirada e impressão de
    extrato. Essas operações devem ser definidas numa classe abstrata
    pura (interface) denominada Conta.

    A operação de depósito é igual nos três tipos de conta.

    A retirada só é diferente na conta com limite, pois esta admite
    que o saldo fique negativo até o limite estabelecido.

    Finalmente o extrato é diferente para as três:

    * na conta comum exibe o número da conta, nome do cliente, transações e o saldo;
    * na conta limite imprime também o valor do limite;
    * na conta poupança imprime também o dia do aniversário.

    Implemente a hierarquia de classes das contas explorando o conceito de polimorfismo.

    Faça um programa em C++ que permita ao usuário fazer depósitos,
    retiradas e verificação de extrato nas suas contas a partir do
    número da conta. Utilize uma única coleção (list ou vector) para
    armazenar todos os tipos de contas.
