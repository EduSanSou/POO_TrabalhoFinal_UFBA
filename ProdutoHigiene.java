//Dupla: Eduardo Santana e Henrique Hatakeyama

/*
Classe ProdutoHigiene. Essa classe herda da superclasse Produto e representa um produto de higiene
que podera ser comercializado num mercado. Seus campos sao preco, nome e codigo (assim como na classe 
Produto).
*/

public class ProdutoHigiene extends Produto {
  //construtor da classe ProdutoHigiene
  public ProdutoHigiene(double preco, String codigo, String nome) {
    //Uso da palavra-chave 'super', que repassa os parametros de entrada para o construtor da classe pai
    super(preco, codigo, nome);
  }
  
  //declaracao do metodo toString, que retorna os valores dos campos de uma instancia da classe
  public String toString(){
    //chamada ao metodo da classe pai, atraves da palavra 'super'
    return super.toString();
  }

}