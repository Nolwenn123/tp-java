package fr.epsi.b32324c1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    String jpa = "SELECT a FROM Animal a WHERE a.petStore = :petStore";

    Product product = new Product();
        id.setId(12345);
    Code.setCode(12345);
    entityManager.persist(Product);

        Petstore petstore = new Petstore();
        id.setId(123);
        name.setName("PetSheep");
        entityManager.persist(petstore);

        Animal animal = new Animal();
        Id.setId("hjkhjk");
        birth.setBirth("12/05/2002");
        couleur.setCouleur("bleu");
        entityManager.persist();

}