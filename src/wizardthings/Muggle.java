/*
 * Name:Allanah Brisebois
 * Muggles rule
 */

package wizardthings;


public class Muggle {
    String gender;
    String name;
    int age;
    boolean knowing;
    
    public Muggle(String gender, String name, int age, boolean knowing) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.knowing = knowing;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setfName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isKnowing() {
        return knowing;
    }

    public void setKnowing(boolean knowing) {
        this.knowing = knowing;
    }

    
}
