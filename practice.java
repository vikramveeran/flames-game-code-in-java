import java.util.Scanner;

public class practice{
    public static void main(String[] args){        
            //Flames game
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter a first name :");
          String name1 = scan.nextLine().toLowerCase().replaceAll(" ","");
          System.out.print("Enter a partnername :");
          String name2 = scan.nextLine().toLowerCase().replaceAll(" ","");
          //removing common letters
          for(int i=0;i<name1.length(); i++){
              char ch = name1.charAt(i);

              if(name2.indexOf(ch) != -1){
                   name1 = name1.replaceFirst(String.valueOf(ch),"");
                   name2 = name2.replaceFirst(String.valueOf(ch),"");
                   i  = -1;
              }
          }
          int totalcount = name1.length()+name2.length();

          // logic for flames
         String flames = "FLAMES";
         while(flames.length()>1){
            int index = (totalcount%flames.length())-1;
            if(index >=0){
               flames = flames.substring(index+1)+flames.substring(0,index);
            }
            else{
                flames = flames.substring(0,flames.length()-1);
            }

         }
          char finalresult  = flames.charAt(0);
         switch(finalresult){
             case 'F':
               System.out.println("Flames :"+"freinds");
               break;
             case 'L':
               System.out.println("Flames :"+"love");
               break;
               case 'A':
               System.out.println("Flames :"+"Affection");
               break;
               case 'M':
               System.out.println("Flames :"+"Marriage");
               break;
               case 'E':
               System.out.println("Flames :"+"Enemy");
               break;
               case 'S':
               System.out.println("Flames :"+"siblings");
               break;
         }
    }
    
}