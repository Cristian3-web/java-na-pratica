public class tipos {
     public static void main(String[] args) {

/*
tipos de dados primitivos
int, double, float, char, byte, short, long, boolean

*/
   int idade = 16;
   //numeros inteiros
   long numero=(long)125.390;
   // long é um tipo primitivo que armazena números inteiros grandes, usando 64 bits, útil para valores muito maiores que int.

      double salario =2.500;
   //numeros decimais 64bits
   float salarioFloat=(float)2500;
   //numeros decimais 32bits
   short valor=32000;
   // short é um tipo primitivo que armazena números inteiros pequenos, usando 16 bits, ideal para economizar memória quando os valores são pequenos.

   byte memoria=124;
   // byte é um tipo primitivo que armazena números inteiros muito pequenos, usando 8 bits, útil para economizar memória em grandes quantidades de dados.

        boolean verdadeiro = true;
        // boolean é um tipo primitivo que representa valores lógicos: true (verdadeiro) ou false (falso).

        char caractere='A';
        // char é um tipo primitivo que armazena um único caractere Unicode usando 16 bits, como letras, números ou símbolos.

        
//com execeção do boolean, todos são númericos e a diferença é a faixa de valores, e quanto eles podem amazernar
String nome="Cristian";
// String é um tipo de dado que representa uma sequência de caracteres, usado para armazenar texto



var nome2="Kaio";
System.out.println(nome2);
System.out.println(nome);
System.out.println("idade:" + idade+ "anos");
System.out.println(verdadeiro);
System.out.println(salario);
System.out.println(numero);
System.out.println(salarioFloat);
System.out.println(memoria);
System.out.println(valor);
System.out.println(caractere);
    }
}
