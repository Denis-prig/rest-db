package com.arishin.restdb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {
    @Id
    private String id;
    private  String name;

   public Coffee(String name){
       this(UUID.randomUUID().toString(), name);
   }
}
