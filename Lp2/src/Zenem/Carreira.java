package Zenem;

public class Carreira {

    public String nome;
    public Curso[] curso = new Curso[4];
    public int insc;
    public int cand;
    
    
    
    public Carreira(){
        
    }

    public Carreira(String nome) {
        this.nome = nome;
    }

    public void setCurso(Curso[] c) {
        curso = c;

    }
    public Curso[] getCurso(){
        return curso;
    }
    public Curso getCurso1(int i){
        return curso[i];
    }

    public String getNome() {
        return nome;
    }

    public void setInscrito() {

        for (int i = 0; i < 4; i++) {
            insc+= curso[i].getInscritos();
        }
    }
    
    public int getInscrito(){
        return insc;
    }
    

    public void setCand() {
            for(int i=0;i<4;i++){
                cand+=curso[i].getCand();
            }
            
    }
    public int getCand(){
        return cand;
    }
    public boolean getMax(){
        return 4==curso.length;
    }
}
