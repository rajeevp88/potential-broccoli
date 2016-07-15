package com.string;

import java.util.HashSet;
import java.util.Set;

/**
 * The complexity of that algorithm is O(n^m), where:
 *  n - the length of a string.
 *  m - number of permutations.
 */
public class NearByWords {

    public static void main(String[] args) {
        System.out.println(nearbyWords("git"));
    }
    
//    static Set<String> nearByWords2(String input){
//    	Set<String> words = new HashSet<>();
//    	
//    	for(char c: input.toCharArray()){
//    		Set<Character> nearByLetters = getNearbyChars(c);
//    		for(Character c1: nearByLetters){
//    			String s1 =  
//    		}
//    		
//    	}
//    }

    static Set<String> nearbyWords(String input) {
        char[] letters = input.toCharArray();
        Set<String> nearbyPermutations = nearbyPermutations(letters, 0);
        Set<String> words = new HashSet<>();
        for (String pw : nearbyPermutations) {
            if (isword(pw)) {
                words.add(pw);
            }
        }
        return words;
    }

    private static Set<String> nearbyPermutations(char[] letters, int index) {
        if (index >= letters.length) {
            HashSet<String> strings = new HashSet<>();
            strings.add("");
            return strings;
        }

        Set<String> subWords = nearbyPermutations(letters, index + 1);
        Set<Character> nearbyLetters = getNearbyChars(letters[index]);

        return permutations(subWords, nearbyLetters);
    }
    
    @Override
    public boolean equals(Object obj) 
    {
    	return (this == obj);
    }

    private static Set<String> permutations(Set<String> subWords, Set<Character> nearbyLetters) {
        Set<String> permutations = new HashSet<>();

        for (String subWord : subWords) {
            for (Character letter : nearbyLetters) {
                permutations.add(letter + subWord);
            }
        }
        return permutations;
    }


    //Lame implementation of helpers.
    private static Set<Character> getNearbyChars(Character character) {
        HashSet<Character> characters = new HashSet<>();
        if (character == 'g') {
            characters.add('g');
            characters.add('h');
            characters.add('f');
        } else if(character == 'i') {
            characters.add('i');
            characters.add('o');
            characters.add('k');
        } else {
        	characters.add('z');
        	characters.add('x');
        	characters.add('c');
        	
        }
        return characters;
    }

    static boolean isword(String word) {
        return word.equals("go") || word.equals("hi");
    }
}