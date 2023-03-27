package com.example.lab6ssg;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayTest {
    private ArrayOperations miArrayOperations;
    int[] miArreglo = {1, 2, 3, 4, -5, 6, 7, 8, 8, 0};
    int[] miArregloRepeticiones = {1,1,1,-3,-3,4,4,4,4,0};

    @Before
    public void setUp(){
        miArrayOperations = new ArrayOperations();
    }

    @Test
    public void searchPositiveNumberIn(){
        boolean resultadoBusqueda = miArrayOperations.searchNumber(miArreglo, 1);
        assertThat(resultadoBusqueda, is(equalTo(true)));
    }

    @Test
    public void searchNegativeNumberIn(){
        boolean resultadoBusqueda = miArrayOperations.searchNumber(miArreglo, -5);
        assertThat(resultadoBusqueda, is(equalTo(true)));
    }

    @Test
    public void searchPositiveNumberNotIn(){
        boolean resultadoBusqueda = miArrayOperations.searchNumber(miArreglo, 9);
        assertThat(resultadoBusqueda, is(equalTo(false)));
    }

    @Test
    public void searchNegativeNumberNotIn(){
        boolean resultadoBusqueda = miArrayOperations.searchNumber(miArreglo, -6);
        assertThat(resultadoBusqueda, is(equalTo(false)));
    }

    @Test
    public void countNumberOcurrencys(){
        int resultadoBusqueda = miArrayOperations.countOcurrences(miArregloRepeticiones, 4);
        assertThat(resultadoBusqueda, is(equalTo(4)));
    }

    @Test
    public void countNoNumberOcurrencys(){
        int resultadoBusqueda = miArrayOperations.countOcurrences(miArregloRepeticiones, 9);
        assertThat(resultadoBusqueda, is(equalTo(0)));
    }

    @Test
    public void countNegativeNumberOcurrencys(){
        int resultadoBusqueda = miArrayOperations.countOcurrences(miArregloRepeticiones, -3);
        assertThat(resultadoBusqueda, is(equalTo(2)));
    }

    @Test
    public void countNegativeNumberNotInOcurrencys(){
        int resultadoBusqueda = miArrayOperations.countOcurrences(miArregloRepeticiones, -9);
        assertThat(resultadoBusqueda, is(equalTo(0)));
    }
}
