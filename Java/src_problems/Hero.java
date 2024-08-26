public class Hero extends Character{
    public enum HeroType {
        MELEE,
        RANGED,
        MAGIC,
        TANK,
        HEALER,
        BUFFER,
    }

    public HeroType heroType;

    public Hero(int id, String name, int maxHP, int currentHP, int atk, int def, HeroType heroType){
        super(id, name, maxHP, currentHP, atk, def);
        this.heroType = heroType;
    }

    public static String HeroTypeToString(HeroType heroType){
        switch(heroType){
            case MELEE:
                return "MELEE";
            case RANGED:
                return "RANGED";
            case MAGIC:
                return "MAGIC";
            case TANK:
                return "TANK";
            case HEALER:
                return "HEALER";
            case BUFFER:
                return "BUFFER";
            default:
                return "UNKNOWN";
        }
    }

    public void PrintBasicInfo(){
        String strAlive = this.IsAlive() ? "(ALIVE)" : "(DEAD)"; 
        System.out.println("HERO | " + this.GetName() + " [" + HeroTypeToString(this.heroType) + "] " +" " + strAlive);
        System.out.println("--------------------------------");
        System.out.println("HP: " + this.GetCurrentHP() + "/" +this.GetMaxHP());
        System.out.println();
    }

    public void CastSkill(Skill skill, Character target){
        System.out.println();
        System.out.println(this.GetName() + " is casting skill [" + skill.name + "] to "  + target.GetName());
        System.out.println();
    }

}
