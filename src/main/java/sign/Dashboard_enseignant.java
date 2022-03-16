/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sign;

import Model.sqlConnection;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
   
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



/**
 *
 * @author oouak
 */
public class Dashboard_enseignant extends javax.swing.JFrame {
    
   // Doctor doctor;
    /*
     * Creates new form Dashboard_enseignant
     */
    
    public Dashboard_enseignant(String name,String prenom,String cin,String email,String mdp,String path_image,int id ,String departe,String spec,int numero) {     //Constructeur qui va prendre les info en parametre et les faire afficher dans la section mon compte
        initComponents();
        recherche.setBackground(new java.awt.Color(0,0,0,1)); // set background jtextfield to transparent
        myacc.setVisible(false);
        home.setVisible(false);
        progres.setVisible(false);
        Affectation.setVisible(false);
        taches.setVisible(false);
        chitchat.setVisible(false);
        /*Nom.setBackground(new java.awt.Color(0,0,0,1));              // set backgound transparent 
        Prenom.setBackground(new java.awt.Color(0,0,0,1));
        Telephone.setBackground(new java.awt.Color(0,0,0,1));
        Email.setBackground(new java.awt.Color(0,0,0,1));
        CIN.setBackground(new java.awt.Color(0,0,0,1));
        password.setBackground(new java.awt.Color(0,0,0,1));
        Sujet.setBackground(new java.awt.Color(0,0,0,1));
        cvpath.setBackground(new java.awt.Color(0,0,0,1));
        ID.setBackground(new java.awt.Color(0,0,0,1));
        */
        
        
        this.Nom.setText(name);
        this.Prenom.setText(prenom);
        this.CIN.setText(cin);
        this.Telephone.setText(String.valueOf(numero));
        this.Email.setText(email);
        this.Departement.setText(departe);
        this.password.setText(mdp);
        this.ID.setText(String.valueOf(id));
        this.picpath.setText(spec);
        ImageIcon image = new ImageIcon(path_image);
        //this.Imagee.setIcon(image);
           
        
        Image img = image.getImage().getScaledInstance(this.Imagee.getWidth(),this.Imagee.getHeight(),Image.SCALE_SMOOTH);
        this.Imagee.setIcon(new ImageIcon(img));
        
        String filename ="C:\\Users\\oouak\\Pictures\\dash.png";
        filename=filename.replace('\\','/');
        ImageIcon imgg = new ImageIcon(filename);
        this.setIconImage(imgg.getImage());
        this.setTitle("Dashboard Enseignant");
    }

    public Dashboard_enseignant() {
        initComponents();
        recherche.setBackground(new java.awt.Color(0,0,0,1));   // set background jtextfield to transparent
        myacc.setVisible(false);
        home.setVisible(false);
        progres.setVisible(false);
        Affectation.setVisible(false);
        taches.setVisible(false);
        chitchat.setVisible(false);
        String filename ="C:\\Users\\oouak\\Pictures\\dash.png";
        filename=filename.replace('\\','/');
        ImageIcon img = new ImageIcon(filename);
        this.setIconImage(img.getImage());
        this.setTitle("Dashboard Enseignant");
        /*Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy ");  
        String strDate = dateFormat.format(date);
        Showdate.setText("Date : "+strDate);*/
    }

    private void SetColor(JLabel L) {
         L.setBackground(new Color(10,25,45));
    }
    private void ResetColor (JLabel L){
        L.setBackground(new Color(153,0,51));
    }
    class jPanelGradient extends JPanel {
        protected void paintComponent(Graphics g){
           Graphics2D g2d =(Graphics2D) g ;
           int width = getWidth();
           int height = getHeight();
           Color color1 = new Color(192, 72, 72);
           Color color2 = new Color(72, 0, 72);
           GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
           g2d.setPaint(gp);
           g2d.fillRect(0,0, width, height);  
        }
    }
    class jPanelGradient1 extends JPanel {
        protected void paintComponent(Graphics g){
           Graphics2D g2d =(Graphics2D) g ;
           int width = getWidth();
           int height = getHeight();
            Color color1 = new Color(195, 20, 50);
            Color color2 = new Color(36, 11, 54);
            GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0, width, height);  
        }
    }
    class jPanelGradient2 extends JPanel {
        protected void paintComponent(Graphics g){
           Graphics2D g2d =(Graphics2D) g ;
           int width = getWidth();
           int height = getHeight();
            Color color1 = new Color(255, 81, 47);
            Color color2 = new Color(240, 152, 25);
            GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0, width, height);  
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

        Right_bar = new jPanelGradient();
        Showdate = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        recherche = new javax.swing.JTextField();
        recherchebott = new javax.swing.JButton();
        home = new jPanelGradient();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel15 = new javax.swing.JLabel();
        myacc = new jPanelGradient();
        Imagee = new javax.swing.JLabel();
        Titre = new javax.swing.JLabel();
        Nom1 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        Nom2 = new javax.swing.JLabel();
        Prenom = new javax.swing.JTextField();
        Nom4 = new javax.swing.JLabel();
        CIN = new javax.swing.JTextField();
        Nom6 = new javax.swing.JLabel();
        Telephone = new javax.swing.JTextField();
        Nom3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Nom7 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Nom5 = new javax.swing.JLabel();
        Departement = new javax.swing.JTextField();
        Nom8 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Nom10 = new javax.swing.JLabel();
        picpath = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Affectation = new javax.swing.JPanel();
        Afficher = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        id_candidat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        Decider = new javax.swing.JButton();
        Voir_cv = new javax.swing.JButton();
        progres = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Actualiser = new javax.swing.JButton();
        taches = new jPanelGradient2();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        chitchat = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Envoyer = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        Left_bar = new jPanelGradient1();
        jLabel2 = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Messagerie = new javax.swing.JLabel();
        Acceuil = new javax.swing.JLabel();
        Compte = new javax.swing.JLabel();
        affectation = new javax.swing.JLabel();
        consult_doc = new javax.swing.JLabel();
        Deconnexion = new javax.swing.JLabel();
        tacheee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Right_bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Showdate.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        Showdate.setForeground(new java.awt.Color(102, 0, 51));
        Showdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Showdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Pictures\\logo5_0.jpg")); // NOI18N
        Right_bar.add(Showdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 180, 110));

        Logo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Pictures\\logo cedocc.png")); // NOI18N
        Right_bar.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 110));

        recherche.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        recherche.setForeground(new java.awt.Color(255, 255, 255));
        recherche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recherche.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 0, 51)));
        recherche.setOpaque(false);
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });
        Right_bar.add(recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 310, 40));

        recherchebott.setBackground(new java.awt.Color(255, 204, 153));
        recherchebott.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_search_24px.png")); // NOI18N
        recherchebott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherchebottActionPerformed(evt);
            }
        });
        Right_bar.add(recherchebott, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 40, 40));

        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Appuyer ici pour plus d'informations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        home.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 370, 40));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenue dans votre application de gestion de CEDOC");
        jLabel1.setOpaque(true);
        home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 60));

        jTextArea1.setBackground(new java.awt.Color(153, 0, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("\nDans le cadre de la mise en place de la réforme du cycle de doctorat, et suite à l’accréditation du Centre d’Etudes Doctorales en \nSciences des Technologies de l’Information et de l’Ingénieur (ST2I), l’ENSIAS propose un Doctorat dans les filières informatique \net Sciences de l'Ingénieur.\n\nDans le cadre de la mise en place de la réforme du cycle de doctorat, et suite à l’accréditation du Centre d’Etudes Doctorales\n en Sciences des Technologies de l’Information et de l’Ingénieur (ST2I), l’ENSIAS propose un Doctorat dans la filière informatique.\n\n----------Description des formations --------------\n\nCes formations sont axées sur les filières importantes et qui sont le génie logiciel, l’informatique décisionnelle, les réseaux et télécom-\nmunications pour l'informatique et. le génie électrique, génie mécanique et le génie énergétique et environnement pour les \nsciences de l'ingénieur. Elle permettra de former les doctorants sur la thématique de recherche qu’ils auront choisie mais également\n leur fournira un ensemble de compétences complémentaires leur permettant de s’insérer dans le monde socioprofessionnel.\n\n-----------Modules de formation  -----------------\n\n• Méthodologie de la recherche\n• Communication scientifique\n• Pédagogie universitaire\n• Création d’entreprises innovantes\n• Modules scientifiques (spécifiques à chaque doctorant selon les prérequis)\n\n------------Durée de la formation-------------------\n\nLa durée de la formation doctorale est de trois années. Trois dérogations d’une année peuvent être accordées selon des conditions\n spécifiées dans le règlement intérieur du CEDOC ST2I.\n\n-----------Conditions d’accès----------------------\n\nDiplômes requis : diplôme de DESA, de DESS, de Master, de Master professionnel ou d’Ingénieur d’état ou diplôme reconnu \néquivalent.\n------------Pré requis scientifiques et pédagogiques : Maîtrise de la langue française et connaissance de la langue anglaise\nProcédures de sélection : Etude de dossier et entretien oral sur le sujet du mémoire de fin d’études et sur la thématique que le \ndoctorant souhaite développer.");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 560, 610));

        jCalendar1.setBackground(new java.awt.Color(0, 0, 255));
        jCalendar1.setForeground(new java.awt.Color(0, 0, 0));
        jCalendar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCalendar1.setOpaque(false);
        home.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 540, 300));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Pictures\\docotrat.jpg")); // NOI18N
        home.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 366, 570, 310));

        Right_bar.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 116, 1150, 670));

        myacc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagee.setBackground(new java.awt.Color(51, 51, 51));
        Imagee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagee.setOpaque(true);
        myacc.add(Imagee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 200));

        Titre.setBackground(new java.awt.Color(51, 0, 153));
        Titre.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        Titre.setForeground(new java.awt.Color(102, 204, 255));
        Titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titre.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_test_account_96px.png")); // NOI18N
        Titre.setText("Mon compte");
        Titre.setOpaque(true);
        myacc.add(Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 90));

        Nom1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom1.setForeground(new java.awt.Color(255, 255, 255));
        Nom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom1.setText("NOM");
        myacc.add(Nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 260, 50));

        Nom.setEditable(false);
        Nom.setBackground(new java.awt.Color(255, 255, 255));
        Nom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nom.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        Nom.setOpaque(false);
        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });
        myacc.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 310, 40));

        Nom2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom2.setForeground(new java.awt.Color(255, 255, 255));
        Nom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom2.setText("Prenom");
        myacc.add(Nom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 260, 50));

        Prenom.setEditable(false);
        Prenom.setBackground(new java.awt.Color(255, 255, 255));
        Prenom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Prenom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Prenom.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        Prenom.setOpaque(false);
        Prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenomActionPerformed(evt);
            }
        });
        myacc.add(Prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 310, 40));

        Nom4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom4.setForeground(new java.awt.Color(255, 255, 255));
        Nom4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom4.setText("CIN");
        myacc.add(Nom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 260, 50));

        CIN.setEditable(false);
        CIN.setBackground(new java.awt.Color(255, 255, 255));
        CIN.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CIN.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        CIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CINActionPerformed(evt);
            }
        });
        myacc.add(CIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 310, 40));

        Nom6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom6.setForeground(new java.awt.Color(255, 255, 255));
        Nom6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom6.setText("Telephone");
        myacc.add(Nom6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 260, 50));

        Telephone.setEditable(false);
        Telephone.setBackground(new java.awt.Color(255, 255, 255));
        Telephone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Telephone.setForeground(new java.awt.Color(0, 0, 0));
        Telephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Telephone.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        Telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelephoneActionPerformed(evt);
            }
        });
        myacc.add(Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 310, 40));

        Nom3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom3.setForeground(new java.awt.Color(255, 255, 255));
        Nom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom3.setText("Email");
        myacc.add(Nom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 260, 50));

        Email.setEditable(false);
        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        myacc.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 310, 40));

        Nom7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom7.setForeground(new java.awt.Color(255, 255, 255));
        Nom7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom7.setText("ID");
        myacc.add(Nom7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, 50));

        ID.setEditable(false);
        ID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        myacc.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 70, 50));

        Nom5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom5.setForeground(new java.awt.Color(255, 255, 255));
        Nom5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom5.setText("Departement ");
        myacc.add(Nom5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 260, 50));

        Departement.setEditable(false);
        Departement.setBackground(new java.awt.Color(255, 255, 255));
        Departement.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Departement.setForeground(new java.awt.Color(0, 0, 0));
        Departement.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Departement.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        Departement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartementActionPerformed(evt);
            }
        });
        myacc.add(Departement, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 310, 40));

        Nom8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom8.setForeground(new java.awt.Color(255, 255, 255));
        Nom8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom8.setText("Password");
        myacc.add(Nom8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 260, 50));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        myacc.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 310, 40));

        jButton3.setBackground(new java.awt.Color(0, 51, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Modifier ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        myacc.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 230, 40));

        Nom10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nom10.setForeground(new java.awt.Color(255, 255, 255));
        Nom10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nom10.setText("Specialité ");
        myacc.add(Nom10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 260, 50));

        picpath.setEditable(false);
        picpath.setBackground(new java.awt.Color(255, 255, 255));
        picpath.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        picpath.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        picpath.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 102)));
        picpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picpathActionPerformed(evt);
            }
        });
        myacc.add(picpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 310, 40));

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Importer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        myacc.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 270, 40));

        jButton5.setBackground(new java.awt.Color(0, 51, 153));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("Enregistrer les modifications");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        myacc.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 604, 250, 40));

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Changer ma photo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        myacc.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 30));

        Right_bar.add(myacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1150, 660));

        Affectation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Afficher.setBackground(new java.awt.Color(255, 204, 51));
        Afficher.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Afficher.setForeground(new java.awt.Color(255, 255, 255));
        Afficher.setText("Afficher les Candidats ");
        Afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherActionPerformed(evt);
            }
        });
        Affectation.add(Afficher, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 530, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Doctorant", "Nom", "Prenom", "Sujet", "CV"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        Affectation.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1120, 330));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID du Doctorant");
        Affectation.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 170, 50));

        id_candidat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id_candidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_candidatActionPerformed(evt);
            }
        });
        Affectation.add(id_candidat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 130, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_decision_48px.png")); // NOI18N
        jLabel6.setText("Décision");
        Affectation.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 130, 50));

        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 102, 0));
        jRadioButton3.setText("Accepté");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        Affectation.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 140, 40));

        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(153, 0, 0));
        jRadioButton4.setText("Refusé");
        Affectation.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 140, 40));

        Decider.setBackground(new java.awt.Color(0, 0, 102));
        Decider.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Decider.setText("Decider");
        Decider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeciderActionPerformed(evt);
            }
        });
        Affectation.add(Decider, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 110, 40));

        Voir_cv.setBackground(new java.awt.Color(0, 153, 153));
        Voir_cv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Voir_cv.setForeground(new java.awt.Color(255, 255, 255));
        Voir_cv.setText("Voir CV");
        Voir_cv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voir_cvActionPerformed(evt);
            }
        });
        Affectation.add(Voir_cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 150, 40));

        Right_bar.add(Affectation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1150, 670));

        progres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_encadrant", "Nom ", "Prenom", "Avancement ", "Date "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        progres.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1080, 370));

        Actualiser.setBackground(new java.awt.Color(255, 204, 51));
        Actualiser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Actualiser.setForeground(new java.awt.Color(255, 255, 255));
        Actualiser.setText("Actualiser");
        Actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualiserActionPerformed(evt);
            }
        });
        progres.add(Actualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 540, 40));

        Right_bar.add(progres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1150, 670));

        taches.setBackground(new java.awt.Color(234, 175, 0));
        taches.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_task_64px.png")); // NOI18N
        jLabel3.setText("Attribuer les tâches ");
        jLabel3.setToolTipText("");
        jLabel3.setOpaque(true);
        taches.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 90));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_show_password_24px.png")); // NOI18N
        jLabel4.setText("ID Doctorant :");
        taches.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 220, 50));

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        taches.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 240, 50));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_expired_26px.png")); // NOI18N
        jLabel7.setText("Date limite :");
        taches.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 250, 40));

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        taches.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 250, 50));

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        taches.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 580, 200));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_create_60px.png")); // NOI18N
        jLabel8.setText("Description de la Tâche ");
        taches.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 350, 60));

        jButton6.setBackground(new java.awt.Color(178, 18, 18));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_ok_48px.png")); // NOI18N
        jButton6.setText("Attribuer ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        taches.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 250, 50));

        Right_bar.add(taches, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1150, 670));

        chitchat.setBackground(new java.awt.Color(238, 184, 20));
        chitchat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 0, 102));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_chat_96px.png")); // NOI18N
        jLabel9.setText("Restez en contact avec votre doctorant ");
        jLabel9.setOpaque(true);
        chitchat.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 110));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("A :");
        chitchat.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 70, 40));

        jTextField4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        chitchat.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 580, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("De :");
        chitchat.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 70, 40));

        jTextField5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        chitchat.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 580, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Objet :");
        chitchat.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 70, 40));

        jTextField6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        chitchat.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 580, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Message :");
        chitchat.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 130, 50));

        jScrollPane4.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        chitchat.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 580, 280));

        Envoyer.setBackground(new java.awt.Color(0, 102, 51));
        Envoyer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Envoyer.setForeground(new java.awt.Color(204, 204, 204));
        Envoyer.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_send_24px.png")); // NOI18N
        Envoyer.setText("Envoyer");
        Envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnvoyerActionPerformed(evt);
            }
        });
        chitchat.add(Envoyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 160, 50));

        jPasswordField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setText("jPasswordField1");
        chitchat.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 250, 40));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("Entrez le mot de passe de votre email");
        chitchat.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 290, 50));

        Right_bar.add(chitchat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1150, 670));

        getContentPane().add(Right_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1150, 790));

        Left_bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_circled_menu_60px.png")); // NOI18N
        Left_bar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 70));

        Menu.setBackground(new java.awt.Color(255, 102, 0));
        Menu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.setText("MENU ");
        Menu.setOpaque(true);
        Left_bar.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 330, 100));

        Messagerie.setBackground(new java.awt.Color(153, 0, 51));
        Messagerie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Messagerie.setForeground(new java.awt.Color(255, 255, 255));
        Messagerie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Messagerie.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_chat_60px.png")); // NOI18N
        Messagerie.setText("Messagerie");
        Messagerie.setToolTipText("");
        Messagerie.setOpaque(true);
        Messagerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MessagerieMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MessagerieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MessagerieMouseExited(evt);
            }
        });
        Left_bar.add(Messagerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 430, 100));

        Acceuil.setBackground(new java.awt.Color(153, 0, 51));
        Acceuil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Acceuil.setForeground(new java.awt.Color(255, 255, 255));
        Acceuil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acceuil.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_home_office_48px.png")); // NOI18N
        Acceuil.setText("Acceuil");
        Acceuil.setToolTipText("");
        Acceuil.setOpaque(true);
        Acceuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcceuilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AcceuilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcceuilMouseExited(evt);
            }
        });
        Left_bar.add(Acceuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 460, 90));

        Compte.setBackground(new java.awt.Color(153, 0, 51));
        Compte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Compte.setForeground(new java.awt.Color(255, 255, 255));
        Compte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Compte.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_account_48px.png")); // NOI18N
        Compte.setText("Mon Compte ");
        Compte.setToolTipText("");
        Compte.setOpaque(true);
        Compte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CompteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CompteMouseExited(evt);
            }
        });
        Left_bar.add(Compte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 430, 90));

        affectation.setBackground(new java.awt.Color(153, 0, 51));
        affectation.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        affectation.setForeground(new java.awt.Color(255, 255, 255));
        affectation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        affectation.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_demand_48px.png")); // NOI18N
        affectation.setText("Affecter les encadrements");
        affectation.setToolTipText("");
        affectation.setOpaque(true);
        affectation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                affectationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                affectationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                affectationMouseExited(evt);
            }
        });
        Left_bar.add(affectation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 340, 100));

        consult_doc.setBackground(new java.awt.Color(153, 0, 51));
        consult_doc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        consult_doc.setForeground(new java.awt.Color(255, 255, 255));
        consult_doc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consult_doc.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_check_48px.png")); // NOI18N
        consult_doc.setText("Consultation des Doctorants");
        consult_doc.setToolTipText("");
        consult_doc.setOpaque(true);
        consult_doc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consult_docMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consult_docMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consult_docMouseExited(evt);
            }
        });
        Left_bar.add(consult_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 330, 110));

        Deconnexion.setBackground(new java.awt.Color(153, 0, 51));
        Deconnexion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Deconnexion.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_login_64px.png")); // NOI18N
        Deconnexion.setText("Se Deconnecter");
        Deconnexion.setOpaque(true);
        Deconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeconnexionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeconnexionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeconnexionMouseExited(evt);
            }
        });
        Left_bar.add(Deconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 390, 100));

        tacheee.setBackground(new java.awt.Color(153, 0, 51));
        tacheee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tacheee.setForeground(new java.awt.Color(255, 255, 255));
        tacheee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tacheee.setIcon(new javax.swing.ImageIcon("C:\\Users\\oouak\\Documents\\NetBeansProjects\\Cedoc\\src\\main\\java\\Icons\\icons8_tasklist_60px.png")); // NOI18N
        tacheee.setText("Attribution des tâches");
        tacheee.setOpaque(true);
        tacheee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tacheeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tacheeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tacheeeMouseExited(evt);
            }
        });
        Left_bar.add(tacheee, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 360, 90));

        getContentPane().add(Left_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 450, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceuilMouseClicked
        // TODO add your handling code here:
       home.setVisible(true);
       Affectation.setVisible(false);  
       myacc.setVisible(false);
       progres.setVisible(false);
       taches.setVisible(false);
       chitchat.setVisible(false);
           
    }//GEN-LAST:event_AcceuilMouseClicked

    private void CompteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompteMouseClicked
        // TODO add your handling code here:
       myacc.setVisible(true);
       Affectation.setVisible(false);
       home.setVisible(false);
       progres.setVisible(false);
       taches.setVisible(false);
       chitchat.setVisible(false);
    }//GEN-LAST:event_CompteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("http://ensias.um5.ac.ma/page/cedoc-st2i"));
        }
        catch(IOException | URISyntaxException err){
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeconnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeconnexionMouseClicked
        // TODO add your handling code here:
        new LOGIN().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DeconnexionMouseClicked

    private void AcceuilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceuilMouseEntered
        // TODO add your handling code here:
        SetColor(Acceuil);  
    }//GEN-LAST:event_AcceuilMouseEntered

    private void AcceuilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceuilMouseExited
        // TODO add your handling code here:
        ResetColor(Acceuil);
    }//GEN-LAST:event_AcceuilMouseExited

    private void CompteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompteMouseEntered
        // TODO add your handling code here:
        SetColor(Compte);
    }//GEN-LAST:event_CompteMouseEntered

    private void affectationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affectationMouseEntered
        // TODO add your handling code here:
        SetColor(affectation);
    }//GEN-LAST:event_affectationMouseEntered

    private void consult_docMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consult_docMouseEntered
        // TODO add your handling code here:
        SetColor(consult_doc);
    }//GEN-LAST:event_consult_docMouseEntered

    private void MessagerieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MessagerieMouseEntered
        // TODO add your handling code here:
        SetColor(Messagerie);
    }//GEN-LAST:event_MessagerieMouseEntered

    private void DeconnexionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeconnexionMouseEntered
        // TODO add your handling code here:
        SetColor(Deconnexion);
    }//GEN-LAST:event_DeconnexionMouseEntered

    private void CompteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompteMouseExited
        // TODO add your handling code here:
        ResetColor(Compte);
    }//GEN-LAST:event_CompteMouseExited

    private void affectationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affectationMouseExited
        // TODO add your handling code here:
        ResetColor(affectation);
    }//GEN-LAST:event_affectationMouseExited

    private void consult_docMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consult_docMouseExited
        // TODO add your handling code here:
        ResetColor(consult_doc);
    }//GEN-LAST:event_consult_docMouseExited

    private void MessagerieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MessagerieMouseExited
        // TODO add your handling code here:
        ResetColor(Messagerie);
    }//GEN-LAST:event_MessagerieMouseExited

    private void DeconnexionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeconnexionMouseExited
        // TODO add your handling code here:
        ResetColor(Deconnexion);
    }//GEN-LAST:event_DeconnexionMouseExited

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void PrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomActionPerformed

    private void CINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CINActionPerformed

    private void TelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelephoneActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void DepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartementActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Modifier boutton ;
        Nom.setEditable(true);
        Prenom.setEditable(true);
        CIN.setEditable(true);
        Telephone.setEditable(true);
        Email.setEditable(true);
        Departement.setEditable(true);
        password.setEditable(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void picpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_picpathActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Importer CV
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        try {
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            filename=filename.replace('\\','/');
            picpath.setText(filename);
            JOptionPane.showMessageDialog(null,"CV ajouté avec succes");
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Enregistrer les modifications
        try{
            Connection con =sqlConnection.dbconnection();
            String sql = " UPDATE info_enseignant SET CIN=?,Picture=?,email=?,nom=?,Password=?,prenom=?,Specialite=?,tel=? WHERE id=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,CIN.getText());
            pst.setString(2,picpath.getText()); 
            pst.setString(3,Email.getText());
            pst.setString(4,Nom.getText());
            pst.setString(5,password.getText());
            pst.setString(6,Prenom.getText());
            pst.setString(7,Departement.getText());
            pst.setString(8,Telephone.getText());
            pst.setString(9,ID.getText());
            int rs = pst.executeUpdate();
            if(rs > 0){
                JOptionPane.showMessageDialog(null,"Modification enregistrées");
            }
            else{
                JOptionPane.showMessageDialog(null,"Erreur ! Veuillez remplir à nouveau le formuaire  ");
            }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void affectationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affectationMouseClicked
        // TODO add your handling code here:
        Affectation.setVisible(true);
        progres.setVisible(false);
        myacc.setVisible(false);
        home.setVisible(false);
        taches.setVisible(false);
        chitchat.setVisible(false);
        
    }//GEN-LAST:event_affectationMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Changer ma photo:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        try {
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            filename=filename.replace('\\','/');
            ImageIcon image = new ImageIcon(filename);   
            //Imagee.setIcon(image);
            picpath.setText(filename);
            Image img = image.getImage().getScaledInstance(Imagee.getWidth(),Imagee.getHeight(),Image.SCALE_SMOOTH);
            Imagee.setIcon(new ImageIcon(img));
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualiserActionPerformed

        // TODO add your handling code here:
        try{
            Connection con =sqlConnection.dbconnection();
            String sql = "Select a.id_encadrant,a.avancement,a.Date,i.Nom,i.Prenom from avancements a join info_etudiant i on a.id_etudiant=i.id where a.id_encadrant=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,ID.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String idd =  String.valueOf(rs.getInt("a.id_encadrant"));
                String nom = rs.getString("i.Nom");
                String prenom = rs.getString("i.Prenom");
                String avanc = rs.getString("avancement");
                String date_env = rs.getString("Date");
                String tbData[] = {idd,nom,prenom,avanc,date_env};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
            }
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_ActualiserActionPerformed

    private void id_candidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_candidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_candidatActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void DeciderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeciderActionPerformed
        // Decider :
        try{
            Connection con = sqlConnection.dbconnection();
            String sql = "Update info_etudiant SET id_encadrant=? where id=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            if(jRadioButton3.isSelected()){
                pst.setString(1,ID.getText());
            }
             if(jRadioButton4.isSelected()){
                pst.setString(1,"0");
            }
            pst.setString(2,id_candidat.getText());
            int rs = pst.executeUpdate();
            if(rs > 0){
                JOptionPane.showMessageDialog(null,"Decision enregistrée avec succès");
            }
            else{
                JOptionPane.showMessageDialog(null,"Erreur ! Veuillez remplir à nouveau le formuaire  ");
            } 
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
       
    }//GEN-LAST:event_DeciderActionPerformed

    private void Voir_cvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voir_cvActionPerformed
        // Boutton voir CV 
        
        // extraire le path du cv du doctorant filename
        try{
            Connection con = sqlConnection.dbconnection();
            String sql = "Select CV from info_sujet where id_etudiant=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,id_candidat.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String filename = rs.getString("CV");
                pdf_viewer pdf_file = new  pdf_viewer();
                pdf_file.openpdf(filename);
                pdf_file.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Erreur ! Veuillez remplir à nouveau le formuaire  ");
            } 
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
        
     
    }//GEN-LAST:event_Voir_cvActionPerformed

    private void recherchebottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherchebottActionPerformed
        // TODO add your handling code here:
        Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.google.com"));
        }
        catch(IOException | URISyntaxException err){
        
        }
        
    }//GEN-LAST:event_recherchebottActionPerformed

    private void consult_docMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consult_docMouseClicked
        // Consultation des doctorants // avancement
       progres.setVisible(true);
       Affectation.setVisible(false);
       home.setVisible(false);
       myacc.setVisible(false);
       taches.setVisible(false);
       chitchat.setVisible(false);
        
    }//GEN-LAST:event_consult_docMouseClicked

    private void AfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherActionPerformed
        // Afficher 
        try{
            Connection con =sqlConnection.dbconnection();
            String sql = "Select etud.id,etud.nom,etud.prenom,suj.sujet,suj.cv from info_etudiant etud join info_sujet suj on etud.id=suj.id_etudiant";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String id =  String.valueOf(rs.getInt("etud.id"));
                String nomm =rs.getString("etud.nom");
                String prenomm =rs.getString("etud.prenom");
                String sujeet = rs.getString("suj.sujet");
                String cvv = rs.getString("suj.cv");
                String tbData[] = {id,nomm,prenomm,sujeet,cvv};
                DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
                tblModel.addRow(tbData);
            }
            
           
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_AfficherActionPerformed

    private void tacheeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tacheeeMouseEntered
        // TODO add your handling code here:
        SetColor(tacheee);
    }//GEN-LAST:event_tacheeeMouseEntered

    private void tacheeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tacheeeMouseExited
        // TODO add your handling code here:
        ResetColor(tacheee);
    }//GEN-LAST:event_tacheeeMouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Attribuer tâche 
        try{
            
                Connection con =sqlConnection.dbconnection();
                String sql = "INSERT INTO `taches` (`id_encadrant`, `id_etudiant`, `tache`, `date_limite`) VALUES (?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1,ID.getText());
                pst.setString(2,jTextField1.getText()); 
                pst.setString(3,jTextField3.getText());
                pst.setString(4,jTextField2.getText());
                int rs = pst.executeUpdate();
                if(rs > 0){
                    JOptionPane.showMessageDialog(null,"Tâche ajoutée avec succès ");
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                
                }
                else{
                   JOptionPane.showMessageDialog(null,"Erreur ! Veuillez remplir essayer de nouveau");   
                   jTextField1.setText("");
                   jTextField2.setText("");
                   jTextField3.setText("");
                
                }      
                con.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
   
          
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tacheeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tacheeeMouseClicked
        // TODO add your handling code here:
        taches.setVisible(true);
        myacc.setVisible(false);
        home.setVisible(false);
        progres.setVisible(false);
        Affectation.setVisible(false);
        chitchat.setVisible(false);
    }//GEN-LAST:event_tacheeeMouseClicked

    private void MessagerieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MessagerieMouseClicked
        // TODO add your handling code here:
        chitchat.setVisible(true);
        myacc.setVisible(false);
        home.setVisible(false);
        progres.setVisible(false);
        Affectation.setVisible(false);
        taches.setVisible(false);
    }//GEN-LAST:event_MessagerieMouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void EnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnvoyerActionPerformed
        // Envoyer 
        // Recipient's email ID needs to be mentioned.
        String to = jTextField4.getText();

        // Sender's email ID needs to be mentioned
        String from = jTextField5.getText();

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";
        String passwordd = jPasswordField1.getText();
        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(from,passwordd);

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(jTextField6.getText());

            // Now set the actual message
            message.setText(jTextArea2.getText());

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Message envoyé avec succès .....");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextArea2.setText("");
            jPasswordField1.setText("");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        } 
        
    }//GEN-LAST:event_EnvoyerActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard_enseignant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_enseignant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_enseignant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_enseignant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_enseignant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acceuil;
    private javax.swing.JButton Actualiser;
    private javax.swing.JPanel Affectation;
    private javax.swing.JButton Afficher;
    private javax.swing.JTextField CIN;
    private javax.swing.JLabel Compte;
    private javax.swing.JButton Decider;
    private javax.swing.JLabel Deconnexion;
    private javax.swing.JTextField Departement;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Envoyer;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Imagee;
    private javax.swing.JPanel Left_bar;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Messagerie;
    private javax.swing.JTextField Nom;
    private javax.swing.JLabel Nom1;
    private javax.swing.JLabel Nom10;
    private javax.swing.JLabel Nom2;
    private javax.swing.JLabel Nom3;
    private javax.swing.JLabel Nom4;
    private javax.swing.JLabel Nom5;
    private javax.swing.JLabel Nom6;
    private javax.swing.JLabel Nom7;
    private javax.swing.JLabel Nom8;
    private javax.swing.JTextField Prenom;
    private javax.swing.JPanel Right_bar;
    private javax.swing.JLabel Showdate;
    private javax.swing.JTextField Telephone;
    private javax.swing.JLabel Titre;
    private javax.swing.JButton Voir_cv;
    private javax.swing.JLabel affectation;
    private javax.swing.JPanel chitchat;
    private javax.swing.JLabel consult_doc;
    private javax.swing.JPanel home;
    private javax.swing.JTextField id_candidat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel myacc;
    private javax.swing.JTextField password;
    private javax.swing.JTextField picpath;
    private javax.swing.JPanel progres;
    private javax.swing.JTextField recherche;
    private javax.swing.JButton recherchebott;
    private javax.swing.JLabel tacheee;
    private javax.swing.JPanel taches;
    // End of variables declaration//GEN-END:variables
}
