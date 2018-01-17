

package br.com.internacionalizacao.camadauso;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TelaLogin extends javax.swing.JFrame {
    //variáveis globais
     String aprovado;
     String reprovado;
     String bomDia;
     String boaTarde;
     String boaNoite;

    ApplicationContext apContext =
        new ClassPathXmlApplicationContext("br/com/internacionalizacao/beans/spring/applicationContext.xml");//Caminho do applicationContext


    public TelaLogin() { //Construtor
         getContentPane().setBackground(Color.darkGray); //Cor do JFrame
         
         initComponents();
         
         lblBra.setVisible(true);
         lblUS.setVisible(false);
         lblEsp.setVisible(false);
         txtUsuario.setText(""); //limpa o campo
         txtSenha.setText("");   //limpa o campo
         horario(); //Método horario
          
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblBra = new javax.swing.JLabel();
        lblFig = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbBrasil = new javax.swing.JRadioButton();
        rbIngles = new javax.swing.JRadioButton();
        rbEspanhol = new javax.swing.JRadioButton();
        lblStatus = new javax.swing.JLabel();
        lblUS = new javax.swing.JLabel();
        lblEsp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24));
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
        lblTitulo.setText("Bem vindo ao Sistema!!");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(110, 160, 311, 29);

        lblBra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brazil.png"))); // NOI18N
        lblBra.setText(" ");
        getContentPane().add(lblBra);
        lblBra.setBounds(400, 50, 80, 70);

        lblFig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        lblFig.setText(" ");
        getContentPane().add(lblFig);
        lblFig.setBounds(10, 63, 102, 95);

        lblLogin.setBackground(new java.awt.Color(0, 0, 255));
        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblLogin.setForeground(new java.awt.Color(0, 0, 204));
        lblLogin.setText("Tela Login");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(190, 10, 140, 22);

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Entre com o Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(110, 210, 140, 14);

        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Entre com a Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(110, 240, 150, 14);

        txtUsuario.setText(" ");
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(260, 210, 150, 20);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(260, 240, 150, 20);

        btnEntrar.setBackground(new java.awt.Color(255, 51, 51));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(130, 280, 100, 23);

        btnSair.setBackground(new java.awt.Color(0, 153, 51));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(63, 23));
        btnSair.setMinimumSize(new java.awt.Dimension(63, 23));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(250, 280, 100, 23);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escolha um Idioma:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 160, 14);

        rbBrasil.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbBrasil);
        rbBrasil.setForeground(new java.awt.Color(255, 255, 255));
        rbBrasil.setSelected(true);
        rbBrasil.setText("Português");
        rbBrasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBrasilActionPerformed(evt);
            }
        });
        jPanel1.add(rbBrasil);
        rbBrasil.setBounds(10, 40, 100, 23);

        rbIngles.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbIngles);
        rbIngles.setForeground(new java.awt.Color(255, 255, 255));
        rbIngles.setText("Inglês");
        rbIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInglesActionPerformed(evt);
            }
        });
        jPanel1.add(rbIngles);
        rbIngles.setBounds(120, 40, 70, 23);

        rbEspanhol.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rbEspanhol);
        rbEspanhol.setForeground(new java.awt.Color(255, 255, 255));
        rbEspanhol.setText("Espanhol");
        rbEspanhol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEspanholActionPerformed(evt);
            }
        });
        jPanel1.add(rbEspanhol);
        rbEspanhol.setBounds(200, 40, 100, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 350, 310, 70);

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText(" ");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(140, 320, 250, 22);

        lblUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usa.png"))); // NOI18N
        getContentPane().add(lblUS);
        lblUS.setBounds(400, 50, 80, 70);

        lblEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spain.png"))); // NOI18N
        lblEsp.setText(" ");
        getContentPane().add(lblEsp);
        lblEsp.setBounds(400, 50, 80, 70);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-496)/2, (screenSize.height-459)/2, 496, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void rbBrasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBrasilActionPerformed
         setaLingua("portugues"); //Método
         lblBra.setVisible(true); //Condição é verdadeira
         lblUS.setVisible(false); //falso
         lblEsp.setVisible(false); //falso
          
    }//GEN-LAST:event_rbBrasilActionPerformed

    private void rbInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInglesActionPerformed
         setaLingua("ingles"); //Método
         lblUS.setVisible(true); //Condição é verdadeira
         lblBra.setVisible(false);//falso
         lblEsp.setVisible(false);//falso
           
    }//GEN-LAST:event_rbInglesActionPerformed

    private void rbEspanholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEspanholActionPerformed
        setaLingua("espanhol"); //Método
        lblEsp.setVisible(true); //Condição é verdadeira
        lblBra.setVisible(false); //falso
        lblUS.setVisible(false);  //falso
    }//GEN-LAST:event_rbEspanholActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
         analisar(); //Método

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
         System.exit(0); //Sair do Sistema
    }//GEN-LAST:event_btnSairActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBra;
    private javax.swing.JLabel lblEsp;
    private javax.swing.JLabel lblFig;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUS;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButton rbBrasil;
    private javax.swing.JRadioButton rbEspanhol;
    private javax.swing.JRadioButton rbIngles;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

     public void setaLingua(String lingua){ //Método que verifica a condição dos idiomas e a mensagens dos properties
         if(lingua.equals("portugues"))
           Locale.setDefault(new Locale("pt", "BR"));
        else if(lingua.equals("ingles"))
           Locale.setDefault(Locale.US);
        else
           Locale.setDefault(new Locale("es", "ES"));
         //Mensagens dos properties
         MessageSource ms = (MessageSource)apContext.getBean("messageSource");
         String login =  ms.getMessage("mensagem.login", null, null);
         String titulo = ms.getMessage("mensagem.titulo", null, null);
         String usuario = ms.getMessage("mensagem.usuario", null, null);
         String senha = ms.getMessage("mensagem.senha", null, null);
         String botao = ms.getMessage("mensagem.botao", null, null);
         String botao1 = ms.getMessage("mensagem.botao1", null, null);
         aprovado = ms.getMessage("mensagem.aprovado", null, null);
         reprovado = ms.getMessage("mensagem.reprovado", null, null);
         bomDia = ms.getMessage("mensagem.bomDia", null, null);
         boaTarde = ms.getMessage("mensagem.boaTarde", null, null);
         boaNoite = ms.getMessage("mensagem.boaNoite", null, null);


         lblLogin.setText(login);
         lblTitulo.setText(titulo);
         lblUsuario.setText(usuario);
         lblSenha.setText(senha);
         btnEntrar.setText(botao);
         btnSair.setText(botao1);

         analisar();//Método

}

      public void analisar(){ //Método que verifica se a condição do Usuário e Senha são verdadeiros
          MessageSource ms = (MessageSource)apContext.getBean("messageSource");
          aprovado = ms.getMessage("mensagem.aprovado", null, null);
          reprovado = ms.getMessage("mensagem.reprovado", null, null);
          String nomeUsuario, senhaUsuario;
          nomeUsuario = txtUsuario.getText();
          senhaUsuario = txtSenha.getText();
          //Verifica se o Usuário e Senha são verdadeiros ou falsos
          if((nomeUsuario.equals("dalmo")) && (senhaUsuario.equals("123")))
             lblStatus.setText(aprovado);
          else
             lblStatus.setText(reprovado);
        }
      public void horario(){ //Método que pega o horário do Sistema e verifica a condição(Bom dia, Boa tarde e Boa noite dos properties).
            MessageSource ms = (MessageSource)apContext.getBean("messageSource");
            bomDia = ms.getMessage("mensagem.bomDia", null, null);
            boaTarde = ms.getMessage("mensagem.boaTarde", null, null);
            boaNoite = ms.getMessage("mensagem.boaNoite", null, null);
            Calendar cal = Calendar.getInstance();
            System.out.println(cal.getTime());
	    int hora = cal.get(Calendar.HOUR_OF_DAY);
	    if(hora < 12 )
	       lblStatus.setText(bomDia);
	    else if(hora >= 12 && hora < 18)
		lblStatus.setText(boaTarde);
	    else
	        lblStatus.setText(boaNoite);
		
   }
}