public class Character{
    private int     id;
    private String  name;
    private boolean isAlive;
    private int     maxHP;
    private int     currentHP;
    private int     atk;
    private int     def; 

    public Character(int id, String name, int maxHP, int currentHP, int atk, int def){
        this.id         = id;
        this.name       = name;
        this.maxHP      = maxHP;
        this.currentHP  = currentHP;
        this.atk        = atk;
        this.def        = atk;

        if(this.currentHP > this.maxHP){
            this.currentHP = this.maxHP;
        }
        if(this.currentHP > 0){
            this.isAlive = true;
        }
        else{
            this.currentHP = 0;
            this.isAlive = false;
        }
    }

    public String GetName(){ return this.name; }
    public boolean IsAlive(){ return this.isAlive; }
    public int GetAtk(){ return this.atk; }
    public int GetDef(){ return this.def; }
    public int GetCurrentHP(){ return this.currentHP; }
    public int GetMaxHP(){ return this.maxHP; }

    public void PrintBasicInfo(){
        String strAlive = this.IsAlive() ? "(ALIVE)" : "(DEAD)"; 
        System.out.println(this.name + " " + strAlive);
        System.out.println("--------------------------------");
        System.out.println("HP: " + this.currentHP + "/" +this.maxHP);
        System.out.println();
    }

    public void BasicAttack(Character target){
        if(!this.IsAlive()){
            System.out.println("Basic Attack FAILED, the attacker (" + this.GetName()+") is DEAD.");
            System.out.println();
            return;
        }

        if(!target.IsAlive()){
            System.out.println("Basic Attack FAILED, the target (" + target.GetName()+") is DEAD.");
            System.out.println();
            return;
        }

        int damage = this.GetAtk() - target.GetDef();
        if(damage <= 0){
            damage = 0;
        }

        System.out.println(this.name + " is launching a basic attack to " + target.GetName()+ " with damage value "+ damage +"...");
        System.out.println();

        // target.ReceiveDamage(damage);
        return;
    }

    public void ReceiveDamage(int damage){
        this.currentHP -= damage;
        // If HP is less or equal to zero then dead (is alive = false)
    }

}