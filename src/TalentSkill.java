/*
 * Trinity Noble
 * 22/09/24
 * CS325
 */
//////////////////////////////////////////////
//this concrete class has specific implementations for the talent skill method. it also inherits the identify skill from Skill.Java.

public class TalentSkill extends Skill {
//Constructor for talent skill, calling on the constructor from the superclass Skill
    public TalentSkill(String name, int skillLevel) {
        super(name, "talent", skillLevel);
    }
//////////////////////////////////////////////
//implementation of the abstract method from Skill
    public void identifySkill() {
        System.out.println("Talent Skill of " + GetName() + " has a level of " + GetSkillLvl());
    }
}
