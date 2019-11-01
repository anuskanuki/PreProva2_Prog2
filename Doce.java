/*
Anuska Kepler e Vitor Bona
 */

package PreProva2_Prog2;


public class Doce {
    
    private int codigo;
    private String nome;
    private float preco;

    /*
    Construtor
    */

    public Doce(int codigo, String nome, float preco) {
        setCodigo(this.codigo);
        setNome(this.nome);
        setPreco(this.preco);
    }
    
    
    
    /*
    Getters e Setters
    */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo<0){
            throw new IllegalArgumentException("Codigo de doce invalido. Espera-se numero maior que zero.");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null||nome.length()<2){
            throw new IllegalArgumentException("Nome de doce invalido. Espera-se nome nao nulo maior de 2 caracteres. ");
        }
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco<0){
             throw new IllegalArgumentException("Preco de doce invalido. Espera-se preco maior que zero. ");
        }
        this.preco = preco;
    }
    
    
    
    

}
