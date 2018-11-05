package alex;

import javax.swing.JOptionPane;

public class Vi extends javax.swing.JPanel {


    public Vi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(200, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String c; //Cadeia a ser analisada
        char ch; // caracter da cadeia
        int i=0;// índice para andar na cadeia caracter por caracter
        int j=0;// índice para buscar o tamanho da cadeia
        c = jTextArea1.getText();
        j= c.length();
        
        
        
        if(i == j) 
        {
             JOptionPane.showMessageDialog(null, "Erro");
         } // termina cadeia vazia
         else
         {
             ch = c.charAt(i);
             if(ch=='b')
             { // comeco cadeia inicia com b
                 if(i==(j-1))
                 {
                    JOptionPane.showMessageDialog(null, "Erro");
                 }
                 else
                 {
             while(true)
             { i++;
               ch = c.charAt(i);
                     if((ch=='b')&&(i==(j-1)))
                     {
                     JOptionPane.showMessageDialog(null, "Erro");
                     break;
                     }
                     else
                     {
                             if(ch!='b')
                             {
                             break;
                             }
                             }
             }
             
             if(ch=='a')
             {
                 if(i==(j-1))
                 {
                     JOptionPane.showMessageDialog(null, "Erro");
                 }
                 else
                 {
                 i++;
                 ch = c.charAt(i);
                 if((ch=='b')&&(i==(j-1)))
                 {
                     JOptionPane.showMessageDialog(null, "Cadeia aceita");
                 }
                 else
                 {
                     
                     JOptionPane.showMessageDialog(null, "Erro");
                 }
             }
             }
                 }
             }// fim cadeia inicia com b
             else{
                 
             
             if(ch=='a')
             {
                 if(i==(j-1))
                 {
                     JOptionPane.showMessageDialog(null, "Erro");
                 }
                 else
                 {
                 i++;
                 ch = c.charAt(i);
                 if((ch=='b')&&(i==(j-1)))
                 {
                     JOptionPane.showMessageDialog(null, "Cadeia aceita");
                 }
                 else
                 {
                     
                     JOptionPane.showMessageDialog(null, "Erro");
                 }
             }
             }
             else
             {
                JOptionPane.showMessageDialog(null, "Erro"); 
             }
             }
         }

        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
