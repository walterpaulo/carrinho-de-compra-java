package br.com.supera.api.config;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BancoHSQLDB {
	private static EntityManagerFactory factory;
	static {
		factory = Persistence.createEntityManagerFactory("productDS");
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public static void close() {
		factory.close();
	}

}