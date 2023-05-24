package charactor;

public class Warrior extends Charactor{

    public Warrior(String name, int hp, int mp, int exp, int x, int y) {
        super(name, hp, mp, exp, x, y);
    }

    @Override
    public void move(double x, double y) {
        setX(x * 1.2);
        setY(y * 1.1);
    }

    @Override
    public void attack() {
        System.out.printf("%s 가 검으로 몬스터를 공격\n", getName());
    }
}
