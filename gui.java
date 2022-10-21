package com.company;
import org.knowm.xchart.SwingWrapper;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

import static com.company.BarChart01.*;

public class gui extends JFrame {
    public static Thread thread;
    public static JFrame frame2;

    public void interfejs(){
        setTitle("Szymon Borzdyński 1");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JFrame frame = new JFrame("Szymon Borzdyński");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JTextField pole_tekstowe1;
        pole_tekstowe1 = new JTextField("25");
        pole_tekstowe1.setBounds(1,20, 100,30);
        frame.add(pole_tekstowe1);

        JTextField pole_tekstowe2;
        pole_tekstowe2 = new JTextField("30");
        pole_tekstowe2.setBounds(1,50, 100,30);
        frame.add(pole_tekstowe2);

        JTextField pole_tekstowe3;
        pole_tekstowe3 = new JTextField("27");
        pole_tekstowe3.setBounds(1,80, 100,30);
        frame.add(pole_tekstowe3);

        JTextField pole_tekstowe4;
        pole_tekstowe4 = new JTextField("");
        pole_tekstowe4.setBounds(1,110, 100,30);
        frame.add(pole_tekstowe4);

        JTextField pole_tekstowe5;
        pole_tekstowe5 = new JTextField("");
        pole_tekstowe5.setBounds(1,140, 100,30);
        frame.add(pole_tekstowe5);

        JTextField pole_tekstowe6;
        pole_tekstowe6 = new JTextField("");
        pole_tekstowe6.setBounds(1,170, 100,30);
        frame.add(pole_tekstowe6);

        JTextField pole_tekstowe7;
        pole_tekstowe7 = new JTextField("");
        pole_tekstowe7.setBounds(1,200, 100,30);
        frame.add(pole_tekstowe7);

        JTextField pole_tekstowe8;
        pole_tekstowe8 = new JTextField("");
        pole_tekstowe8.setBounds(1,230, 100,30);
        frame.add(pole_tekstowe8);

        JTextField pole_tekstowe9;
        pole_tekstowe9 = new JTextField("");
        pole_tekstowe9.setBounds(1,260, 100,30);
        frame.add(pole_tekstowe9);

        JTextField pole_tekstowe10;
        pole_tekstowe10 = new JTextField("");
        pole_tekstowe10.setBounds(1,290, 100,30);
        frame.add(pole_tekstowe10);

        JCheckBox checkBox1 = new JCheckBox("Check");
        checkBox1.setBounds(100,20, 80,30);
        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox1.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe1.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe1.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox("Check");
        checkBox2.setBounds(100,50, 80,30);
        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox2.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe2.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe2.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox2);

        JCheckBox checkBox3 = new JCheckBox("Check");
        checkBox3.setBounds(100,80, 80,30);
        checkBox3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox3.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe3.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe3.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox3);

        JCheckBox checkBox4 = new JCheckBox("Check");
        checkBox4.setBounds(100,110, 80,30);
        checkBox4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox4.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe4.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe4.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox4);

        JCheckBox checkBox5 = new JCheckBox("Check");
        checkBox5.setBounds(100,140, 80,30);
        checkBox5.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox5.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe5.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe5.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox5);

        JCheckBox checkBox6 = new JCheckBox("Check");
        checkBox6.setBounds(100,170, 80,30);
        checkBox6.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox6.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe6.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe6.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox6);

        JCheckBox checkBox7 = new JCheckBox("Check");
        checkBox7.setBounds(100,200, 80,30);
        checkBox7.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox7.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe7.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe7.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox7);

        JCheckBox checkBox8 = new JCheckBox("Check");
        checkBox8.setBounds(100,230, 80,30);
        checkBox8.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox8.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe8.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe8.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox8);

        JCheckBox checkBox9 = new JCheckBox("Check");
        checkBox9.setBounds(100,260, 80,30);
        checkBox9.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox9.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe9.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe9.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox9);

        JCheckBox checkBox10 = new JCheckBox("Check");
        checkBox10.setBounds(100,290, 80,30);
        checkBox10.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(checkBox10.isSelected()){
                    System.out.println("Selected");
                    dodaj_liczbe(pole_tekstowe10.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }
                } else{
                    System.out.println("Not Selected");
                    usun_liczbe(pole_tekstowe10.getText());
                    if(frame2 != null){
                        frame2.revalidate();
                        frame2.repaint();
                    }

                }
            }
        });
        frame.add(checkBox10);


        JButton wybierz_guzik = new JButton("wykres");
        wybierz_guzik.setBounds(300,100,90, 60);
        wybierz_guzik.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("TEST");
                thread = new Thread(() -> {
                    frame2 = new SwingWrapper(chart).displayChart();
                    javax.swing.SwingUtilities.invokeLater(() -> frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE));
                });
                thread.start();
            }
        });

        JButton autor_guzik = new JButton("Autor");
        autor_guzik.setBounds(382,430,100, 30);
        autor_guzik.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Autor","Szymon Borzdyński",JOptionPane.PLAIN_MESSAGE);
            }
        });

        frame.add(wybierz_guzik);
        frame.add(autor_guzik);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
