package lsg;

import characters.Hero;
import characters.Monster;

/**
 *
 */

public class LearningSoulsGame {

    public static void main(String args[]){
        Hero gregooninator = new Hero();

        gregooninator.printStats();

        Monster Studentatort = new Monster("Studentatort");

        Studentatort.printStats();

        Monster Monster_2 = new Monster();

        Monster_2.printStats();

        Monster Monster_3 = new Monster();

        Monster_3.printStats();

        //le friendly est le plus optimal lorsque les fichiers sont sue le meme packages.
        //sinon le public est plus optimal.


    }
}
