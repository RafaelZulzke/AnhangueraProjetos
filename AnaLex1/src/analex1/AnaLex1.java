package analex1;

import java.awt.Window;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class AnaLex1 extends JFrame
{

    
    AnaLex1()
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
    janela = new AnaLex1();
    janela.show(); 
    }
    
    
}
