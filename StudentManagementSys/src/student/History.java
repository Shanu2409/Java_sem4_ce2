/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class History {
    History(String[][] row, String[] col){
        
        JTable table = new JTable(row,col);
        
        
        JFrame frame = new JFrame("History");
        
        frame.add(new JScrollPane(table));
        
        frame.setSize(400,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String...a){
        String[][] r = {
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"},
            {"malad", "Goregoan", "30", "grq423", "Bus", "4"}
        };
        
        String[] c = {"From", "To", "Price", "UID", "Type", "Platform"};
        
        new History(r,c);
    }
}
