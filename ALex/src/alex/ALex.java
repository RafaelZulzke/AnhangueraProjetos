package alex;

import java.awt.Window;
import java.awt.event.WindowListener;
import javax.swing.JFrame;


public class ALex extends JFrame
{
    
    ALex()
    {
        Vi Panel;
        Panel = new Vi();
        setSize(400,400);
        setLocation(10,10);
        setResizable(true);
        setTitle("Analisador Léxico" );
        
        Panel.setLocation(5,5);
        Panel.setSize(350,350);
        Panel.setVisible(true);
        
        getContentPane().setLayout(null);
        getContentPane().add(Panel);
        
    }
    public static void main(String[] args) 
    {
    JFrame janela;
    janela = new ALex();
    janela.show();
    
    }
    
}
