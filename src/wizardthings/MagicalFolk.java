/*
 * Name:Allanah Brisebois
 */

package wizardthings;


public class MagicalFolk {
    int age;
    String name;
    String wandType;
    boolean darkWizard;
    String gender;

    public MagicalFolk(int age, String name, String wandType, boolean darkWizard, String gender){
        this.age = age;
        this.name = name;
        this.wandType = wandType;
        this.darkWizard = darkWizard;
        this.gender = gender;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getname(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public void setDarkWizard(boolean darkWizard) {
        this.darkWizard = darkWizard;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
   
    
    public String getWandType(){
        return wandType;
    }
    
    public boolean getDarkWizard(){
        return darkWizard;
    }
    
    public String getGender(){
        return gender;
    }
}
