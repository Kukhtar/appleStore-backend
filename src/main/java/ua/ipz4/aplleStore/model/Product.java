package ua.ipz4.aplleStore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Long authorId;
    private String[] photoList;
    @ManyToOne
    @JoinColumn(name="card_id", nullable=true)
    private Card card;
    @OneToOne(cascade=CascadeType.ALL)
    private Characters characters;


}
