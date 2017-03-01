package com.theironyard.novauc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by JacobP on 2/16/17.
 */
public class Main {

    public Main(Integer integer, String column, String column1, Object column2, String column3, String column4) {
    }

    public static void main(String[] args) throws IOException {

        HashMap<String, ArrayList<Person>> users = new HashMap<>();


//read all posts into our data structure
        File f = new File("people.txt"); // used to import file
        Scanner fileScanner = new Scanner(f); // used to read the file
//            ArrayList<Person> people = new ArrayList<>();


        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            String[] columns = line.split("\\,");

            Person p = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);




            if (users.containsKey(p.country)) {
                users.get(p.country).add(p);
            } else {
                users.put(p.country, new ArrayList<>());
                users.get(p.country).add(p);
            }
            System.out.println(p + " ");

        }

       File map = new File("people.json");
//
//
        // write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.deep(true).serialize(users);
        FileWriter fw = new FileWriter(map);
        fw.write(json);
        fw.close();

    }
}































