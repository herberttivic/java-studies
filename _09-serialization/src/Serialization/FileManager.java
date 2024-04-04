package Serialization;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private final File db = new File("database.dat");
    protected ArrayList<User> userList = new ArrayList<User>();


    public void exec(){
        try {
            var archive  = new File("teste.txt");
            var writter = new FileWriter(archive, true);
            var reader = new BufferedReader(new FileReader(archive));

            writter.write("\nNovo texto");
            writter.close();

            var s = "";
            while ((s = reader.readLine() )!= null){
                System.out.println(s);
            }
            reader.close();
        }catch (IOException  e){}
    }

    public void saveUsers(ArrayList<User> users) throws IOException{
        try {
            var fos =  new FileOutputStream(db);
            var oos = new ObjectOutputStream(fos);

            for(User user : users){
                oos.writeObject(user);
            }
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void readUsers() throws IOException, ClassNotFoundException{

        var fis =  new FileInputStream(db);
        var ois = new ObjectInputStream(fis);

        Object obj = null;
        try{
            while ((obj = ois.readObject()) != null){
//              CONVERSÃO DE TIPO. OBS : SÓ É POSSÍVEL QUANDO OS TIPOS TEM RELAÇÃO. EX :(QUALQUER CLASSE e Object)
                this.userList.add((User)obj);
            };
        }catch (EOFException e){}

    }

    public ArrayList<User> getUsers(){
        return this.userList;
    }

    public void addUser( User u){
        this.userList.add(u);
    }
}
