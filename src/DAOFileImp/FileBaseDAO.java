/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOFileImp;

import DAO.BaseRootDAO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import model.Model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Settings;

/**
 *
 * @author howar
 */
public abstract class FileBaseDAO<T extends Model> implements BaseRootDAO<T> {

    protected final Logger logger = LogManager.getLogger(FileBaseDAO.class);
    protected final String DATA_FOLDER = Settings.getProperty("db.folder", "data/");
    protected final String DATA_FILE;

    FileBaseDAO(Class<T> clazz) {
        this.DATA_FILE = DATA_FOLDER + clazz.getSimpleName();
    }

    public List<Object> readFileAsObjects(String filename) { //using list instead of array list to make sure the it can be maintained easily, later on i can change to other list type
        List<Object> objects = null;
        //write the stream within the column, if exception occurs, the stream will be closed automatically, so no need to write finally close
        //only closable class can put here
        try (
                FileInputStream inStream = new FileInputStream(filename);
                ObjectInputStream oinStream = new ObjectInputStream(inStream);) {
            objects = (List<Object>) oinStream.readObject(); //array list is serializable, so can directly read
        } catch (FileNotFoundException e) { // if the file doesnt exist, can be when the system is first used, so return empty list, so that the handlers can init
            logger.error("DAO file not found. Path: {}", filename);
            return (List<Object>) objects;
        } catch (IOException | ClassNotFoundException e) {
            logger.fatal(e.getMessage());
        }
        return objects;
    }

    public void writeObjectsToFile(String filename, List objectsList) {

        try (
                OutputStream outStream = new FileOutputStream(filename);
                ObjectOutputStream ooutStream = new ObjectOutputStream(outStream);) {
            ooutStream.writeObject(objectsList);
        } catch (FileNotFoundException e) { // if the file doesnt exist, can be when the system is first used, so return empty list, so that the handlers can init
            logger.fatal(e.getMessage());
        } catch (IOException e) {
            logger.fatal(e.getMessage());
        }
    }


    @Override
    public List<T> all() {
        List<T> ts = (ArrayList) readFileAsObjects(DATA_FILE);
        if (ts == null) {
            writeObjectsToFile(DATA_FILE, new ArrayList<T>());
            ts = (ArrayList) readFileAsObjects(DATA_FILE);
        }
        return ts;
    }

    @Override
    public T get(UUID id) {
        List<T> ts = this.all();
        T elementT = null;
        for (T element : ts) {
            if (element.getKey().equals(id)) {
                return element;
            }
        }
        return elementT;
    }

    @Override
    public void update(UUID id, T t) {
        List<T> ts = this.all();
        for (int i = 0; i < ts.size(); i++) {
            if (ts.get(i).getKey().equals(id)) {
                ts.set(i, t);
                logger.debug("Updated {} element: {}", ts.getClass().getSimpleName(), ts.get(i).getKey());
            }
        }
        writeObjectsToFile(DATA_FILE, ts);
    }

    @Override
    public void replace(List<T> tList) {
        writeObjectsToFile(DATA_FILE, tList);
    }


    @Override
    public void create(T t) {
        List<T> ts = this.all();
        ts.add(t);
        writeObjectsToFile(DATA_FILE, ts);
        logger.info("{} object created: key [{}]", t.getClass().getSimpleName(), t.getKey());
    }

    @Override
    public void delete(UUID id) {
        List<T> ts = this.all();

        Iterator itr = ts.iterator();

        while (itr.hasNext()) {
            T elementT = (T) itr.next();
            if (elementT.getKey().equals(id)) {
                itr.remove();
            }
        }
        writeObjectsToFile(DATA_FILE, ts);
    }

    @Override
    public void deleteAll() {
        writeObjectsToFile(DATA_FILE, new ArrayList<T>());
    }


}
