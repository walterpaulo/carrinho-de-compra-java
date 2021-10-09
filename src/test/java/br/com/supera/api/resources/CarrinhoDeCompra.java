package br.com.supera.api.resources;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;






public class CarrinhoDeCompra {
	
	public static void main(String[] args) {
		
//		CarrinhoDeCompraDAO dao = new CarrinhoDeCompraDAO() ;
//		EntityManagerProvider emp = EntityManagerProvider.instance("productDS");
//		DBUnitRule dbUnitRule = DBUnitRule.instance(emp.connection());
//		em().createNativeQuery("INSERT INTO userinfo ( id, name, price, score,image)"
//                + " VALUES ( :a, :b, :c, :d, :e, :f)")
//                .setParameter("a", 312)
//                .setParameter("b", "Super Mario Odyssey")
//                .setParameter("c", 197.88)
//                .setParameter("d", 100)
//                .setParameter("e", "super-mario-odyssey.png");
//		System.err.println(dao.listar());;
		
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("productDS");
				entityManagerFactory.close();
		
		
		
		
		
	}

	
}
