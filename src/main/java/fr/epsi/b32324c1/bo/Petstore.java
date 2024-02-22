import javax.persistence.*;

@Entity
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "manager_name")
    private String managerName;

    @ManyToMany
    @JoinTable(
            name = "petstore_product",
            joinColumns = @JoinColumn(name = "petstore_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "petStore", cascade = CascadeType.ALL)
    private Set<Animal> animals;

    // Getters and setters
}
