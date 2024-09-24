/*
 * Trinity Noble
 * 22/09/24
 * CS325
 */
//////////////////////////////////////////////
//this concrete class has specific implementations for the soft skill method. it also inherits the identify skill from Skill.Java.

public class SoftSkill extends Skill {
//Constructor for softskill, calling on the constructor from the superclass Skill
    public SoftSkill(String name, int skillLevel) {
        super(name, "soft", skillLevel);
    }
//////////////////////////////////////////////
//implementation of the abstract method from Skill
    public void identifySkill() {
        System.out.println("Soft Skill of " + GetName() + " has a level of " + GetSkillLvl());
    }
}
