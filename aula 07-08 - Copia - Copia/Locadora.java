class Locadora extends Pessoa {

    public Locadora(String nome) {
        super(nome);
    }

    public void Acao() {
        System.out.println(getNome() + " é a locadora.");
    }
}