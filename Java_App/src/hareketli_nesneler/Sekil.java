package hareketli_nesneler;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Sekil extends JFrame  implements ActionListener{ //ayrı bi class da oluştur

	int x, y,z,t, a, b;
	int dikYuk, dikGen,kareYuk,kareGen,daireGen, daireYuk;
	int hizX = 1;
	int hizY = 1;
	int hizZ = 1;
	int hizT = 1;
	int hizA = 1;
	int hizB = 1;
	Random rand=new Random();
	int kareKonum = rand.nextInt(50)+10;
	int dikdortgenKonum = rand.nextInt(120)+90;
	int daireKonum = rand.nextInt(150)+200;
	public Sekil() {
		super();
		x=kareKonum;
		y=kareKonum;
		z=dikdortgenKonum;
		t=dikdortgenKonum;
		a=daireKonum;
		b=daireKonum;
		
		dikYuk=50;
		dikGen=150;
		kareYuk=100;
		kareGen=100;
		daireGen=100;
		daireYuk=100;
		
		Timer zaman = new Timer(20,this);
		zaman.start();
	}
	
	public void paint(Graphics g) { //bir frame i yeniden tanımlayıp içine bişeykler çizmek için
		super.paint(g); //pencereyi tekrar çiz
		g.setColor(Color.red);
		g.fillRect(x, y, kareGen, kareYuk);
		g.setColor(Color.yellow);
		g.fillOval(a, b,daireGen,daireYuk);
		g.setColor(Color.BLUE);
		g.fillRect(z, t, dikGen, dikYuk);
		
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		x+=hizX;
		if(x>=390 || x<=0)hizX = hizX * -1;
		y+=hizY;
		if(y>=390 || y<=0)hizY = hizY * -1;
		
		z+=hizZ;
		if(z>=390 || z<=0)hizZ = hizZ * -1;
		t+=hizT;
		if(t>=390 || t<=0)hizT = hizT * -1;
		
		a+=hizA;
		if(a>=390 || a<=0)hizA = hizA * -1;
		b+=hizB;
		if(b>=390 || b<=0)hizB = hizB * -1;
		repaint();
		
		
	}
	
}


