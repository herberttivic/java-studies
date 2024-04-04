import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        var separator = new String("_____________");
        var userList =  new ArrayList<User>();

        var u1 = new User("Herbert");
        var u2 = new User("João");
        var u3 = new User("Ana");
        var u4 = new User("Maria");
        var u5 = new User("José");

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        userList.add(u5);

//      USING FOR

        for (int i = 0; i < userList.size(); i++){
            System.out.println(userList.get(i).getName());
        }
        System.out.println(separator);

//      USING FOR WITH ":"

        for (User user : userList){
            System.out.println(user.getName());
        }
        System.out.println(separator);

//      USING WHILE WITH ITERATOR

        Iterator<User> it = userList.iterator();

        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
        System.out.println(separator);

//      USING FOREACH

        userList.forEach(User::printName);
    }
}