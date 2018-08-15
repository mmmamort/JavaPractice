package Homework.加强班.敖屹07.第八题;

import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory implements ThreadFactory {
    private AtomicInteger tag = new AtomicInteger(0);
    private ArrayList<Character> name = new ArrayList<>();
    private char nameCode = '王';

    @Override
    public Thread newThread(Runnable r) {
        int number = tag.getAndIncrement();
        while (number + 1 > name.size()) {
            name.add(nameCode);
            nameCode += 1;
        }
        Thread thread = new Thread(r);
        thread.setName(name.get(number) + "老师");
        return thread;
    }
}
