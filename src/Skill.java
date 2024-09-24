/*
 * Trinity Noble
 * 22/09/24
 * CS325
 */
//creating the skill abstract class. this abstract class will allow for inheritance or polymorphism to be able to occur.
//////////////////////////////////////////////
public abstract class Skill {
    private String name;
    private String type;
    private int skillLevel;
//////////////////////////////////////////////
// Creating Skill Constructor
    public Skill(String name, String type, int skillLevel) {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }
//////////////////////////////////////////////
//Creating the getters to access the attributes.
    public String GetName(){
      return name;
    }
    public String GetType(){
     return type;
    }
    public int GetSkillLvl(){
     return skillLevel;
    }
//////////////////////////////////////////////
//defining the method for polymorphism 
    public abstract void identifySkill();
}