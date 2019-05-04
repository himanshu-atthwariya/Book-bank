/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_package;

//import java.awt.Graphics2D;
import java.awt.Image;
//import java.awt.RenderingHints;
//import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.sql.*;
        
/**
 *
 * @author Himanshu
 */
public class Book extends javax.swing.JFrame {

    /**
     * Creates new form Book
     */
    
    public Book(String branch,String sem,String username){////////////////////pass the object value in the constructor of jframe
        initComponents();/////////////////////to initialize components(default values)
        
        this.branch=branch;
        this.sem=sem;
        uname=username;/////////////////to hold the username for saving orders
        
        jlTitle.setText(branch +" "+sem+" Sem");//////////////////to set title of jframe
        
       /* String book1="FnF-HD-desktop-wallpaper-2-1200x675.jpg";
        String book2="FnF-HD-desktop-wallpaper-2-1200x675.jpg";
        String book3="FnF-HD-desktop-wallpaper-2-1200x675.jpg";
        String book4="FnF-HD-desktop-wallpaper-2-1200x675.jpg";
        String book5="FnF-HD-desktop-wallpaper-2-1200x675.jpg";
        String book6="FnF-HD-desktop-wallpaper-2-1200x675.jpg";
        */
     /* if(branch.equals("CSE") && sem.equals("1ST")){
            book1="223167.jpg";
            book2="16729.jpg";
            book3="2499.jpg";
            book4="301103.jpg";
            book5="238761.png";
            book6="330515.jpg";
        }
        if(branch.equals("CSE")&&sem.equals("2ND")){   
        }*/
        
        String image[]=new String[7];
        //String book[]=new String[7];////////////////////these are defined below outside of this class
        //String author[]=new String[7];
       // String first[]=new String[7];
       //String second[]=new String[7];
        for(int i=1;i<=6;i++){
            image[i]="FnF-HD-desktop-wallpaper-2-1200x675.jpg";//////////////to avoid null pointer exception
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+branch,"root","zxcv");
            Statement st=con.createStatement();
            //String query="select book1,book2,book3,book4,book5,book6 from"+branch;//+"where sem='1ST'";
            String query="select * from "+sem;//+" where sem=\""+sem+"\"";
            //System.out.println(query);
            ResultSet rs=st.executeQuery(query);
            for(int i=1;i<=6;i++)
            {rs.next();
            image[i]=rs.getString("image");
            book[i]=rs.getString("book");
            author[i]=rs.getString("author");
            first[i]=rs.getString("firstprice");
            second[i]=rs.getString("secondprice");
            //System.out.println(image[i]);
            }
            
            /*rs.next();
            book2=rs.getString("image");
            rs.next();
            book3=rs.getString("image");
            rs.next();
            book4=rs.getString("image");
            rs.next();
            book5=rs.getString("image");
            rs.next();
            book6=rs.getString("image");
            */
            
            jlP1B1.setText(book[1]);
            jlP2B2.setText(book[2]);
            jlP3B3.setText(book[3]);
            jlP4B4.setText(book[4]);
            jlP5B5.setText(book[5]);
            jlP6B6.setText(book[6]);
            
            jlP1A1.setText(author[1]);
            jlP2A2.setText(author[2]);
            jlP3A3.setText(author[3]);
            jlP4A4.setText(author[4]);
            jlP5A5.setText(author[5]);
            jlP6A6.setText(author[6]);
            
            jlFP1.setText(first[1]);
            jlFP2.setText(first[2]);
            jlFP3.setText(first[3]);
            jlFP4.setText(first[4]);
            jlFP5.setText(first[5]);
            jlFP6.setText(first[6]);
            
            jlSP1.setText(second[1]);
            jlSP2.setText(second[2]);
            jlSP3.setText(second[3]);
            jlSP4.setText(second[4]);
            jlSP5.setText(second[5]);
            jlSP6.setText(second[6]);
            
            
            }catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);    
            }
        
        //for(int i=0;i<1;i++){
            ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(image[1])));
            Image img1=myimage.getImage();
            Image img2=img1.getScaledInstance(jlBook1.getWidth(),jlBook1.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon i=new ImageIcon(img2);
            jlBook1.setIcon(i);//You can scale and save Image, but you can't do it with ImageIcon. For creating pictures in your GUI you usually have to use ImageIcon, but if you don't wanna do that, Image should be better.
        //}
        myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(image[2])));
        img1=myimage.getImage();
        img2=img1.getScaledInstance(jlBook2.getWidth(),jlBook2.getHeight(),Image.SCALE_SMOOTH);
        i=new ImageIcon(img2);
        jlBook2.setIcon(i);
        
        myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(image[3])));
        img1=myimage.getImage();
        img2=img1.getScaledInstance(jlBook3.getWidth(),jlBook3.getHeight(),Image.SCALE_SMOOTH);
        i=new ImageIcon(img2);
        jlBook3.setIcon(i);
        
        myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(image[4])));
        img1=myimage.getImage();
        img2=img1.getScaledInstance(jlBook4.getWidth(),jlBook4.getHeight(),Image.SCALE_SMOOTH);
        i=new ImageIcon(img2);
        jlBook4.setIcon(i);
        
        myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(image[5])));
        img1=myimage.getImage();
        img2=img1.getScaledInstance(jlBook5.getWidth(),jlBook5.getHeight(),Image.SCALE_SMOOTH);
        i=new ImageIcon(img2);
        jlBook5.setIcon(i);
        
        myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(image[6])));
        img1=myimage.getImage();
        img2=img1.getScaledInstance(jlBook6.getWidth(),jlBook6.getHeight(),Image.SCALE_SMOOTH);
        i=new ImageIcon(img2);
        jlBook6.setIcon(i);
            
    }
    
    
    public Book() {
        initComponents();
   //   JScrollPane scroll=new JScrollPane(j,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
   /*     String book1="FnF-HD-desktop-wallpaper-2-1200x675.jpg",book2="FnF-HD-desktop-wallpaper-2-1200x675.jpg",book3="FnF-HD-desktop-wallpaper-2-1200x675.jpg",book4="FnF-HD-desktop-wallpaper-2-1200x675.jpg",book5="FnF-HD-desktop-wallpaper-2-1200x675.jpg",book6="FnF-HD-desktop-wallpaper-2-1200x675.jpg";
   //   BranchAndSem bas=new BranchAndSem();//////////////////this bas is not same as the object which has branch and sem stored
        System.out.println(bas.getBranch());
        if(bas.getBranch().equals("CSE") && bas.getSem().equals("1st")){
            book1="FnF-HD-desktop-wallpaper-2-1200x675.jpg";
            book2="wp2208724-pubg-wallpapers.jpg";
        }
///////////// to resize an image first take the image icon then convert it into image and thenresize it then convert it back to image icon and then set it back
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(book1)));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(jlBook1.getWidth(),jlBook1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        jlBook1.setIcon(i);//You can scale and save Image, but you can't do it with ImageIcon. For creating pictures in your GUI you usually have to use ImageIcon, but if you don't wanna do that, Image should be better.
        myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(book2)));
        img1=myimage.getImage();
        img2=img1.getScaledInstance(jlBook2.getWidth(),jlBook2.getHeight(),Image.SCALE_SMOOTH);
        i=new ImageIcon(img2);
        jlBook2.setIcon(i);/////////////You can scale and save Image, but you can't do it with ImageIcon. For creating pictures in your GUI you usually have to use ImageIcon, but if you don't wanna do that, Image should be better.
    */    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jlClose1 = new javax.swing.JLabel();
        jlMinimize1 = new javax.swing.JLabel();
        jlTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlBook1 = new javax.swing.JLabel();
        jlP1B1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlP1A1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlFP1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlSP1 = new javax.swing.JLabel();
        jbP1B1 = new javax.swing.JButton();
        jbP1B2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jlBook2 = new javax.swing.JLabel();
        jlP2B2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlP2A2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlFP2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlSP2 = new javax.swing.JLabel();
        jbP2B1 = new javax.swing.JButton();
        jbP2B2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jlBook3 = new javax.swing.JLabel();
        jlP3B3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlP3A3 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jlFP3 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jlSP3 = new javax.swing.JLabel();
        jbP3B1 = new javax.swing.JButton();
        jbP3B2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jlBook4 = new javax.swing.JLabel();
        jlP4B4 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jlP4A4 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jlFP4 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jlSP4 = new javax.swing.JLabel();
        jbP4B1 = new javax.swing.JButton();
        jbP4B2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jlBook5 = new javax.swing.JLabel();
        jlP5B5 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jlP5A5 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jlFP5 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jlSP5 = new javax.swing.JLabel();
        jbP5B1 = new javax.swing.JButton();
        jbP5B2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jlBook6 = new javax.swing.JLabel();
        jlP6B6 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jlP6A6 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jlFP6 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jlSP6 = new javax.swing.JLabel();
        jbP6B1 = new javax.swing.JButton();
        jbP6B2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlClose1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jlClose1.setForeground(new java.awt.Color(255, 255, 255));
        jlClose1.setText("X");
        jlClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlClose1MouseClicked(evt);
            }
        });
        jPanel3.add(jlClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 30, 50));

        jlMinimize1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jlMinimize1.setForeground(new java.awt.Color(255, 255, 255));
        jlMinimize1.setText("-");
        jlMinimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimize1MouseClicked(evt);
            }
        });
        jPanel3.add(jlMinimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 20, 50));

        jlTitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlTitle.setText("jlabel");
        jPanel3.add(jlTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 240, -1));

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 0));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(683, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jlBook1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlBook1.setText("jlabel");

        jlP1B1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP1B1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("by");

        jlP1A1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP1A1.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("MRP");

        jlFP1.setText("jLabel7");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setText("Second hand Price");

        jlSP1.setText("jLabel14");

        jbP1B1.setText("Buy at MRP");
        jbP1B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP1B1ActionPerformed(evt);
            }
        });

        jbP1B2.setText("Buy Second hand");
        jbP1B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP1B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP1B1)
                .addGap(160, 160, 160)
                .addComponent(jbP1B2)
                .addGap(59, 59, 59))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jlBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlFP1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlSP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jlP1A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jlP1B1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jlBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlP1B1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlP1A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jlFP1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jlSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbP1B1)
                    .addComponent(jbP1B2))
                .addGap(25, 25, 25))
        );

        jlBook2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlBook2.setText("jlabel");

        jlP2B2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP2B2.setText("jLabel1");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("by");

        jlP2A2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP2A2.setText("jLabel3");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("MRP");

        jlFP2.setText("jLabel7");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setText("Second hand Price");

        jlSP2.setText("jLabel14");

        jbP2B1.setText("Buy at MRP");
        jbP2B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP2B1ActionPerformed(evt);
            }
        });

        jbP2B2.setText("Buy Second Hand");
        jbP2B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP2B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jbP2B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jbP2B2)
                .addGap(59, 59, 59))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jlBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlFP2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlSP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jlP2A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jlP2B2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jlBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlP2B2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlP2A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jlFP2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jlSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbP2B1)
                    .addComponent(jbP2B2))
                .addGap(25, 25, 25))
        );

        jlBook3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlBook3.setText("jlabel");

        jlP3B3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP3B3.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("by");

        jlP3A3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP3A3.setText("jLabel3");

        jLabel39.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel39.setText("MRP");

        jlFP3.setText("jLabel7");

        jLabel55.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel55.setText("Second hand Price");

        jlSP3.setText("jLabel14");

        jbP3B1.setText("Buy at MRP");
        jbP3B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP3B1ActionPerformed(evt);
            }
        });

        jbP3B2.setText("Buy Second Hand");
        jbP3B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP3B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP3B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP3B2)
                .addGap(59, 59, 59))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jlBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlFP3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlSP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(jlP3A3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jlP3B3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jlBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlP3B3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlP3A3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jlFP3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(jlSP3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbP3B1)
                    .addComponent(jbP3B2))
                .addGap(25, 25, 25))
        );

        jlBook4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlBook4.setText("jlabel");

        jlP4B4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP4B4.setText("jLabel1");

        jLabel58.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel58.setText("by");

        jlP4A4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP4A4.setText("jLabel3");

        jLabel60.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel60.setText("MRP");

        jlFP4.setText("jLabel7");

        jLabel62.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel62.setText("Second hand Price");

        jlSP4.setText("jLabel14");

        jbP4B1.setText("Buy at MRP");
        jbP4B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP4B1ActionPerformed(evt);
            }
        });

        jbP4B2.setText("Buy Second Hand");
        jbP4B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP4B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP4B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP4B2)
                .addGap(59, 59, 59))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jlBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlFP4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlSP4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel58)
                            .addGap(18, 18, 18)
                            .addComponent(jlP4A4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jlP4B4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jlBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlP4B4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlP4A4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jlFP4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(jlSP4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbP4B1)
                    .addComponent(jbP4B2))
                .addGap(25, 25, 25))
        );

        jlBook5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlBook5.setText("jlabel");

        jlP5B5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP5B5.setText("jLabel1");

        jLabel65.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel65.setText("by");

        jlP5A5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP5A5.setText("jLabel3");

        jLabel67.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel67.setText("MRP");

        jlFP5.setText("jLabel7");

        jLabel69.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel69.setText("Second hand Price");

        jlSP5.setText("jLabel14");

        jbP5B1.setText("Buy at MRP");
        jbP5B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP5B1ActionPerformed(evt);
            }
        });

        jbP5B2.setText("Buy Second Hand");
        jbP5B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP5B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP5B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP5B2)
                .addGap(59, 59, 59))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jlBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlFP5, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlSP5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel65)
                            .addGap(18, 18, 18)
                            .addComponent(jlP5A5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jlP5B5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jlBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jlP5B5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlP5A5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jlFP5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jlSP5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbP5B1)
                    .addComponent(jbP5B2))
                .addGap(25, 25, 25))
        );

        jlBook6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlBook6.setText("jlabel");

        jlP6B6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP6B6.setText("jLabel1");

        jLabel72.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel72.setText("by");

        jlP6A6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlP6A6.setText("jLabel3");

        jLabel74.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel74.setText("MRP");

        jlFP6.setText("jLabel7");

        jLabel76.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel76.setText("Second hand Price");

        jlSP6.setText("jLabel14");

        jbP6B1.setText("Buy at MRP");
        jbP6B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP6B1ActionPerformed(evt);
            }
        });

        jbP6B2.setText("Buy Second Hand");
        jbP6B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbP6B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP6B1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbP6B2)
                .addGap(59, 59, 59))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jlBook6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlFP6, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlSP6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel72)
                            .addGap(18, 18, 18)
                            .addComponent(jlP6A6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jlP6B6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jlBook6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlP6B6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlP6A6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(jlFP6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(jlSP6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbP6B1)
                    .addComponent(jbP6B2))
                .addGap(25, 25, 25))
        );

        jButton1.setText("My orders");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1990, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

///////////////this is also done to resize image but dont work.
  /*  private Image ScaledImage(Image img,int width,int height){
        BufferedImage resizedImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2=resizedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img,0,0,width,height,null);
        g2.dispose();
        return resizedImage;
    }*/
    
    private void jlClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlClose1MouseClicked

    private void jlMinimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimize1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jlMinimize1MouseClicked

    private void jbP2B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP2B1ActionPerformed
        insertionMRP(2);
    }//GEN-LAST:event_jbP2B1ActionPerformed

    private void jbP1B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP1B1ActionPerformed
        insertionMRP(1);////////////////this is only called when button is MRP
        /////////////////////////i have to write this try catch for every button on jfarme so i decided to make function insertionMRP 
       /*try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","zxcv");
            String query="insert into orders values(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1,Integer.parseInt(uname));
            pst.setString(2,branch);
            pst.setString(3,sem);
            pst.setString(4,book[1]);
            pst.setString(5,author[1]);
            pst.setString(6,first[1]);
            int count=pst.executeUpdate();
            System.out.println(count +" row/s affected");
            pst.close();
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }*/
    }//GEN-LAST:event_jbP1B1ActionPerformed

    private void jbP3B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP3B1ActionPerformed
        insertionMRP(3);
    }//GEN-LAST:event_jbP3B1ActionPerformed

    private void jbP4B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP4B1ActionPerformed
        insertionMRP(4);
    }//GEN-LAST:event_jbP4B1ActionPerformed

    private void jbP5B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP5B1ActionPerformed
        insertionMRP(5);
    }//GEN-LAST:event_jbP5B1ActionPerformed

    private void jbP6B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP6B1ActionPerformed
        insertionMRP(6);
    }//GEN-LAST:event_jbP6B1ActionPerformed

    private void jbP1B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP1B2ActionPerformed
        insertionSecond(1);
    }//GEN-LAST:event_jbP1B2ActionPerformed

    private void jbP2B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP2B2ActionPerformed
        insertionSecond(2);
    }//GEN-LAST:event_jbP2B2ActionPerformed

    private void jbP3B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP3B2ActionPerformed
        insertionSecond(3);
    }//GEN-LAST:event_jbP3B2ActionPerformed

    private void jbP4B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP4B2ActionPerformed
        insertionSecond(4);
    }//GEN-LAST:event_jbP4B2ActionPerformed

    private void jbP5B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP5B2ActionPerformed
        insertionSecond(5);
    }//GEN-LAST:event_jbP5B2ActionPerformed

    private void jbP6B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbP6B2ActionPerformed
        insertionSecond(6);
    }//GEN-LAST:event_jbP6B2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Orders o=new Orders(uname);
        o.setVisible(true);
        o.pack();
        o.setLocationRelativeTo(null);
        o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        BranchAndSem b=new BranchAndSem(uname);
        b.setVisible(true);
        b.pack();
        b.setLocationRelativeTo(null);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }
    
    private void insertionMRP(int a)
    {
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","zxcv");
            String query="insert into orders values(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,(uname));
            pst.setString(2,branch);
            pst.setString(3,sem);
            pst.setString(4,book[a]);
            pst.setString(5,author[a]);
            pst.setString(6,first[a]);
            int count=pst.executeUpdate();
            System.out.println(count +" row/s affected");
            pst.close();
            con.close();
            JOptionPane.showMessageDialog(null,"Your item is added to cart");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void insertionSecond(int a){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","zxcv");
            String query="insert into orders values(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1,Integer.parseInt(uname));
            pst.setString(2,branch);
            pst.setString(3,sem);
            pst.setString(4,book[a]);
            pst.setString(5,author[a]);
            pst.setString(6,second[a]);
            int count=pst.executeUpdate();
            System.out.println(count +" row/s affected");
            pst.close();
            con.close();
            JOptionPane.showMessageDialog(null,"Your item is added to cart");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private String uname,branch,sem;
    String book[]=new String[7];
    String author[]=new String[7];
    String first[]=new String[7];
    String second[]=new String[7];
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbP1B1;
    private javax.swing.JButton jbP1B2;
    private javax.swing.JButton jbP2B1;
    private javax.swing.JButton jbP2B2;
    private javax.swing.JButton jbP3B1;
    private javax.swing.JButton jbP3B2;
    private javax.swing.JButton jbP4B1;
    private javax.swing.JButton jbP4B2;
    private javax.swing.JButton jbP5B1;
    private javax.swing.JButton jbP5B2;
    private javax.swing.JButton jbP6B1;
    private javax.swing.JButton jbP6B2;
    private javax.swing.JLabel jlBook1;
    private javax.swing.JLabel jlBook2;
    private javax.swing.JLabel jlBook3;
    private javax.swing.JLabel jlBook4;
    private javax.swing.JLabel jlBook5;
    private javax.swing.JLabel jlBook6;
    private javax.swing.JLabel jlClose1;
    private javax.swing.JLabel jlFP1;
    private javax.swing.JLabel jlFP2;
    private javax.swing.JLabel jlFP3;
    private javax.swing.JLabel jlFP4;
    private javax.swing.JLabel jlFP5;
    private javax.swing.JLabel jlFP6;
    private javax.swing.JLabel jlMinimize1;
    private javax.swing.JLabel jlP1A1;
    private javax.swing.JLabel jlP1B1;
    private javax.swing.JLabel jlP2A2;
    private javax.swing.JLabel jlP2B2;
    private javax.swing.JLabel jlP3A3;
    private javax.swing.JLabel jlP3B3;
    private javax.swing.JLabel jlP4A4;
    private javax.swing.JLabel jlP4B4;
    private javax.swing.JLabel jlP5A5;
    private javax.swing.JLabel jlP5B5;
    private javax.swing.JLabel jlP6A6;
    private javax.swing.JLabel jlP6B6;
    private javax.swing.JLabel jlSP1;
    private javax.swing.JLabel jlSP2;
    private javax.swing.JLabel jlSP3;
    private javax.swing.JLabel jlSP4;
    private javax.swing.JLabel jlSP5;
    private javax.swing.JLabel jlSP6;
    private javax.swing.JLabel jlTitle;
    // End of variables declaration//GEN-END:variables
}
