package de.danzel34.sortalgorythm.algorytims;

import de.danzel34.sortalgorythm.bar.Bar;

import javax.swing.*;
import java.awt.*;

public class BubbleSort extends JFrame {

    /**
     * Creates a new BubbleSort window
     */
    public BubbleSort() {
        setTitle("Bubble Sort");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo((Component)null);
        setVisible(true);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> {
            //TODO ANIMATION

        });
        startButton.setBounds(50, 50, 100, 50);
        add(startButton);
        //fenster mit bars erstellen
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 10));
        for (int i = 0; i < 10; i++) {
            panel.add(new Bar(i));
        }
        add(panel);
    }

    /**
     * Sorts an array of integers using Bubble Sort
     * @param array
     */
    public static void sort(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
