package MODEL;

import DAO.Arquivos;// Importe do PACK  DAO.
import java.util.ArrayList;

/**
 * Autor: Alexandre Ferreira Costa 
 * Email: alexandrexandefc@gmail.com 
 * Data:01/04/2016 Hora: 08:04:36 
 * Codificação: UTF-8 
 * Disciplina: Programação
 * Nome Original: Dijkstra.java Pacote de Criação: MODEL **/

public class Dijkstra {// Classe dijkstra que rota o algoritmo.
    private int numeroVertices = 7;// Numero de vertices.
    /*Obs: se mudar o numero de vertices da classe arquivo devera mudar o numero de vertices aqui também, e vice-versa.*/
    private int matrizGrafos[][] = new int[numeroVertices][numeroVertices];// Instancia a matriz de adjacentes.
    private int[] estimativa = new int[numeroVertices];// Vetor de estimativa, que recebe as estimativas de cada vertices.
    private int[] fechado = new int[numeroVertices];// Vetor fechado, que verifica se o  vertices esta fechado ou aberto.
    private int[] precedente = new int[numeroVertices];// Vetor precedente, que guarda o precedente de cada vertices.
    private int peso = 0;// Recebe e verifica o peso de cada aresta.
    private int menor = Integer.MAX_VALUE;// Verifica o menor peso das aresta. Variavel e inicializada com valor infinito.
    private int atual = 0;// Variavel atual, que verifica o atual vertice.

    public Dijkstra() {// Construtor da classe.
    }

    //================================================================================================================================
    public void relaxamento(int atual, int destino, int peso) {//Função de relaxamento, para pegar melhor caminho, sempre pega o melhor peso do vertice.
        if (estimativa[atual] + peso < estimativa[destino]) {// Verifica se estimativa[atual](vertice saida) mais o peso e maior que peso do vertice destino.
            estimativa[destino] = estimativa[atual] + peso;// Estimativa destino recebe o novo peso do vertice.
            precedente[destino] = atual;// Precedente recebe o atual, que e vertice que ele ta vindo.
        }
    }
//====================================================================================================================================
    public int menorPeso(int[] distancia) {// Função menor peso, utilizada para escolher melhor peso de cada vertice.
        menor = Integer.MAX_VALUE;// Menor recebe valor infinito.
        int indice = 0;// Indice que sera retornado com o valor do melhor peso.
        for (int i = 0; i < numeroVertices; i++) {
            if ((menor > distancia[i]) && (fechado[i] != 0)) {// Verificar qual peso da aresta e menor, apenas ne vertices não fechados.
                menor = distancia[i];// Menor recebe a distancia.
                indice = i;// Indice recebe o vertice que tem menor peso.
            }
        }
        fechado[indice] = 0;// Feche o vertice escolhido.
        return indice;// Retorna o indice.
    }
//=====================================================================================================================================
   public ArrayList recebeRotas() {// Metodo recebeRotas que retorna uma ArrayList de todas as rotas;
        int linha = numeroVertices-1;// Linha recebe numeroVertices - 1, para não estorar os indices de precedente;
        ArrayList rotas = new ArrayList();// ArrayList de rotas que revece o precedente de todos vertices;
        
        while (linha > 0) {
            linha = precedente[linha];// Linha recebe precedente.
            rotas.add(linha);// E adiciona precedente a lista.
        }
        return rotas;// Retorna as rotas;
    }
    
    public int []recebeEstimativas(){// Metodo recebeEstimativas retorna apenas as estimativas.
        
        return estimativa;// Retorna a estimativas.
    }
//=====================================================================================================================================
    public ArrayList dijks() {// Metodo dijks que retorna uma ArrayList.
        Arquivos arquivo = new Arquivos();// Instancia a classe arquivo.
        ArrayList rotas = new ArrayList();// Instancia ArrayList de rotas.
        
        matrizGrafos = arquivo.carregarDadosGrafo(); // Criar a matriz adjacente, com dados do arquivo
        
        for (int i = 0; i < numeroVertices; ++i) {
            estimativa[i] = Integer.MAX_VALUE;// estimativa e inicializada com valor infinito.
            fechado[i] = -1;// Todos vertices inicializados como aberto.
            precedente[i] = -1;// Precedente como -1, que significa como sem precedente.
        }

        estimativa[0] = 0; // vertice 0, recebe estimativa de 0;
        fechado[0] = 0;// E inicializado novamente como fechado.

        while (atual < numeroVertices) {
            for (int destino = 0; destino < numeroVertices; destino++) {
                if ((matrizGrafos[atual][destino] != Integer.MAX_VALUE) && (fechado[destino] != 0)) {// verifica se valor da matriz e diferenre de infinito, e fechado diferente de 0
                    peso = matrizGrafos[atual][destino];// Peso recebe o valor do vertice.
                    relaxamento(atual, destino, peso);// Função relaxamento recebe, o valor do vertice atual, vertice destino e peso da aresta.
                }
            }
            atual = menorPeso(estimativa);// Atual recebe o retorno da função menorPeso, que recebe e escolhe o menor peso de cada vertice.
            if (atual == numeroVertices-1) {// Condição de parada, quando se chega no vertice final, ou seja o vertice G.
                break;
            }
        }

        rotas = recebeRotas();// recebe as melhores rotas.
        
        return rotas;// retorna as rotas.
    }
}
//==================================================================================================================================
