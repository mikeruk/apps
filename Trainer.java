package tema14DefiningClassesExerc.test123;

import java.util.ArrayList;
import java.util.List;

public class Trainer {


    private String name;
    private int badges;
    private List<Pokemon> pokemonList = new ArrayList<>();

    public Trainer(String name){
        this.name = name;
        this.badges = 0;
        //this.pokemonList = list;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addPokemonToList(Pokemon pokemon){
        this.pokemonList.add(pokemon);
    }

    public List<Pokemon> getPokemonList(){
        return pokemonList;
    }
    public void setPokemonList(List<Pokemon> list){
        this.pokemonList = list;
    }

    public void setBadges(){
        this.badges += 1;
    }
    public int getBadges(){
        return badges;
    }

    public boolean hasTheElement(String element){
        boolean contains = false;
        for(Pokemon pokemon: pokemonList){
            if(pokemon.getElement().equals(element)){
                return true;
            }
        }
        return contains;

    }









}
