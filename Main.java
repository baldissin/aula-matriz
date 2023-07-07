import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //Aluno[] alunosOng = new Aluno[3];
        List<Aluno> alunosOng = new ArrayList<>();
        //Aluno1, Aluno2, Aluno3

        while (true){
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            if (nome.equals("SAIR")){
                break;
            }
            String nota = JOptionPane.showInputDialog("Digite a nota: ");
            Aluno aluno = new Aluno(nome,Double.parseDouble(nota));
            alunosOng.add(aluno);
        }

        //procurar a maior nota com for
        double maiorNota = 0;
        for (Aluno aluno : alunosOng) { //for(int i =0; i< alunosOng.size(); i++){
            if (maiorNota < aluno.getNota()) {
                maiorNota = aluno.getNota();
            }
        }
        JOptionPane.showMessageDialog(null, "A maior nota calculada com FOR é: " + maiorNota);

        maiorNota = 0;

        int i = 0;
        while(i < alunosOng.size()){
            if(maiorNota < alunosOng.get(i).getNota()){
                maiorNota = alunosOng.get(i).getNota();
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "A maior nota calculada com WHILE é: " + maiorNota);

        int j = 0;
        do {
            if(maiorNota < alunosOng.get(j).getNota()){
                maiorNota = alunosOng.get(j).getNota();
            }
            j++;
        }while(j < alunosOng.size());
        JOptionPane.showMessageDialog(null, "A maior nota calculada com DO-WHILE é: " + maiorNota);

    }
}
