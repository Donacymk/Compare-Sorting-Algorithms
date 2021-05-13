import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class Plot extends JFrame {

    public Plot() {
        super("Comparison Of Algorithms");

        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private JPanel createChartPanel() {
        String chartTitle = "Programming Algorithms";
        String categoryAxisLabel = "Algorithms";
        String valueAxisLabel = "Time Taken(ms)";

        CategoryDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createLineChart3D("Comparison Of Algorithms", "Algorithms","Time Taken", createDataset());
        CategoryPlot plot = chart.getCategoryPlot();
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);
        renderer.setSeriesPaint(0,Color.BLACK);

        return new ChartPanel(chart);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String series1 = "Sorting Algorithms";
        Timetaken tt = new Timetaken();
        double bubbleTime = tt.timetakenbubble();
        double insertionTime = tt.timetakeninsertionSort();
        double mergeTime = tt.timetakenmergeSort();
        double selectionTime = tt.timetakenselectionSort();
        double quickTime = tt.timetakenquickSort();
        double radixTime = tt.timetakenradixSort();


        dataset.addValue(bubbleTime, series1, "BubbleSort");
        //dataset.addValue(bucketTime, series1, "BucketSort");
        dataset.addValue(insertionTime, series1, "InsertionSort");
        dataset.addValue(mergeTime, series1, "MergeSort");
        dataset.addValue(selectionTime, series1, "SelectionSort");
        dataset.addValue(quickTime, series1, "QuickSort");
        dataset.addValue(radixTime, series1, "RadixSort");
        return dataset;
    }
}