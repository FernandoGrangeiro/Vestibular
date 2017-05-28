package Zenem;

public class Curso {
    public String nome;
    public int vagas;
    public String carreira;
    public int inscritos;
    
    public Curso(String nome,int vagas,String carreira){
     this.nome=nome;
     this.vagas=vagas;
     this.carreira=carreira;
    }
    public Curso(){
        
    }
    public int getVagas(){
        return vagas;
    }
    public int getInscritos(){
     return inscritos;   
    }
    public int getCand(){
        return inscritos/vagas;
    }
    
    public void aumInsc(){
        inscritos++;
    }
    
    public String getNome(){
     return nome;   
    }
    
    
    
}
