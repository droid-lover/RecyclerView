package example.com.recyclerviewdemo.Adapters;

/**
 * Created by jarvis on 10-Mar-16
 * at  5:33 PM .
 */
public class Model {

    private String name;
    private String nameDesc;
    private int images;





    public Model(String name, String nameDesc, int images){
        this.name = name;
        this.nameDesc = nameDesc;
        this.images = images;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameDesc() {
        return nameDesc;
    }

    public void setNameDesc(String nameDesc) {
        this.nameDesc = nameDesc;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
