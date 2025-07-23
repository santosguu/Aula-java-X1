package com.ramoscodev;

import com.ramoscodev.classes.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // variavel
        // tipo nome = valor;
        int idade = 30;
        int resultados = 0;

        String nome = "Gustavo";
        Pessoa pessoa = new Pessoa( "Gustavo", 16 , "Tio" );

        System.out.println("Nome Completo" + nomeCompleto() );
        System.out.println("Soma: " + somar( 10, 20 ));

        System.out.println( "Nome: " + nome );
        System.out.println( "Pessoa: " + pessoa );
        System.out.println( "Nome da Pessoa: " + pessoa.getNome() );
        System.out.println( "Idade da Pessoa: " + pessoa.getIdade() );


        System.out.println( "Idade: " + idade );

        System.out.println( "Hello World!" );
    }

    public static String nomeCompleto() {
        return "Ramos Codev";
    }


    public static int somar( int nro1, int nro2) {
        return nro1 + nro2;
    }
}
