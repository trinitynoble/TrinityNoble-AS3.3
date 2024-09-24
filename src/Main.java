/*
 * Trinity Noble
 * 22/09/24
 * CS325
 */
//////////////////////////////////////////////
//This class is used to display the instances created.
public class Main {
    public static void main(String[] args) {
// creating instances for each skill
        Skill uid = new HardSkill("User Interface Design", 9);
        Skill a = new SoftSkill("Adaptability", 8);
        Skill h = new GiftSkill("Honesty", 9);
        Skill d = new TalentSkill("Drawing", 8);
//////////////////////////////////////////////
// displaying the instances using the method created in the abstract class.
        uid.identifySkill();
        a.identifySkill();
        h.identifySkill();
        d.identifySkill();
    }
}
