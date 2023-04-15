import java.util.Arrays;

public abstract  class Family {
    private String[] parents;
    private String[] children;
    private String adress;

    public Family(String[] parents, String[] children, String adress) {
        this.parents = parents;
        this.children = children;
        this.adress = adress;
    }

    public String[] getParents() {
        return parents;
    }

    public void setParents(String[] parents) {
        this.parents = parents;
    }

    public String[] getChildren() {
        return children;
    }

    public void setChildren(String[] children) {
        this.children = children;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "parents: " + Arrays.toString(parents) + "\n" +
                "children: " + Arrays.toString(children) + "\n" +
                "adress: " + adress;
    }

}

