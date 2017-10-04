/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.clas;

import id.co.indocyber.table.Person;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ReloadNasabah {
    
    
    public static List<Person> InputFileNasabah(String name) throws FileNotFoundException, IOException{ 
    List<Person> people = new ArrayList<>();
        File file = new File(name);
        FileReader fileReader = new FileReader(file); 
        BufferedReader reader = new BufferedReader(fileReader);
        
        String line=null;
        while((line=reader.readLine())!=null){
            String[] arrayModel=line.split(",");
            Person person;
        person = new Person(
                arrayModel[0],
                arrayModel[1].trim(),
                arrayModel[2].trim(),
                Integer.parseInt(arrayModel[3].trim()),
                arrayModel[4],
                Double.parseDouble(arrayModel[5].trim()),
                Integer.parseInt(arrayModel[6].trim()),
                Double.parseDouble(arrayModel[7].trim()),
                Double.parseDouble(arrayModel[8].trim()),
                Double.parseDouble(arrayModel[9].trim()),
                Integer.parseInt(arrayModel[10].trim()));
            people.add(person);
        }
    
    return people;
    
    }    
}
