package projeto201.conteudo.java02poo.aula09exerciciosavancadosepraticos.ex01historicodecompras.repository;

import projeto201.conteudo.java02poo.aula09exerciciosavancadosepraticos.ex01historicodecompras.domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto p){
        produtos.add(p);
    }

    public List<Produto> listarTodos() {
        return produtos;
    }

    public Produto buscarporId(int id){
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);

    }

    public void remover(int id){
        produtos.removeIf(p -> p.getId() == id);
    }

    public void atualizar(Produto p){
        remover(p.getId());
        salvar(p);
    }
}
