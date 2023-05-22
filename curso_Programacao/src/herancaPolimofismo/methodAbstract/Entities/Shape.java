package methodAbstract.Entities;

import methodAbstract.Entities.enums.Color;

public abstract class Shape {
    private Color color;
    

    public Shape() {
    }

    

    public Shape(Color color) {
        this.color = color;
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    //não pode ser implementado
    //A classe tbm é abstrada
    public abstract double area();
    
}
