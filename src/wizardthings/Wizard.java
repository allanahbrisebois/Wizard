/*
 * Name:Allanah Brisebois
 */

package wizardthings;


public class Wizard extends MagicalFolk {
    int male;
    
    public Wizard(int age, String name, String wandType, boolean darkWizard, String gender, int id){
        super(age, name, wandType, darkWizard, gender);
        this.male = id;
    }
    
    
}
