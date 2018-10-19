package tugas;
import javax.swing.*; 
import java.awt.event.*;

public class CaseHp extends JFrame 
{
JLabel lblpembeli=new JLabel("NamaPembeli");    
JTextField txpembeli=new JTextField(20);    
JLabel lblnohp=new JLabel("NomorHp");    
JTextField txnohp=new JTextField(7);    
JLabel lbljenis=new JLabel("JENIS CASE");    
JRadioButton Softcase=new JRadioButton("Softcase");    
JRadioButton Hardcase=new JRadioButton("Hardcase");    
ButtonGroup total=new ButtonGroup();    
JLabel lbltotal=new JLabel("GambarCase");    
JCheckBox Animasi=new JCheckBox("Animasi");    
JCheckBox Logo=new JCheckBox("Logo");    
JCheckBox Kartun=new JCheckBox("Kartun");    
JButton Cetak=new JButton("Cetak");    
JTextArea hasil=new JTextArea();    
    
CaseHp()    
{       
 setTitle("CaseHp MURAH");       
 setLocation(300,100);       
 setSize(300,320);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}  
 
 void KomponenVisual()    
 {       
  getContentPane().setLayout(null);
  getContentPane().add(lblpembeli);       
  lblpembeli.setBounds(10,10,80,20);       
  getContentPane().add(txpembeli);       
  txpembeli.setBounds(105,10,175,20);       
  getContentPane().add(lblnohp);       
  lblnohp.setBounds(10,33,80,20);       
  getContentPane().add(txnohp);       
  txnohp.setBounds(105,33,70,20);       
  getContentPane().add(lbljenis);      
  lbljenis.setBounds(10,56,80,20);  
  total.add(Softcase);    
  total.add(Hardcase);      
  getContentPane().add(Softcase);  
  Softcase.setBounds(105,56,62,20);    
  getContentPane().add(Hardcase);
  Hardcase.setBounds(160,56,100,20);       
  getContentPane().add(lbltotal);       
  lbltotal.setBounds(10,80,70,20);       
  getContentPane().add(Animasi);       
  Animasi.setBounds(105,80,100,20);       
  getContentPane().add(Logo);       
  Logo.setBounds(105,103,100,20);       
  getContentPane().add(Kartun);       
  Kartun.setBounds(105,126,100,20);       
  getContentPane().add(Cetak);       
  Cetak.setBounds(10,150,270,20);       
  getContentPane().add(hasil);       
  hasil.setBounds(10,180,270,100);       
  setVisible(true); 
 }

 void AksiReaksi()    
 {       
  Cetak.addActionListener(new ActionListener()       
  {          
   public void actionPerformed(ActionEvent e)          
   {             
    hasil.append(txpembeli.getText()+"\n");             
    hasil.append(txnohp.getText()+"\n");             
    if(Softcase.isSelected()==true)             
    {                
     hasil.append(Softcase.getText()+"\n");             
    }             
    else             
    {                
    hasil.append(Hardcase.getText()+"\n");             
    }  
    if(Animasi.isSelected()==true)             
    {                
     hasil.append(Animasi.getText()+"\n");             
    }             
    if(Logo.isSelected()==true)             
    {                
     hasil.append(Logo.getText()+"\n");             
    }             
    if(Kartun.isSelected()==true)             
    {                
     hasil.append(Kartun.getText()+"\n");             
    } 
  }       
  });    
 }  
  public static void main(String args[])    
  {       
   CaseHp e5=new CaseHp();       
   e5.KomponenVisual();       
   e5.AksiReaksi();    
  }

}