public class Monster extends Character{
    public enum MonsterType {
        WILD,
        MINION,
        MINI_BOSS,
        BOSS,
    }

    public MonsterType monsterType;

    public Monster(int id, String name, int maxHP, int currentHP, int atk, int def, MonsterType monsterType){
        super(id, name, maxHP, currentHP, atk, def);
        this.monsterType = monsterType;
    }

    public static String MonsterTypeToString(MonsterType monsterType) {
        switch (monsterType) {
            case WILD:
                return "WILD";
            case MINION:
                return "MINION";
            case MINI_BOSS:
                return "MINI BOSS";
            case BOSS:
                return "BOSS";
            default:
                return "UNKNOWN";
        }
    }

    public void PrintBasicInfo(){
        String strAlive = this.IsAlive() ? "(ALIVE)" : "(DEAD)"; 
        System.out.println("MONSTER | " +this.GetName() + " [" + MonsterTypeToString(this.monsterType) + "] " +" " + strAlive);
        System.out.println("--------------------------------");
        System.out.println("HP: " + this.GetCurrentHP() + "/" +this.GetMaxHP());
        System.out.println();
    }

    public void Targets(Character target){
        System.out.println();
        System.out.println(this.GetName() + " is targeting "  + target.GetName());
        System.out.println();
    }

}
