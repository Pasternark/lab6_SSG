package com.example.lab6ssg;

public class ArrayOperations {

    public boolean searchNumber(int[] miArray, double parametroEntero){

        boolean check = false;


        for(int i = 0; i < miArray.length; i++){
            if(parametroEntero == miArray[i]){
                check = true;
                break;
            }
        }
        return check;
    }

    public int countOcurrences(int[] miArray, int parametroEntero){

        int contadorOcurrencias = 0;

        for(int i = 0; i < miArray.length; i++){
            if (parametroEntero == miArray[i]){
                contadorOcurrencias++;
            }
        }
           return contadorOcurrencias;
    }
}
