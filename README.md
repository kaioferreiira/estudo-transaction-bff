## BFF para proxy de Transações Financeiras.

1) Ou subam passando o parâmetro -Dspring.profiles.active=dev
2) Ou renomeiem o arquivo de src/main/resources/application-dev.yaml para src/main/resources/application.yaml


O Domínio deve ser de conta corrente e é possível fazer as operações de depósito, saque e saldo conforme as regras abaixo:

* Ter estrutura para Cheque Especial.
* Validar se o valor de saque não ultrapassa o cheque especial, e se ultrapassar lançar uma critica para o usuário.
* Efetuar operação de depósito, informando a conta, valor e data atualizando o saldo.
* Efetuar operação de saque, informando a conta, valor e data e atualizando o saldo.
* Consulta de saldo a aplicação terá que ter um contrato que informe o saldo do correntista mais o cheque especial por uma data e conta.
* Consulta de Extrato mostrar as movimentações por data de saques e depósitos de uma conta corrente nos últimos 15 dias.  
* Junto do código fonte do projeto da aplicação deverá ser entregue um Dockerfile para instalação.

Suba um arquivo.zip com o projeto da aplicação sem conter a pasta target ou build do maven e gradle respectivamente