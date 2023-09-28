public class Lista {

    Nodo firstNode;
    int size;


    public Lista(){
        this.firstNode = null;
        this.size = 0;
    }
    //Add to start of the list
    public void addToStart(int value){
        Nodo newNode = new Nodo(value);

        if(isEmpty()){
            firstNode = newNode;
        }else{
            newNode.setNextNode(firstNode);
            firstNode = newNode;
        }
        size++;
    }
    //Add to end of the list
    public void addToEnd(int value){
        Nodo newNode =  new Nodo(value);
        Nodo aux = firstNode;
        for (int i = 0; i < size; i++) {
            if(aux.getNextNode() == null){
                aux.setNextNode(newNode);

            }else{
                aux = aux.getNextNode();
            }
        }
        size++;
    }

    //add to specific position of the list
    public void addToSpecificPosition(int value, int position){

    }

    //print the elements of the list
    public void printList(){
        Nodo aux = firstNode;

        for (int i = 0; i < size; i++) {
            if(aux.getNextNode() == null){
                System.out.print(aux.getValueNode());
            }else{
                System.out.print(aux.getValueNode()+",");
                aux = aux.getNextNode();
            }

        }
    }
    public boolean isEmpty(){
        return (size == 0)?true:false;

        /*if(size == 0){
            return true;
        }else{
            return false;
        }*/
    }
}
