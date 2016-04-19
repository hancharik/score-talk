/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretalk;


import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Jack {
    VoiceManager freettsVM;
    Voice freettsVoice;

    public Jack() {
        // Most important part!
        System.setProperty("mbrola.base", "C:/Users/mark/Desktop/mbrola");
        freettsVM = VoiceManager.getInstance();

        // Simply change to MBROLA voice
         freettsVoice = freettsVM.getVoice("mbrola_us3");// freettsVoice = freettsVM.getVoice("mbrola_us3");// us_3 // af1

        // Allocate your chosen voice
        freettsVoice.allocate();
        //sayWords(words);
    }

    public void sayWords(String words) {
        // Make her speak!
        freettsVoice.speak(words);
    }

    
}