/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author anara
 */
public class Sual7 {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        List<Integer> reversedNumList = reverselist(numList);
        System.out.println(reversedNumList);
        
    }
        public static <T>  List<T>  reverselist(List<T> list) {
        
      Collections.reverse(list);
      return list;
      
    }
   
}
