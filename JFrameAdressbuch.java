import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.03.2017
  * @author 
  */

public class JFrameAdressbuch extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private Adressbuch abuch = new Adressbuch();
  private JNumberField jNumberField1 = new JNumberField();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JLabel jLabel4 = new JLabel();
  // Ende Attribute
  
  public JFrameAdressbuch() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 322; 
    int frameHeight = 425;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Adressbuch");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(112, 8, 110, 20);
    jLabel1.setText("Adressbuch");
    jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel1);
    jButton1.setBounds(8, 184, 73, 25);
    jButton1.setText("Suche");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(96, 184, 137, 25);
    jButton2.setText("Nummer herausfinden");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(96, 144, 137, 25);
    jButton3.setText("Kontakt einfuegen");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jTextField1.setBounds(88, 56, 161, 25);
    cp.add(jTextField1);
    jTextArea1ScrollPane.setBounds(88, 256, 153, 89);
    cp.add(jTextArea1ScrollPane);
    jLabel2.setBounds(8, 56, 67, 25);
    jLabel2.setText("Name");
    cp.add(jLabel2);
    jLabel3.setBounds(8, 96, 67, 25);
    jLabel3.setText("Nummer");
    cp.add(jLabel3);
    jNumberField1.setBounds(88, 96, 161, 25);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jButton4.setBounds(8, 144, 73, 25);
    jButton4.setText("Löschen");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(96, 224, 137, 25);
    jButton5.setText("Testadressbuch laden");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jLabel4.setBounds(8, 352, 296, 25);
    jLabel4.setText("Beim Löschen immer den ganzen Namen eintippen.");
    cp.add(jLabel4);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public JFrameAdressbuch
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new JFrameAdressbuch();
  } // end of main
  
  public String jButton1_ActionPerformed(ActionEvent evt) {
    jTextArea1.setText(abuch.suche(jTextField1.getText())); 
    return null;
  } // end of jButton1_ActionPerformed

  public String jButton2_ActionPerformed(ActionEvent evt) {
    jTextArea1.setText(abuch.nummerAnzeigen(jTextField1.getText()));
    return null;
  } // end of jButton2_ActionPerformed

  public String jButton3_ActionPerformed(ActionEvent evt) {
     jTextArea1.setText(abuch.sortiertEinfuegen(jTextField1.getText(), jNumberField1.getInt()));
     return null;
    }
  public void jButton4_ActionPerformed(ActionEvent evt) {
    jTextArea1.setText(abuch.loeschen(jTextField1.getText()));
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
     jTextArea1.setText(abuch.testKontakteErstellen());
    }  
} 
