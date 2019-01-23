package classes;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;


public class Human extends classes.GenAbstract{

    private int level;

    public Human(String name){
        super(name);
        this.level = 1;
    }

    private String getTasks(){
        return "1) Farm || 7) Store || 8) Inventory || 9) Help || 0) Quit";
    }

    public Boolean action(){
        System.out.println(this.getTasks());
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.indexOf("farm") == 0 || input.indexOf("Farm") == 0 || input.indexOf("1") == 0){
            // System.out.println("")
        } else if(input.indexOf("inventory") == 0 || input.indexOf("Inventory") == 0 || input.indexOf("8") == 0){
            HashMap<String, Integer> inventory = this.getInventory();
            // System.out.println(inventory);
            // inventory.put("Wheat Seeds", 5);
            // inventory.put("Tomato Seeds", 2);
            // inventory.put("Barly Seeds", 4);
            // inventory.put("Corn Seeds", 3);
            // inventory.put("Melon Seeds", 8);
            // inventory.put("Hoe", 1);
            // inventory.put("Shovel", 2);
            // inventory.put("Straw Hat", 1);
            System.out.println(inventory);
            Set<String> keys = inventory.keySet();
            for(String key : keys){
                System.out.println(inventory.get(key) + "x  " + key);
            }
        } else if(input.indexOf("help") == 0 || input.indexOf("Help") == 0 || input.indexOf("9") == 0){
            System.out.println("Enter the name or the number of the action you would like to do.");
            System.out.println("Actions will take more or less time to complete depending on what is selected.");
        } else if(input.indexOf("exit") == 0 || input.indexOf("Exit") == 0 || input.indexOf("quit") == 0 || input.indexOf("Quit") == 0 || input.indexOf("0") == 0){
            return this.exit();
        }
        return true;
    }

    private void farm(){
        this.setGold(this.getGold() + 10);
        this.setExp(this.getExp() + 5);
        this.setWeek(this.getWeek() + 4);
    }

    public Double calcLevel(){
        return 100 * this.level * 1 * .25;
    }
}