/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizadorcarpeta;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarkLaf;

public class MenuPrincipal extends javax.swing.JFrame {
    public static ArrayList<String> listaMaterias = new ArrayList<>();
    public static ArrayList<ArrayList<String>> diasMaterias = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static int materiasPorCarpeta = 2;
    public static int maximoCarpetasPorDia = 2;

    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("2");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setText("Materias por Carpeta:");

        jButton1.setText("Cargar Materias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Lunes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Martes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Miércoles");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Jueves");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Viernes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Procesar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Organizador de Carpetas");

        jLabel3.setText("Cargue las materias...");

        jLabel4.setText("Configure los días...");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel5.setText("Máximo de Carpetas por Día:");

        jLabel6.setText("Modo de Cálculo...");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Modo Rápido");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Modo Lento");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel2))
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(38, 38, 38)
                                                .addComponent(jRadioButton2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(jTextField1.getText().length()==0)
            return;
        for (int i = 0; i < this.jTextField1.getText().length(); i++) {
            switch (jTextField1.getText().charAt(i)) {
                case '0':
                    if(Integer.parseInt(jTextField1.getText())!=0)
                        break;
                    jTextField1.setText(String.valueOf(materiasPorCarpeta));
                    JOptionPane.showMessageDialog(null,"Solamente se pueden ingresar numeros positivos!");
                    return;
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    jTextField1.setText(String.valueOf(materiasPorCarpeta));
                    JOptionPane.showMessageDialog(null,"Solamente se pueden ingresar numeros!");
                    return;
            }
        }
        materiasPorCarpeta=Integer.parseInt(jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuMaterias temp = new MenuMaterias();
        temp.main(this);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SelectorDia temp =new SelectorDia("");
        temp.main("Lunes", this);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SelectorDia temp = new SelectorDia("");
        temp.main("Martes", this);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SelectorDia temp =new SelectorDia("");
        temp.main("Miércoles", this);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SelectorDia temp =new SelectorDia("");
        temp.main("Jueves", this);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SelectorDia temp = new SelectorDia("");
        temp.main("Viernes", this);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Cargando temp = new Cargando();
        temp.setLocationRelativeTo(null);
        temp.setVisible(true);
        // funcion de calculos
        if(jRadioButton2.isSelected())
            cargaLenta();
        else // if(jRadioButton2.isSelected())
            cargaRapida();
        temp.setVisible(false);
        temp.dispose();
        setVisible(true); //temporal
        // Hacer visible la nueva ventana de los resultados
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if(jTextField2.getText().length()==0)
            return;
        for (int i = 0; i < jTextField2.getText().length(); i++) {
            switch (this.jTextField2.getText().charAt(i)) {
                case '0':
                    if(Integer.parseInt(jTextField2.getText())!=0)
                        break;
                    jTextField1.setText(String.valueOf(maximoCarpetasPorDia));
                    JOptionPane.showMessageDialog(null,"Solamente se pueden ingresar numeros positivos!");
                    return;
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    jTextField2.setText(String.valueOf(maximoCarpetasPorDia));
                    JOptionPane.showMessageDialog(null,"Solamente se pueden ingresar numeros!");
                    return;
            }
        }
        maximoCarpetasPorDia=Integer.parseInt(jTextField2.getText());
    }//GEN-LAST:event_jTextField2KeyReleased

    /* OPERACION DE CALCULOS */
    
    private void cargaLenta () {
        ArrayList<Integer> totalPosibilidades = new ArrayList(); // VECTOR CON NUMEROS DEL 0 AL 'X' CANTIDAD DE MATERIAS PARA ENTREGARLO A LA FUNCION QUE RELLENA LA MATRIZ CON TODAS LAS POSIBILIDADES
        for(int i=1;i<=listaMaterias.size();i++)
            totalPosibilidades.add(i);
        
        cargarPosi(totalPosibilidades, new ArrayList<>());
        
        ArrayList<int[][]> carpetasHistorial = new ArrayList();
        for(int i=0;i<posibilidades(totalPosibilidades.size());i++) { // Por cada Carpeta
            int carpetas[][] = new int[(listaMaterias.size()/materiasPorCarpeta)+1][materiasPorCarpeta];
            for(int x=1;x<=listaMaterias.size(); x++) 
                carpetas[(x-1)/materiasPorCarpeta][(x-1)%materiasPorCarpeta]=res.get(i).get(x-1);

            // ordena la Matriz "carpeta" horizontalmente y luego verticalmente
            for(int x=0;x<(listaMaterias.size()/materiasPorCarpeta)+1;x++) { // por cada vector... (ordena horizontalmente)
                for(int z=0;z<materiasPorCarpeta;z++){ // Repetir la cantidad de veces de largo del vector
                    for(int y=1;y<materiasPorCarpeta;y++){ // Recorrer por cada materia
                        if(carpetas[x][y-1] == 0) carpetas[x][y-1] = 2147483647; // si es 0, o sea vacio, lo llena con el int mas grande
                        if(carpetas[x][y-1] > carpetas[x][y]) { // Aplica Burbujeo
                            int swap = carpetas[x][y-1];
                            carpetas[x][y-1] = carpetas[x][y];
                            carpetas[x][y] = swap;
                        }
                    }
                }
            }
            for(int x=0;x<(listaMaterias.size()/materiasPorCarpeta)+1;x++) { // Repetir la cant. de veces de largo del vector... (ordena verticalmente)
                for(int y=1;y<(listaMaterias.size()/materiasPorCarpeta)+1;y++){
                    if(carpetas[y-1][0] > carpetas[y][0]) { // Aplica Burbujeo
                        int swap[] = new int[materiasPorCarpeta];
                        System.arraycopy(carpetas[y-1], 0, swap, 0, materiasPorCarpeta); //System.out.println(swap[z]);
                        System.arraycopy(carpetas[y], 0, carpetas[y-1], 0, materiasPorCarpeta);
                        System.arraycopy(swap, 0, carpetas[y], 0, materiasPorCarpeta);
                    }
                }
            }
            
            // Busque que no haya repetidos anteriores
            int Encontrado=0;
            if (carpetasHistorial.isEmpty()) carpetasHistorial.add(carpetas);
            else {
                for(int x=0;x<carpetasHistorial.size();x++) {
                    int coincidencias=0;
                    for(int y=0;y<(listaMaterias.size()/materiasPorCarpeta)+1;y++){
                        for(int z=0;z<materiasPorCarpeta;z++){
                            if(carpetas[y][z] == carpetasHistorial.get(x)[y][z]) coincidencias++;
                        }
                    }
                    if(coincidencias>listaMaterias.size()) Encontrado=1;
                }
            }
            
            if(Encontrado==0) { // Si no se encontró una matriz igual, imprimirlo
                carpetasHistorial.add(carpetas);
                int cantC[] = new int [5];
                for(int x=0; x<5;x++){
                    cantC[x] = carpetasPorDia(carpetas, diasMaterias.get(x));
                }
                int max=cantC[0];
                for(int x=1;x<cantC.length;x++) if(max<cantC[x]) max=cantC[x];
                if(max<=maximoCarpetasPorDia) imprimirCarpetaGanadora(carpetas, cantC);
            }
        }
    }
    
    private void cargaRapida () {
        ArrayList<Integer> totalPosibilidades = new ArrayList(); // VECTOR CON NUMEROS DEL 0 AL 'X' CANTIDAD DE MATERIAS PARA ENTREGARLO A LA FUNCION QUE RELLENA LA MATRIZ CON TODAS LAS POSIBILIDADES
        for(int i=1;i<=listaMaterias.size();i++)
            totalPosibilidades.add(i);
        cargarPosi(totalPosibilidades, new ArrayList<>()); // Carga matriz posibilidades
            
        for(int i=0;i<res.size();i++) { // Por cada poaiblidad
            boolean salir=false;
            int[][] carpetas = new int[(listaMaterias.size()/materiasPorCarpeta)+1][materiasPorCarpeta];
            // Carga la lista en las carpetas
            for(int x=0;x<listaMaterias.size(); x++) 
                carpetas[x/materiasPorCarpeta][x%materiasPorCarpeta]=res.get(i).get(x);
            
            // Verifica que la matriz esté ordenada verticalmente, sino sale
            for(int y=0;y<listaMaterias.size()/materiasPorCarpeta;y++){ // Por cada carpeta
                if(carpetas[y][0]==0 || carpetas[y+1][0]==0) // Si hay  una materia '0', significa que no hay materia
                    break;
                if(carpetas[y][0]>=carpetas[y+1][0]){
                    salir=true;
                    break;
                }
            }
            // Verifica que la matriz esté ordenada horizontalmente, sino sale
            for(int y=0;y<listaMaterias.size()/materiasPorCarpeta+1 && !salir;y++){ // Por cada carpeta
                for(int x=0;x<materiasPorCarpeta-1;x++){ // Por cada materia
                    if(carpetas[y][x]==0 || carpetas[y][x+1]==0) // Si hay  una materia '0', significa que no hay materia
                        break;
                    if(carpetas[y][x]>carpetas[y][x+1]){ //Si no esta ordenado
                        salir=true;
                        break;
                    }
                }
            }
            
            if(!salir){
                // imprimirlo
                int cantC[] = new int [5];
                for(int x=0; x<5;x++){
                    cantC[x] = carpetasPorDia(carpetas, diasMaterias.get(x));
                }
                int max=cantC[0];
                for(int x=1;x<cantC.length;x++) if(max<cantC[x]) max=cantC[x];
                if(max<=maximoCarpetasPorDia) imprimirCarpetaGanadora(carpetas, cantC);
            }
        }
    }
    
    public static int carpetasPorDia (int carpeta[][], ArrayList<String> dia) {
        ArrayList<Integer> eleccionCarpeta = new ArrayList();
        for(int i=0;i<dia.size();i++){
            ///COMPRUEBA EL NUMERO DE LA MATERIA
            int numeroMateria=-1;
            for(int x=0;x<listaMaterias.size();x++){
                if(listaMaterias.get(x).equalsIgnoreCase(dia.get(i))) numeroMateria=x;
            }
            ///Empiza la Busqueda
            for(int x=0;x<(listaMaterias.size()/materiasPorCarpeta)+1;x++){
                for(int y=0;y<materiasPorCarpeta;y++){
                    if(carpeta[x][y] == numeroMateria) {
                        eleccionCarpeta.add(x);
                    }                    
                }
            }
        }
            ArrayList<Integer> carpetasEncontradas = new ArrayList();
            
            for(int i=0;i<eleccionCarpeta.size();i++){
                // VERIFICA SI LA CARPETA YA SE HABIA ENCONTRADO
                int boolYaEncontrada=0;
                for(int x=0;x<carpetasEncontradas.size();x++){
                    if(eleccionCarpeta.get(i).equals(carpetasEncontradas.get(x))) {
                        boolYaEncontrada=1;
                        break;
                    }
                }
                if (boolYaEncontrada==0) carpetasEncontradas.add(eleccionCarpeta.get(i));
            }
        return carpetasEncontradas.size() ;
    }
    
    public static void cargarPosi (ArrayList<Integer> totalPosibilidades, ArrayList<Integer> posibilidad) {
        for(int i=0;i<totalPosibilidades.size();i++) { 
            if(totalPosibilidades.size() == 1) { // Si queda solo un numero lo agrega al arraylist y lo guarda ese array en el arraylist de los otros arraylist
                posibilidad.add(totalPosibilidades.get(0));
                res.add(posibilidad);
            } else { // Aplica la recursion
                // Agrega el numero dentro de otro array para Pasarselo a la Recursion
                ArrayList<Integer> posiSwap = new ArrayList(); 
                    posibilidad.forEach((n) -> posiSwap.add(n));
                    posiSwap.add(totalPosibilidades.get(i));
                    
                // Elimina el numero que se colocó en el Array y le Pasa a la recurción el array sin ese numero
                ArrayList<Integer> swap = new ArrayList(); 
                    totalPosibilidades.forEach((n) -> swap.add(n));
                    swap.remove(i);

                cargarPosi(swap, posiSwap);
            }
        }
    }
    
    public static int posibilidades (int posi){
        if(posi<2)
            return 1;
        else
            return posi*posibilidades(posi-1);
    }
    
    public static void imprimirCarpetaGanadora(int carpeta[][], int cantC[]){
        //IMPRIME LA CARPETA Y LA CANTIDAD MAXIMA DE CARPETAS POR DÍA
        int totalC=0;
        for(int x=0; x<5; x++){
            switch(x){
                case 0 : System.out.print("     LUNES: "); break;
                case 1 : System.out.print(" ; MARTES: "); break;
                case 2 : System.out.print(" ; MIERCOLES: "); break;
                case 3 : System.out.print(" ; JUEVES: "); break;
                case 4 : System.out.print(" ; VIERNES: "); break;
            }
            System.out.print(cantC[x]);
        }
        System.out.println("");
        for(int x=0;x<cantC.length;x++) totalC+=cantC[x];
        System.out.println("     Cantidad de Carpetas Semanal: " + totalC);
        System.out.print("     CARPETA: \n");
            for(int y=0;y<(listaMaterias.size()/materiasPorCarpeta)+1;y++){
                for(int x=0; x<materiasPorCarpeta;x++){
                    System.out.print("       ");
                    for(int i=0; i<listaMaterias.size();i++){
                        if(carpeta[y][x]-1==i) System.out.print(listaMaterias.get(i));
                    }
                }
                System.out.println();
            }
            System.out.println();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        for(int i=0;i<5;i++)
            diasMaterias.add(new ArrayList<String>());
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            System.out.println(e);
        }
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal temp = new MenuPrincipal();
                temp.setLocationRelativeTo(null);
                temp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
