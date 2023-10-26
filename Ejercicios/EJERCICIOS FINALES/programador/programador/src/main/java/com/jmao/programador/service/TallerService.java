
package com.jmao.programador.service;

import com.jmao.programador.model.Taller;
import com.jmao.programador.repository.ITallerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TallerService implements ITallerService{
    
    @Autowired
    ITallerRepository tallerRepo;

    @Override
    //Crear talleres
    public void saveTaller(Taller tall) {
        tallerRepo.save(tall);
        
    }

    @Override
    //Leer talleres
    public List<Taller> getTalleres() {
        List <Taller> listaTalleres = tallerRepo.findAll();
        return listaTalleres;
    }

    @Override
    public void dropTaller(Long id) {
        tallerRepo.deleteById(id);
    }

    @Override
    public Taller findTaller(Long id) {
        Taller tall = tallerRepo.findById(id).orElse(null);
        return tall;
    }

    @Override
    public void editTalleres(Taller tall) {
        this.saveTaller(tall);
        
    }

    @Override
    public List<Taller> getTalleresJava() {
        String palabra = "java";
        String palabraComparar;
        
       List<Taller> listaCursos = this.getTalleres();
       List<Taller> listaCursosJava = new ArrayList();
       
       for(Taller curso:listaCursos){
           palabraComparar = curso.getNombre().toLowerCase();
           boolean contieneJava = palabraComparar.contains(palabra);
           if (contieneJava == true){
               listaCursosJava.add(curso);
               
           }
       }
       return listaCursosJava;
    }

    @Override
    public List<Taller> getTalleresSQL() {
        String palabra = "SQL";
        String palabraComparar;
        
       List<Taller> listaCursos = this.getTalleres();
       List<Taller> listaCursosJava = new ArrayList();
       
       for(Taller curso:listaCursos){
           palabraComparar = curso.getNombre();
           boolean contieneSQL = palabraComparar.contains(palabra);
           if (contieneSQL == true){
               listaCursosJava.add(curso);
               
           }
       }
       return listaCursosJava;
        
        
    }

    

 }
    

