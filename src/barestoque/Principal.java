
package barestoque;

import barestoque.view.InicializadorLookAndFeel;
import barestoque.view.Janela;
import barestoque.view.telas.TelaInicial;
import barestoque.view.telas.cliente.TelaClienteLista;
import barestoque.view.telas.fornecedor.TelaFornecedorLista;
import barestoque.view.telas.produto.TelaProdutoCadastro;
import javax.swing.SwingUtilities;
public class Principal
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            new InicializadorLookAndFeel ().init();
            Janela j = new Janela ("Teste", 1280, 768, false);
            j.aparecer();
            j.setCena(new TelaClienteLista(j));
        });
    }
}