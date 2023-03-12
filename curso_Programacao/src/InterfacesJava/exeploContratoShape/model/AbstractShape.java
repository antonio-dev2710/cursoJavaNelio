package InterfacesJava.exeploContratoShape.model;

import InterfacesJava.exeploContratoShape.model.enums.Color;
//qunado eu colo uma classe como abstrato e implemento uma interface o complilador n me obriga implementar o metodo da classe pai, levando a resposabilidade para a classe q ira herdar implementar o metodo
public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
