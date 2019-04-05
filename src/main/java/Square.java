public class Square {

    private String name;
    private int pos;

    public Square(String name, int pos){
        this.name = name;
        this.pos = pos;
    }

    public int getLocation(){
        return pos;
    }

    public String getName(){
        return name;
    }
}
