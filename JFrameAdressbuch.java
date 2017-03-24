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
  private JTextField jTextField2 = new JTextField();
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private Adressbuch abuch = new Adressbuch();
  // Ende Attribute
  
  public JFrameAdressbuch() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 275; 
    int frameHeight = 408;
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
    
    jLabel1.setBounds(72, 8, 110, 20);
    jLabel1.setText("Adressbuch");
    jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(jLabel1);
    jButton1.setBounds(88, 224, 137, 25);
    jButton1.setText("Suche");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(88, 184, 137, 25);
    jButton2.setText("Nummer herausfinden");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(88, 144, 137, 25);
    jButton3.setText("Kontakt einfügen");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jTextField1.setBounds(80, 56, 161, 25);
    cp.add(jTextField1);
    jTextField2.setBounds(80, 96, 161, 25);
    cp.add(jTextField2);
    jTextArea1ScrollPane.setBounds(72, 256, 169, 97);
    cp.add(jTextArea1ScrollPane);
    jLabel2.setBounds(8, 56, 67, 25);
    jLabel2.setText("Name");
    cp.add(jLabel2);
    jLabel3.setBounds(8, 96, 67, 25);
    jLabel3.setText("Nummer");
    cp.add(jLabel3);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public JFrameAdressbuch
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new JFrameAdressbuch();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    jTextArea1.setText(abuch.suche(jTextField1.getText()));
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    abuch.nummerAnzeigen();
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    abuch.sortiertEinfuegen();
  }  
} // end of class JFrameAdressbuch
