public class Binary {
    public String binaryToDecimal(String a){
        int decimal = 0;
        int power = 0;
        if(a.length() == 1){
            return a;
        }
        for(int i = a.length()-1; i >= 0; i--){
            decimal += Character.getNumericValue(a.charAt(i)) * (int) Math.pow(2, power);
            power++;
        } 
    
        return String.valueOf(decimal);
    }

}


