
import java.applet.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;



	@SuppressWarnings("serial")
	public class SixthAdvTask extends Applet implements ActionListener{
		   public void init(){
		      String link = "yahoo";
		      Button b = new Button(link);
		      b.addActionListener(this);
		      add(b);
		   }
		   public void actionPerformed(ActionEvent ae){
		      Button src = (Button)ae.getSource();
		      String link = "http://www."+src.getLabel()+".com";
		      try{
		         AppletContext a = getAppletContext();
		         URL u = new URL(link);
		         a.showDocument(u,"_self");
		      }
		      catch (MalformedURLException e){
		         System.out.println(e.getMessage());
		      }
		   }
		}
/*
import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class  SixthAdvTask extends Applet{
   public void paint(Graphics g){
      g.drawRect(300,150,200,100);
      g.setColor(Color.yellow);   
      g.fillRect( 300,150, 200, 100 );
      g.setColor(Color.magenta);
      g.drawString("Rectangle",500,150);
   }
}*/
