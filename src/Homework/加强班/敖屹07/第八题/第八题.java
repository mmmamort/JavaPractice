package Homework.加强班.敖屹07.第八题;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 第八题 {
    public static void main(String[] args) {
        studyJava studyJava = new studyJava();
        ExecutorService teach = Executors.newFixedThreadPool(2, new NamedThreadFactory());
        teach.submit(studyJava);
        teach.submit(studyJava);
        teach.submit(studyJava);
        teach.shutdown();
    }
}
