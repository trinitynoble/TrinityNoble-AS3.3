public class SkillTest {
    public static void main(String[] args) {
        // Create instances of each skill
        Skill programming = new HardSkill("Programming", 6);
        Skill communication = new SoftSkill("Communication", 8);
        Skill mercy = new GiftSkill("Mercy", 9);
        Skill organization = new TalentSkill("Organization", 7);

        // Call identifySkill method on each instance
        programming.identifySkill();
        communication.identifySkill();
        mercy.identifySkill();
        organization.identifySkill();
    }
}