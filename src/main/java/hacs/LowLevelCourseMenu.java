package hacs;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LowLevelCourseMenu extends CourseMenu {
    final int xa = 389, ya = 54, wa = 79, ha = 29;

    final int xb = 390, yb = 125, wb = 79, hb = 29;

    final int xc = 21, yc = 55, wc = 103, hc = 26;
    final int xd = 21, yd = 128, wd = 103, hd = 26;

    final int xe = 140, ye = 57, we = 126, he = 22;
    final int xf = 137, yf = 127, wf = 126, hf = 22;

    final int xg = 290, yg = 54, wg = 79, hg = 29;

    final int xi = 290, yi = 124, wi = 79, hi = 29;

    final int xh = 23, yh = 186, wh = 432, hh = 99;
    public LowLevelCourseMenu() {
    }

    void showMenu(Course theCourse) {
        setVisible(true);
    }

    void showAddButtons() {
        assignmentAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                assignmentAddButtonActionPerformed(e);
            }
        });
        assignmentAddButton.setText("Add");
        assignmentAddButton.setBounds(new Rectangle(xa, ya, wa, ha));
        optionAddButton.setText("Add");
        optionAddButton.setBounds(new Rectangle(xb, yb, wb, hb));
        this.getContentPane().add(assignmentAddButton, null);
        this.getContentPane().add(optionAddButton, null);
    }

    void showRadios() {
        assignmentRadio.setText("Assignment");
        assignmentRadio.setBounds(new Rectangle(xc, yc, wc, hc));
        this.getContentPane().add(assignmentRadio, null);
        optionRadio.setText("LowLevelExperiment");
        optionRadio.setBounds(new Rectangle(xd, yd, wd, hd));
        this.getContentPane().add(optionRadio, null);
    }

    void showComboxes() {
        assignmentCombox.setBounds(new Rectangle(xe, ye, we, he));
        optionCombo.setBounds(new Rectangle(xf, yf, wf, hf));
        this.getContentPane().add(assignmentCombox, null);
        this.getContentPane().add(optionCombo, null);
        refresh();
    }

    void showViewButtons() {
        assignmentViewButton.setText("View");
        assignmentViewButton.setBounds(new Rectangle(xg, yg, wg, hg));
        assignmentViewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                assignmentViewButtonActionPerformed(e);
            }
        });
        optionViewButton.setText("View");
        optionViewButton.setBounds(new Rectangle(xi, yi, wi, hi));
        this.getContentPane().add(assignmentViewButton, null);
        this.getContentPane().add(optionViewButton, null);
    }

    void showLabel() {
        assignmentContentLable.setText("AssigmentContent");
        assignmentContentLable.setBounds(new Rectangle(xh, yh, wh, hh));
        this.getContentPane().add(assignmentContentLable, null);
    }
}
