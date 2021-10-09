package br.com.supera.api.DAO;

import static com.github.dbunit.rules.util.EntityManagerProvider.em;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import com.github.dbunit.rules.DBUnitRule;
import com.github.dbunit.rules.api.configuration.DBUnit;
import com.github.dbunit.rules.api.dataset.DataSet;
import com.github.dbunit.rules.util.EntityManagerProvider;

import br.com.supera.api.models.Product;

@DBUnit(allowEmptyFields = true)
@DataSet("products.yml")
public class CarrinhoDeCompraDAO {
	
//	
//	public List<Product> listar(){
//		
//		EntityManagerProvider emp = EntityManagerProvider.instance("productDS");
//		DBUnitRule dbUnitRule = DBUnitRule.instance(emp.connection());
//		
//		List<Product> products = em().createQuery("select p from Product p").getResultList();
//		assertNotNull(products);
//		return products;
//	}

}
