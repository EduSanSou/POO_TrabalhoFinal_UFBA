//Dupla: Eduardo Santana e Henrique Hatakeyama

import java.util.ArrayList;
import java.util.Scanner;
/*
Classe Operador de Caixa. Tal classe representa um operador de um sistema de caixa de mercado.
Cada operador possui um nome e CPF proprios, e todos compartilham uma mesma lista de produtos que
serao vendidos no estabelecimento. Algumas operacoes realizadas por um operador de caixa sao 
adicionar produtos a uma lista de compras(vender), cadastrar e conferir dados de um determinado produto.
*/

public class OperadorDeCaixa{
  //declaracao de campos
  private String nome;
  private String cpf;
  //lista de produtos cadastrados
  private static ArrayList<Produto> produtos = new ArrayList<>();
  
  //construtor da classe
  public OperadorDeCaixa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }
  //metodo para realizar a operacao de venda
  static public void adicionarProdutoParaListaDeCompras(){
    //classe scanner para habilitar entrada de dados
    Scanner entrada = new Scanner(System.in);
    Scanner entradaString = new Scanner(System.in);
    //variaveis necessarias para a execucao do metodo
    String continua = "";
    double total = 0;
    String nomesDosProdutos = "Produtos: ";
    String codigoDeBarras = "";
    int i = 0; 
    //parte para adicionar quantos produtos forem necessarios a lista (a criterio do vendedor)
    do{
      System.out.println("Digite o codigo de barras do produto: ");
      codigoDeBarras = entradaString.nextLine();
      for(Produto p : produtos){
        //atualiza o valor total das compras, alem dos nomes dos itens vendidos
        if(codigoDeBarras.equalsIgnoreCase(p.getCodigo())){
          
          total = total + p.getPreco();
          nomesDosProdutos = nomesDosProdutos + p.getNome() + "; ";
        }
      }
      i++; //incremento para atualizar o numero de itens vendidos
      
      System.out.println("Deseja adicionar mais produtos a lista de compras? Digite 'S' para sim ou 'N' para nao.");
      continua = entradaString.nextLine();      
      
    }while(continua.equalsIgnoreCase("S"));
    //opcao para conceder desconto caso a quantidade de produtos inseridos seja maior ou igual a 10
    if(i >= 10){
      System.out.println("Desconto concedido. Compra acima de 10 unidades.");
      total = total * 0.97;
    }
    //exibe o valor final e o nome dos produtos
    System.out.println("Total: R$ " + total);
    System.out.println(nomesDosProdutos);
  }
  
  static public void calcularDesconto(double total){
    
    if(produtos.size() >= 10){
      total = total * 3/100;
    }
  }
  
  
  //metodo para cadastrar produto (adiona-lo a lista de produtos disponiveis a venda)
  static public void cadastrarProduto(Produto p){
    produtos.add(p);

  }
  
  
  static public void emitirNotaFiscal(Mercado m){
    int i;
    System.out.println("||||" + m.getNomeMercado() + "||||");
    for(i=0; i<=produtos.size(); i++){
      System.out.println();
    }
  }
  
  
  //busca informacoes de um determinado produto atraves de seu nome ou codigo de barras
  static public void conferirProduto(String identificacaoParaConferirProduto){
    
    for(Produto p: produtos){
      
      if(p.getNome().equalsIgnoreCase(identificacaoParaConferirProduto) || p.getCodigo().equalsIgnoreCase(identificacaoParaConferirProduto) ){
        //chamada implicita ao metodo toString que retorna dados da instancia p
        System.out.println(p);
      }
      
    }
  }
}