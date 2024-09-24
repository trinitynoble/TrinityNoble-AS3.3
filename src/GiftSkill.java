/*
 * Trinity Noble
 * 22/09/24
 * CS325
 */
//////////////////////////////////////////////
public class GiftSkill extends Skill {
//Constructor for giftskill, calling on the constructor from the superclass Skill
    public GiftSkill(String name, int skillLevel) {
        super(name, "gift", skillLevel);
    }
//////////////////////////////////////////////
//implementation of the abstract method from Skill
    public void identifySkill() {
        System.out.println("Gift Skill of " + GetName() + " has a level of " + GetSkillLvl());
    }
}
