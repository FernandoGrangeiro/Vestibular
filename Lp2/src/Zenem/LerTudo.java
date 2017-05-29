package Zenem;

import java.io.*;

public class LerTudo {

    public LerTudo() {

    }

    public void lerCurso(String nomearq, Carreira[] c) throws IOException, FileNotFoundException {
        FileReader fr = new FileReader(nomearq);
        BufferedReader br = new BufferedReader(fr);
            String linha;
            int i = 0, i1 = 0, i2 = 0, i3 = 0;
            Curso cur;
            Curso[] ex = new Curso[5];
            Curso[] hum = new Curso[5];
            Curso[] bio = new Curso[5];
            while ((linha = br.readLine()) != null) {
                String[] info = linha.split(";");
                String nome = info[0];
                int qtddVaga = Integer.parseInt(info[1]);
                String carreira = info[2];
                cur = new Curso(nome, qtddVaga, carreira);
                if (cur.carreira.equals(c[0].getNome())) {
                    ex[i1] = cur;
                    i1++;
                }
                if (cur.carreira.equals(c[1].getNome())) {
                    hum[i2] = cur;
                    i2++;
                }
                if (cur.carreira.equals(c[2].getNome())) {
                    bio[i3] = cur;
                    i3++;
                }
                i++;
            }  
            c[0].setCurso(ex);
            c[1].setCurso(hum);
            c[2].setCurso(bio);
        
        br.close();
    }

    public Carreira[] lerCarreira(String nomearq) throws IOException, FileNotFoundException {
        Carreira[] ca = new Carreira[3];

        FileReader fr = new FileReader(nomearq);
        BufferedReader br = new BufferedReader(fr);
        String linha;
        int i = 0;
        Carreira c;

        while ((linha = br.readLine()) != null) {
            String[] info = linha.split(";");
            String nome = info[0];
            c = new Carreira(nome);
            ca[i] = c;
            i++;
        }
        br.close();
        return ca;
    }

    public void lerAluno(String nomearq, ZENEM v, Carreira[] ca) throws IOException, FileNotFoundException {
        FileReader fr = new FileReader(nomearq);
        BufferedReader br = new BufferedReader(fr);
            String linha;
            String[] cursoA = new String[3];
            while ((linha = br.readLine()) != null) {
                String[] info = linha.split(";");
                String nome = info[0];
                String RG = info[1];
                String carreiraEscolhida = info[2];
                cursoA[0] = info[3];
                cursoA[1] = info[4];
                cursoA[2] = info[5];
                Candidato c = new Candidato(nome, RG, carreiraEscolhida, cursoA);
                for (String cursoA1 : cursoA) {
                    for (Carreira ca1 : ca) {
                        for (Curso curso : ca1.curso) {
                            if (cursoA1.equals(curso.getNome())) {
                                curso.aumInsc();
                            }
                        }
                    }
                }
                
                v.inscrever(c);
                
            }
            br.close();
        }
    }

