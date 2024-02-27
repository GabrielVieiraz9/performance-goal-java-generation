package menu.repository;

import menu.model.Produto;

public interface MenuRepository {
	
	//CRUD do Produto
	public void procurarID(int identificacao);
	public void listarProdutos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int identificacao);
	
}
