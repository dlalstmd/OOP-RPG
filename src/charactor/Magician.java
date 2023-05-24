package charactor;

public class Magician extends Charactor{
    public Magician(String name, int hp, int mp, int exp, int x, int y) {
        super(name, hp, mp, exp, x, y);
    }

    @Override
    public void move(double x, double y) {
        setX(x * 1.1);
        setY(y * 1.1);
    }

    @Override
    public void attack() {
        System.out.printf("%s 가 마법봉으로 몬스터를 공격했습니다\n", getName());
    }
}
