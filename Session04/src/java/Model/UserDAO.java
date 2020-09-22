/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class UserDAO {
    public static List<User> ls = new ArrayList<>();
    public User findbyUsername(String username){
        for (User user : ls) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    public int update(User user){
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getUsername().equals(user.getUsername())) {
                ls.set(i, user);
                return 1;
            }
        }
        return -1;
    }
   public int save(User user){
       if (findbyUsername(user.getUsername()) != null) {
           update(user);
       } else {
           ls.add(user);
       }
       return 1;
    }
   public int delete(String username){
      User u = findbyUsername(username);
       if (u != null) {
           ls.remove(u);
           return 1;
       }
       return 0;
    }
   public List<User> getAll(){
   return ls;
   }
}
