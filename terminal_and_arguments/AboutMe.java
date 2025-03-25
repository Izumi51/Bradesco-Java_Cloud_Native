package terminal_and_arguments;

/*
public Terminal
Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

Abra o MS-DOS ou Power Shell

Localize o diretório do seu projeto: cd C:\estudos\dio-trilha-java-basico\java-terminal

Acesse a pasta **** bin: ** cd bin**

Agora digite o comando:**java MinhaClasse ** (nome da sua classe sem a extensão .class)


Argumentos
Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [] de 
argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo:

No terminal

java MinhaClasse agumentoUm argumentoDois
*/
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
} 