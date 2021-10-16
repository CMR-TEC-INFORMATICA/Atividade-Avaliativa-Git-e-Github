/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projgitgithub;

import java.util.Scanner;

/**
 *
 * @author crism
 */
public class ProjGitGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "."; 
        
            Scanner LerTeclado = new Scanner(System.in);
                
                System.out.println("Qual é o seu nome?: ");
                
                    nome = LerTeclado.nextLine();
        
                System.out.println();
        
                System.out.println("Olá" + "," + nome + "!");  
                
    } 
}

