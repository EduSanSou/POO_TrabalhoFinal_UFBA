//Dupla: Eduardo Santana e Henrique Hatakeyama

import java.util.ArrayList;
import java.util.Scanner;
/*
Classe Main. Tal aplicacao implementa metodos para a exibicao de um menu de caixa de mercado.
*/
class Main {
  /*
  Metodo Main. Tal metodo serve para executar os metodos e construtores presentes nas outras classes.
  Os argumentos via linha de comando neste caso serao ignorados.
  */
  public static void main(String[] args) {
    //Classe Scanner, usada para entrada de dados
    Scanner entrada = new Scanner(System.in);
    Scanner entradaString = new Scanner(System.in);
    //Arraylist para armazenar os produtos a venda no mercado
    ArrayList<Produto> produtos = new ArrayList<>();
    //declaracao de variaveis necessarias para execucao do metodo
    int menu = 0;
    String nomeOperador;
    double total;
    double valorRecebido;
    double preco;
    String codigo;
    String nome;
    String tipoDeProduto;
    String validade;
    String identificacaoParaConferirProduto;

    do{
      exibirMenu(); //chamada ao metodo de exibicao do menu
      menu = 0;
      menu = entrada.nextInt();
      //switch case para direcionar a as opcoes do menu
      switch(menu){
        // realizar venda
        case 1:
          
          System.out.println("===> Realizar Venda");
          System.out.println("Nome do operador:");
          nomeOperador = entradaString.nextLine();
          
          OperadorDeCaixa.adicionarProdutoParaListaDeCompras();
          

          System.out.print("Digite o valor total da compra: R$ ");
          total = entrada.nextDouble();

          System.out.print("Digite o valor entregue pelo cliente: R$ ");
          valorRecebido = entrada.nextDouble();
          
          System.out.println("Troco: R$  " + (valorRecebido - total));

          
          break;
        //cadastro de produto
        case 2:
          
          System.out.println("===> Cadastrar Produto");
          System.out.println("Digite 'Alimento' ou 'Higiene': ");
          tipoDeProduto = entradaString.nextLine();
          //caso seja alimento
          if(tipoDeProduto.equalsIgnoreCase("Alimento")){
            System.out.println("Digite o preco: ");
            preco = entrada.nextDouble();
            System.out.println("Digite o codigo de barras: ");
            codigo = entradaString.nextLine();
            System.out.println("Digite o nome: ");
            nome = entradaString.nextLine();
            System.out.println("Digite a validade: ");
            validade = entradaString.nextLine();
            Alimento a = new Alimento(preco, codigo, nome, validade); //nova instanciacao
            OperadorDeCaixa.cadastrarProduto(a); //adicao da instancia de alimento recem criada a lista de produtos
          }
          //caso seja produto de higiene
          else if(tipoDeProduto.equalsIgnoreCase("Higiene")){
            System.out.println("Digite o preco: ");
            preco = entrada.nextDouble();
            System.out.println("Digite o codigo de barras: ");
            codigo = entradaString.nextLine();
            System.out.println("Digite o nome: ");
            nome = entradaString.nextLine();
            ProdutoHigiene h = new ProdutoHigiene(preco,codigo,nome); //nova instanciacao
            OperadorDeCaixa.cadastrarProduto(h); //adicao da instancia de alimento recem criada a lista de produtos
          }

          break;
        //retorna dados de um produto cadastrado
        case 3:
            System.out.println("Digite o codigo ou o nome do produto: ");
            identificacaoParaConferirProduto =  entradaString.nextLine();
            OperadorDeCaixa.conferirProduto(identificacaoParaConferirProduto);
            
          break;  
        //finalizar programa
        case 4:
          System.out.println("Finalizando...");

          break;
        default:
          
          System.out.println("Opcao de menu invalida.");
                       
      }
      
    }while(menu != 4);


  }
  //metodo para exibicao do menu  
  static void exibirMenu(){
    System.out.println("=========== MENU DO CAIXA ===========");
    System.out.println("1- REALIZAR VENDA");
    System.out.println("2- CADASTRAR PRODUTO");
    System.out.println("3- CONFERIR PRECO");
    System.out.println("4- FINALIZAR");
    }
}
