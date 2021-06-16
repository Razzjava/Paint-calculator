package OOP;

public abstract class Room {
    // attribute

    private int Height;
    private int Width;
    private int area;
    private int numofwalls;



    //  Constructor

 // Method
public int getHeight() {
    return Height;
}

public void setHeight(int height) {
    Height = height;
}

public int getWidth() {
    return Width;
}

public void setWidth(int width) {
    Width = width;
}

public int getNumofwalls() {
    return numofwalls;
}

public void setNumofwalls(int numofwalls) {
    this.numofwalls = numofwalls;
}

public int calculateArea() {
    return Height * Width;
}

public int getArea() {
    return area;
}





}
