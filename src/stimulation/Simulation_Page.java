package stimulation;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ASONOFGOD
 */
public class Simulation_Page extends javax.swing.JFrame {
     private File f = null;
    private File NewFile = null;
    private JFileChooser choose;
    private PrintWriter pw;
    private FileReader fr;
    private FileWriter fw;
    private BufferedReader br;
    private BufferedWriter bw;
    private int lineCount=0;
    private String[] textContent;
    private boolean isModified = false;
    

    /**
     * Creates new form Simulation_Page
     */
    public Simulation_Page() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Enter number of Simulations you want to perform:");

        jLabel2.setText("Enter the value of your X0:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("GROUP 1 SIMULATION PAGE");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204)));

        jButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 204));
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 204));
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 204));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 204));
        jButton6.setText("SAVE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), new java.awt.Color(102, 153, 0)));

        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setText("GENERATE RANDOM NUMBERS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 0));
        jButton5.setText("RUN SIMULATION");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     {
         int n=Integer.parseInt(jTextField1.getText());
         int x0=Integer.parseInt(jTextField2.getText());
            double[] rn;
            int[] t1;
            int[] t2;
            int[] t3;
            t3=new int[n];
            t2=new int[n];
            t1=new int[n];
            rn=new double[4*n];          
            int k=0;
            int i=4*n;
           do
            {
               x0 =(((97*x0)+3)%1000); 
               double x1= x0*(0.001);
               
               rn[k]=x1;
                jTextArea1.append(" X["+(k+1)+"]="+x0+"\t"+"Rn["+(k+1)+"]="+new BigDecimal(rn[k]).setScale(3,RoundingMode.HALF_UP)+"\n");
                System.out.format("X["+(k+1)+"]="+x0+"\t"+"RN["+(k+1)+"]="+"%.3f%n",rn[k]);
                k++;
             }
            while( k<i); 
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        Mainpage Mp=new Mainpage();
        Mp.setVisible(true);
        this.dispose();        
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(this, "Are you sure you want to exit", "Select one", JOptionPane.YES_NO_OPTION);
        if(j==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else if(j==JOptionPane.NO_OPTION)
        {
            return;
        }
    }                                        

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(this, "Are you sure you want to exit", "Select one", JOptionPane.YES_NO_OPTION);
        if(j==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else if(j==JOptionPane.NO_OPTION)
        {
            return;
        }
    }                                  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
          try {
            jTextArea1.print();
            JOptionPane.showMessageDialog(this, "Printing was successful");
        } catch (PrinterException | HeadlessException e)
        {
            JOptionPane.showConfirmDialog(this, "Printing was not successful");
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String p=jTextField1.getText();
        String q=jTextField2.getText();
        if (p=="" && q=="")
        {
            JOptionPane.showMessageDialog(this, "Enter the number of simulations you want to perform and your X0", "Input parameters", JOptionPane.OK_OPTION);
        }
        if(p=="")
        {
            JOptionPane.showMessageDialog(this, "Enter the number of simulations you want to perform ", "Input parameter", JOptionPane.OK_OPTION);
        }
        if(q=="")
        {
            JOptionPane.showMessageDialog(this, "Input your X0 ", "Input parameter", JOptionPane.OK_OPTION);
        }
            int n=Integer.parseInt(jTextField1.getText());
            int x0=Integer.parseInt(jTextField2.getText());
            double[] rn;
            int[] t1;
            int[] t2;
            int[] t3;
            t3=new int[n];
            t2=new int[n];
            t1=new int[n];
            rn=new double[4*n];          
            int k=0;
            int j;
            int i=4*n;
           do
            {
               x0 = (((97*x0)+3)%1000); 
               new BigDecimal(x0).setScale(2,RoundingMode.HALF_UP);
               double x1= x0*(0.001);
               rn[k]=x1;
               System.out.format("X["+(k+1)+"]="+x0+"\t"+"RN["+(k+1)+"]="+"%.3f%n",rn[k]);
               k++;
             }
           while( k<i);
           k=0;
           for( j=0; j<n; j++)
           {    
              if(rn[k]<0.7)
              {
                  t1[j]=0;
              }
              else if(rn[k]<0.9)
              {
                  t1[j]=5;
              }
              else 
              {
                  t1[j]=10;
              }
           k=k+4;
             System.out.println("T1["+(j+1)+"]="+t1[j]);
            // jTextArea1.append("T1["+(j+1)+"]="+t1[j]+"\n" );   
           }
           k=1;
             for (j=0; j<n; j++)
          {
               double y=Math.pow(-2*(Math.log(rn[k])),0.5);
               double x=((2*180*rn[k+1]));
               double radians=Math.toRadians(x);
               double z=Math.cos(radians);
               t2[j]=(int) Math.round((2*(y*z)+30));      
            k=k+4;
               System.out.println("T2["+(j+1)+"]="+t2[j]);  
               //jTextArea1.append("T2["+(j+1)+"]="+t2[j]+"\n" );   
         }
           k=3;
            for(j=0; j<n; j++)
           {   
               if(rn[k]<0.3)
               {
                   t3[j]=28;
               }
                else if(rn[k]<0.7)
              {
                  t3[j]=30;
              }
              else if(rn[k]<0.9)
              {
                  t3[j]=32;
              }
               else
              {
                  t3[j]=34;
              }
            k=k+4;
                System.out.println("T3["+(j+1)+"]="+t3[j]);
                //jTextArea1.append("T1["+(j+1)+"]="+t1[j]+"\t"+"T2["+(j+1)+"]="+t2[j]+"\t"+"T3["+(j+1)+"]="+t3[j]+"\n" );   
           }
            int c=0;
            for( j=0; j<n; j++)
            {
                if(t3[j]<t1[j]+t2[j])
                {
                    jTextArea1.append("T1["+(j+1)+"]="+t1[j]+"\t"+"T2["+(j+1)+"]="+t2[j]+"\t"+"T3["+(j+1)+"]="+t3[j]+"\t"+"Simulation "+(j+1)+": Catch"+"\n" );   
                    System.out.println("Simulation "+(j+1)+": Catch");
                    c=c+1;
                }
                else 
                {
                    System.out.println("Simulation "+(j+1)+": NOT Catch");
                    jTextArea1.append("T1["+(j+1)+"]="+t1[j]+"\t"+"T2["+(j+1)+"]="+t2[j]+"\t"+"T3["+(j+1)+"]="+t3[j]+"\t"+"Simulation "+(j+1)+": Not Catch"+"\n" );   
                }
            }
                jTextArea1.append("Number of Catches = "+c+"\n");
                jTextArea1.append("Probability of catching = "+c+"/"+n+"\n");
                System.out.println("Number of Catches="+c);
                System.out.println("Probability of catching= "+c+"/"+n);
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         if (f != null) {
            saveExistingFile();
        } else if (f == null) {
            saveFile();
        }
        isModified=false;
    }                                        

    public void saveExistingFile(){
        try{
        pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
                //textContent is an array
                textContent = jTextArea1.getText().split("\\n");

                for (int k = 0; k < textContent.length; k++) {
                    pw.println(textContent[k]);
                }
                pw.flush();
                pw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    //save a file which has not existed
    public void saveFile(){
        try {
            choose = new JFileChooser();
            choose.setSelectedFile(f);
            int i = choose.showSaveDialog(null);
            if (i == JFileChooser.APPROVE_OPTION) {
                f = choose.getSelectedFile();
               // System.out.println(f.getName().toString());


                //to check if there exist a file of same name
                if(f.exists()){
                    Object[] options = {"Yes",
                "No"};

                   int e= JOptionPane.showOptionDialog(this, "File "+f.getPath().toString()+" already Exist.\nDo you wish to replace it?", 
                            "Confirm Save as", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                            null, options, options[0]);

                    if(e==JOptionPane.YES_OPTION){
                        saveExistingFile();
                    }
                    else if(e==JOptionPane.NO_OPTION){
                        saveFile();
                   }

                }

                else if(!f.exists()){
                    f.createNewFile();
                }

                pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
                //textContent is an array
                textContent = jTextArea1.getText().split("\\n");

                for (int k = 0; k < textContent.length; k++) {
                    pw.println(textContent[k]);
                }
                pw.flush();
                pw.close();

                jTextArea1.setText("");

                try {

                    br = new BufferedReader(new FileReader(f));
                    String line = br.readLine();

                    while (line != null) {
                        jTextArea1.append(line + "\n");
                        line = br.readLine();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            else if(i==JFileChooser.CANCEL_OPTION){
                return;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                     javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulation_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulation_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulation_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulation_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulation_Page().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}


