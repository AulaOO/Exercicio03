/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.calculaArea();
        retangulo.calculaPerimetro();
        if(retangulo.testaComprimento() == true){
            System.out.println("O comprimento é um número de ponto flutuante maior que 0.0 e menor que 20.0");
        }
        else{
           System.out.println("O comprimento não é um número de ponto flutuante maior que 0.0 e menor que 20.0"); 
        }
        if(retangulo.testaLargura() == true){
            System.out.println("A largura é um número de ponto flutuante maior que 0.0 e menor que 20.0");
        }
        else{
            System.out.println("A largura não é um número de ponto flutuante maior que 0.0 e menor que 20.0");
        }
    }
    
}
