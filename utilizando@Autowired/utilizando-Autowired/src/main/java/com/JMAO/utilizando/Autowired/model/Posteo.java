
package com.JMAO.utilizando.Autowired.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Posteo {
    
   private Long id;
   private String nombrePost;
   private String autor;

   public Posteo() {
    }

   public Posteo(Long id, String nombrePost, String autor) {
        this.id = id;
        this.nombrePost = nombrePost;
        this.autor = autor;
    }
   
   
    
 }
