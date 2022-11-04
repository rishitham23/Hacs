package hacs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class CourseSelectDlg extends JDialog {
    //0 HighLevel presentation 1 LowLevel Experiment
    final int l1 = 18, l2 = 78, l3 = 139, l4 = 79, l5 = 29, l6 = 224;
    final int l7 = 140, l8 = 73, l9 = 31, l10 = 420, l11 = 238, l12 = 155;
    final int l13 = 41, l14 = 203, l15 = 22, l16 = 50, l17 = 87, l18 = 103;
    final int l19 = 26, l20 = 39, l21 = 44, l22 = 85, l23 = 236, l24 = 88;

    ClassCourseList theCourseList;
    Course selectedCourse;
    int nCourseLevel = 0;
    boolean mbLogout = false;
    JComboBox courseNameCom = new JComboBox();
    JRadioButton highLevelRadio = new JRadioButton();
    JRadioButton lowLevelRadio = new JRadioButton();
    JLabel jLabel1 = new JLabel();
    JButton okButton = new JButton();
    ButtonGroup buttonGroup1 = new ButtonGroup();
    JButton buttonLogout = new JButton();

    public CourseSelectDlg() {
        try {
            jbInit();
            setSize(l10, l11);
            setModal(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        courseNameCom.setBounds(new Rectangle(l12, l5, l14, l15));
        highLevelRadio.setText("HighLevel");
        highLevelRadio.setBounds(new Rectangle(l16, l17, l18, l19
        ));
        lowLevelRadio.setToolTipText("");
        lowLevelRadio.setSelected(true);
        lowLevelRadio.setText("LowLevel");
        lowLevelRadio.setBounds(new Rectangle(l23, l24, l18, l19));
        jLabel1.setText("CourseName");
        jLabel1.setBounds(new Rectangle(l20, l21, l22, l1));
        okButton.setText("OK");
        okButton.setBounds(new Rectangle(l2, l3, l4, l13));
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                okButtonActionPerformed(e);
            }
        });
        buttonLogout.setText("Logout");
        buttonLogout.setBounds(new Rectangle(l6, l7, l8, l9));
        buttonLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonLogoutActionPerformed(e);
            }
        });
        this.getContentPane().add(courseNameCom, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(highLevelRadio, null);
        this.getContentPane().add(lowLevelRadio, null);
        this.getContentPane().add(okButton, null);
        this.getContentPane().add(buttonLogout, null);
        buttonGroup1.add(highLevelRadio);
        buttonGroup1.add(lowLevelRadio);
    }

    /*
     * show the theCourseList in a combox Show the Course type selection button
     * return the pointer pointing to the Course object return the Course Type
     */

    public Course showDlg(ClassCourseList courseList) {

        theCourseList = courseList;
        CourseIterator theIterator = new CourseIterator(theCourseList);
        Course theCourse;
        while ((theCourse = (Course) theIterator.next()) != null) {
            courseNameCom.addItem(theCourse);
        }
        this.setVisible(true);
        return selectedCourse;
    }

    void okButtonActionPerformed(ActionEvent e) {
        selectedCourse = (Course) courseNameCom.getSelectedItem();
        if (highLevelRadio.isSelected()) {
            nCourseLevel = 0; // highlevel course: 0
        } else {
            nCourseLevel = 1; // lowlevel course: 1
        }
        //hide();
    }

    public boolean isLogout() {
        return mbLogout;
    }

    void buttonLogoutActionPerformed(ActionEvent e) {
        mbLogout = true;
        setVisible(false);
    }
}
