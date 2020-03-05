/*
 * Name:Allanah Brisebois
 */

package wizardthings;


public class Witch extends MagicalFolk {
    int female;

    public Witch(int age, String name, String wandType, boolean darkWizard, String gender, int id) {
        super(age, name, wandType, darkWizard, gender);
        this.female = id;
    }

}
