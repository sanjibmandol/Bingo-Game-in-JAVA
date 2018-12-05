/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingomain;

import java.awt.Button;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanjib Mandol
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int numUser[],temp, temp1, numComp[], arryUser[]=new int[25], arryComp[]= new int[25], arraytemp[]=new int[25],i=0;
    boolean turns=false;
    public NewJFrame() {
        initComponents();
     
        numUser= new int[25];
        numComp= new int[25];
        for(i=0; i<25; i++)
        {
            numUser[i]=i+1;
            numComp[i]=i+1;
            arraytemp[i]=i+1;
            arryComp[i]=0;
            arryUser[i]=0;
            
        }
        shuffleUser();
        shuffleComp();
      
        setElements();
        
        
        turn();
        
        
    }
    void turn()
    {
            
            
        
               
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                while(true)
                {
                    temp= ((int)(Math.random()*25))+1;
                    if(arraytemp[temp-1]!=-1)
                    {
                        Displaying.setText(""+temp);
                        arraytemp[temp-1]=-1;
                        for(i=0; i<25; i++)
                        {
                            if(numComp[i]==temp)
                            {
                                arryComp[i]=1;
                                
                                break;
                            }
                                
                        }
                        
                        
                        for(i=0; i<25; i++)
                        {
                            if(numUser[i]==temp)
                            {
                                temp=i;
                                arryUser[i]=1;
                                break;
                            }                               
                        }
                        
                        switch(temp)
                        {
                            case 0:
                                Btn0.setEnabled(false);
                                break;
                            case 1:
                                Btn1.setEnabled(false);
                                break;
                            case 2:
                                Btn2.setEnabled(false);
                                break;
                            case 3:
                                Btn3.setEnabled(false);
                                break;
                            case 4:
                                Btn4.setEnabled(false);
                                break;
                            case 5:
                                Btn5.setEnabled(false);
                                break;
                            case 6:
                                Btn6.setEnabled(false);
                                break;
                            case 7:
                                Btn7.setEnabled(false);
                                break;
                            case 8:
                                Btn8.setEnabled(false);
                                break;
                            case 9:
                                Btn9.setEnabled(false);
                                break;
                            case 10:
                                Btn10.setEnabled(false);
                                break;
                            case 11:
                                Btn11.setEnabled(false);
                                break;
                            case 12:
                                Btn12.setEnabled(false);  
                                break;
                            case 13:
                                Btn13.setEnabled(false);
                                break;
                            case 14:
                                Btn14.setEnabled(false);
                                break;
                            case 15:
                                Btn15.setEnabled(false);
                                break;
                            case 16:
                                Btn16.setEnabled(false);
                                break;
                            case 17:
                                Btn17.setEnabled(false);
                                break;
                            case 18:
                                Btn18.setEnabled(false);
                                break;
                            case 19:
                                Btn19.setEnabled(false);
                                break;
                            case 20:
                                Btn20.setEnabled(false);
                                break;
                            case 21:
                                Btn21.setEnabled(false);
                                break;
                            case 22:
                                Btn22.setEnabled(false);
                                break;
                            case 23:
                                Btn23.setEnabled(false);
                                break;
                                
                            case 24:
                                Btn24.setEnabled(false);
                                break;
                           
                        }
                            
                        break;
                    }
                        
                }
                compareComp();
                compareUser();
                
                 
        
    }
    void compareUser()
    {
        
        int a=0;
        if(arryUser[0]==1 && arryUser[1]==1 && arryUser[2]==1 && arryUser[3]==1 && arryUser[4]==1)
        {
            a=a+1;
        }
        if(arryUser[5]==1 && arryUser[6]==1 && arryUser[7]==1 && arryUser[8]==1 && arryUser[9]==1)
        {
            a=a+1;
        }
        if(arryUser[10]==1 && arryUser[11]==1 && arryUser[12]==1 && arryUser[13]==1 && arryUser[14]==1)
        {
            a=a+1;
        }
        if(arryUser[15]==1 && arryUser[16]==1 && arryUser[17]==1 && arryUser[18]==1 && arryUser[19]==1)
        {
            a=a+1;
        }
        if(arryUser[20]==1 && arryUser[21]==1 && arryUser[22]==1 && arryUser[23]==1 && arryUser[24]==1)
        {
            a=a+1;
        }
        
        
        if(arryUser[0]==1 && arryUser[5]==1 && arryUser[10]==1 && arryUser[15]==1 && arryUser[20]==1)
        {
            a=a+1;
        }
        if(arryUser[1]==1 && arryUser[6]==1 && arryUser[11]==1 && arryUser[16]==1 && arryUser[21]==1)
        {
            a=a+1;
        }
        if(arryUser[2]==1 && arryUser[7]==1 && arryUser[12]==1 && arryUser[17]==1 && arryUser[22]==1)
        {
            a=a+1;
        }
        if(arryUser[3]==1 && arryUser[8]==1 && arryUser[13]==1 && arryUser[18]==1 && arryUser[23]==1)
        {
            a=a+1;
        }
        if(arryUser[4]==1 && arryUser[9]==1 && arryUser[14]==1 && arryUser[19]==1 && arryUser[24]==1)
        {
            a=a+1;
        }
        
        
        if(arryUser[0]==1 && arryUser[6]==1 && arryUser[12]==1 && arryUser[18]==1 && arryUser[24]==1)
        {
            a=a+1;
        }
        if(arryUser[4]==1 && arryUser[8]==1 && arryUser[12]==1 && arryUser[16]==1 && arryUser[20]==1)
        {
            a=a+1;
        }
        if(a>=5)
        {
            JOptionPane.showMessageDialog(null,"User Win");
            System.exit(10);
        }

    }
        void compareComp()
    {
        
        int a=0;
        if(arryComp[0]==1 && arryComp[1]==1 && arryComp[2]==1 && arryComp[3]==1 && arryComp[4]==1)
        {
            a=a+1;
        }
        if(arryComp[5]==1 && arryComp[6]==1 && arryComp[7]==1 && arryComp[8]==1 && arryComp[9]==1)
        {
            a=a+1;
        }
        if(arryComp[10]==1 && arryComp[11]==1 && arryComp[12]==1 && arryComp[13]==1 && arryComp[14]==1)
        {
            a=a+1;
        }
        if(arryComp[15]==1 && arryComp[16]==1 && arryComp[17]==1 && arryComp[18]==1 && arryComp[19]==1)
        {
            a=a+1;
        }
        if(arryComp[20]==1 && arryComp[21]==1 && arryComp[22]==1 && arryComp[23]==1 && arryComp[24]==1)
        {
            a=a+1;
        }
        
        
        if(arryComp[0]==1 && arryComp[5]==1 && arryComp[10]==1 && arryComp[15]==1 && arryComp[20]==1)
        {
            a=a+1;
        }
        if(arryComp[1]==1 && arryComp[6]==1 && arryComp[11]==1 && arryComp[16]==1 && arryComp[21]==1)
        {
            a=a+1;
        }
        if(arryComp[2]==1 && arryComp[7]==1 && arryComp[12]==1 && arryComp[17]==1 && arryComp[22]==1)
        {
            a=a+1;
        }
        if(arryComp[3]==1 && arryComp[8]==1 && arryComp[13]==1 && arryComp[18]==1 && arryComp[23]==1)
        {
            a=a+1;
        }
        if(arryComp[4]==1 && arryComp[9]==1 && arryComp[14]==1 && arryComp[19]==1 && arryComp[24]==1)
        {
            a=a+1;
        }
        
        
        if(arryComp[0]==1 && arryComp[6]==1 && arryComp[12]==1 && arryComp[18]==1 && arryComp[24]==1)
        {
            a=a+1;
        }
        if(arryComp[4]==1 && arryComp[8]==1 && arryComp[12]==1 && arryComp[16]==1 && arryComp[20]==1)
        {
            a=a+1;
        }
        if(a>=5)
        {
            JOptionPane.showMessageDialog(null,"Computer Win");
            System.exit(10);
        }

    }
    
    void setElements()
    {
            Btn0.setText(""+numUser[0]);
            Btn1.setText(""+numUser[1]);
            Btn2.setText(""+numUser[2]);
            Btn3.setText(""+numUser[3]);
            Btn4.setText(""+numUser[4]);
            Btn5.setText(""+numUser[5]);
            Btn6.setText(""+numUser[6]);
            Btn7.setText(""+numUser[7]);
            Btn8.setText(""+numUser[8]);
            Btn9.setText(""+numUser[9]);
            Btn10.setText(""+numUser[10]);
            Btn11.setText(""+numUser[11]);
            Btn12.setText(""+numUser[12]);
            Btn13.setText(""+numUser[13]);
            Btn14.setText(""+numUser[14]);
            Btn15.setText(""+numUser[15]);
            Btn16.setText(""+numUser[16]);
            Btn17.setText(""+numUser[17]);
            Btn18.setText(""+numUser[18]);
            Btn19.setText(""+numUser[19]);
            Btn20.setText(""+numUser[20]);
            Btn21.setText(""+numUser[21]);
            Btn22.setText(""+numUser[22]);
            Btn23.setText(""+numUser[23]);
            Btn24.setText(""+numUser[24]);
    }
    void shuffleUser()
    {
        for(int i=0; i<25; i++)
        {
            temp= ((int)(Math.random()*25));
            temp1=numUser[i];
            numUser[i]= numUser[temp];
            numUser[temp]= temp1;
           
        }
    }
       void shuffleComp()
    {
        for(int i=0; i<25; i++)
        {
            temp= ((int)(Math.random()*25));
            temp1=numComp[i];
            numComp[i]= numComp[temp];
            numComp[temp]= temp1;
           
        }
    }

       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn13 = new javax.swing.JButton();
        Btn12 = new javax.swing.JButton();
        Btn24 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn11 = new javax.swing.JButton();
        Btn20 = new javax.swing.JButton();
        Btn23 = new javax.swing.JButton();
        Btn15 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn1 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn22 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        Btn19 = new javax.swing.JButton();
        Displaying = new javax.swing.JTextField();
        Btn21 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn18 = new javax.swing.JButton();
        Btn14 = new javax.swing.JButton();
        Btn17 = new javax.swing.JButton();
        Btn16 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo Club");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn13.setText("Button13");
        Btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn13ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 90, 60));

        Btn12.setText("Button12");
        Btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 90, 60));

        Btn24.setText("Button24");
        Btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn24ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 90, 60));

        Btn3.setText("Button3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 90, 60));

        Btn9.setText("Button9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 90, 60));

        Btn11.setText("Button11");
        Btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 100, 60));

        Btn20.setText("Button20");
        Btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn20ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 110, 60));

        Btn23.setText("Button23");
        Btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn23ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 90, 60));

        Btn15.setText("Button15");
        Btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn15ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 110, 60));

        Btn6.setText("Button6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 60));

        jLabel1.setText("Computer's generated:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        Btn1.setText("Button1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, 60));

        Btn8.setText("Button8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 90, 60));

        Btn22.setText("Button22");
        Btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn22ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 90, 60));

        Btn2.setText("Button2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 90, 60));

        Btn4.setText("Button4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 90, 60));

        Btn0.setText("Button0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, 60));

        Btn19.setText("Button19");
        Btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn19ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 90, 60));
        jPanel1.add(Displaying, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 88, -1));

        Btn21.setText("Button21");
        Btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn21ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 100, 60));

        Btn5.setText("Button5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 110, 60));

        Btn18.setText("Button18");
        Btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn18ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 90, 60));

        Btn14.setText("Button14");
        Btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn14ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 90, 60));

        Btn17.setText("Button17");
        Btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn17ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 90, 60));

        Btn16.setText("Button16");
        Btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn16ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 100, 60));

        Btn7.setText("Button7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 90, 60));

        Btn10.setText("Button10");
        Btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 110, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("O");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 30, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("      B             I              N           G            O");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 74, 500, 60));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("B");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 30, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("I");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("N");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 30, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("G");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 30, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 1, 790, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        Btn1.setEnabled(false);
        arryUser[1]=1;

        compareUser();
        
        arraytemp[Integer.parseInt(Btn1.getText())-1] = -1;
        for(i=0; i<25; i++)
                        {
                            if(numComp[i]== (Integer.parseInt(Btn1.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        
               //     jTextField1.setText(jTextField1.getText()+","+numComp[i]);
                
                        compareComp();
        turn();
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        // TODO add your handling code here:
     
        Btn0.setEnabled(false);
        arryUser[0]=1;
        
        compareUser();
        
                arraytemp[Integer.parseInt(Btn0.getText())-1] = -1;
                for(i=0; i<25; i++)
                        {
                            if(numComp[i]== (Integer.parseInt(Btn0.getText()))-1)
                            {
                                arryComp[i]=1;
                                break;
                            }
                        }
              
             //       jTextField1.setText(jTextField1.getText()+","+arryComp[i]);
                
                
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn0ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        Btn2.setEnabled(false);
        arryUser[2]=1;
                
        compareUser();        
                arraytemp[Integer.parseInt(Btn2.getText())-1] = -1;
                               for(i=0; i<25; i++)
                        {
                            if(numComp[i]== (Integer.parseInt(Btn2.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        Btn3.setEnabled(false);
        arryUser[3]=1;
               
        compareUser();
                arraytemp[Integer.parseInt(Btn3.getText())-1] = -1;
                               for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn3.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        Btn4.setEnabled(false);
        arryUser[4]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn4.getText())-1] = -1;
                                      for(i=0; i<25; i++)
                        {
                            if(numComp[i]== (Integer.parseInt(Btn4.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
        Btn5.setEnabled(false);
        arryUser[5]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn5.getText())-1] = -1;
                                      for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn5.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
        Btn6.setEnabled(false);
        arryUser[6]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn6.getText())-1] = -1;
                        
                        for(i=0; i<25; i++)
                        {
                            if(numComp[i]== (Integer.parseInt(Btn6.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                        turn();
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
        Btn7.setEnabled(false);
        arryUser[7]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn7.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn7.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
        Btn8.setEnabled(false);
        arryUser[8]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn8.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn8.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
        Btn9.setEnabled(false);
        arryUser[9]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn9.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn9.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn10ActionPerformed
        // TODO add your handling code here:
        Btn10.setEnabled(false);
        arryUser[10]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn10.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                            if(numComp[i]== (Integer.parseInt(Btn10.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn10ActionPerformed

    private void Btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn11ActionPerformed
        // TODO add your handling code here:
        Btn11.setEnabled(false);
        arryUser[11]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn11.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                            if(numComp[i]== (Integer.parseInt(Btn11.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn11ActionPerformed

    private void Btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn12ActionPerformed
        // TODO add your handling code here:
        Btn12.setEnabled(false);
        arryUser[12]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn12.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn12.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn12ActionPerformed

    private void Btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn13ActionPerformed
        // TODO add your handling code here:
        Btn13.setEnabled(false);
        arryUser[13]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn13.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn13.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn13ActionPerformed

    private void Btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn14ActionPerformed
        // TODO add your handling code here:
        Btn14.setEnabled(false);
        arryUser[14]=1;
                compareUser();
                                arraytemp[Integer.parseInt(Btn14.getText())-1] = -1;
                                               for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn14.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn14ActionPerformed

    private void Btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn15ActionPerformed
        // TODO add your handling code here:
        Btn15.setEnabled(false);
        arryUser[15]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn15.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn15.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn15ActionPerformed

    private void Btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn16ActionPerformed
        // TODO add your handling code here:
        Btn16.setEnabled(false);
        arryUser[16]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn16.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn16.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn16ActionPerformed

    private void Btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn17ActionPerformed
        // TODO add your handling code here:
        Btn17.setEnabled(false);
        arryUser[17]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn17.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn17.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn17ActionPerformed

    private void Btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn18ActionPerformed
        // TODO add your handling code here:
        Btn18.setEnabled(false);
        arryUser[18]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn18.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn18.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn18ActionPerformed

    private void Btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn19ActionPerformed
        // TODO add your handling code here:
        Btn19.setEnabled(false);
        arryUser[19]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn19.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn19.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn19ActionPerformed

    private void Btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn20ActionPerformed
        // TODO add your handling code here:
        Btn20.setEnabled(false);
        arryUser[20]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn20.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn20.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn20ActionPerformed

    private void Btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn21ActionPerformed
        // TODO add your handling code here:
        Btn21.setEnabled(false);
        arryUser[21]=1;        
         compareUser();
                arraytemp[Integer.parseInt(Btn21.getText())-1] = -1;
                               for(i=0; i<25; i++)
                        {
                            if(numComp[i]== (Integer.parseInt(Btn21.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn21ActionPerformed

    private void Btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn22ActionPerformed
        // TODO add your handling code here:
        Btn22.setEnabled(false);
        arryUser[22]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn22.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn22.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn22ActionPerformed

    private void Btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn23ActionPerformed
        // TODO add your handling code here:
        Btn23.setEnabled(false);
        arryUser[23]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn23.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn23.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn23ActionPerformed

    private void Btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn24ActionPerformed
        // TODO add your handling code here:
        Btn24.setEnabled(false);
        arryUser[24]=1;
                compareUser();
                        arraytemp[Integer.parseInt(Btn24.getText())-1] = -1;
                                       for(i=0; i<25; i++)
                        {
                             if(numComp[i]== (Integer.parseInt(Btn24.getText()))-1)
                            {
                                arryComp[i]=1;
                            }
                        }
                        compareComp();
                turn();
    }//GEN-LAST:event_Btn24ActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn10;
    private javax.swing.JButton Btn11;
    private javax.swing.JButton Btn12;
    private javax.swing.JButton Btn13;
    private javax.swing.JButton Btn14;
    private javax.swing.JButton Btn15;
    private javax.swing.JButton Btn16;
    private javax.swing.JButton Btn17;
    private javax.swing.JButton Btn18;
    private javax.swing.JButton Btn19;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn20;
    private javax.swing.JButton Btn21;
    private javax.swing.JButton Btn22;
    private javax.swing.JButton Btn23;
    private javax.swing.JButton Btn24;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JTextField Displaying;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
