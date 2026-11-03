package Factory_Pattern;


import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }if (shapeType==equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType==equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType==equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
