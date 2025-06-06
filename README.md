# ticket_dashboard
API para disponibilizar os dados para a composição de um dashboard de chamados de suporte

✅ Exemplos de chamada

*GET*: http://localhost:8080/api/tickets?mes=3&ano=2021

*POST*: http://localhost:8080/api/tickets

{
  "id": 1,
  "titulo": "Erro no financeiro",
  "codCliente": 1,
  "codModulo": 2,
  "dataAbertura": "2021-03-01",
  "dataEncerramento": "2021-03-02"
}

*Bkp banco de dados*: https://drive.google.com/file/d/1Nw-MCiBEBozGHjbT7J5Rtq-J_fvuacai/view?usp=sharing
