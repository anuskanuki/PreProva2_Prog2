/*
Anuska Kepler e Vitor Bona
 */

package PreProva2_Prog2;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<Doce> docesComprados;

    public Cliente(String nome) {
        setNome(this.nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null||nome.length()<=1){
            throw new IllegalArgumentException("Nome de cliente invalido. Espera-se um nome nao nulo e maior que 1 caractere");
        }
        this.nome = nome;
    }

    public ArrayList<Doce> getDocesComprados() {
        return docesComprados;
    }

    public void addDoce(Doce doceAdicionado) {
           if(doceAdicionado==null){
            throw new IllegalArgumentException("Doce invalido. Espera-se um doce nao nulo para ser adicionado");
        }
        docesComprados.add(doceAdicionado);
    }
    
    public float totalCompra(){
        float total=0;
        
        getDocesComprados();
        
        return total;
    }
    
    
    
    
}
