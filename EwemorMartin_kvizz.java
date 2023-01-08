package ewemormartin_kvizz;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class EwemorMartin_kvizz {

    public static void main(String[] args) {
        Object kerdes1;
        Object kerdes2;
        Object kerdes3;
        Object kerdes4;
        int kerdes5;
        String nev="";
        String converter;
        int kilepes=JOptionPane.YES_OPTION;
        int messagetype=JOptionPane.INFORMATION_MESSAGE;
        int megoldas;
        Object[] valaszok=new Object[]{"5","11","69","20"};
        Icon nincs= null;
        while (kilepes==JOptionPane.YES_OPTION){
            megoldas=0;
            valaszok=new Object[]{"5","11","69","20"};
            while (nev.length()<3){
            nev=JOptionPane.showInputDialog("Kerem adja meg a nevét: ");
            }
            kerdes1=JOptionPane.showInputDialog(null,"Hány ember van egy foci csapatban" ,  "1. kerdes", messagetype,nincs, valaszok, 0);
            if (kerdes1=="11")
            {
                megoldas++;
            }
            valaszok=new Object[]{"2006","1986","2022","1978"};
            kerdes2=JOptionPane.showInputDialog(null,"Mikor játszott Magyarország utoljára foci világbajnokságon" , "2. kerdes", messagetype, nincs, valaszok, 0);
            if (kerdes2=="1986")
            {
                megoldas++;
            }
            valaszok=new Object[]{"56","45","69","37"};
            kerdes3=JOptionPane.showInputDialog(null,"Hány évesen halt meg Adolf Hitler?" , "3. kerdes", messagetype, nincs, valaszok, 0);
            if (kerdes3=="56")
            {
                megoldas++;
            }
            valaszok=new Object[]{"1969. júl. 16.","1970. márc.25","1969. júni. 16.","1960.júl. 16."};
            kerdes4=JOptionPane.showInputDialog(null,"MIkor volt az első ember a holdon?" , "4. kerdes", messagetype, nincs, valaszok, 0);
            if (kerdes4=="1969. júl. 16.")
            {
                megoldas++;
            }
            converter=JOptionPane.showInputDialog(null,"MIkor nyerte meg először Fraciaország először a foci VB-t?" , "5. kerdes", messagetype);
            kerdes5=Integer.parseInt(converter);
            if (kerdes5==1998)
            {
                megoldas++;
            }
            JOptionPane.showMessageDialog(null, "Ennyi kerdesre adtál helyes választ:"+megoldas, nev, messagetype);
            kilepes=JOptionPane.showConfirmDialog(null, "Szeretne-e Újra játszani", "Új játék", JOptionPane.YES_NO_OPTION);
        }
    }
   
}

    
    

