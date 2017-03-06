package jozkar.recycleviewexample;

/**
 * Created by Jozkar on 14.11.2015.
 */
public class RowData {

    public String name, id;
    public int icon;
    public int position;


    public RowData(int position, String name, int icon) {
        this.position = position;
        this.name = name;
        this.icon = icon;
    }
}
