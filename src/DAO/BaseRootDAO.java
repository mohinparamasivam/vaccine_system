/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import java.util.UUID;
import model.Model;

/**
 *
 * @author howar
 */
public interface BaseRootDAO<T extends Model> {

    public List<T> all();

    public T get(UUID id);

    public void update(UUID id, T t);

    public void replace(List<T> tList);

    public void create(T t);

    public void delete(UUID id);

    public void deleteAll();

}
