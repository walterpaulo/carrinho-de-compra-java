package br.com.supera.api.util;

import javax.persistence.EntityManager;

public class Conexao {
	private static final String PERSISTENCE_UNIT = "RESOURCE_LOCAL";
	private static ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<EntityManager>();
}
