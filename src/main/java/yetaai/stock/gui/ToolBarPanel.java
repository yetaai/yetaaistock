/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yetaai.stock.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;

/**
 *
 * @author HIS20166
 */
public class ToolBarPanel extends JPanel implements ActionListener {

    public ToolBarPanel(String toolbartypename) {
//     Consider reflection optimization   sun.reflect.inflationThreshold = 2;

        super(new BorderLayout());
        JToolBar toolbar = new JToolBar("Yetaai Stock toolbar");
        addButons(toolbar);
        setPreferredSize(new Dimension(450, 130));
        add(toolbar, BorderLayout.PAGE_START);
        JScrollPane scrollPane = new JScrollPane();
        add(scrollPane, BorderLayout.CENTER);
    }

    private void addButons(JToolBar toolbar) {
        JButton button1 = new JButton();
        button1.setActionCommand("Exit by ESC");
        button1.addActionListener((ActionListener)this);
        toolbar.add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
