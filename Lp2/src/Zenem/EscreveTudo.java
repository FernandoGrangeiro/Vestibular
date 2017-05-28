package Zenem;


import java.io.*;

public class EscreveTudo {
    public EscreveTudo(){
        
    }
    
    public void escrevecand(String n)  throws IOException, FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("candidatos5.txt", true);
        try (PrintWriter pw = new PrintWriter(fos)) {
            pw.print(n);
        }
    }
    
    public void escrevecurso(String n) throws IOException, FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("curso5.txt", true);
        try (PrintWriter pw = new PrintWriter(fos)) {
            pw.print(n);
        }
        
    }
    public void escrevecarre(String n) throws IOException, FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("carreiras5.txt", true);
        try (PrintWriter pw = new PrintWriter(fos)) {
            pw.print(n);
        }
        
    }
}
