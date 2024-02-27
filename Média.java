// Esse código foi criado para calcular sua média final e ver se você passou de ano

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        System.out.print("Bem vindo, escreva seu nome\n");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();//aqui lê o seu nome
        
        System.out.print("Escreva sua 4 notas bimestrais\n");
        double n1 = sc.nextDouble();//sua primeira nota
        double n2 = sc.nextDouble();//sua segunda nota
        double n3 = sc.nextDouble();// sua terceira nota
        double n4 = sc.nextDouble();// sua quarta nota
        double n = (n1 + n2 + n3 + n4)/4;//Calcular sua Mota final
        if(n <= 10){
           System.out.print(name+" sua nota final é: " +n );//Aqui diz sua nota final
        }else{// caso os valores seja maiores que 10 pede que faça novamente 
            System.out.print("escreva novamente ");
        }
        
        if(n == 10){
            System.out.print("\nPassou com exito");
        }// caso sua média foi acima de 6 ou um 6 ele diz que você passou de ano
        else if(n >= 6){
            System.out.print("\nPassou de nao");
        }// caso sua média for menor que 6 ele diz que você não passou de ano e precisoa fazer recuperação 
        else if(n < 6){
            System.out.print("\nNão passou de ano, terá que fazer recuperação ");
        }
        
    }
    
}
