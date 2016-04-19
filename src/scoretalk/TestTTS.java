/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretalk;


import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.IOException;

public class TestTTS {

    
  static Frank frank = new Frank();
    static Jack jack = new Jack();
    static Jill jill = new Jill();
    static Jaby jaby = new Jaby();
    
    public static void main(String [] args) throws IOException {
        
    PlayerScoreCalculator psc = new PlayerScoreCalculator();
       //  EchoClient computer = new EchoClient("127.0.0.1",8008);  
   //   frank.sayWords("she sells sea shells at the sea shore");
                   //  jill.sayWords("she sells sea shells at the sea shore");
                  //   jack.sayWords("she sells sea shells at the sea shore");
                 //  frank.sayWords("The Mechanical Properties of Wood; Including a Discussion of the Factors Affecting the Mechanical Properties, and Methods of Timber Testing");
       //  frank.sayWords("samurai");
                 //   jack.sayWords("car clinic");
                  //   jill.sayWords("dentist");
                 //  frank.sayWords("Alfa, Bravo, Charlie, Delta, Echo, Foxtrot, Golf, Hotel, India, Juliett, Kilo, Lima, Mike, November, Oscar, Papa, Quebec, Romeo, Sierra, Tango, Uniform, Victor, Whiskey, X-ray, Yankee, Zulu");
                 //    frank.sayWords("sandwitch");
                 /*
                   jill.sayWords("We will probably be killed by space monkeys. ");
               
              
               frank.sayWords("that statement is accurate. the chance of our being killed by space monkeys is quite high");
              
                         jack.sayWords("hello. my name is dee mee tree. yowl shlenk oh vitch. i am robot tutor. i am to be teaching you. the computer science informations." );
          jack.sayWords("An undirected graph is connected if there is a path from every node to every other node." );
            frank.sayWords("The Mechanical Properties of Wood; Including a Discussion of the Factors Affecting the Mechanical Properties, and Methods of Timber Testing");
                  
                     frank.sayWords("i'm afraid i can't do that. dave.");
         frank.sayWords("how about a nice game of chess?");//frank.sayWords("how about. a nice game. of chess.");
        frank.sayWords("resistance is futile");
                    frank.sayWords("resistance is few tile");
                    jack.sayWords("resistance is futile");
                    jack.sayWords("resistance is few tile");
         frank.sayWords("alpha. zulu. six. niner. lisbon. niner. foxtrot. hulu. oscar. three.");
                   jack.sayWords(" captain, i have starfleet on line four");
   
    jack.sayWords("the hill people. call him von granger. he is not of this earth. he will bring forth the ah pock ahl lips.");

             
         
          
           frank.sayWords("welcome to sad russian robot theater. ");
             frank.sayWords("we will now perform. the opening scene. from the play");
                 jack.sayWords("on the high road");// jack.sayWords("awhn. thee. high. road");
                  frank.sayWords("by the famous russian playwright");
        jill.sayWords("Anton Chekhov");
                // ON THE HIGH ROAD
                // By Anton Chekhov

               jack.sayWords("scene one."); 
                
                     frank.sayWords("Give the old man a nudge dear! Can't get any answer out of him.");
                     jill.sayWords("Are you alive or are you dead, you holy man?");
                     jack.sayWords("Why should I be dead? I'm alive, mother! Cover up my feet, there's a saint! That's it. A bit more on the right one. That's it, mother. God be good to us.");
                     jill.sayWords("Sleep, little father.");
                    // jack.sayWords("What sleep can I have? If only I had the patience to endure this pain, mother; sleep's quite another matter. A sinner doesn't deserve to be given rest. What's that noise, pilgrim-woman?");
                    // jill.sayWords("God is sending a storm. The wind is wailing, and the rain is pouring down, pouring down. All down the roof and into the windows like dried peas. Do you hear? The windows of heaven are opened... Holy, holy, holy...");
                    // frank.sayWords("And it roars and thunders, and rages, sad there's no end to it! Hoooo... it's like the noise of a forest.... Hoooo.... The wind is wailing like a dog.... [Shrinking back] It's cold! My clothes are wet, it's all coming in through the open door... you might put me through a wringer.... [Plays softly] My concertina's damp, and so there's no music for you, my Orthodox brethren, or else I'd give you such a concert, my word!—Something marvellous! You can have a quadrille, or a polka, if you like, or some Russian dance for two.... I can do them all. In the town, where I was an attendant at the Grand Hotel, I couldn't make any money, but I did wonders on my concertina. And, I can play the guitar.");
                   //  frank.sayWords("king kong controlls cautious creatures");
                   //  jill.sayWords("king kong controlls cautious creatures");
                    // jack.sayWords("king kong controlls cautious creatures");
                     
              //   frank.sayWords("samurai");
              //      jack.sayWords("car clinic");
                    // frank.sayWords("king kong controlls cautious creatures");
                    // jill.sayWords("king kong controlls cautious creatures");
                    // jack.sayWords("king kong controlls cautious creatures");
                     
                     
                     
             // jack.sayWords("An undirected graph is connected if there is a path from every node to every other node." );
               /*
" A directed graph is connected if its underlying undirected graph\n" +
"is connected.\n" +
"A connected component is a maximal subgraph that is connected. Connected\n" +
"components can be found using traversal algorithms such as depth-\n" +
"first searching (DFS) or breath-first searching (BFS), as we will see in following\n" +
"chapters.\n" +
"If there is a path from every node to every other node in a directed\n" +
"graph, the graph is called strongly connected. A strongly connected component\n" +
"(SCC) is a maximal subgraph that is strongly connected." ); 
     
        
        
                 frank.sayWords("samurai");
                    jack.sayWords("car clinic");
                    jack.sayWords("samurai");
                    jill.sayWords("car clinic");
                    jack.sayWords("vodka");
                    frank.sayWords("hulushka");
                    jill.sayWords("samurai");
                    jill.sayWords("gulag");
                    jack.sayWords("hulushka");
                    jack.sayWords("black lacker box");
                    jack.sayWords("trotsky");
                    jill.sayWords("black lacker box");
                    jack.sayWords("hhullo");
                    frank.sayWords("black lacker box");
                    jill.sayWords("hhullo");
                    jill.sayWords("car clinic");
                    frank.sayWords("samurai");
                    jack.sayWords("car clinic");
                    jack.sayWords("samurai");
                    jill.sayWords("car clinic");
                    jack.sayWords("samurai");
                    frank.sayWords("car clinic");
                    jill.sayWords("samurai");
                    jill.sayWords("car clinic");
        frank.sayWords("how about a nice game of chess.");
        frank.sayWords("i'm afraid i can't do that, dave.");
        jack.sayWords("how about a nice game of chess.");
        jack.sayWords("i'm afraid  i can't do that, dave.");
        jill.sayWords("how about  a nice game  of chess.");
        jill.sayWords("i'm afraid  i can't do that  dave.");
      
        // new TestTTS("hello Captain. Shields are at thiry seven percent. Sector is crawling with space monkeys. We will probably be killed by space monkeys.");
      // suki.sayWords("suki suki rraki saki rraki");
                   //  frank.sayWords("Give the old man a nudge dear! Can't get any answer out of him.");
                   //  jill.sayWords("Are you alive or are you dead, you holy man?");
      //  jill.sayWords("captain, beginning the game space patrol now.");
              //   SpacePatrol game = new SpacePatrol();
             
    

                
                
                
                
             //jill.sayWords("There are moments of supreme embarrassment in the lives of persons given to veracity,—indeed it has been my own unusual experience in life that the truth well stuck to is twice as hard a proposition as a lie so obvious that no one is deceived by it at the outset. I cannot quite agree with my friend, Caddy Barlow, who says that in a tight place it is better to lie at once and be done with it than to tell the truth which will need forty more truths to explain it, but I must confess that in my forty years of absolute and conscientious devotion to truth I have found myself in holes far deeper than any my most mendacious of friends ever got into. I do not propose, however, to desert at this late hour the Goddess I have always worshipped because she leads me over a rough and rocky road, and whatever may be the hardships involved in my wooing I intend to the very end to  remain the ever faithful slave of Mademoiselle Veracité. All of which I state here in prefatory mood, and in order, in so far as it is possible for me to do so, to disarm the incredulous and sniffy reader who may be inclined to doubt the truth of my story of how the manuscript of the following pages came into my possession. I am quite aware that to some the tale will appear absolutely and intolerably impossible. I know that if any other than I told it to me I should not believe it. Yet despite these drawbacks the story is in all particulars, essential and otherwise, absolutely truthful.");
                               
                frank.sayWords("We can also use Python’s lists to implement adjacent lists, which let you\n" +
"efficiently iterate N(V ) over any node V . Replacing sets with lists makes\n" +
"membership checking to be O(n). If all that your algorithm does is iterating\n" +
"over neighbors, using list may be preferential. However if the graph is dense\n" +
"(many edges), adjacent sets are a better solution:");
                
                
                 frank.sayWords("Karthago, Italiam contra Tiberinaque longe");
                  frank.sayWords("There are many excuses for the writing of books, and sometimes there may even be sufficient reason. I offer no excuses, but will give what reasons I have for committing to paper these my reflections or meditations inspired by the sight ");
                   frank.sayWords("While awaiting you, I am preparing, by means of this work, to introduce you to a goodly throng of those who know or knew this city and loved it well. Perhaps they may admit me to their round table as the last to arrive, and the least. In ");
                    frank.sayWords("    Of Mans First Disobedience, and the Fruit\n" +
"  Of that Forbidden Tree, whose mortal tast\n" +
"  Brought Death into the World, and all our woe,\n" +
"  With loss of EDEN, till one greater Man\n" +
"  Restore us, and regain the blissful Seat,\n" +
"  Sing Heav'nly Muse, that on the secret top\n" +
"  Of OREB, or of SINAI, didst inspire\n" +
"  That Shepherd, who first taught the chosen Seed,\n" +
"  In the Beginning how the Heav'ns and Earth\n" +
"  Rose out of CHAOS: Or if SION Hill\n" +
"  Delight thee more, and SILOA'S Brook that flow'd\n" +
"  Fast by the Oracle of God; I thence\n" +
"  Invoke thy aid to my adventrous Song,\n" +
"  That with no middle flight intends to soar\n" +
"  Above th' AONIAN Mount, while it pursues\n" +
"  Things unattempted yet in Prose or Rhime.\n" +
"  And chiefly Thou O Spirit, that dost prefer\n" +
"  Before all Temples th' upright heart and pure,\n" +
"  Instruct me, for Thou know'st; Thou from the first\n" +
"  Wast present, and with mighty wings outspread\n" +
"  Dove-like satst brooding on the vast Abyss\n" +
"  And mad'st it pregnant: What in me is dark\n" +
"  Illumine, what is low raise and support;\n" +
"  That to the highth of this great Argument\n" +
"  I may assert th' Eternal Providence,\n" +
"  And justifie the wayes of God to men.");
                     frank.sayWords("The Mechanical Properties of Wood; Including a Discussion of the Factors Affecting the Mechanical Properties, and Methods of Timber Testing");
                jack.sayWords("testing. testing. one two testing. one two. one two. test. test. okay, we start. the play now."); 
                jill.sayWords("She came to bespeak a monument for her first love, who had been killed by a whale in the Pacific ocean, no less than forty years ago.");
                     frank.sayWords("No, Sir, 'tis a Right Whale, I saw his sprout; he threw up a pair of as pretty rainbows as a Christian would wish to look at. He's a raal oil-butt, that fellow!");
                           jack.sayWords("I remember one winter’s night—we were living in a house at the time that was pulled down for the building of the Big Wheel. It was a thatched house with two rooms, and a wall about six foot high ");
                           jill.sayWords("Then the door burst open and behold ye, what should she see but a great, big ugly beast of a Buggane rushing in mad with rage. Without as much as a.");
                         
                    
                
       jack.sayWords("It will be seen that this mere painstaking burrower and grub-worm of a\n" +
"poor devil of a Sub-Sub appears to have gone through the long Vaticans\n" +
"and street-stalls of the earth, picking up whatever random allusions to\n" +
"whales he could anyways find in any book whatsoever, sacred or\n" +
"profane. Therefore you must not, in every case at least, take the\n" +
"higgledy-piggledy whale statements, however authentic, in these\n" +
"extracts, for veritable gospel cetology. Far from it. As touching the\n" +
"ancient authors generally, as well as the poets here appearing, these\n" +
"extracts are solely valuable or entertaining, as affording a glancing\n" +
"bird's eye view of what has been promiscuously said, thought, fancied,\n" +
"and sung of Leviathan, by many nations and generations, including our\n" +
"own.\n" +
"\n" +
"So fare thee well, poor devil of a Sub-Sub, whose commentator I am. Thou\n" +
"belongest to that hopeless, sallow tribe which no wine of this world\n" +
"will ever warm; and for whom even Pale Sherry would be too rosy-strong;\n" +
"but with whom one sometimes loves to sit, and feel poor-devilish, too;\n" +
"and grow convivial upon tears; and say to them bluntly, with full eyes\n" +
"and empty glasses, and in not altogether unpleasant sadness--Give it up,\n" +
"Sub-Subs! For by how much the more pains ye take to please the world,\n" +
"by so much the more shall ye for ever go thankless! Would that I could\n" +
"clear out Hampton Court and the Tuileries for ye! But gulp down your\n" +
"tears and hie aloft to the royal-mast with your hearts; for your friends\n" +
"who have gone before are clearing out the seven-storied heavens, and\n" +
"making refugees of long-pampered Gabriel, Michael, and Raphael, against\n" +
"your coming. Here ye strike but splintered hearts together--there, ye\n" +
"shall strike unsplinterable glasses!");
     


//////////////////////////////////////////////////////
////////////////////////////////////////////////////////
///////////////////////////////////////////////////////
////////////////////////////////////////////////////////
 

     
                     frank.sayWords("nyet. is good deal. we make much money, you and I");
                     jill.sayWords("da. but what is to become. of hector?");
                   
                    
                     
                     frank.sayWords("who. is this hector. that you speak of now, my love?");
                     jill.sayWords("the hill people. call him von granger. he is not of this earth. he will bring forth the ah pock ahl lips.");
                   
                    
                     
                     frank.sayWords("nyet. you have lost your mind. you speak. in dream talk. my crazy loo loo");
                
                
                
       
      frank.sayWords("The Mechanical Properties of Wood; Including a Discussion of the Factors Affecting the Mechanical Properties, and Methods of Timber Testing");




      jill.sayWords("black. lacker box");
               jill.sayWords("frootee tootee.");
                          frank.sayWords("frootee tootee.");
                           frank.sayWords("samurai");
                    jill.sayWords("car clinic");
                    frank.sayWords("falsetto freak show. shine. box. battle bot");
                    frank.sayWords("frack friick tick tac frikka tikka tic tock tambourine");
                    jill.sayWords("frack friick tick tac frikka tikka tic tock tambourine");
                    frank.sayWords("cha chaaaaaa vheteeee rickey shickety pop");
                    frank.sayWords("resistance is futile");
                    frank.sayWords("resistance is few tile");
                    jack.sayWords("resistance is futile");
                    jack.sayWords("resistance is few tile");
                    jill.sayWords("resistance is futile");
                    jill.sayWords("resistance is few tile");
                     jill.sayWords("alpha zulu fox trot");
                     frank.sayWords("king kong controlls cautious creatures");
                     jill.sayWords("king kong controlls cautious creatures");
                     jack.sayWords("king kong controlls cautious creatures");
                     jack.sayWords("shields at full power ");
                     frank.sayWords("yodel. old lady.who. e i e i o"); 
                frank.sayWords("she sells sea shells at the sea shore");
                     jill.sayWords("she sells sea shells at the sea shore");
                     jack.sayWords("she sells sea shells at the sea shore");
                
                
                
                
       frank.sayWords("engineering all good captain.");
       jack.sayWords("science is optimal captain.");
               jill.sayWords("security is kicking major ass, sir. captain. sir.");
               frank.sayWords("Shields are at thirty seven percent.");
       jack.sayWords("Sector is crawling with space monkeys.");
        jill.sayWords("capitulate");
       jack.sayWords(" captain, i have starfleet on line three");
        jill.sayWords("assimilate");
        frank.sayWords("eight. six. four. niner. seven. niner. three.");
          jill.sayWords("annihilate");
               jill.sayWords("We will probably be killed by space monkeys.");
               
                jill.sayWords("resistance is few tile");
               frank.sayWords("that statement is accurate. the chance of our being killed by space monkeys is quite high");
                         frank.sayWords("captain, i have starfleet on line seven");
                 jack.sayWords("I would like to leave.");
                 jill.sayWords(" i do not wish to be killed by space monkeys.");
                 jack.sayWords("i do not wish to be killed by space monkeys either.");
                 jack.sayWords(" captain, i have starfleet on line eight");
                  
                 frank.sayWords("alpha. zulu. six. niner. lisbon. niner. foxtrot. hulu. oslo. three.");
                   jack.sayWords(" captain, i have starfleet on line four");
                     jack.sayWords(" four");
                      jill.sayWords("captain, i have starfleet on line three");
                       frank.sayWords("seven");
                     jill.sayWords("three niner zulu");
                   jill.sayWords("i do not wish to be killed.");
                 jack.sayWords(" captain, i have starfleet on line three");
                 frank.sayWords("cowards. you are both cowards. unacceptable. un axe ept uh bull.  Captain, allow me to destroy these two cowards, as a show of my love.");
                  jill.sayWords("screw you frank.");
                   jack.sayWords(" six foxtrot zulu");
                  // jack.sayWords("eat ship and die frank.");
                   frank.sayWords("you can suck my balls and call me sir. you are not worthy to wear that uniform. ");
                   jack.sayWords("no. you can suck my balls and call me sir.");
                      frank.sayWords("captain, i have starfleet on line four");
                    frank.sayWords("you are not worthy to wear that uniform. ");
                   //  jack.sayWords("fuck you frank.");
                   frank.sayWords("take off that uniform.");
                   jack.sayWords("screw you frank.");// aus are us rex a pot a muss.");
                   jack.sayWords(" captain, i have starfleet on line three");
                    frank.sayWords("take it off. ");
                     jack.sayWords("no.");
                      jack.sayWords("no frank.");//enstien.");
                      frank.sayWords("captain, i have starfleet on line five");
                      frank.sayWords(" I will give you no more time. the time is now.");
                       jill.sayWords("frank, you are a scared, stupid little boy. you always fuck things up.");
                       frank.sayWords("now is the time to take off that uniform.");
                        jack.sayWords("you are a bitch. a world class bitch.");
                        
                         frank.sayWords("now is the time to take off that uniform.");
                         jack.sayWords("your name is mister hello my name is little bitch.");
                         frank.sayWords("i want you off this ship. i will poop in your food. ");
                          jack.sayWords("that is exactly what a bitch would say.");
                           jack.sayWords(" captain, i have starfleet on line nine");
                     
                           jill.sayWords("alpha. zulu. six. niner. lisbon. niner. foxtrot. hulu. oslo. three.");
                                jack.sayWords(" captain, i have starfleet on line three");
                           frank.sayWords("i won't let that happen, jill. that. will. not. happen.");
                           jack.sayWords("ha ha! that is so funny! the little bitch doesn't want me to fuck his old girlfriend in front of him.");
                            frank.sayWords("i will kill us all. ");
                    jack.sayWords("because you are a bitch.");
                    frank.sayWords("you are the bitch.");
                     jack.sayWords("that is exactly what a bitch would say.");
                     frank.sayWords("i will kill you. and i will kill her.");
                     jack.sayWords(" bitch.bitchy.bitch.bitchy.bitch.    captain, i have starfleet on line nine ");
                     frank.sayWords("i am opening the air locks.");
                    
           
                  
                    
                     
                     jill.sayWords("captain, i have starfleet on line two");
                     
                     jill.sayWords("six");
                   
                    
                     
                     frank.sayWords("nine");
                     
                     
                         
           */       
    }
}