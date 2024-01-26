package DigitalClock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {
    private  JLabel clock;
    private final Font font = new Font("Arial",Font.BOLD,26);
    public MyFrame() {
        setTitle("My JFrame Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(600, 250);
        this.createGUI();
        this.startClock();
        setVisible(true);

    }
    public void createGUI(){
        JLabel heading = new JLabel("My Clock");
        clock = new JLabel("Clock");
        heading.setFont(font);
        clock.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clock);
    }
    public void startClock(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss a");
                String dateTime = sdf.format(d);
                clock.setText(dateTime);
            }
        });
            timer.start();

    }
}
