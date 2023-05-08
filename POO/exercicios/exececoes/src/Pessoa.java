public class Pessoa {
    public String name;
    public int idade;

    public Pessoa() {
    }

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeNegativaException{
        if(idade<0){
            throw new IdadeNegativaException("A idade não pode ser negativa");
        } else{
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }
}
