package gennadziy.model;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Planets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name_planet;
    private String url_img;
    private String planet_type;
    private long distance;
    private double One_Way_Light_Time;
    private double Length_of_Year;
    private String descr;

}
