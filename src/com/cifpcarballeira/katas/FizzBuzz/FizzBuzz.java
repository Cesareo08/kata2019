/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author dam131
 */
public class FizzBuzz {

    public String getFizzBuzz(int num) {
        if (num%3==0 && num%5==0) {
            return "FizzBuzz";
        }
        else if (num%3==0 || Integer.toString(num).indexOf('3')!=-1) {
            return "Fizz";
        }
        else if (num%5==0) {
            return "Buzz";
        }
        else
            return Integer.toString(num);
    }
    
}
