package nonrepeatedcharacters;

public class FirstNonRepeatedCharacter {

  public static void main(String[] args) {
   
  String inputstr="experience";
   
   for(char i : inputstr.toCharArray()){
   if (inputstr.indexOf(i) ==
inputstr.lastIndexOf(i)){
             System.out.println("FIRST NON-REPEATED CHARACTER IS: "+i);
             break;
        }
        }
    }   
  }
