/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.UserDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import model.People;
import model.Personnel;
import model.User;

/**
 *
 * @author howar
 */
public class FileUserDAO implements UserDAO {

    private volatile static FileUserDAO instance;

    private FileUserDAO() {
    }

    public static FileUserDAO getInstance() {
        if (instance == null) {
            synchronized (FileUserDAO.class) {
                if (instance == null) {
                    instance = new FileUserDAO();
                }
            }
        }
        return instance;
    }

    @Override
    public void updateUserPassword(UUID userId, String newPassword) {
        Personnel pers = getPersonnel(userId);
        if (pers != null) {
            FilePersonnelDAO personnelDao = FilePersonnelDAO.getInstance();
            pers.setPassword(newPassword);
            personnelDao.update(userId, pers);
        }
        People peop = getPeople(userId);
        if (peop != null) {
            FilePeopleDAO peopleDao = FilePeopleDAO.getInstance();
            peop.setPassword(newPassword);
            peopleDao.update(userId, peop);
        }
    }

    @Override
    public List<User> all() {
        FilePeopleDAO peopleDao = FilePeopleDAO.getInstance();
        FilePersonnelDAO personnelDao = FilePersonnelDAO.getInstance();
        List<People> peoples = peopleDao.all();
        List<Personnel> personnels = personnelDao.all();

        List<User> users = new ArrayList<>();

        users.addAll(this.getUsersFromSubClassList(peoples));
        users.addAll(this.getUsersFromSubClassList(personnels));
        return users;
    }

    @Override
    public User get(UUID id) {
        List<User> users = this.all();
        User userT = null;
        for (User user : users) {
            if (user.getKey().equals(id)) {
                return user;
            }
        }
        return userT;
    }

    @Override
    public List<User> allPersonnelUsers() {
        FilePersonnelDAO personnelDao = FilePersonnelDAO.getInstance();

        return this.getUsersFromSubClassList(personnelDao.all());
    }

    @Override
    public List<User> allPeopleUsers() {
        FilePeopleDAO peopleDao = FilePeopleDAO.getInstance();
        return this.getUsersFromSubClassList(peopleDao.all());
    }


    @Override
    public boolean canLogin(String username, String password) {
        List<User> users = this.all();
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean canPeopleLogin(String username, String password) {
        List<User> users = this.allPeopleUsers();
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean canPersonnelLogin(String username, String password) {
        List<User> users = this.allPersonnelUsers();
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private Personnel getPersonnel(UUID userId) {
        FilePersonnelDAO personnelDao = FilePersonnelDAO.getInstance();
        for (Personnel personnel : personnelDao.all()) {
            if (personnel.getKey().equals(userId)) {
                return personnel;
            }
        }
        return null;
    }

    private People getPeople(UUID userId) {
        FilePeopleDAO peopleDao = FilePeopleDAO.getInstance();
        for (People people : peopleDao.all()) {
            if (people.getKey().equals(userId)) {
                return people;
            }
        }
        return null;
    }


    private List<User> getUsersFromSubClassList(List<? extends User> uList) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < uList.size(); i++) {
            users.add((User) uList.get(i));
        }
        return users;
    }



}
