/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author Edgardo
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Integer duración;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duración) {
        this.titulo = titulo;
        this.director = director;
        this.duración = duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuración() {
        return duración;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuración(Integer duración) {
        this.duración = duración;
    }
    public static Comparator<Pelicula> compararDuracion=new Comparator <Pelicula> (){
    
    @Override
    public int compare(Pelicula p1, Pelicula p2){
      return p1.getDuración().compareTo(p2.getDuración());  
    }
};
    
     public static Comparator<Pelicula> compararDirector=new Comparator <Pelicula> (){
    
    @Override
    public int compare(Pelicula p1, Pelicula p2){
      return p1.getDirector().compareTo(p2.getDirector());
    }
     };
      public static Comparator<Pelicula> compararTitulo=new Comparator <Pelicula> (){
    
    @Override
    public int compare(Pelicula p1, Pelicula p2){
      return p1.getTitulo().compareTo(p2.getTitulo());
    }
     };
}
