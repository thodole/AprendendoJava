package modelo;

public class Felino extends Animal{
    
    private int idFelino;

    public Felino(String nome, int idade, int idFelino) {
        super(nome, idade);
        this.idFelino = idFelino;
    }

    public int getIdFelino() {
        return idFelino;
    }

    public void setIdFelino(int idFelino) {
        this.idFelino = idFelino;
    }
    
    @Override
    public String toString() {
        return "\nID do Felino:            " + idFelino +
               "\nNome:                    " + getNome() +
               "\nIdade                    " + getIdade();
    }
    
}