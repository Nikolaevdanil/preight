import javafx.scene.shape.Circle;

import  javax.swing. * ;
import  java.awt. * ;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import  java.util.ArrayList ;
import  java.util.Random ;
import javax.swing.JComponent;

abstract   class Shape extends  JComponent {
    private int a,b,c,d;
    Shape(int a,int b,int c, int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
//  abstract void paintComponent(Graphics g);
}
class Rectangle extends Shape {
    protected double x = 0,y=0,w=0,h=0;
    protected int r=0,t=0,u=0;
    Rectangle(int a,int b,int c,int d){
        super(a,b,c,d);
    }
    @Override
    protected void paintComponent(Graphics g) {
        setLayout(null);
        Font font = new Font("Times new roman", Font.BOLD, 20);//шрифт
        Graphics2D g2 = (Graphics2D) g;//графика
        g2.setFont(font);//шрифт
        for(int i=0;i<10;i++)
        {
            x=Math.random()*1000+500;
            y=Math.random()*700+500;
            w=Math.random()*10;
            h=Math.random()*10;
            r=(int)(Math.random()*255);
            t=(int)(Math.random()*255);
            u=(int)(Math.random()*255);
            Point2D p1=new Point2D.Double(x,y);
            Point2D p2=new Point2D.Double(w,h);
            Rectangle2D r2 = new Rectangle2D.Double();
            r2.setFrameFromDiagonal(p1,p2);
            g2.setPaint(new Color(r,t,u));//цвет
            g2.fill(r2);//показать на экран
        }
        for(int i=0;i<10;i++)
        {
            x=Math.random()*1000;
            y=Math.random()*700;
            w=Math.random()*10;
            h=Math.random()*10;
            r=(int)(Math.random()*255);
            t=(int)(Math.random()*255);
            u=(int)(Math.random()*255);
            Point2D p1=new Point2D.Double(x,y);
            Point2D p2=new Point2D.Double(w,h);
            Ellipse2D el=new Ellipse2D.Double();//размеры
            el.setFrameFromDiagonal(p1,p2);
            g2.setPaint(new Color(r,t,u));//цвет
            g2.fill(el);//показать на экран
        }
    }
}

public class prdefd{
    public static void main(String[]args) {
        JFrame jFrame = getFrame();
        jFrame.add(new Rectangle(4,5,6,7));
    }

    static JFrame getFrame()
    {
        JFrame jFrame=new JFrame(){};
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,300);
        return jFrame;
    }
}
