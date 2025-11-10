public class Cube {
    // properties
    private int side;

    // constructors
    public Cube(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }else{
            this.side = side;
        }
    }
    public Cube(){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }else{
            this.side = 1;
        }
    }

    // getter
    public int getSide(){
        return side;
    }

    // setter
    public void setSide(int side){
        this.side = side;
    }

    // functions 
    public int calculateVolume(){
        return side*side*side;
    }

    // toString
    public String toString(){
        return "Cube{" + side + "}";
    }
}
