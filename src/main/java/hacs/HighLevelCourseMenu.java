package hacs;
/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighLevelCourseMenu extends CourseMenu {
    final int l1 = 389, l2 = 54, l3 = 79, l4 = 29;
    final int l5 = 390, l6 = 125, l7 = 21, l8 = 55;
    final int l9 = 103, l10 = 26, l11 = 128, l12 = 140;
    final int l13 = 57, l14 = 126, l15 = 22, l16 = 137;
    final int l17 = 127, l18 = 290, l19 = 79, l20 = 124;
    final int l21 = 54, l22 = 23, l23 = 186, l24 = 99, l25 = 432;

    /*
     * JButton AssignmentAddButton = new JButton(); JRadioButton OptionRadio = new
     * JRadioButton(); JComboBox OptionCombo = new JComboBox(); JButton
     * OptionViewButton = new JButton(); JButton OptionAddButton = new JButton();
     */

    public HighLevelCourseMenu() {
    }

    void showMenu(Course theCourse) {
        showViewButtons();
        showRadios();
        showComboxes();
        setVisible(true);
    }

    void showAddButtons() {
        assignmentAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                assignmentAddButtonActionPerformed(e);
            }
        });
        assignmentAddButton.setText("Add");
        assignmentAddButton.setBounds(new Rectangle(l1, l2, l3, l4));
        optionAddButton.setText("Add");
        optionAddButton.setBounds(new Rectangle(l5, l6, l3, l4));
        this.getContentPane().add(assignmentAddButton, null);
        this.getContentPane().add(optionAddButton, null);
    }

    void showRadios() {
        assignmentRadio.setText("Assignment");
        assignmentRadio.setBounds(new Rectangle(l7, l8, l9, l10));
        this.getContentPane().add(assignmentRadio, null);
        optionRadio.setText("HighLevel Presentation");
        optionRadio.setBounds(new Rectangle(l7, l11, l9, l10));
        this.getContentPane().add(optionRadio, null);
    }

    void showComboxes() {
        assignmentCombox.setBounds(new Rectangle(l12, l13, l14, l15));
        optionCombo.setBounds(new Rectangle(l16, l17, l14, l15));
        this.getContentPane().add(assignmentCombox, null);
        this.getContentPane().add(optionCombo, null);
        refresh();
    }

    void showViewButtons() {
        assignmentViewButton.setText("View");
        assignmentViewButton.setBounds(new Rectangle(l18, l21, l19, l4));
        assignmentViewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                assignmentViewButtonActionPerformed(e);
            }
        });
        optionViewButton.setText("View");
        optionViewButton.setBounds(new Rectangle(l18, l20, l19, l4));
        this.getContentPane().add(assignmentViewButton, null);
        this.getContentPane().add(optionViewButton, null);
    }

    void showLabel() {
        assignmentContentLable.setText("AssigmentContent");
        assignmentContentLable.setBounds(new Rectangle(l22, l23, l25, l24));
        this.getContentPane().add(assignmentContentLable, null);
    }
}
