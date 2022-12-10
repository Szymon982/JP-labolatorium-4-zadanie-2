package com.company;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.demo.charts.ExampleChart;
import javax.swing.*;
import java.awt.*;

import java.util.List;



public class BarChart01 implements ExampleChart<CategoryChart> {
    public static CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Wykres").xAxisTitle("Dane").yAxisTitle("Wartość").build();

    public static void create_chart(){
        ExampleChart<CategoryChart> exampleChart = new BarChart01();
        CategoryChart chart = exampleChart.getChart();
        new SwingWrapper<>(chart);
    }

    public static void dodaj_liczbe(String liczba, Color[] kolor){
        try{
            chart.addSeries(String.valueOf(liczba), List.of(Integer.parseInt(liczba)), List.of(Integer.parseInt(liczba)));
            chart.getStyler().setSeriesColors(kolor);
        } catch (java.lang.NumberFormatException exception){
            JOptionPane.showMessageDialog(null,"Nieprawidłowe dane w polu","Błąd",JOptionPane.ERROR_MESSAGE);
        } catch (java.lang.IllegalArgumentException exception){
            JOptionPane.showMessageDialog(null,"Dane nie mogą się powtarzać","Błąd",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void usun_liczbe(String liczba){
        chart.removeSeries(String.valueOf(liczba));
    }

    static Color[] colors = new Color[]{
            new Color(255, 255, 255),
            new Color(166, 48, 48),
            new Color(95, 238, 12),
            new Color(255, 216, 2),
            new Color(232, 8, 221),
            new Color(60, 15, 93),
            new Color(59, 224, 194),
            new Color(75, 74, 74),
            new Color(239, 7, 7),
            new Color(96, 86, 168),
            new Color(0, 0, 0),
    };


    public CategoryChart getChart() {
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.setTitle("WYKRES");
        chart.addSeries("Dane:", List.of(0), List.of(0));
        return chart;
    }

    public String getExampleChartName() {
        return null;
    }



}