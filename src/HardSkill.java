/*
 * Trinity Noble
 * 22/09/24
 * CS325
 */
//////////////////////////////////////////////
//this concrete class has specific implementations for the hard skill method. it also inherits the identify skill from Skill.Java.
public class HardSkill extends Skill {
//Constructor for hardskill, calling on the constructor from the superclass Skill
    public HardSkill(String name, int skillLevel) {
        super(name, "hard", skillLevel);
    }
//////////////////////////////////////////////
//implementation of the abstract method from Skill
    public void identifySkill() {
        System.out.println("Hard Skill of " + GetName() + " has a level of " + GetSkillLvl());
    }
}