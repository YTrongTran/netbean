/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeParts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class DepartsDAO {
    public static List<Departs> ls = new ArrayList<>();

    public Departs findByID(String id) {
        for (Departs departs : ls) {
            if (departs.getId().equals(departs)) {
                return departs;
            }
        }
        return null;
    }

    public int update(Departs dp) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getId().equals(dp.getId())) {
                ls.set(i, dp);
                return i;
            }
        }
        return -1;
    }

    public int save(Departs dp) {
        if (findByID(dp.getId()) != null) {
            update(dp);
        } else {
            ls.add(dp);
        }
        return 1;
    }

    public int delete(String id) {
        Departs d = findByID(id);
        if (d != null) {
            ls.remove(d);
            return 1;
        }
        return 0;
    }

    public List<Departs> getAll() {
        return ls;
    }

   
}
