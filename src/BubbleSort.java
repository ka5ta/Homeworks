

public class BubbleSort {

    /***
     * Sortuuje elementy
     * @param elementy tablica do posortowania
     * @return true jesli wszystko jest ok, false w przypadku niepowodzenia
     */
    public boolean sortowanie(int[] elementy){
        /*

         */
        for (int i = 0; i <elementy.length ; i++) {
            for (int j = 0; j <elementy.length-1 ; j++) {
                if(elementy[i] > elementy[i+1]){
                    int temp = elementy[i];
                    elementy[i] = elementy[i+1];
                    elementy[i+1] = temp;
                }
            }
        }
        return true;
    }

    public void sortBomb(int[] elements){




        while (true) {
            // starting a new pass
            boolean didSwapThisPass = false;

            //making a pass
            for (int i = 0; i < elements.length - 1; i++) {
                if (elements[i] > elements[i + 1]) {  //swapping numbers
                    int temp = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = temp;
                    didSwapThisPass = true;
                }
            }

            if(!didSwapThisPass){
                return;
            }
        }
    }

    //3215



    public static void main(String[] args) {
        BubbleSort sb = new BubbleSort();
        int[] elementy = {5,3,2,1};
//        sb.sortowanie(elementy);
        sb.sortBomb(elementy);
    }


}
