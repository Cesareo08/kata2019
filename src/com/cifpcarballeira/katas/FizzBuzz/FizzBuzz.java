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
        if (num==1) {
            return "1";
        }
        else if (num==2) {
            return "2";
        }
        else if (num%3==0) {
            return "Fizz";
        }
        else
            return num;
    }
    
}
