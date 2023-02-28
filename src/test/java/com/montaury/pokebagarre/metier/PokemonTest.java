package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @BeforeEach
    @Test
    void le_premier_pokemon_gagne_grace_a_une_meilleure_attaque(){
        //given
        Pokemon pokemon1 = new Pokemon("Pikachu","",new Stats(50,20));
        Pokemon pokemon2 = new Pokemon("Artikodin","",new Stats(30,20));
        //when
        boolean b = pokemon1.estVainqueurContre(pokemon1);
        //then
        assertEquals(true,b);
    }
    @Test
    void le_premier_pokemon_gagne_grace_defense(){
        //given
        Pokemon pokemon1 = new Pokemon("Pikachu","",new Stats(50,50));
        Pokemon pokemon2 = new Pokemon("Pikachu","",new Stats(50,20));
        //when
        boolean b = pokemon1.estVainqueurContre(pokemon2);
        //then
        assertEquals(true,b);
    }
    @Test
    void le_premier_gagne_meme_attaque_meme_defense(){
        //given
        Pokemon pokemon1 = new Pokemon("Pikachu","",new Stats(50,20));
        Pokemon pokemon2 = new Pokemon("Pikachu","",new Stats(50,20));
        //when
        boolean b = pokemon1.estVainqueurContre(pokemon2);
        //then
        assertEquals(true,b);
    }
    @Test
    void le_premier_perd_attaque(){
        //given
        Pokemon pokemon1 = new Pokemon("Pikachu","",new Stats(20,50));
        Pokemon pokemon2 = new Pokemon("Pikachu","",new Stats(50,20));
        //when
        boolean b = pokemon1.estVainqueurContre(pokemon2);
        //then
        assertEquals(false,b);
    }
    @Test
    void le_premier_perd_defense(){
        //given
        Pokemon pokemon1 = new Pokemon("Pikachu","",new Stats(50,20));
        Pokemon pokemon2 = new Pokemon("Pikachu","",new Stats(50,50));
        //when
        boolean b = pokemon1.estVainqueurContre(pokemon2);
        //then
        assertEquals(false,b);
    }
}