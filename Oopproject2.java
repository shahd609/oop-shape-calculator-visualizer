package com.mycompany.oopproject2;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Oopproject2 {

    public static void main(String[] args) {

        ArrayList<Drawable> shapesList = new ArrayList<>();

        try (Scanner sc = new Scanner(new File("input.txt"))) {
            if (sc.hasNextInt()) {
                int size = sc.nextInt();
                if(size<2){
                    System.out.println("size not correct");
                    return;
                }
 
                for (int i = 0; i < size; i++) {
                    String type = sc.next();
                    double value = sc.nextDouble();
                    if (type.equalsIgnoreCase("circle")) {
                        shapesList.add(new Circle(value));
                    } else if (type.equalsIgnoreCase("cube")) {
                        shapesList.add(new Cube(value));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File input.txt not found!");
        }

        Drawable[] shapes = shapesList.toArray(new Drawable[0]);

        double totalArea = 0;
        for (Drawable d : shapes) {
            if (d instanceof Shape) {
                totalArea += ((Shape) d).getArea();
            }
        }

        try (PrintWriter pw = new PrintWriter("sumAreas.txt")) {
            pw.println("Total area of all shapes: " + totalArea);
        } catch (IOException e) {
            System.out.println("Error writing output file.");
        }

        JFrame frame = new JFrame("OOP Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int x = 50;
                int y = 200;

                for (Drawable d : shapes) {

                    if (d instanceof Circle) {
                        Circle c = (Circle) d;

                        int r = (int) c.getRadius();

                        g.setColor(Color.BLUE);
                        g.fillOval(x, y, r * 2, r * 2);


                        g.setColor(Color.BLACK);
                        g.drawString("Sphere r = " + r, x, y - 10);

                        x += (r * 2) + 100;
                    }

                    else if (d instanceof Cube) {
                        Cube cb = (Cube) d;
                        int s = (int) cb.getSide();
                        int offset = s / 3;

                        g.drawRect(x, y, s, s);
                        g.drawRect(x + offset, y - offset, s, s);

                        g.drawLine(x, y, x + offset, y - offset);
                        g.drawLine(x + s, y, x + s + offset, y - offset);
                        g.drawLine(x, y + s, x + offset, y + s - offset);
                        g.drawLine(x + s, y + s, x + s + offset, y + s - offset);

                        g.drawString("Cube s = " + s, x, y - 10);

                        x += s + offset + 100;
                    }
                }
            }
        };

        frame.add(drawingPanel);
        frame.setVisible(true);
    }
}