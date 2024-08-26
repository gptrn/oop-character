public class TestCase1{
    public static void main(String[] args){
        Character balmont = new Character(1, "Balmont", 100, 80, 100, 15);
        Character grezzle = new Character(2, "Grezzle", 100, 90, 75, 32);
        
        // Part 1
        balmont.PrintBasicInfo();
        grezzle.PrintBasicInfo();

        balmont.BasicAttack(grezzle);
        grezzle.BasicAttack(balmont);

        balmont.PrintBasicInfo();
        grezzle.PrintBasicInfo();

        balmont.BasicAttack(grezzle);
        grezzle.BasicAttack(balmont);

        balmont.PrintBasicInfo();
        grezzle.PrintBasicInfo();

        return;
    }
}