package displaymvcdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * class to hold a list of type Student and associated methods
 */
public class StudentList {

    private final List<Student> students;

    /**
     * creates a new ArrayList to hold students and then
     * fills that list with three students
     */
    public StudentList() throws FileNotFoundException {
        students = new ArrayList<>();
        addInitialStudentsToList();
    }

    private void addInitialStudentsToList() throws FileNotFoundException{
        // TODO: replace the three hard-coded lines below
        // with code that reads the data from the (included) file students.txt
        // and populates the ArrayList students appropriately
        
        //Ritvik Kumar Kothapalli - Author
        File f = new File("students.txt");
        Scanner scF = new Scanner(f);
        while (scF.hasNext()) {
            String record  = scF.nextLine();
            Scanner scR = new Scanner(record);
            String clientName;
            clientName = scR.next();
            
            
            
                    
        }

        
        
                
  
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
}
