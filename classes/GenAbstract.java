package classes;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public abstract class GenAbstract{

    private String name;

    private int age = 24;
    private int week;
    private int year;

    private int gold;
    private int exp;
    private HashMap<String, Integer> inventory = new HashMap<String, Integer>();

    // private ArrayList<Integer> arr = new ArrayList<Integer>();

    // private HashMap<String, List<Integer>> lvTable = new HashMap<String, List<Integer>>();

    public GenAbstract(String name){
        this.name = name;
        this.week = 1;
        this.year = 1;
        this.gold = 5;
        this.exp = 0;

        /*
            lvTable Setup
        */
        // ArrayList<Integer> val = new ArrayList<Integer>();
        // val.add(500);
        // // Upgrade to Theif
        // val.add(1000);
        // // Upgrade to Warrior
        // val.add(1700);
        // val.add(2500);
        // // Upgrade to Scholar
        // val.add(3500);
        // this.lvTable.put("Human", val);

        // val = new ArrayList<Integer>();
        // val.add(200);
        // val.add(500);
        // val.add(1100);
        // // Upgrade to Archer
        // val.add(1900);
        // // Upgrade to Knight
        // val.add(3000);
        // this.lvTable.put("Warrior", val);
        // val = new ArrayList<Integer>();
        // val.add(1000);
        // val.add(1400);
        // val.add(2500);
        // val.add(4000);
        // val.add(6000);
        // this.lvTable.put("Knight", val);
        // val = new ArrayList<Integer>();
        // val.add(500);
        // val.add(1400);
        // val.add(3000);
        // // Upgrade to Ranger
        // val.add(4800);
        // val.add(7500);
        // this.lvTable.put("Archer", val);
        // val = new ArrayList<Integer>();
        // val.add(200);
        // val.add(500);
        // val.add(1100);
        // val.add(1900);
        // val.add(3000);
        // this.lvTable.put("Ranger", val);
        // this.lvTable.put("Scholar", val);
        // this.lvTable.put("Mage", val);
        // this.lvTable.put("Healer", val);
        // this.lvTable.put("Theif", val);
        // this.lvTable.put("Rogue", val);
        // this.lvTable.put("Smuggler", val);

        
    }

    /* Level Tables */
    // public void showLevelTables(){
    //     System.out.println(this.lvTable);
    // }

    /* Summary Values */

    public String getDate(){
        return "Week: " + this.week + " Of Year: " + this.year;
    }
    public String getStats(){
        return "Gold: " + this.gold + "  Exp: " + this.exp;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    /*
        Age and time related values
    */
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getWeek(){
        return this.week;
    }
    public void setWeek(int week){
        this.week = week;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }


    /* Gold and Experience values */
    public int getGold(){
        return this.gold;
    }
    public void setGold(int gold){
        this.gold = gold;
    }
    public int getExp(){
        return this.exp;
    }
    public void setExp(int exp){
        this.exp = exp;
    }
    public HashMap<String, Integer> getInventory(){
        return this.inventory;
    }
    public void setInventory(HashMap<String, Integer> inventory){
        this.inventory = inventory;
    }

    /* Actions */
    public Boolean exit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are You Sure You Want To Quit?");
        System.out.println("(y/n)");
        String input = scanner.nextLine();
        if(input.indexOf("y") == 0 || input.indexOf("Y") == 0){
            System.out.println("\n");
            return false;
        }
        return true;
    }
}