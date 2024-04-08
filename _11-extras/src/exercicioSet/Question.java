package exercicioSet;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question {

    public static void main(String[] args) {

        try{
            File file = new File("log.txt");
            var reader = new BufferedReader(new FileReader(file));

            String s;
            Set<LogEntry> logs = new HashSet<>();
            System.out.println("__________________________________");
            while ((s = reader.readLine()) != null){
                System.out.println(s);
                String[] fields = s.split(" ");
                String user = fields[0];
                String time = fields[1];
                logs.add(new LogEntry(user,time));
            }
            System.out.println("__________________________________");
            reader.close();

            Set<LogEntry> accesses = new HashSet<>();

            logs.forEach(log ->{
//               PENDENTE VERIFICAÇÃO SE EXISTE UM ITEM NA SET ACCESS COM O MESMO NOME DO LOG ATUAL
//               VER AULA DE IGUALDADE
            });



        }catch (IOException e){

        }

    }
}
