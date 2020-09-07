/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usesinglylinkedlistjmc;

/**
 *
 * @author Enubs
 */
public class UseSinglyLinkedListJMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("Enubs", "Ron", "Ibo", 38, "Samal");//instantiation (creating an object)
        Person p2 = new Person("Li", "Jet", "Hua", 55, "China");
        Person p3 = new Person("Chan", "Jackie", "Lo", 60, "Hollywoord");
        
        SList<Person> personsList = new SList<>();
        personsList.addFirst(p3);//[Chan]
        personsList.addFirst(p2);//[Li][Chan]
        personsList.addFirst(p1);//[Enubs][Li][Chan]
        
        System.out.print(personsList.first().getLastname());
    }
    
}
