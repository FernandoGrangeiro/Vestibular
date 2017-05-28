package Zenem;

import java.util.ArrayList;
import java.util.Arrays;

public class ZENEM {

    ArrayList<Candidato> candidatos = new ArrayList<>();
    ArrayList<Curso> cursos = new ArrayList<>();
    ArrayList<Carreira> carreiras = new ArrayList<>();

    public ZENEM() {

    }

    public void inscrever(Candidato c) {
        candidatos.add(c);

    }

    public void addCurso(Carreira[] car) {
        for (Carreira car1 : car) {
            for (int z = 0; z < 4; z++) {
                cursos.add(car1.getCurso1(z));
            }
        }
    }

    public void addCarreira(Carreira[] car) {
        carreiras.addAll(Arrays.asList(car));
    }

    public String CandInscCurs() {
        Curso c;

        for (int i = 0; i < cursos.size() - 1; i++) {
            for (int z = i; z < cursos.size(); z++) {
                if (cursos.get(i).getInscritos() < cursos.get(z+1).getInscritos()) {
                    c = cursos.get(z+1);
                    cursos.set(z+1, cursos.get(z));
                    cursos.set(z, c);

                }
            }
        }
        String n = "";
        for (int i = 0; i < cursos.size(); i++) {
            n += cursos.get(i).getNome() + "\n";
        }
        return n;
    }

    public String CandVagaCurs() {
        Curso c;

        for (int i = 0; i < cursos.size() - 1; i++) {
            for (int z = i; z < cursos.size(); z++) {
                if (cursos.get(i).getCand() < cursos.get(z+1).getCand()) {
                    c = cursos.get(z+1);
                    cursos.set(z+1, cursos.get(z));
                    cursos.set(z, c);

                }
            }
        }
        String n = "";
        for (int i = 0; i < cursos.size(); i++) {
            n += cursos.get(i).getNome() + "\n";
        }
        return n;
    }

    public String CandInscCarr() {
        Carreira c;

        for (int i = 0; i < carreiras.size() - 1; i++) {
            for (int z = i; z < carreiras.size(); z++) {
                if (carreiras.get(i).getInscrito() < carreiras.get(z+1).getInscrito()) {
                    c = carreiras.get(z+1);
                    carreiras.set(z+1, carreiras.get(z));
                    carreiras.set(z, c);

                }
            }
        }
        String n = "";
        for (int i = 0; i < carreiras.size(); i++) {
            n += carreiras.get(i).getNome() + "\n";
        }
        return n;
    }

    public String CandVagaCarr() {
        Carreira c;

        for (int i = 0; i < carreiras.size() - 1; i++) {
            for (int z = i; z < carreiras.size(); z++) {
                if (carreiras.get(z).getCand() < carreiras.get(z+1).getCand()) {
                    c = carreiras.get(z+1);
                    carreiras.set(z+1, carreiras.get(z));
                    carreiras.set(z, c);

                }
            }
        }
        String n = "";
        for (int i = 0; i < carreiras.size(); i++) {
            n += carreiras.get(i).getNome() + "\n";
        }
        return n;
    }

    public String PrimeiraEsco() {
        String z = "";
        for (int i = 0; i < candidatos.size(); i++) {
            z += (cursos.get(i).getNome());
            for (int j = 0; j < cursos.size(); j++) {
                if (candidatos.get(i).getCurso().equals(cursos.get(j).getNome())) {
                    z += ("\n" + candidatos.get(i).getNome());
                }
            }
        }
        return z;
    }
}
