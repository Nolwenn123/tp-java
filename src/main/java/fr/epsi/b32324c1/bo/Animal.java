import javax.persistence.*;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "birth")
    private String birth;

    @Column(name = "couleur")
    private String couleur;

    @ManyToOne
    @JoinColumn(name = "petstore_id")
    private PetStore petStore;

    // Getters and setters
}