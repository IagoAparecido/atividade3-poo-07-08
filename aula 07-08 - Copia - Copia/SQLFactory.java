public class SQLFactory {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Roberto");
        Locadora locadora = new Locadora("Carro Novo");
        Carro carro = new Carro("Fit", 2020);

        Locacao locacao = new Locacao(cliente, locadora, carro, "1 mês");
        locacao.getInformacoes();
    }
}
