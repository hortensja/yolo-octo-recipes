package me.krasun.recipes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "food")
public class Ingredient {

    @Id
    private String id;

    @Field("Food Name")
    private String name;

    @Field("Food Group")
    private String group;

    @Field("Database Number")
    private int dbNumber;


}
