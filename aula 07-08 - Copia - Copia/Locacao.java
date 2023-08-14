class Locacao {
  Locadora locadora;
  Cliente cliente;
  Carro carro;
  String periodo;

  public Locacao(Cliente cliente, Locadora locadora, Carro carro, String periodo) {
    this.carro = carro;
    this.locadora = locadora;
    this.cliente = cliente;
    this.periodo = periodo;
  }

  public void getInformacoes() {

    System.out.println("Informações do Semestre:");
    System.out.println(
        "Cliente: " + cliente.getNome() + ", fez a locação do carro: " + carro.getModelo() + ", de ano: "
            + carro.getAno() +
            " com a locadora: " + locadora.getNome() + ", pelo período de :" + periodo);

  }
}
