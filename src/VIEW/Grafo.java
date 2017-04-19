package VIEW;

import DAO.Arquivos;
import MODEL.Dijkstra;
import java.util.ArrayList;

public class Grafo extends javax.swing.JFrame {

    ArrayList rotas = new ArrayList();// Recebe a Lista com precedentes de cada rota escolhida.

    public Grafo() {// Construtor da classe.
        initComponents();// Cria os componentes.
    }

    private void gerarRotas() {// Metodo gerarRotas(), que exibe os valores da melhor rota.
        int[] estimativa = new int[7]; // Vetor de estimativa que recebe a estimativa de cada vertice.
        Dijkstra dijkstra = new Dijkstra();// Instanciando a classe Dijkstra.

        rotas = dijkstra.dijks(); // ArrayList recebe a lista de rotas que vem da classe dijkstra
        estimativa = dijkstra.recebeEstimativas();// Vetor estimativa recebe as estimativas.

        /*As rotas são exibidas atraves de imagem, e de acordo com resultado do algoritmo*/
        for (int linha = 0; linha < rotas.size(); linha++) {
            if (rotas.get(linha).equals(0)) { // Muda o vertice A.
                A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasAP.png")));// Muda cor da imagem.
                estimativaA.setText(String.valueOf(estimativa[0]));// E modifica a estimativa.
            }
            if (rotas.get(linha).equals(1)) {// Muda o vertice B.
                B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasBP.png")));
                estimativaB.setText(String.valueOf(estimativa[1]));
            }
            if (rotas.get(linha).equals(2)) {// Muda o vertice C.
                C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasCP.png")));
                estimativaC.setText(String.valueOf(estimativa[2]));
            }
            if (rotas.get(linha).equals(3)) {// Muda o vertice D.
                D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasDP.png")));
                estimativaD.setText(String.valueOf(estimativa[3]));
            }
            if (rotas.get(linha).equals(4)) {// Muda o vertice E.
                E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasEP.png")));
                estimativaE.setText(String.valueOf(estimativa[4]));
            }
            if (rotas.get(linha).equals(5)) {// Muda o vertice F
                F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasFP.png")));
                estimativaF.setText(String.valueOf(estimativa[5]));
            }
            /*O vertice G sempre sera marcado, pois e o vertice final*/
            G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasHP.png")));
            estimativaG.setText(String.valueOf(estimativa[6]));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jSeparator1 = new javax.swing.JSeparator();
        GerarRotas = new javax.swing.JButton();
        zerarRota = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        Painel = new javax.swing.JPanel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        estimativaE = new javax.swing.JLabel();
        estimativaA = new javax.swing.JLabel();
        estimativaB = new javax.swing.JLabel();
        estimativaD = new javax.swing.JLabel();
        estimativaG = new javax.swing.JLabel();
        estimativaC = new javax.swing.JLabel();
        estimativaF = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        GerarRotas.setBackground(new java.awt.Color(204, 204, 204));
        GerarRotas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GerarRotas.setText("GerarRotas");
        GerarRotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarRotasActionPerformed(evt);
            }
        });

        zerarRota.setBackground(new java.awt.Color(204, 204, 204));
        zerarRota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zerarRota.setText("ZerarRotas");
        zerarRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zerarRotaActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(204, 204, 204));
        sair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        Painel.setBackground(new java.awt.Color(102, 102, 102));

        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasA.png"))); // NOI18N

        B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasB.png"))); // NOI18N

        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasC.png"))); // NOI18N

        D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasD.png"))); // NOI18N

        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasF.png"))); // NOI18N

        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasE.png"))); // NOI18N

        G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasGV.png"))); // NOI18N

        estimativaE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estimativaE.setForeground(new java.awt.Color(255, 255, 255));
        estimativaE.setText("**");

        estimativaA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estimativaA.setForeground(new java.awt.Color(255, 255, 255));
        estimativaA.setText("0");

        estimativaB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estimativaB.setForeground(new java.awt.Color(255, 255, 255));
        estimativaB.setText("**");

        estimativaD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estimativaD.setForeground(new java.awt.Color(255, 255, 255));
        estimativaD.setText("**");

        estimativaG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estimativaG.setForeground(new java.awt.Color(255, 255, 255));
        estimativaG.setText("**");

        estimativaC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estimativaC.setForeground(new java.awt.Color(255, 255, 255));
        estimativaC.setText("**");

        estimativaF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estimativaF.setForeground(new java.awt.Color(255, 255, 255));
        estimativaF.setText("**");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PainelLayout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(estimativaA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(A))
                                .addGroup(PainelLayout.createSequentialGroup()
                                    .addGap(189, 189, 189)
                                    .addComponent(B))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PainelLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(estimativaC))
                                        .addComponent(C))))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(estimativaF))
                                    .addComponent(F))))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(estimativaB)
                        .addGap(139, 139, 139)))
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(94, 94, 94))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(estimativaD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(estimativaG)))
                        .addGap(139, 139, 139))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(estimativaE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estimativaB)
                    .addComponent(estimativaD)
                    .addComponent(estimativaG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B)
                    .addComponent(G))
                .addGap(25, 25, 25)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(estimativaA)))
                .addGap(21, 21, 21)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C)
                    .addComponent(E))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estimativaE)
                    .addComponent(estimativaC))
                .addGap(83, 83, 83)
                .addComponent(F)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estimativaF)
                .addGap(12, 12, 12))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Implementação Algoritmo Dijkstra com 7 vertices");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(sair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(GerarRotas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zerarRota)))
                .addGap(40, 40, 40))
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zerarRota, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GerarRotas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GerarRotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarRotasActionPerformed
        gerarRotas();// Evento de gerar rotas.
    }//GEN-LAST:event_GerarRotasActionPerformed

    private void zerarRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zerarRotaActionPerformed
        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasA.png")));// Muda as imagem do vertice A.
        estimativaA.setText("**");//Muda a estimativa do vertice A.

        B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasB.png")));
        estimativaB.setText("**");

        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasC.png")));
        estimativaC.setText("**");

        D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasD.png")));
        estimativaD.setText("**");

        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasE.png")));
        estimativaE.setText("**");

        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasF.png")));
        estimativaF.setText("**");

        G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/LetrasH.png")));
        estimativaG.setText("**");
    }//GEN-LAST:event_zerarRotaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();// Fecha o processo da janela.
    }//GEN-LAST:event_sairActionPerformed

    public static void main(String args[]) {// Classe principal.

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafo().setVisible(true);// Torna a janela visivel.
            }
        });
    }
    
    // Não pode ser modificadas.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JButton GerarRotas;
    private javax.swing.JPanel Painel;
    private javax.swing.JLabel estimativaA;
    private javax.swing.JLabel estimativaB;
    private javax.swing.JLabel estimativaC;
    private javax.swing.JLabel estimativaD;
    private javax.swing.JLabel estimativaE;
    private javax.swing.JLabel estimativaF;
    private javax.swing.JLabel estimativaG;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton sair;
    private javax.swing.JButton zerarRota;
    // End of variables declaration//GEN-END:variables
}
