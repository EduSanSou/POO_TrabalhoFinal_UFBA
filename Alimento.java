//Dupla: Eduardo Santana e Henrique Hatakeyama

/*
Classe Alimento, que herda da superclasse Produto. Tal classe representa um alimento que podera 
ser vendido num mercado. Um campo relevante alem dos ja herdados da classe pai(preco, codigo e nome) 
e o de validade.
*/

public class Alimento extends Produto{
    //campo validade, que representa a data limite de consumo
    private String validade;
    //construtor com uso da palavra 'super'
    public Alimento(double preco, String codigo, String nome, String validade){
        super(preco,codigo,nome);
        this.validade = validade;
    }
    //getter para validade
    public String getValidade(){
        return this.validade;
    }
    //metodo toString, que retorna os valores dos campos
    public String toString(){
        return super.toString() + ", " + this.validade;
    }
}