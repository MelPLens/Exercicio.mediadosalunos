# Exercicio.mediadosalunos
Exercicio na linguagem java para calcular a media dos alunos com o peso das notas.
package Listaexercicios;
import java.util.Scanner;
public class mediaalunos2504 
{

public static void main (String[] args) 
{
@SuppressWarnings("resource")
Scanner ler = new Scanner (System.in);
double ac01, ac02 , avg11 , avf11 , mediafinal;// começo a inserir as informacoes para calcular a média das notas

System.out.printf("Digite sua nota da prova ac1 :");
ac01 = ler.nextDouble(); // fiz a escolha do double por ele ter uma precisão dupla para ter uma maior precisão nos calculos

System.out.printf("Digite sua nota da prova ac2 :");
ac02 = ler.nextDouble();

System.out.printf("Digite sua nota da prova avg :");
avg11 = ler.nextDouble();

System.out.printf("Digite sua nota da prova avf :");
avf11 = ler.nextDouble();

double ac011 = (ac01*0.15); // começo fazer os calculos pelo peso de notas de cada avaliacao e multiplicando com a nota que o aluno colocar.
double ac021 = (ac02*0.3);
double avg111 = (avg11*0.1);
double avf111 = (avf11*0.45);

mediafinal = (ac011+ac021+avg111+avf111);// logo depois do resultado pela multiplicacao, somo todas os calculos e por fim a nota final.

System.out.printf("Sua nota será :" + mediafinal);
}
}
