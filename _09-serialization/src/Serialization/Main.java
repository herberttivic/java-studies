package Serialization;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        var users = new ArrayList<User>();

        users.add(new User("Herbert"));
        users.add(new User("João"));
        users.add(new User("Ana"));
        users.add(new User("Pedro"));
        users.add(new User("Maria"));

        try{
            var fm = new FileManager();

            fm.readUsers();
            for(User u : fm.getUsers()){
                System.out.println(u.getName());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}