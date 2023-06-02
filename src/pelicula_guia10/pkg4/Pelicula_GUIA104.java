/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelicula_guia10.pkg4;

import entidades.Pelicula;
import java.util.ArrayList;
import serivicios.PeliculaServicio;

/**
 *
 * @author Edgardo
 */
public class Pelicula_GUIA104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pelicula> pelis=new ArrayList();
        PeliculaServicio ps=new PeliculaServicio();
        ps.crearPelicula(pelis);
        ps.mostrarPelicula(pelis);
        ps.mostrarPeliculaDuracion(pelis);
        ps.mostrarPelicularOrdenMayor(pelis);
        ps.mostrarPeliculasOrdenMenor(pelis);
        ps.mostrarPeliculasPortitulo(pelis);
        ps.mostrarPelisPorDirector(pelis);
    }
    
}
