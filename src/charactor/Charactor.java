package charactor;

public abstract class Charactor {
    private String name;
    private int hp;
    private int mp;
    private int exp;
    private double x, y;

    public Charactor(String name, int hp, int mp, int exp, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.exp = exp;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract void move(double x, double y);

    public abstract void attack();
}
