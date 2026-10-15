package techlearn;

import techlearn.composite.Aula;
import techlearn.composite.ComponenteCatalogo;
import techlearn.iterator.Iterator;

//Resolução do Passo 5:  Desafio de Extensão Prática.

public class FiltroConteudo {
    public static void filtrarAulasCurtas(
            ComponenteCatalogo componente) {

        if (componente instanceof Aula) {
            if (componente.getDuracaoMinutos() <= 45) {
                componente.exibirDetalhes();
            }
            return;
        }

        Iterator<ComponenteCatalogo> iterator =
                componente.criarIterator();

        while (iterator.hasNext()) {
            filtrarAulasCurtas(iterator.next());
        }
    }
}
