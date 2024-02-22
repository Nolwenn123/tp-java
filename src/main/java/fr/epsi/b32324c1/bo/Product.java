import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "label")
    private String label;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ProdType type;

    @Column(name = "price")
    private Double price;

    @ManyToMany(mappedBy = "products")
    private Set<PetStore> petStores;

    // Getters and setters
}
