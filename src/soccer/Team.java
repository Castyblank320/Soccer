/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Team {
    private String Name;
    private ArrayList<Integer> Points = new ArrayList<>();
    private ArrayList<Team> Matches = new ArrayList<>();
    
    public Team(String Name){
        this.Name = Name;
    }
    
    public void setName(String Name){
        this.Name = Name;
}
    public String getName(){
        return this.Name;
}
    public void play(int Points,Team Match){
        this.Points.add(Points);
        this.Matches.add(Match);
    }
    
    public ArrayList<Team> getMatches(){
        return Matches;
    }
    
    public ArrayList<Integer> getPoints(){
        return Points;
    }

}
