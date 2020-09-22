/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class UserDAO {
    public static List<User> ls = new ArrayList<>();
    public User findByID(String username){
        for (User user : ls) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    public int  update (User user){
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getUsername().equals(user.getUsername())) {
                ls.set(i, user);
                return i;
            }
        }
        return -1;
    }
    
    public int save (User user){
        if (findByID(user.getUsername()) != null) {
            update(user);
        }else{
        ls.add(user);
        }
        return 1;
    }
    public int delete(String username){
    User user = findByID(username);
        if (user != null) {
            ls.remove(user);
               return 1;
        }
    return -1;   
    }
  public List<User> getAll(){
  return ls;
  }
}

