public class TestCase2{
    public static void main(String[] args){
        Hero theHero1 = new Hero(1, "Balmont", 100, 80, 100, 15, Hero.HeroType.MELEE);
        Hero theHero2 = new Hero(2, "Grezzle", 100, 90, 75, 32, Hero.HeroType.RANGED);

        Monster theMonster1 = new Monster(2, "Gobleen", 100, 90, 25, 12, Monster.MonsterType.WILD);
        Monster theMonster2 = new Monster(2, "Gobleen Warrior", 200, 150, 175, 132, Monster.MonsterType.MINION);
        Monster theMonster3 = new Monster(2, "Gobleen Lord", 1000, 900, 275, 232, Monster.MonsterType.MINI_BOSS);

        theHero1.PrintBasicInfo();
        theHero2.PrintBasicInfo();

        theMonster1.PrintBasicInfo();
        theMonster2.PrintBasicInfo();
        theMonster3.PrintBasicInfo();

        Skill theSkill1 = new Skill("Ground Bash");
        Skill theSkill2 = new Skill("Fire Arrow Rain");
        
        theHero1.CastSkill(theSkill1, theMonster1);
        theHero2.CastSkill(theSkill2, theMonster1);
        theMonster1.Targets(theHero1);
        return;
    }
}