public class Fish extends Animal{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private FishLivEnv livingEnv;

    @Enumerated(EnumType.STRING)
    @Column(name = "environment")
    private FishEnvironment environment;

}