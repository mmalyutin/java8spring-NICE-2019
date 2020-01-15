package real_spring.screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */

@Component
public class ColorFrame extends JFrame {

    private Random random = new Random();

    @Autowired
    private Color color;


    @PostConstruct
    public void init() {

        System.out.println(color.getClass());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        System.out.println(color.getBlue());
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void moveToRandomLocation() {
        setLocation(random.nextInt(1200), random.nextInt(900));
        getContentPane().setBackground(color);
        repaint();
    }


}
