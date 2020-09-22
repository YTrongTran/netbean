/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrStudent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class StudentDAO {
    List<Student> ls = new ArrayList<>();
    public int add(Student st) {
        ls.add(st);
        return 1;
    }
    
        public int count(){
            return ls.size();
        }       
        public Student findStudentByID(String masv){
            for (Student l : ls) {
                if (l.getmSV().equalsIgnoreCase(masv)) {
                return l;    
                }
                
            }
            return null;
        }
//        public Student findStudentByID(String masv){
//            for (Student st : ls) {
//                if (st.getmSV().equalsIgnoreCase(masv)) {
//                    return st;
////                }
//            }
//        return null;
//        }
        public int del(String msv){
        Student find =findStudentByID(msv);
            if (find != null) {
                ls.remove(find);
                return 1;
            }
        return -1;
        }
        public int editStudent(Student st){
            for (Student s : ls) {
                if (s.getmSV().equals(s.getmSV())) {
                    s.settSV(st.gettSV());
                    s.setPhone(st.getPhone());
                    s.setEmail(st.getEmail());
                    s.setGioitinh(st.isGioitinh());
                    s.setNgaysinh(st.getNgaysinh());
                    break;
                    
                }
            }
            return 1;
        }
}
