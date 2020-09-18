package String;

public class StringPractice1 {

    public static void main(String args[]){
        String str="abbcccddef";    
        char charArray[]=str.toCharArray();
        int len=charArray.length;

        for(int i=0;i<len;i++){
            //if i th one and i+1 th character are same then update the charArray
            try{
                if(charArray[i]==charArray[i+1]){
                    charArray[i]='0';                   
                }}
                catch(Exception e){
                    System.out.println("");
                }
        }//finally printing final character string
        for(int k=0;k<charArray.length;k++){
            if(charArray[k]!='0'){
                System.out.print(charArray[k]);
            }       }
    }
}
