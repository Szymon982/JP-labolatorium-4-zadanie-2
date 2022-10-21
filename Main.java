package com.company;
import org.knowm.xchart.SwingWrapper;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        gui start = new gui();
        start.interfejs();
        BarChart01.create_chart();
    }
}
