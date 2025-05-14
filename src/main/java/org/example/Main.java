package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Resume resume = new Resume(
                "Nurbaev Rasulbek ",
                " izatbeisheev5@gmail.com",
                "345678",
                "High school certificate",
                "5 years at Google",
                "Java, Spring, SQL"
        );

        System.out.println(resume);
        List<Resume> resumeList = new ArrayList<>();
        resumeList.add(resume);

        Filehander.saveResumesToFile(resumeList);
    }
}
