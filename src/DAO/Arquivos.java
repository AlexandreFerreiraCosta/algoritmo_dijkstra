package DAO;

/**
 * Autor: Alexandre Ferreira Costa 
 * Email: alexandrexandefc@gmail.com 
 * Data:23/03/2016 Hora: 21:39:49 
 * Codificação: UTF-8 
 * Disciplina: Programação
 * Nome Original: Arquivos.java Pacote de Criação: DAO */

import java.io.FileInputStream;
import java.io.FileNotFoundException;// Importes
import java.util.Scanner;

public class Arquivos {// Classe arquivo, criada para receber os dados do arquivo
    private int numeroVertices = 7;// Numero de vertices, pode mudar de acordo com quantidade de vertices que deseja.
    /*Obs: Se mudar numero de vertices, tera que mudar a classe grafo que exibe as imagem das rotas.
    E mudar as rotas do arquivos
    */
    
    public Arquivos() { //Construtor vazio

    }
//=================================================================================================================================
    public int[][] carregarDadosGrafo() { // Metodo carregarDadosGrafos, carrega os dados para matriz adjacentes.
        FileInputStream filGrafo = null;// Fill utilizado para ler arquivo.
        int matrizGrafos[][] = new int[numeroVertices][numeroVertices];// Instancia a matriz de adjacentes.

        try {
            filGrafo = new FileInputStream("Entrada.txt");// Instancia o objeto do tipo arquivo, e recebe o caminho do arquivo.
        } catch (FileNotFoundException ex) {
            System.out.println("Erro");// Msg de erro de leitura de arquivo.
        }

        Scanner scan = new Scanner(filGrafo);// Scanner Utilizado para ler o arquivo.

        for (int linha = 0; linha < numeroVertices; linha++) {// Interação da linha da matriz.
            for (int coluna = 0; coluna < numeroVertices; coluna++) {// Interação da coluna da matriz.
                matrizGrafos[linha][coluna] = Integer.MAX_VALUE; // Inicializa a matriz de adjacente com valor infinito. 
            }
        }
        
        while (scan.hasNext()) {// Ler arquivo ate chegar o final.
            int linha = scan.nextInt();// Pega o primeiro inteiro da atual linha do arquivo, que sera a linha da matriz.
            int coluna = scan.nextInt();// Pega o segundo inteiro da atual linha do arquivo, que sera a coluna da matriz.
            int peso = scan.nextInt();// Pega o 3 inteiro da atual linha do arquivo, que sera o peso da aresta
            matrizGrafos[linha][coluna] = peso;//Matriz recebe os valores do arquivo.
            
        }        
        return matrizGrafos;// Retorna a matriz
    }
}
