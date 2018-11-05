package figurageometrica;

public class UsaFigura 
{

 public static void main(String[] args) 
{
   FiguraGeometrica fig = new FiguraGeometrica();
   Quadrado qua = new Quadrado();
   Circulo circ = new Circulo();
   Triangulo tri = new Triangulo();
   TrianguloEqui equi = new TrianguloEqui();

   fig.desenha();
   circ.desenha();
   qua.desenha();
   tri.desenha();
   equi.desenha();
   
}
    
}
