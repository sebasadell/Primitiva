import java.util.Arrays;

public class Block {
    private int quantity;
    private int[] usedNumbers;

    public Block(int x){
        this.quantity = x;
        this.usedNumbers = new int[quantity];

        if(x < 6){
            quantity = 6;
        }
        if(x > 49){
            quantity = 49;
        }

        for(int i = 0; i < usedNumbers.length; i++){
            boolean repeated = false;
            usedNumbers[i] =(int) (Math.random() * 49) + 1;
            for(int j = 0; j < i; j++){
                if(usedNumbers[i] == usedNumbers[j]){
                    repeated = true;
                }
            }
            if(repeated){
                i--;
            }
        }
        Arrays.sort(usedNumbers);
    }

    public Block(int... array){
        this.usedNumbers = array;
        Arrays.sort(usedNumbers);
    }

    public String toString(){
        String s = "";
        Arrays.sort(usedNumbers);
        for(int i = 0; i < usedNumbers.length - 1; i++){
            s += usedNumbers[i] + ", ";
        }
        s += usedNumbers[usedNumbers.length - 1];
        return s;
    }

    public int[] getNumbers() {
        Arrays.sort(usedNumbers);
        int[] array = new int[usedNumbers.length];
        for(int i = 0; i < usedNumbers.length; i++){
            array[i] = usedNumbers[i];
        }
        return array;
    }
}