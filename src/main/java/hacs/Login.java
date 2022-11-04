package hacs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * @version 3.0
 * <p>
 * Update to Java 8
 */

public class Login extends JDialog {
    private static final long serialVersionUID = 1L;
    boolean mbExit = false;
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JButton loginButton = new JButton();
    JButton buttonExit = new JButton();
    JTextField userNameText = new JTextField();
    JPasswordField passwordText = new JPasswordField();
    JRadioButton studentRadio = new JRadioButton();
    JRadioButton instructorRadio = new JRadioButton();
    ButtonGroup buttonGroup1 = new ButtonGroup();
    private String userBox = null;
    private UserInfoItem.UserType userType = UserInfoItem.UserType.STUDENT;
    static final int SET_WIDTH = 300;
    static final int SET_HEIGHT = 300;
    final int xa = 26, ya = 52, wa = 80, ha = 18;
    final int xb = 23, yb = 119, wb = 80, hb = 18;
    final int xc = 31, yc = 212, wc = 85, hc = 28;
    final int xd = 180, yd = 211, wd = 97, hd = 28;
    final int xe = 119, ye = 52, we = 144, he = 22;
    final int xf = 118, yf = 119, wf = 147, hf = 22;
    final int xg = 37, yg = 164, wg = 103, hg = 26;
    final int xh = 177, yh = 162, wh = 103, hh = 26;
    public Login() {
        try {
            jbInit();
            setSize(SET_WIDTH, SET_HEIGHT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        jLabel1.setText("UserName");
        jLabel1.setBounds(new Rectangle(xa, ya, wa, ha));
        jLabel2.setText("Password");
        jLabel2.setBounds(new Rectangle(xb, yb, wb, hb));
        loginButton.setText("Login");
        loginButton.setBounds(new Rectangle(xc, yc, wc, hc));
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginButtonActionPerformed(e);
            }
        });
        buttonExit.setText("Exit");
        buttonExit.setBounds(new Rectangle(xd, yd, wd, hd));
        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonExitActionPerformed(e);
            }
        });
        userNameText.setBounds(new Rectangle(xe, ye, we, he));
        passwordText.setBounds(new Rectangle(xf, yf, wf, hf));
        studentRadio.setSelected(true);
        studentRadio.setText("Student");
        studentRadio.setBounds(new Rectangle(xg, yg, wg, hg));
        instructorRadio.setText("Instructor");
        instructorRadio.setBounds(new Rectangle(xh, yh, wh, hh));
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(loginButton, null);
        this.getContentPane().add(buttonExit, null);
        this.getContentPane().add(userNameText, null);
        this.getContentPane().add(passwordText, null);
        this.getContentPane().add(studentRadio, null);
        this.getContentPane().add(instructorRadio, null);
        buttonGroup1.add(studentRadio);
        buttonGroup1.add(instructorRadio);
    }

    void loginButtonActionPerformed(ActionEvent e) {
        BufferedReader file;
        mbExit = false;
        try {
            if (studentRadio.isSelected()) {
                userType = UserInfoItem.UserType.STUDENT;
                file = new BufferedReader(new FileReader("src/main/resources/StuInfo.txt"));
            } else {
                userType = UserInfoItem.UserType.INSTRUCTOR;
                file = new BufferedReader(new FileReader("src/main/resources/InsInfor.txt"));
            }
            userBox = userNameText.getText();
            String passwordBox = new String(passwordText.getPassword());
            String loginName = null;
            String aline = null, userName = null, password = null;
            while ((aline = file.readLine()) != null) {
                userName = getUserName(aline);
                password = getPassword(aline);
                if (userName.compareTo(userBox) == 0 && password.compareTo(passwordBox) == 0) {
                    loginName = userName;
                }
            }
            if (loginName != null) {
                this.setVisible(false);
            }
        } catch (Exception ee) {
            System.out.println(ee);
        }

    }

    private String getUserName(String aline) {
        int separator = aline.lastIndexOf(':');
        return aline.substring(0, separator);
    }

    /**
     * This method fetches the password corresponding to the given user
     * @param aline represent the input entry
     * @return represents the password post parsing the input entry
     */
    private String getPassword(String aline) {
        int separator = aline.lastIndexOf(':');
        return aline.substring(separator + 1, aline.length());
    }

    public String getUserName() {
        return userBox;
    }

    /**
     *  This method fetches the type of user
     */
    public UserInfoItem.UserType getUserType() {
        return userType;
    }

    public boolean isExit() {
        return mbExit;
    }

    void buttonExitActionPerformed(ActionEvent e) {
        mbExit = true;
        setVisible(false);
    }
}
