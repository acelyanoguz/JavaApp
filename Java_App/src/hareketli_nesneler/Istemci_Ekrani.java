package hareketli_nesneler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Istemci_Ekrani extends JFrame {

	public static void main(String[] args) {
		
	JFrame frame = new JFrame("Bağlantı Bilgisi Girişi");
	JLabel sunucuPortLbl, sunucuIpLbl;
	JTextField sunucuPortText, sunucuIpText;
	JButton baglanBtn;
	
	
	
	sunucuIpLbl = new JLabel("Sunucu IP");
	sunucuIpLbl.setBounds(50,10,100,30);
	sunucuIpText=new JTextField();
	sunucuIpText.setBounds(50,40,200,30);
	
	sunucuPortLbl = new JLabel("Sunucu Port");
	sunucuPortLbl.setBounds(50,70,100,30);
	sunucuPortText=new JTextField();
	sunucuPortText.setBounds(50,100,200,30);

	baglanBtn = new JButton("Bağlan");
	baglanBtn.setBounds(50, 170, 200, 30);
	
	
	baglanBtn.addActionListener(new ActionListener() {

	int sunucuPort = Integer.parseInt(sunucuPortText.getText());
		@Override
		public void actionPerformed(ActionEvent e) {
			//int sunucuPort = Integer.parseInt(sunucuPortText.getText());
			//subucuya bağlanma işlemi
		}
		
	});
	
	
	frame.add(sunucuPortLbl);
	frame.add(sunucuPortText);
	frame.add(sunucuIpLbl);
	frame.add(sunucuIpText);
	frame.add(baglanBtn);
	frame.setSize(400,300);
	frame.setLayout(null);
	frame.setVisible(true);
	
	
	
	}

}

