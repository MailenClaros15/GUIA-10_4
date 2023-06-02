/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serivicios;
import java.util.ArrayList;
import entidades.Pelicula;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class PeliculaServicio {
    Scanner leer =new Scanner (System.in).useDelimiter("\n");
    public void crearPelicula(ArrayList<Pelicula> peliculas){
        boolean bucle =true;
        do{
   Pelicula pelicula=new Pelicula() ;
        System.out.println("Ingrese el nombre de la pelicula");
        pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el director");
        pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
        pelicula.setDuración(leer.nextInt());
          peliculas.add(pelicula) ;
            System.out.println("Desea cargar otra pelicula?S/N");
            String respuesta=leer.next();
            if(respuesta.equalsIgnoreCase("N")){
                bucle=false;
            }
    }while(bucle); 
}
    public void mostrarPelicula(ArrayList<Pelicula> peliculas){ 
        System.out.println("---Lista de peliculas---");
        for (Pelicula pelicula:peliculas) {
            System.out.println(pelicula.getTitulo());
        }
    }
    public void mostrarPeliculaDuracion(ArrayList<Pelicula> peliculas){
        System.out.println("Lista de peliculas que duran más de una hora");
        for(Pelicula pelicula: peliculas){
            if(pelicula.getDuración()>1){
                System.out.println(pelicula.getTitulo());
            }
        }
        
        
        }
    
    public void mostrarPelicularOrdenMayor(ArrayList<Pelicula> peliculas){
        Collections.sort(peliculas, Pelicula.compararDuracion);
        Collections.reverse(peliculas);
        System.out.println("Las peliclas por duracion mayor a menor");
        for (Pelicula pelicula: peliculas) {
            System.out.println(pelicula.getTitulo()+" con una duracion de "+pelicula.getDuración());
        }
    
    }
    public void mostrarPeliculasOrdenMenor(ArrayList<Pelicula> peliculas){
        Collections.sort(peliculas, Pelicula.compararDuracion);
        
        System.out.println("Las peliclas por duracion menor a mayor");
        for (Pelicula pelicula: peliculas) {
            System.out.println(pelicula.getTitulo()+" con una duracion de "+pelicula.getDuración());
        }
    }
    public void mostrarPeliculasPortitulo(ArrayList<Pelicula> peliculas){
        Collections.sort(peliculas, Pelicula.compararTitulo);
        System.out.println("Las peliculas ordenadas por titulo alfabeticamente");
        for(Pelicula pelicula:peliculas){
            System.out.println(pelicula.getTitulo());
        }
     
}
    public void mostrarPelisPorDirector(ArrayList<Pelicula> peliculas){
          Collections.sort(peliculas, Pelicula.compararDirector);
           System.out.println("Las peliculas ordenadas por Director alfabeticamente");
        for(Pelicula pelicula:peliculas){
            System.out.println(pelicula.getDirector());
        
    }
}
}
