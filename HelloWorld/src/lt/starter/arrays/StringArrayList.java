package lt.starter.arrays;

/**
 * Created by Andrius on 2015-11-04.
 */
public class StringArrayList {

    private String[] content;

    public StringArrayList() {
        this.content = new String[2];
    }

    public String get(int index){
        return content[index];
    }

    public void set(String value, int index){
        content[index] = value;

    }
}
