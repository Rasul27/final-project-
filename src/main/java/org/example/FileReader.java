package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class FileReader {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream((new FileInputStream("resumes.dat")))) {
            List<Resume> resumes = (List<Resume>) in.readObject();
            for (Resume r: resumes) {
                System.out.println(r);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
