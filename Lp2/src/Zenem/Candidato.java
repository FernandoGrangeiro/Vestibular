package Zenem;

/**
 *
 * @author adm
 */
public class Candidato {

    public final String nome;
    public final String RG;
    public final String carreira;
    public String[] cursos = new String[3];

    public Candidato(String nome, String Rg, String carreira, String[] cursos) {
        this.nome = nome;
        this.RG = Rg;
        this.carreira = carreira;
        this.cursos = cursos;

    }
    public String getNome(){
        return nome;
    }
    public String getRG(){
        return RG;
    }
    public String getCurso(){
        return cursos[0];
    }
}
