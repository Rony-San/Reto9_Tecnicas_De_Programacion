/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ronys
 */
public class metodos {

    public static int factorial(Integer numero) {
        if (numero == 0) {
            return 1;
        } else {
            return (Integer) (numero * factorial(numero - 1));
        }
    }
}
