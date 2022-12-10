package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.knowm.xchart.SwingWrapper;

import static com.company.BarChart01.*;

public class gui extends JFrame {
    public static Thread thread;
    public static JFrame frame2;
    public static int ilosc_danych=0;
    public static String[] dane_do_wykresu = new String[11];

    public boolean sprawdz_czy_sa_dane(){
        return ilosc_danych>0;
    }

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
        dane_do_wykresu[1] = pole_tekstowe1.getText();
        frame.add(pole_tekstowe1);

        JTextField pole_tekstowe2;
        pole_tekstowe2 = new JTextField("30");
        pole_tekstowe2.setBounds(1,50, 100,30);
        dane_do_wykresu[2] = pole_tekstowe2.getText();
        frame.add(pole_tekstowe2);

        JTextField pole_tekstowe3;
        pole_tekstowe3 = new JTextField("27");
        pole_tekstowe3.setBounds(1,80, 100,30);
        dane_do_wykresu[3] = pole_tekstowe3.getText();
        Color[] colortemo = new Color[]{new Color(224, 59, 59)};
        pole_tekstowe3.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                usun_liczbe(dane_do_wykresu[3]);
                dodaj_liczbe(pole_tekstowe3.getText(),colortemo);
                dane_do_wykresu[3] = pole_tekstowe3.getText();
                if(frame2 != null){
                    frame2.revalidate();
                    frame2.repaint();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                usun_liczbe(dane_do_wykresu[3]);
                dodaj_liczbe(pole_tekstowe3.getText(),colortemo);
                dane_do_wykresu[3] = pole_tekstowe3.getText();
                if(frame2 != null){
                    frame2.revalidate();
                    frame2.repaint();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        frame.add(pole_tekstowe3);

        JTextField pole_tekstowe4;
        pole_tekstowe4 = new JTextField("28");
        pole_tekstowe4.setBounds(1,110, 100,30);
        dane_do_wykresu[4] = pole_tekstowe4.getText();
        frame.add(pole_tekstowe4);

        JTextField pole_tekstowe5;
        pole_tekstowe5 = new JTextField("36");
        pole_tekstowe5.setBounds(1,140, 100,30);
        dane_do_wykresu[5] = pole_tekstowe5.getText();
        frame.add(pole_tekstowe5);

        JTextField pole_tekstowe6;
        pole_tekstowe6 = new JTextField("");
        pole_tekstowe6.setBounds(1,170, 100,30);
        dane_do_wykresu[6] = pole_tekstowe6.getText();
        frame.add(pole_tekstowe6);

        JTextField pole_tekstowe7;
        pole_tekstowe7 = new JTextField("");
        pole_tekstowe7.setBounds(1,200, 100,30);
        dane_do_wykresu[7] = pole_tekstowe7.getText();
        frame.add(pole_tekstowe7);

        JTextField pole_tekstowe8;
        pole_tekstowe8 = new JTextField("");
        pole_tekstowe8.setBounds(1,230, 100,30);
        dane_do_wykresu[8] = pole_tekstowe8.getText();
        frame.add(pole_tekstowe8);

        JTextField pole_tekstowe9;
        pole_tekstowe9 = new JTextField("");
        pole_tekstowe9.setBounds(1,260, 100,30);
        dane_do_wykresu[9] = pole_tekstowe9.getText();
        frame.add(pole_tekstowe9);

        JTextField pole_tekstowe10;
        pole_tekstowe10 = new JTextField("");
        pole_tekstowe10.setBounds(1,290, 100,30);
        dane_do_wykresu[10] = pole_tekstowe10.getText();
        frame.add(pole_tekstowe10);

        JCheckBox checkBox1 = new JCheckBox("Check");
        checkBox1.setBounds(100,20, 80,30);
        Color[] color1 = new Color[]{new Color(224, 59, 59)};
        checkBox1.addItemListener(e -> {
            if(checkBox1.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe1.getText(),color1);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe1.getText());
            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox("Check");
        checkBox2.setBounds(100,50, 80,30);
        Color[] color2 = new Color[]{new Color(35, 119, 15)};
        checkBox2.addItemListener(e -> {
            if(checkBox2.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe2.getText(),color2);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe2.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox2);

        JCheckBox checkBox3 = new JCheckBox("Check");
        checkBox3.setBounds(100,80, 80,30);
        Color[] color3 = new Color[]{new Color(150, 147, 18)};
        checkBox3.addItemListener(e -> {
            if(e.getStateChange() == ItemEvent.ITEM_STATE_CHANGED){
                checkBox3.setSelected(false);
                System.out.println("zmieniona wartosc");
            }
            if(checkBox3.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe3.getText(),color3);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe3.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox3);

        JCheckBox checkBox4 = new JCheckBox("Check");
        checkBox4.setBounds(100,110, 80,30);
        Color[] color4 = new Color[]{new Color(33, 61, 241)};
        checkBox4.addItemListener(e -> {
            if(checkBox4.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe4.getText(),color4);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe4.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox4);

        JCheckBox checkBox5 = new JCheckBox("Check");
        checkBox5.setBounds(100,140, 80,30);
        Color[] color5 = new Color[]{new Color(241, 124, 7)};
        checkBox5.addItemListener(e -> {
            if(checkBox5.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe5.getText(),color5);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe5.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox5);

        JCheckBox checkBox6 = new JCheckBox("Check");
        checkBox6.setBounds(100,170, 80,30);
        Color[] color6 = new Color[]{new Color(91, 0, 105)};
        checkBox6.addItemListener(e -> {
            if(checkBox6.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe6.getText(),color6);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe6.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox6);

        JCheckBox checkBox7 = new JCheckBox("Check");
        checkBox7.setBounds(100,200, 80,30);
        Color[] color7 = new Color[]{new Color(0, 250, 162)};
        checkBox7.addItemListener(e -> {
            if(checkBox7.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe7.getText(),color7);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe7.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox7);

        JCheckBox checkBox8 = new JCheckBox("Check");
        checkBox8.setBounds(100,230, 80,30);
        Color[] color8 = new Color[]{new Color(76, 77, 70)};
        checkBox8.addItemListener(e -> {
            if(checkBox8.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe8.getText(),color8);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe8.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox8);

        JCheckBox checkBox9 = new JCheckBox("Check");
        checkBox9.setBounds(100,260, 80,30);
        Color[] color9 = new Color[]{new Color(52, 4, 4)};
        checkBox9.addItemListener(e -> {
            if(checkBox9.isSelected()){
                ilosc_danych++;
                dodaj_liczbe(pole_tekstowe9.getText(),color9);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe9.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox9);

        JCheckBox checkBox10 = new JCheckBox("Check");
        checkBox10.setBounds(100,290, 80,30);
        Color[] color10 = new Color[]{new Color(255, 0, 233)};
        checkBox10.addItemListener(e -> {
            if(checkBox10.isSelected()){
                ilosc_danych++;

                dodaj_liczbe(pole_tekstowe10.getText(),color10);
            } else{
                ilosc_danych--;
                usun_liczbe(pole_tekstowe10.getText());

            }
            if(frame2 != null){
                frame2.revalidate();
                frame2.repaint();
            }
        });
        frame.add(checkBox10);


        JButton wybierz_guzik = new JButton("wykres");
        wybierz_guzik.setBounds(300,100,90, 60);
        wybierz_guzik.addActionListener(e -> {
            if(ilosc_danych==0){
                JOptionPane.showMessageDialog(null,"Brak danych do wykresu, zaznacz chociaż jedno pole","Błąd",JOptionPane.ERROR_MESSAGE);
                return;
            }
            thread = new Thread(() -> {
                chart.getStyler().setSeriesColors(colors);
                frame2 = new SwingWrapper(chart).displayChart();
                SwingUtilities.invokeLater(() -> frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE));
            });
            thread.start();
        });

        JButton autor_guzik = new JButton("Autor");
        autor_guzik.setBounds(382,430,100, 30);
        autor_guzik.addActionListener(e -> JOptionPane.showMessageDialog(null,"Szymon Borzdyński","Autor",JOptionPane.PLAIN_MESSAGE));


        frame.add(wybierz_guzik);
        frame.add(autor_guzik);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
