package koschei.models;

public class Ocean1 {

    private final Island2 island;

    public Ocean1(Island2 island) {
        this.island = island;
    }

    public String toString() {
        return "на океане остров " + island.toString();
    }
    //Bean AppConfig
}
