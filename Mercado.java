//Dupla: Eduardo Santana e Henrique Hatakeyama

/*
A classe mercado serve para representar um mercado comum, que possui um nome, CNPJ, endereco
e uma lista de produtos.
*/

import java.util.ArrayList;


public class Mercado {
  //campos da classe
  private ArrayList<Produto> produtos;
  private String nomeMercado;
  private String cnpj;
  private String endereco;
  //construtor
  public Mercado(String nomeMercado, String endereco) {
    this.nomeMercado = nomeMercado;
    this.endereco = endereco;
    this.produtos = new ArrayList<>();
  }
  //metodos acessores
  public ArrayList<Produto> getProdutos() {
    return produtos;
  }

  public String getNomeMercado() {
    return nomeMercado;
  }

  public String getCnpj() {
    return cnpj;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setProdutos(ArrayList<Produto> produtos) {
    this.produtos = produtos;
  }

  public void setNomeMercado(String nomeMercado) {
    this.nomeMercado = nomeMercado;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
    
    
}