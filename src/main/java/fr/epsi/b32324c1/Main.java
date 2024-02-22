package fr.epsi.b32324c1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    // Exemple d'insertion pour Product
    Product product1 = new Product();
    product1.setCode("code1");
    product1.setLabel("label1");
    product1.setType(ProdType.TYPE1);
    product1.setPrice(10.0);
    entityManager.persist(product1);
    entityManager.getTransaction().commit();
    entityManager.close();

    String jpql = "SELECT a FROM Animal a WHERE a.petStore = :petStore";
    List<Animal> animals = entityManager.createQuery(jpql, Animal.class)
            .setParameter("petStore", petStore)
            .getResultList();

    List<Animal> animals = query.getResultList();
    entityManager.close();


}