/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_Project;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author suxia
 */
@Local
public interface LostandfoundFacadeLocal {

    void create(Lostandfound lostandfound);

    void edit(Lostandfound lostandfound);

    void remove(Lostandfound lostandfound);

    Lostandfound find(Object id);

    List<Lostandfound> findAll();

    List<Lostandfound> findRange(int[] range);

    int count();
    
}
