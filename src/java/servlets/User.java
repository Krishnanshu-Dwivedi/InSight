/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.util.*;

public class User {
    public static String name;
    public static String userId;
    public static String password ;
    

    public static String getName() {
        return name;
    }

    public static String getUserId() {
        return userId;
    }

    public static String getPassword() {
        return password;
    }

    public static String getPhone() {
        return phone;
    }
    public static String phone;

    public User(String name, String userId, String password, String phone) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.phone = phone;
    }
    public static List<String> getData(){
        ArrayList <String> ls = new ArrayList <>();
        ls.add(name);
        ls.add(userId);
        ls.add(password);
        ls.add(phone);
        return ls;
    }
}
