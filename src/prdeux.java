

import javax.swing.*;
import java.awt.*;

public class prdeux {
    public static void main(String[]args) {
        JFrame jFrame = getFrame();

    }

    static JFrame getFrame()
    {
        JFrame jFrame=new JFrame(){};
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,300);
        Image img;
        img = new ImageIcon("https://www.google.com/search?q=%D0%BA%D0%B0%D1%80%D1%82%D0%B8%D0%BD%D0%BA%D0%B0&rlz=1C1EJFC_ruRU896RU896&sxsrf=ALeKk03NI5WhDWoVnsIp4Nm82t4atrQ2NQ:1601384730416&tbm=isch&source=iu&ictx=1&fir=Uty3AyJO5lwgzM%252CA1CcL8Z4OK5gqM%252C_&vet=1&usg=AI4_-kRfhrlpkwBnPvIu7asyarr2_ME9Vw&sa=X&ved=2ahUKEwiG7ISAt47sAhUmiYsKHdaDBEsQ9QF6BAgLEFw&biw=1366&bih=625#imgrc=Uty3AyJO5lwgzM").getImage();

        return jFrame;
    }
}
