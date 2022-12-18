import java.util.Arrays;

public class Ticket extends Block{
    private int quantity;
    private Block[] ticket;

    public Ticket(int x){
        this.quantity = x;
        this.ticket = new Block[quantity];
        for(int i = 0; i < quantity; i++){
            ticket[i] = new Block(6);
        }
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < ticket.length; i++){
            s += ticket[i].toString();
            s += "\n";
        }
        return s;
    }

    public String printUsedNumbers(){
        int[] usedNumbers = new int[1];
        for(int i = 0; i < ticket.length; i++){
            boolean repeated;
            int[] block = ticket[i].getNumbers();
            Arrays.sort(block);
            for(int j = 0; j < block.length; j++){
                repeated = false;
                for(int k = 0; k < usedNumbers.length; k++){
                    if(block[j] == usedNumbers[k]){
                        repeated = true;
                        break;
                    }
                }
                if(!repeated){
                    int[] aux = new int[usedNumbers.length + 1];
                    for(int l = 0; l < usedNumbers.length; l++){
                        aux[l] = usedNumbers[l];
                    }
                    aux[usedNumbers.length] = block[j];
                    usedNumbers = aux;
                }
            }
        }
        Arrays.sort(usedNumbers);
        String s = "";
        for(int i = 1; i < usedNumbers.length - 1; i++){
            s += usedNumbers[i] + ", ";
        }
        s += usedNumbers[usedNumbers.length - 1];
        return s;
    }
}
