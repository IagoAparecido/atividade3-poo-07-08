class Cliente extends Pessoa {

    public Cliente(String nome) {
        super(nome);
    }

    public void Acao() {
        System.out.println(getNome() + " é o Cliente.");
    }
}