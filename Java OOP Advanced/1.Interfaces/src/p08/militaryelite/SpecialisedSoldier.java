package p08.militaryelite;


public interface SpecialisedSoldier {

   default boolean isValidCorps(String corps){

       if(corps.equals("Airforces")||corps.equals("Marines")){
           return true;
       }
       return false;
   }

}
