package de.danzel34.sortalgorythm.gui;

import de.danzel34.sortalgorythm.algorytims.BubbleSort;

import javax.swing.*;
import java.awt.*;

public class MainGui extends JFrame {

    public MainGui() {
        //TODO input for array
        setTitle("Sortier Algorithmen");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo((Component)null);

        //create a selection menu for algorithms
        JComboBox<String> algorithmSelection = new JComboBox<>();
        algorithmSelection.addItem("Bubble Sort");
        algorithmSelection.addItem("Selection Sort");
        algorithmSelection.addItem("Insertion Sort");
        algorithmSelection.addItem("Merge Sort");
        algorithmSelection.addItem("Quick Sort");
        algorithmSelection.addItem("Heap Sort");
        algorithmSelection.setBounds(50, 150, 200, 50);
        add(algorithmSelection);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> {
            String selectedAlgorithm = (String) algorithmSelection.getSelectedItem();
            switch (selectedAlgorithm) {
                case "Bubble Sort":
                    setVisible(false);
                    System.out.println("Bubble Sort");
                    BubbleSort bubbleSort = new BubbleSort();
                    break;
                case "Selection Sort":
                    setVisible(false);
                    System.out.println("Selection Sort");
                    break;
                case "Insertion Sort":
                    setVisible(false);
                    System.out.println("Insertion Sort");
                    break;
                case "Merge Sort":
                    setVisible(false);
                    System.out.println("Merge Sort");
                    break;
                case "Quick Sort":
                    setVisible(false);
                    System.out.println("Quick Sort");
                    break;
                case "Heap Sort":
                    setVisible(false);
                    System.out.println("Heap Sort");
                    break;
            }
        });
        startButton.setBounds(50, 50, 100, 50);
        add(startButton);
    }

    public void open() {
        setVisible(true);
    }
}
