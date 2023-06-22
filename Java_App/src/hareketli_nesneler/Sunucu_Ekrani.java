package hareketli_nesneler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sunucu_Ekrani extends JFrame {

	public static void main(String[] args) {
		
	JFrame frame = new JFrame("Sunucu Veri Girişi");
	JLabel portLbl, kareLbl, dikdortgenLbl, daireLbl;
	JTextField kareText, dikdortgenText, daireText;
	JButton baslatBtn;
	
	portLbl = new JLabel("Port");
	portLbl.setBounds(50,10,100,30);
	
	kareLbl = new JLabel("Kare Sayısı");
	kareLbl.setBounds(50,70,100,30);
	kareText=new JTextField();
	kareText.setBounds(50,100,200,30);
	
	dikdortgenLbl = new JLabel("Dikdortgen Sayısı");
	dikdortgenLbl.setBounds(50,130,100,30);
	dikdortgenText=new JTextField();
	dikdortgenText.setBounds(50,160,200,30);
	
	daireLbl = new JLabel("Daire Sayısı");
	daireLbl.setBounds(50,190,100,30);
	daireText=new JTextField();
	daireText.setBounds(50,220,200,30);
	
	baslatBtn = new JButton("Başlat");
	baslatBtn.setBounds(50, 280, 200, 30);
	
	
	baslatBtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int kareSayi = Integer.parseInt(kareText.getText());
			
			//şekil sayılarını bildirme ve başlatma islemi
		}
		
	});
	
	
	frame.add(portLbl);
	frame.add(kareLbl);
	frame.add(dikdortgenLbl);
	frame.add(daireLbl);
	frame.add(kareText);
	frame.add(dikdortgenText);
	frame.add(daireText);
	frame.add(baslatBtn);
	frame.setSize(400,400);
	frame.setLayout(null);
	frame.setVisible(true);
	
	
	
	}

}

