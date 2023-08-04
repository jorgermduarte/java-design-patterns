package pt.jorgeduarte.designpatterns.builder.domain.entities;

import java.util.List;

public class Meal {
    private List<IItem> items;
    private String name;

    public void addItem(IItem item){
        this.items.add(item);
    }

    public void setMealName(String name){
        this.name = name;
    }

    public List<IItem> getMeal(){
        return this.items;
    }

}
