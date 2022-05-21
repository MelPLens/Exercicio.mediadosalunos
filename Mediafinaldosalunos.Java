package Listaexercicios;
import java.util.Scanner;
public class mediaalunos2504 
{

public static void main (String[] args) 
{
@SuppressWarnings("resource")
Scanner ler = new Scanner (System.in);

double // Faço a escolha do double por ele possuir uma precisao dupla para calculos mais extensos.
ac01, 
ac02 , 
avg11 , 
avf11 , 
mediafinal;

System.out.printf("Digite sua nota da prova ac1 :"); // o usuario vai inserir sua nota
ac01 = ler.nextDouble(); 

System.out.printf("Digite sua nota da prova ac2 :");
ac02 = ler.nextDouble();

System.out.printf("Digite sua nota da prova avg :");
avg11 = ler.nextDouble();

System.out.printf("Digite sua nota da prova avf :");
avf11 = ler.nextDouble();

//depois de possuir todas as infomações necessarias,começo fazer os calculos pelo peso de notas de cada avaliacao e multiplicando com a nota que o aluno colocar.

ac01 = (ac01*0.15); 
ac02 = (ac02*0.3);
avg11 = (avg11*0.1);
avf11 = (avf11*0.45);

mediafinal = (ac01+ac02+avg11+avf11);// logo depois do resultado pela multiplicacao, somo todas os calculos e por fim a nota final.

System.out.printf("Sua nota será :" + mediafinal); //portanto, imprimo a mensagem para o usuario + o calculo da sua media final.
}
}
