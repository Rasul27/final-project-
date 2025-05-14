 package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Filehander {

    private static final String FILE_NAME = "resumes.dat";


    public static void saveResumesToFile(List<Resume> newResumes) {
        List<Resume> existingResumes = loadResumesFromFile();

        existingResumes.addAll(newResumes); // add new ones

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(existingResumes); // save the full updated list
            System.out.println("✅ All resumes have been successfully saved.");
        } catch (IOException e) {
            System.out.println("❌ Error while saving resumes: " + e.getMessage());
        }
    }


    public static List<Resume> loadResumesFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Resume>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("⚠️ Error while loading resumes: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
