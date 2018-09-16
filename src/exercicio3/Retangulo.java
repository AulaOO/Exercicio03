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
public class Retangulo {
    private float altura;
    private float largura;
    private float comprimento;

    public Retangulo() {
        altura = 1;
        largura = 1;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float calculaPerimetro(){
        float perimetro = 2*(comprimento + largura);
        return perimetro;
    }
    
    public float calculaArea(){
        float area = largura * altura;
        return area;
    }
    
    public boolean testaComprimento(){
        if((comprimento > 0) && (comprimento < 20)){
            return true;
        }
        else{
            return false;
        }
    }
    
        public boolean testaLargura(){
        if((largura > 0) && (largura < 20)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
    
}
