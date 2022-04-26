package application.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="Generos")

public class Genero {
    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)

    private int id;
    private String nome;

    public void setId(String id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}