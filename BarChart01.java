package com.company;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.demo.charts.ExampleChart;
import javax.swing.*;
import java.util.List;

public class BarChart01 implements ExampleChart<CategoryChart> {
    public static CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Score Histogram").xAxisTitle("Score").yAxisTitle("Number").build();

    public static void create_chart(){
        ExampleChart<CategoryChart> exampleChart = new BarChart01();
        CategoryChart chart = exampleChart.getChart();
        new SwingWrapper<CategoryChart>(chart);
    }

    public static void dodaj_liczbe(String liczba){
        try{
            chart.addSeries(String.valueOf(liczba), List.of(Integer.parseInt(liczba)), List.of(Integer.parseInt(liczba)));
        } catch (java.lang.NumberFormatException exception){
            JOptionPane.showMessageDialog(null,"Nieprawidłowe dane w polu","Błąd",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void usun_liczbe(String liczba){
        chart.removeSeries(String.valueOf(liczba));
    }

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