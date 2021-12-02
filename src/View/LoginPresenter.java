/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import DAO.UserDAO;
import DAOFileImp.FileUserDAO;
import View.people.People_Dashboard;
import View.personnel.Personnel_Dashboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author howar
 */
public class LoginPresenter {
    private final LoginView view;
    protected static final Logger logger = LogManager.getLogger();

    public LoginPresenter(LoginView view) {
        this.view = view;
        initPresentationLogic();
    }

    private void initPresentationLogic() {
        view.btnQuit.addActionListener(new btnQuitActionListener());
        view.ckbShowPass.addActionListener(new ckbShowPassActionListener());
        view.rbtnPeople.addActionListener(new rbtnPersonnelPeopleActionListener());
        view.rbtnPersonnel.addActionListener(new rbtnPersonnelPeopleActionListener());
        view.btnLogin.addActionListener(new btnLoginActionListener());
    }

    private class btnLoginActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = view.txtUsername.getText();
            String password = new String(view.txtPassword.getPassword());
            UserDAO userDao = FileUserDAO.getInstance();
            boolean canLogin = false;
            boolean isPeopleLogin = false;
            boolean isPersonnelLogin = false;
            if (view.rbtnPersonnel.isSelected()) {
                isPersonnelLogin = true;
            } else if (view.rbtnPeople.isSelected()) {
                isPeopleLogin = true;
            }
            if (isPersonnelLogin) {
                canLogin = userDao.canPersonnelLogin(username, password);
            } else if (isPeopleLogin) {
                canLogin = userDao.canPeopleLogin(username, password);
            }

            if (canLogin) {
                JOptionPane.showMessageDialog(null, "Valid Credential");
                if (isPersonnelLogin) {

                    Personnel_Dashboard personnel_Dashboard = new Personnel_Dashboard(userDao.getPersonnelByUsernameAndPassword(username, password));
                    personnel_Dashboard.setLocationRelativeTo(view);
                    personnel_Dashboard.setVisible(true);
                    view.dispose();
                } else if (isPeopleLogin) {
                    People_Dashboard people_Dashboard = new People_Dashboard(userDao.getPeopleByUsernameAndPassword(username, password));
                    people_Dashboard.setLocationRelativeTo(view);
                    people_Dashboard.setVisible(true);
                    view.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Credential");
            }


        }

    }

    private class rbtnPersonnelPeopleActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.rbtnPersonnel.isSelected()) {
                logger.info("Changed to {} login.", "Personnel");
            }
            if (view.rbtnPeople.isSelected()) {
                logger.info("Changed to {} login.", "People");
            }
        }

    }

    private class btnQuitActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class ckbShowPassActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.ckbShowPass.isSelected()) {
                view.txtPassword.setEchoChar((char) 0);
            } else {
                view.txtPassword.setEchoChar('*');
            }
        }
    }

}
