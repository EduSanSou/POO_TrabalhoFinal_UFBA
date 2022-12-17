//Dupla: Eduardo Santana e Henrique Hatakeyama

/*
Classe abstrata produto. Tal classe representa genericamente um produto do supermercado, com um preco,
um codigo e um nome, campos que serao herdados por suas classes filhas(Alimento e ProdutoHigiene).
*/

public abstract class Produto{
  //campos da classe
  private double preco;
  private String codigo;
  private String nome;
  //construtor da classe
  public Produto(double preco, String codigo, String nome){
    this.preco = preco;
    this.codigo = codigo;
    this.nome = nome;
  }
    
  //metodos getters
  public double getPreco(){        
    return this.preco;
  }
  public String getCodigo(){
    return this.codigo;
  }
  
  public String getNome(){
    return this.nome;
  }
  //metodo toString, que retorna os valores dos campos de uma instancia da classe
  public String toString(){
    return "R$ " + this.preco + ", " + "Codigo de barras: " + this.codigo + ", " + "Nome: " + this.nome;
  }
  
}