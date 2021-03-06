package com.kingshuk.designpatterns.soliddesignprinciples;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Class created to demonstrate the use of the SRP - Single Responsibility Principle
 * Created by CO21321 on 2/26/2018.
 */
class Journal
{
    private final List<String> entries = new ArrayList<>();

    private static int count = 0;

    public void addEntry(String text)
    {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index)
    {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return System.lineSeparator().concat(entries.toString());
    }

    // here we break SRP
    public void save(String filename) throws Exception
    {
        try (PrintStream out = new PrintStream(filename))
        {
            out.println(toString());
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}
}

// handles the responsibility of persisting objects
class Persistence
{
    public void saveToFile(Journal journal,
                           String filename, boolean overwrite) throws Exception
    {
        if (overwrite || new File(filename).exists())
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
    }

    public void load(Journal journal, String filename) {}
    public void load(Journal journal, URL url) {}
}

public class SingleResponsibilityPrincipleDemo {
    public static void main(String[] args) throws Exception
    {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        
        //Loading file name from scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the full path and file name:");
        
        String filename = scanner.next();
        p.saveToFile(j, filename, true);
        
        scanner.close();

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
