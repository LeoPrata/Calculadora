
package calculadora.Visao;




public class TelaPrincipal extends javax.swing.JFrame {
    
    
    public TelaPrincipal() {
        initComponents();
       
    }
     Double valor1, valor2;
     String operacao;
   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btAC = new javax.swing.JButton();
        btParenteces = new javax.swing.JButton();
        btPorcentagem = new javax.swing.JButton();
        btDivisao = new javax.swing.JButton();
        btN7 = new javax.swing.JButton();
        btN8 = new javax.swing.JButton();
        btN9 = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        btN4 = new javax.swing.JButton();
        btN5 = new javax.swing.JButton();
        btN6 = new javax.swing.JButton();
        btSubitracao = new javax.swing.JButton();
        btN1 = new javax.swing.JButton();
        btN2 = new javax.swing.JButton();
        btN3 = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        btN0 = new javax.swing.JButton();
        btVingula = new javax.swing.JButton();
        btC = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        tfValor.setBackground(new java.awt.Color(0, 0, 0));
        tfValor.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        tfValor.setForeground(new java.awt.Color(255, 255, 255));
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btAC.setBackground(new java.awt.Color(153, 255, 153));
        btAC.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btAC.setText("AC");
        btAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACActionPerformed(evt);
            }
        });
        jPanel1.add(btAC);

        btParenteces.setBackground(new java.awt.Color(153, 255, 255));
        btParenteces.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btParenteces.setText("^");
        btParenteces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParentecesActionPerformed(evt);
            }
        });
        jPanel1.add(btParenteces);

        btPorcentagem.setBackground(new java.awt.Color(153, 255, 255));
        btPorcentagem.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btPorcentagem.setText("%");
        btPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPorcentagemActionPerformed(evt);
            }
        });
        jPanel1.add(btPorcentagem);

        btDivisao.setBackground(new java.awt.Color(153, 255, 255));
        btDivisao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btDivisao.setText("/");
        btDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(btDivisao);

        btN7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN7.setText("7");
        btN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN7ActionPerformed(evt);
            }
        });
        jPanel1.add(btN7);

        btN8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN8.setText("8");
        btN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN8ActionPerformed(evt);
            }
        });
        jPanel1.add(btN8);

        btN9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN9.setText("9");
        btN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN9ActionPerformed(evt);
            }
        });
        jPanel1.add(btN9);

        btMultiplicacao.setBackground(new java.awt.Color(153, 255, 255));
        btMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btMultiplicacao.setText("x");
        btMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btMultiplicacao);

        btN4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN4.setText("4");
        btN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN4ActionPerformed(evt);
            }
        });
        jPanel1.add(btN4);

        btN5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN5.setText("5");
        btN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN5ActionPerformed(evt);
            }
        });
        jPanel1.add(btN5);

        btN6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN6.setText("6");
        btN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN6ActionPerformed(evt);
            }
        });
        jPanel1.add(btN6);

        btSubitracao.setBackground(new java.awt.Color(153, 255, 255));
        btSubitracao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btSubitracao.setText("-");
        btSubitracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubitracaoActionPerformed(evt);
            }
        });
        jPanel1.add(btSubitracao);

        btN1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN1.setText("1");
        btN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN1ActionPerformed(evt);
            }
        });
        jPanel1.add(btN1);

        btN2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN2.setText("2");
        btN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN2ActionPerformed(evt);
            }
        });
        jPanel1.add(btN2);

        btN3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN3.setText("3");
        btN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN3ActionPerformed(evt);
            }
        });
        jPanel1.add(btN3);

        btSoma.setBackground(new java.awt.Color(153, 255, 255));
        btSoma.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btSoma.setText("+");
        btSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomaActionPerformed(evt);
            }
        });
        jPanel1.add(btSoma);

        btN0.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btN0.setText("0");
        btN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btN0ActionPerformed(evt);
            }
        });
        jPanel1.add(btN0);

        btVingula.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btVingula.setText(",");
        btVingula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVingulaActionPerformed(evt);
            }
        });
        jPanel1.add(btVingula);

        btC.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btC.setText("C");
        btC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCActionPerformed(evt);
            }
        });
        jPanel1.add(btC);

        btIgual.setBackground(new java.awt.Color(153, 255, 255));
        btIgual.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });
        jPanel1.add(btIgual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfValor)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(320, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
        valor2 = Double.parseDouble(tfValor.getText());
        
        if(null != operacao)switch (operacao) {
            case "soma":
                tfValor.setText(String.valueOf(valor1 + valor2));
                break;
            case "subtracao":
                tfValor.setText(String.valueOf(valor1 - valor2));
                break;
            case "multiplicacao":
                tfValor.setText(String.valueOf(valor1 * valor2));
                break;
            case "divisao":
                tfValor.setText(String.valueOf(valor1 / valor2));
                break;
            case "porcentagem":
                tfValor.setText(String.valueOf((valor1 * valor2) / 100));
                break;
            case "potencia":
                tfValor.setText(String.valueOf(Math.pow(valor1, valor2)));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btIgualActionPerformed

    private void btN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN0ActionPerformed
       tfValor.setText(tfValor.getText()+ "0");
       
        
    }//GEN-LAST:event_btN0ActionPerformed

    private void btN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN1ActionPerformed
        tfValor.setText(tfValor.getText()+ "1");
        
    }//GEN-LAST:event_btN1ActionPerformed

    private void btN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN2ActionPerformed
        tfValor.setText(tfValor.getText()+ "2");
       
    }//GEN-LAST:event_btN2ActionPerformed

    private void btN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN3ActionPerformed
        tfValor.setText(tfValor.getText()+ "3");
        
    }//GEN-LAST:event_btN3ActionPerformed

    private void btN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN4ActionPerformed
        tfValor.setText(tfValor.getText()+ "4");
        
    }//GEN-LAST:event_btN4ActionPerformed

    private void btN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN5ActionPerformed
       tfValor.setText(tfValor.getText()+ "5");
    }//GEN-LAST:event_btN5ActionPerformed

    private void btN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN6ActionPerformed
        tfValor.setText(tfValor.getText()+ "6");
    }//GEN-LAST:event_btN6ActionPerformed

    private void btN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN7ActionPerformed
        tfValor.setText(tfValor.getText()+ "7");
    }//GEN-LAST:event_btN7ActionPerformed

    private void btN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN8ActionPerformed
        tfValor.setText(tfValor.getText()+ "8");
    }//GEN-LAST:event_btN8ActionPerformed

    private void btN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btN9ActionPerformed
        tfValor.setText(tfValor.getText()+ "9");
    }//GEN-LAST:event_btN9ActionPerformed

    private void btVingulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVingulaActionPerformed
        tfValor.setText(tfValor.getText()+ ",");
    }//GEN-LAST:event_btVingulaActionPerformed

    private void btACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACActionPerformed
        tfValor.setText("");
    }//GEN-LAST:event_btACActionPerformed

    private void btSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomaActionPerformed
       valor1 = Double.parseDouble(tfValor.getText());
       tfValor.setText("");
       operacao = "soma";
    }//GEN-LAST:event_btSomaActionPerformed

    private void btSubitracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubitracaoActionPerformed
       valor1 = Double.parseDouble(tfValor.getText());
       tfValor.setText("");
       operacao = "subtracao";
    }//GEN-LAST:event_btSubitracaoActionPerformed

    private void btMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicacaoActionPerformed
       valor1 = Double.parseDouble(tfValor.getText());
       tfValor.setText("");
       operacao = "multiplicacao";
    }//GEN-LAST:event_btMultiplicacaoActionPerformed

    private void btDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisaoActionPerformed
       valor1 = Double.parseDouble(tfValor.getText());
       tfValor.setText("");
       operacao = "divisao";
        
    }//GEN-LAST:event_btDivisaoActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void btPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPorcentagemActionPerformed
       valor1 = Double.parseDouble(tfValor.getText());
       tfValor.setText("");
       operacao = "porcentagem";
    }//GEN-LAST:event_btPorcentagemActionPerformed

    private void btParentecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParentecesActionPerformed
       valor1 = Double.parseDouble(tfValor.getText());
       tfValor.setText("");
       operacao = "potencia";
    
    }//GEN-LAST:event_btParentecesActionPerformed

    private void btCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCActionPerformed
        String apagar = tfValor.getText();
        apagar = apagar.substring(0, apagar.length() - 1);
        tfValor.setText(apagar);
    }//GEN-LAST:event_btCActionPerformed
     
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAC;
    private javax.swing.JButton btC;
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMultiplicacao;
    private javax.swing.JButton btN0;
    private javax.swing.JButton btN1;
    private javax.swing.JButton btN2;
    private javax.swing.JButton btN3;
    private javax.swing.JButton btN4;
    private javax.swing.JButton btN5;
    private javax.swing.JButton btN6;
    private javax.swing.JButton btN7;
    private javax.swing.JButton btN8;
    private javax.swing.JButton btN9;
    private javax.swing.JButton btParenteces;
    private javax.swing.JButton btPorcentagem;
    private javax.swing.JButton btSoma;
    private javax.swing.JButton btSubitracao;
    private javax.swing.JButton btVingula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
