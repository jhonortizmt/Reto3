/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioJuego {
    
    @Autowired
    private InterfaceJuego crud;

    public List<Juego> getAll(){
        return (List<Juego>) crud.findAll();
    }

    public Optional<Juego> getBike(int id){
        return crud.findById(id);
    }

    public Juego save(Juego bike){
        return crud.save(bike);
    }
    public void delete(Juego bike){
        crud.delete(bike);
    }
    
}
