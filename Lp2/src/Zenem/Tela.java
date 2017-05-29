package Zenem;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Tela {

    public static void main(String[] args) throws IOException {

        ZENEM v = new ZENEM();
        int x = 0;
        Carreira[] car = new Carreira[3];

        int op = JOptionPane.showOptionDialog(null, "Bem Vindo ao ZENEM\nGostaria de se inscrever?", "ZENEM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, null, null);

        if (op == JOptionPane.YES_OPTION) {
            String[] msg = {"Arquivo", "Manual"};
            op = JOptionPane.showOptionDialog(null, "Bem Vindo ao ZENEM\nGostaria de se inscrever?", "ZENEM", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, msg, msg[0]);
            if (op == 0) {
                LerTudo lt = new LerTudo();
                String nome = JOptionPane.showInputDialog("Digite o Nome do Arquivo de Carreiras para abrir");
                car = lt.lerCarreira(nome);
                nome = JOptionPane.showInputDialog("Digite o Nome do Arquivo de Curso para abrir");
                lt.lerCurso(nome, car);
                nome = JOptionPane.showInputDialog("Digite o Nome do Arquivo de Candidatos para abrir");
                lt.lerAluno(nome, v, car);

            }
            do {

                int conti = 0;

                if (op == 1) {
                    do {

                        String nome = JOptionPane.showInputDialog("Digite o nome da carreira");
                        Carreira carr = new Carreira(nome);
                        car[conti] = carr;
                        conti++;
                    } while (conti < 3);
                    int i1 = 0, i2 = 0, i3 = 0;
                    Curso[] a1 = new Curso[4];
                    Curso[] a2 = new Curso[4];
                    Curso[] a3 = new Curso[4];
                    do {
                        String nome = JOptionPane.showInputDialog("Digite o nome do curso");
                        if(nome.equals("")){
                            nome = JOptionPane.showInputDialog("Digite o nome do curso");
                        }
                        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vagas?"));
                        String care = JOptionPane.showInputDialog("A qual carreira esse curso pertence ?" + car[0].getNome() + " " + car[1].getNome() + " " + car[2].getNome());
                        if(care.equals("")){
                            care = JOptionPane.showInputDialog("A qual carreira esse curso pertence ?" + car[0].getNome() + " " + car[1].getNome() + " " + car[2].getNome());
                        }
                    
                        Curso cur = new Curso(nome, num, care);

                        if (care.equals(car[0].getNome())) {
                            a1[i1] = cur;
                            i1++;
                        }
                        if (care.equals(car[1].getNome())) {
                            a2[i2] = cur;
                            i2++;
                        }
                        if (care.equals(car[2].getNome())) {
                            a3[i3] = cur;
                            i3++;
                        }

                    } while (i1 < 4 && i2 < 4 && i3 < 4);
                    car[0].setCurso(a1);
                    car[1].setCurso(a2);
                    car[2].setCurso(a3);

                    String nome = JOptionPane.showInputDialog("Digite Seu Nome");
                    if (nome.equals("")) {
                        do {
                            nome = JOptionPane.showInputDialog("Campo nao pode estar vazio");
                        } while (nome.equals(""));
                    }

                    String RG = JOptionPane.showInputDialog("Digite seu RG");
                    if (RG.equals("") || RG.length() < 9 || RG.length() > 9 || !v.veriRg(RG)) {
                        do {
                            RG = JOptionPane.showInputDialog("RG tamanho incorreto ou vazio");
                        } while ((RG.equals("") || RG.length() < 9 || RG.length() > 9 || !v.veriRg(RG)));
                    }

                    int opca = Integer.parseInt(JOptionPane.showInputDialog("Escolha a carreira que voce quer \n1-" + car[0].getNome() + "\n2-" + car[1].getNome() + "\n3-" + car[2].getNome()));
                    int cont = 0;
                    String ca = "";
                    String[] cursos = new String[3];
                    if (opca == 1) {
                        ca = car[0].getNome();

                        do {
                            int opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha entre esses cursos\n1-" + car[0].curso[0].getNome()) + "/n2-" + car[0].curso[1].getNome() + "/n3-" + car[0].curso[2].getNome() + "/n4-" + car[0].curso[3].getNome()+"\n"+cont);
                            if (opc == 1) {
                                cursos[cont] = car[0].curso[0].getNome();
                                car[0].curso[0].aumInsc();
                            }
                            if (opc == 2) {
                                cursos[cont] = car[0].curso[1].getNome();
                                car[0].curso[1].aumInsc();
                            }
                            if (opc == 3) {
                                cursos[cont] = car[0].curso[2].getNome();
                                car[0].curso[2].aumInsc();
                            }
                            if (opc == 4) {
                                cursos[cont] = car[0].curso[3].getNome();
                                car[0].curso[3].aumInsc();
                            }

                            cont++;

                        } while (cont < 3);

                    }
                    if (opca == 2) {
                        ca = car[1].getNome();
                        do {
                            int opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha entre esses cursos\n1-" + car[1].curso[0].getNome()) + "/n2-" + car[1].curso[1].getNome() + "/n3-" + car[1].curso[2].getNome() + "/n4-" + car[1].curso[3].getNome());
                            if (opc == 1) {
                                cursos[cont] = car[1].curso[0].getNome();
                                car[1].curso[0].aumInsc();
                            }
                            if (opc == 2) {
                                cursos[cont] = car[1].curso[1].getNome();
                                car[1].curso[1].aumInsc();
                            }
                            if (opc == 3) {
                                cursos[cont] = car[1].curso[2].getNome();
                                car[1].curso[2].aumInsc();
                            }
                            if (opc == 4) {
                                cursos[cont] = car[1].curso[3].getNome();
                                car[1].curso[3].aumInsc();
                            }
                            cont++;

                        } while (cont < 3);

                    }
                    if (opca == 3) {
                        ca = car[2].getNome();
                        do {
                            int opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha entre esses cursos"));
                            if (opc == 1) {
                                cursos[cont] = car[2].curso[0].getNome();
                                car[2].curso[0].aumInsc();
                            }
                            if (opc == 2) {
                                cursos[cont] = car[2].curso[1].getNome();
                                car[2].curso[1].aumInsc();
                            }
                            if (opc == 3) {
                                cursos[cont] = car[2].curso[2].getNome();
                                car[2].curso[3].aumInsc();
                            }
                            if (opc == 4) {
                                cursos[cont] = car[2].curso[3].getNome();
                                car[2].curso[3].aumInsc();
                            }
                            cont++;

                        } while (cont < 3);

                    }

                    Candidato c = new Candidato(nome, RG, ca, cursos);

                    v.inscrever(c);
                }

                car[0].setInscrito();
                car[1].setInscrito();
                car[2].setInscrito();
                v.addCarreira(car);
                v.addCurso(car);

                x = JOptionPane.showOptionDialog(null, "Gostaria de continuar se inscrevendo?", "ZENEM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

            } while (x == JOptionPane.YES_OPTION);
        } 
        int es;
        EscreveTudo et = new EscreveTudo();
        do {
            String[] msg = {"COCI","COCV","CACI","CACV","LCCPO","Sair"};
            es = JOptionPane.showOptionDialog(null, "Cursos Ordenados pelo numero de candidatos inscritos\nCursos Ordenados pelo numero de candidatos por vagas\nCarreiras ordenadas pelo numero de candidatos inscritos \nCarreiras Ordenadas pelo numero de candidatos por vaga\nListar cada curso com os nomes das pessoas que escolheram o curso como primeira opcao\n Sair", "ZENEM", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, msg, msg[0]);

            if (es == 0) {
                JOptionPane.showMessageDialog(null, v.CandInscCurs());
                et.escrevecurso(v.CandInscCurs());
            }

            if (es == 1) {
                JOptionPane.showMessageDialog(null, v.CandVagaCurs());
                et.escrevecurso(v.CandVagaCurs());
            }
            if (es == 2) {
                JOptionPane.showMessageDialog(null, v.CandInscCarr());
                et.escrevecarre(v.CandInscCarr());
            }
            if (es == 3) {
                JOptionPane.showMessageDialog(null, v.CandVagaCarr());
                et.escrevecarre(v.CandVagaCarr());
            }
            if (es == 4) {
                JOptionPane.showMessageDialog(null, v.PrimeiraEsco());
                et.escrevecand(v.PrimeiraEsco());
            }

        } while (es < 5);
        JOptionPane.showMessageDialog(null, "Obrigado");
    }

}
