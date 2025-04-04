/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cutenames;

/**
 *
 * @author SHONISANI
 */import javax.swing.JOptionPane;
public class CuteNames {

    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "You have a cute name "+ name);
    }
}
