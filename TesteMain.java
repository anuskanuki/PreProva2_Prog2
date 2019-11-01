/*
Anuska Kepler e Vitor Bona
 */

package PreProva2_Prog2;


public class TesteMain {
    
    
Arquivo arquivo = new Arquivo();
Cliente c1 = new Cliente("Carla");


 c1.addDoce(new Doce(1, “Bala de Goma”, 1f);
 c1.addDoce(new Doce(2, “Bolo de amora”, 10f);
 arquivo.salvar(“Dia 1”, “Arquivo01”, c1);
 Cliente c2=new Cliente("Josué");
 c2.addDoce(new Doce(1, “Bala de Goma”, 1f);
 arquivo.salvar(“Dia 1”, “Arquivo01”, c2);
 Cliente cliente = arquivo.ler(“Dia 1”, “Arquivo01”);
 System.out.println(cliente.toString());

 ArrayList<Cliente> clientes = arquivo.lerLista(“Dia 1”, “Arquivo01”);
 for (Cliente cli: clientes) {
 System.out.println(cli.toString());
 }
 String arquivos = arquivo.listarDiretorios(“Dia 1”);
 System.out.println(arquivos);
 
 
 
}
