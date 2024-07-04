/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author anara
 */
public class Sual2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        
        words.add("Salam");
        words.add("necesen");
        
        List<String> reverseword = words.stream()
                .map(soz -> new StringBuilder(soz)
                        .reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reverseword);
    }
}
