/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mimarket;

import javax.swing.JPanel;

/**
 *
 * @author NITRO 5
 */
public class ChangePanel {
    private JPanel currentPanel;
    private JPanel newPanel;

    public ChangePanel(JPanel currentPanel, JPanel newPanel) {
        this.currentPanel = currentPanel;
        this.newPanel = newPanel;
        this.currentPanel.removeAll();
        this.currentPanel.revalidate();
        this.currentPanel.repaint();
        
        this.currentPanel.add(this.newPanel);
        this.currentPanel.revalidate();
        this.currentPanel.repaint();
    }
}
